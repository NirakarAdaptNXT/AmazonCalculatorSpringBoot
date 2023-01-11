package com.adaptnxt.sanu.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClosingFee {
	private Integer minVal;
	private Integer maxVal;
	private Integer fixedClosingFee;
	private Integer categoriesWithException;
	
}
