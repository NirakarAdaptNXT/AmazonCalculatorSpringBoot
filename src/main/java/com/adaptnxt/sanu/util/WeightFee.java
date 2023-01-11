package com.adaptnxt.sanu.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeightFee {
	private String size;
	private Integer localFee;
	private Integer RegionalFee;
	private Integer NationalFee;
}
