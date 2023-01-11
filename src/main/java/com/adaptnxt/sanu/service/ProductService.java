package com.adaptnxt.sanu.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.adaptnxt.sanu.util.ClosingFeeUtil;
import com.adaptnxt.sanu.util.OtherFeeUtil;
import com.adaptnxt.sanu.util.ReferralUtil;
import com.adaptnxt.sanu.util.WeightHandlingFeeUtil;

@Service
public class ProductService {
	
	//get All category
	public Set<String> getAllCatagory(){
		return ReferralUtil.allCategory();
	}
	
	//get all sub category of a category
	public Set<String> getAllSubCatagoryOfACategory(String name){
		return ReferralUtil.allSubCategoryOfACategory(name);
	}
	
	//get referral fee of a product based on category and subcategory
	public Double getReferralOfSubCategory(String catagory, String subCatagory) {
		return ReferralUtil.getReferralOfSubCategory(catagory, subCatagory);
	}
	
	//get closing fee based on shipping way and selling price
	public Integer closingFeeOnSellingPrice(String shippingWay, Double sellingPrice) {
		return ClosingFeeUtil.closingFeeOnSellingPrice(shippingWay, sellingPrice);
	}
	
	//shipping fee based on weight,shipping zone,shipping way
	public Integer weightFeeBasedShippingAndZone(Integer weightOfProduct,String shippingWay,String shippingZone) {
		return WeightHandlingFeeUtil.weightFeeBasedShippingAndZone(weightOfProduct, shippingWay, shippingZone);
	}
	
	//get other fee only applicable to FBA 
	public Integer getOtherFeeOnFBA(Integer weight) {
		return OtherFeeUtil.getOtherFeeOnFBA(weight);
	}
}
