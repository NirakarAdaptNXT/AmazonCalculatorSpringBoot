package com.adaptnxt.sanu.model;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {
	private String product_catagory;
	private String product_sub_catagory;
	
	private Double sell_price_of_product;
	
	private Double weight_of_product;
	
	private String ways_of_shipping;
	private String shipping_charge;
	
	private String shipping_zone;
	
	
	

}
