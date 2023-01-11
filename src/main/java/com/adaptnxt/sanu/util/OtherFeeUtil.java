package com.adaptnxt.sanu.util;

import java.util.HashMap;
import java.util.Map;

public class OtherFeeUtil {
	private static  Map<String,Integer> pickAndPack;
	private static Integer storageFee;
	
	static {
		pickAndPack=new HashMap<>();
		pickAndPack.put("Standard", 13);
		pickAndPack.put("Heavy", 26);
		
		storageFee=45;
		System.out.println("OtherFeeUtil static block executed");
	}
	
	public static Integer getOtherFeeOnFBA(Integer weight) {
		if(weight<22500) {
			return pickAndPack.get("Standard")+storageFee;
		} 
		else {
			return pickAndPack.get("Heavy")+storageFee;
		}
	}
}
