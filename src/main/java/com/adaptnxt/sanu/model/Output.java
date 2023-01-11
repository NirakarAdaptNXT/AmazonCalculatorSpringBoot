package com.adaptnxt.sanu.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Output {
	private Double referralFee;
	private Integer closingFee;
	private Integer shippingFee;
	private Integer otherFee;
	private Double referralClosingShipping;
	private Double GSTOnreferralClosingShipping;
	private Double totalAmazonCharges;
	private Double youMake;
	
}
