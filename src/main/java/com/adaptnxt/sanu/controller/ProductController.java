package com.adaptnxt.sanu.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adaptnxt.sanu.model.Output;
import com.adaptnxt.sanu.model.ProductDetails;
import com.adaptnxt.sanu.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/category")
	public ResponseEntity<Set<String>> getAllCategory(){
		ResponseEntity<Set<String>> entity=null;
		try{
			entity=new ResponseEntity<Set<String>>(service.getAllCatagory(),HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return entity;
	}
	
	@GetMapping("/subcategory/{categoryName}")
	public ResponseEntity<Set<String>> getAllSubCategory(@PathVariable String categoryName){
		ResponseEntity<Set<String>> entity=null;
		try{
			entity=new ResponseEntity<Set<String>>(service.getAllSubCatagoryOfACategory(categoryName),HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return entity;
	}
	
	@PostMapping("/profit")
	public ResponseEntity<Output> getDifferentfees(@RequestBody ProductDetails details){
		ResponseEntity<Output> entity=null;
		Output output=null;
		
		try{
			String catagory=details.getProduct_catagory();
			String subCatagory=details.getProduct_sub_catagory();
			Double sellingPrice;
			if(details.getSell_price_of_product()!=null) {
				sellingPrice=details.getSell_price_of_product();
			}
			else {
				sellingPrice=0.0;
			}
			Integer weightOfProduct;
			if(details.getWeight_of_product()!=null) {
				weightOfProduct=details.getWeight_of_product().intValue();
			}
			else {
				weightOfProduct=0;
			}
			String shippingWay=details.getWays_of_shipping();
			String shippingZone=details.getShipping_zone();
			Double shippingCostForSelfShip;
			if(details.getShipping_charge()!=null) {
				shippingCostForSelfShip=Double.parseDouble(details.getShipping_charge());
			}
			else {
				shippingCostForSelfShip=0.0;
			}
			
			
			System.out.println(catagory);
			System.out.println(subCatagory);
			System.out.println(sellingPrice);
			System.out.println(weightOfProduct);
			System.out.println(shippingWay);
			System.out.println(shippingZone);
			System.out.println(shippingCostForSelfShip);
			System.out.println("======================================================");
			
			output=new Output();
			Double referralFeePer=service.getReferralOfSubCategory(catagory, subCatagory);
			output.setReferralFee(sellingPrice*(referralFeePer/100));
			
			output.setClosingFee(service.closingFeeOnSellingPrice(shippingWay, sellingPrice));
			
			if(shippingWay.equalsIgnoreCase("Self Ship")) {
				if(shippingCostForSelfShip!=null) {
					output.setShippingFee(shippingCostForSelfShip.intValue());
				}
			}else {
				output.setShippingFee(service.weightFeeBasedShippingAndZone(weightOfProduct, shippingWay, shippingZone));
			}
			
			if(shippingWay.equalsIgnoreCase("FBA")) {
				output.setOtherFee(service.getOtherFeeOnFBA(weightOfProduct));
				output.setReferralClosingShipping(output.getReferralFee()+output.getClosingFee()+output.getShippingFee()+output.getOtherFee());
			}
			else {
				output.setReferralClosingShipping(output.getReferralFee()+output.getClosingFee()+output.getShippingFee());
			}
			output.setGSTOnreferralClosingShipping(output.getReferralClosingShipping()*0.18);
			output.setTotalAmazonCharges(output.getReferralClosingShipping()+output.getGSTOnreferralClosingShipping());
			output.setYouMake(sellingPrice-output.getTotalAmazonCharges());
			 
			System.out.println(output);
			System.out.println("=========================");
			 
			entity=new ResponseEntity<Output>(output, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return entity;
	}

}
