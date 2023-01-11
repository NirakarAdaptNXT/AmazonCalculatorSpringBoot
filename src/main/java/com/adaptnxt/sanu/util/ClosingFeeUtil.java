package com.adaptnxt.sanu.util;

import java.util.ArrayList;
import java.util.List;

public class ClosingFeeUtil {
	private static  List<ClosingFee> FBA;
	private static List<ClosingFee> easyShip;
	private static  List<ClosingFee> selfShip;
	
	static {
		FBA=new ArrayList();
		FBA.add(new ClosingFee(0,250,25,12));
		FBA.add(new ClosingFee(251,500,20,12));
		FBA.add(new ClosingFee(501,1000,18,18));
		FBA.add(new ClosingFee(1000,null,40,70));
		
		easyShip=new ArrayList();
		easyShip.add(new ClosingFee(0,250,3,null));
		easyShip.add(new ClosingFee(251,500,6,null));
		easyShip.add(new ClosingFee(501,1000,30,null));
		easyShip.add(new ClosingFee(1000,null,56,null));
		
		selfShip=new ArrayList();
		selfShip.add(new ClosingFee(0,250,7,null));
		selfShip.add(new ClosingFee(251,500,20,null));
		selfShip.add(new ClosingFee(501,1000,36,null));
	    selfShip.add(new ClosingFee(1000,null,65,null));
	    
	    System.out.println("ClosingFeeUtil static block executed");
	}
	
	public static Integer closingFeeOnSellingPrice(String shippingWay,Double sellPrice) {
		if(shippingWay.equalsIgnoreCase("FBA")) {
			if(sellPrice>=0 & sellPrice<=250) {
				return FBA.get(0).getFixedClosingFee();
			}
			else if(sellPrice>=251 & sellPrice<=500) {
				return FBA.get(1).getFixedClosingFee();
			}
            else if(sellPrice>=501 & sellPrice<=1000) {
            	return FBA.get(2).getFixedClosingFee();
			}
            else {
            	return FBA.get(3).getFixedClosingFee();
            }
		}
		else if(shippingWay.equalsIgnoreCase("EasyShip")){
			if(sellPrice>=0 & sellPrice<=250) {
				return easyShip.get(0).getFixedClosingFee();
			}
			else if(sellPrice>=251 & sellPrice<=500) {
				return easyShip.get(1).getFixedClosingFee();
			}
            else if(sellPrice>=501 & sellPrice<=1000) {
            	return easyShip.get(2).getFixedClosingFee();
			}
            else {
            	return easyShip.get(3).getFixedClosingFee();
            }
		}
		else {
			if(sellPrice>=0 & sellPrice<=250) {
				return selfShip.get(0).getFixedClosingFee();
			}
			else if(sellPrice>=251 & sellPrice<=500) {
				return selfShip.get(1).getFixedClosingFee();
			}
            else if(sellPrice>=501 & sellPrice<=1000) {
            	return selfShip.get(2).getFixedClosingFee();
			}
            else {
            	return selfShip.get(3).getFixedClosingFee();
            }
		}
	}
	
	public static void main(String[] args) {
		System.out.println(closingFeeOnSellingPrice("SelfShip", Double.valueOf(650)));
	
	}
}
