package com.adaptnxt.sanu.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightHandlingFeeUtil {
	private static Map<String,List<WeightFee>> FBAWeightHandling;
	private static Map<String,List<WeightFee>> EasyShipWeightHandling;

	private static List<WeightFee> FBAStandardWeight;
	private static List<WeightFee> FBAHeavyWeight;

	private static List<WeightFee> EasyShipStandardWeight;
	private static List<WeightFee> EasyShipHeavyWeight;

	static {
		FBAStandardWeight=new ArrayList<>();
		FBAStandardWeight.add(new WeightFee("First 500 gms",31,40,61));
		FBAStandardWeight.add(new WeightFee("Each additional 500 gms upto 1kg",13,17,25));
		FBAStandardWeight.add(new WeightFee("Each additional kg after 1 kg",21,27,33));
		FBAStandardWeight.add(new WeightFee("Each additional kg after 5 kgs",12,13,16));

		FBAHeavyWeight=new ArrayList<>();
		FBAHeavyWeight.add(new WeightFee("First 12 kgs ",88,130,178));
		FBAHeavyWeight.add(new WeightFee("Each additional kg",2,3,6));

		FBAWeightHandling=new HashMap<>();
		FBAWeightHandling.put("Standard Size", FBAStandardWeight);
		FBAWeightHandling.put("Heavy & Bulky Items", FBAHeavyWeight);

		EasyShipStandardWeight=new ArrayList<>();
		EasyShipStandardWeight.add(new WeightFee("First 500 gms",44,53,74));
		EasyShipStandardWeight.add(new WeightFee("Each additional 500 gms upto 1kg",13,17,25));
		EasyShipStandardWeight.add(new WeightFee("Each additional kg after 1 kg",21,27,33));
		EasyShipStandardWeight.add(new WeightFee("Each additional kg after 5 kgs",12,13,16));

		EasyShipHeavyWeight=new ArrayList<>();
		EasyShipHeavyWeight.add(new WeightFee("First 12 kgs ",192,277,371));
		EasyShipHeavyWeight.add(new WeightFee("Each additional kg",5,6,12));

		EasyShipWeightHandling=new HashMap<>();
		EasyShipWeightHandling.put("Standard Size", EasyShipStandardWeight);
		EasyShipWeightHandling.put("Heavy & Bulky Items", EasyShipHeavyWeight);
		
		System.out.println("WeightHandlingFeeUtil static block executed");
	}

	public static Integer weightFeeBasedShippingAndZone(Integer weight,String shippingWay,String zone) {
		if(shippingWay.equalsIgnoreCase("FBA")) {
			WeightFee wFeeUpto500=FBAStandardWeight.get(0);
			WeightFee wFeeUpto1000=FBAStandardWeight.get(1);
			WeightFee wFeeUpto5000PerKg=FBAStandardWeight.get(2);
			WeightFee wFeeUpto22500PerKg=FBAStandardWeight.get(3);

			WeightFee wFeefirst12Kg=FBAHeavyWeight.get(0);
			WeightFee wFeeAfter12KgPerKg=FBAHeavyWeight.get(1);
			if(weight<=22500) {
				if(weight<=500) {
					if(zone.equalsIgnoreCase("Local")) {
						return wFeeUpto500.getLocalFee();
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						return wFeeUpto500.getRegionalFee();
					}
					else {
						return wFeeUpto500.getNationalFee();
					}
				}
				else if(weight>500 & weight<=1000) {
					if(zone.equalsIgnoreCase("Local")) {
						return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee();
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee();
					}
					else {
						return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee();
					}
				}
				else if(weight >1000 & weight<=5000) {
					Integer count=weight/1000;
					if(zone.equalsIgnoreCase("Local")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*count;
						}
						else {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*(count-1);
						}	   
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*count;
						}
						else {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*(count-1);
						}
					}
					else {
						if(weight%1000 !=0) {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*count;
						}
						else {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*(count-1);
						}
					}
				}
				else{
					Integer count=weight/1000;
					if(zone.equalsIgnoreCase("Local")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*4+wFeeUpto22500PerKg.getLocalFee()*(count-4);
						}
						else {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*4+wFeeUpto22500PerKg.getLocalFee()*(count-5);
						}	   
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*4+wFeeUpto22500PerKg.getRegionalFee()*(count-4);
						}
						else {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*4+wFeeUpto22500PerKg.getRegionalFee()*(count-5);
						}
					}
					else {
						if(weight%1000 !=0) {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*4+wFeeUpto22500PerKg.getNationalFee()*(count-4);
						}
						else {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*4+wFeeUpto22500PerKg.getNationalFee()*(count-5);
						}
					}
				}
			}//if
			else {
				Integer count=weight/1000;
				if(zone.equalsIgnoreCase("Local")) {
					if(weight%1000 !=0) {
						return wFeefirst12Kg.getLocalFee()+wFeeAfter12KgPerKg.getLocalFee()*(count-11);
					}
					else {
						return wFeefirst12Kg.getLocalFee()+wFeeAfter12KgPerKg.getLocalFee()*(count-12);
					}	   
				}
				else if(zone.equalsIgnoreCase("Regional")) {
					if(weight%1000 !=0) {
						return wFeefirst12Kg.getRegionalFee()+wFeeAfter12KgPerKg.getRegionalFee()*(count-11);
					}
					else {
						return wFeefirst12Kg.getRegionalFee()+wFeeAfter12KgPerKg.getRegionalFee()*(count-12);
					}
				}
				else {
					if(weight%1000 !=0) {
						return wFeefirst12Kg.getNationalFee()+wFeeAfter12KgPerKg.getNationalFee()*(count-11);
					}
					else {
						return wFeefirst12Kg.getNationalFee()+wFeeAfter12KgPerKg.getNationalFee()*(count-12);
					}
				}
			}//else

		}else //if(shippingWay.equalsIgnoreCase("EasyShip")) {
		{   WeightFee wFeeUpto500=EasyShipStandardWeight.get(0);
			WeightFee wFeeUpto1000=EasyShipStandardWeight.get(1);
			WeightFee wFeeUpto5000PerKg=EasyShipStandardWeight.get(2);
			WeightFee wFeeUpto22500PerKg=EasyShipStandardWeight.get(3);

			WeightFee wFeefirst12Kg=EasyShipHeavyWeight.get(0);
			WeightFee wFeeAfter12KgPerKg=EasyShipHeavyWeight.get(1);
			if(weight<=22500) {
				if(weight<=500) {
					if(zone.equalsIgnoreCase("Local")) {
						return wFeeUpto500.getLocalFee();
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						return wFeeUpto500.getRegionalFee();
					}
					else {
						return wFeeUpto500.getNationalFee();
					}
				}
				else if(weight>500 & weight<=1000) {
					if(zone.equalsIgnoreCase("Local")) {
						return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee();
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee();
					}
					else {
						return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee();
					}
				}
				else if(weight >1000 & weight<=5000) {
					Integer count=weight/1000;
					if(zone.equalsIgnoreCase("Local")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*count;
						}
						else {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*(count-1);
						}	   
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*count;
						}
						else {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*(count-1);
						}
					}
					else {
						if(weight%1000 !=0) {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*count;
						}
						else {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*(count-1);
						}
					}
				}
				else{
					Integer count=weight/1000;
					if(zone.equalsIgnoreCase("Local")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*4+wFeeUpto22500PerKg.getLocalFee()*(count-4);
						}
						else {
							return wFeeUpto500.getLocalFee()+wFeeUpto1000.getLocalFee()+wFeeUpto5000PerKg.getLocalFee()*4+wFeeUpto22500PerKg.getLocalFee()*(count-5);
						}	   
					}
					else if(zone.equalsIgnoreCase("Regional")) {
						if(weight%1000 !=0) {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*4+wFeeUpto22500PerKg.getRegionalFee()*(count-4);
						}
						else {
							return wFeeUpto500.getRegionalFee()+wFeeUpto1000.getRegionalFee()+wFeeUpto5000PerKg.getRegionalFee()*4+wFeeUpto22500PerKg.getRegionalFee()*(count-5);
						}
					}
					else {
						if(weight%1000 !=0) {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*4+wFeeUpto22500PerKg.getNationalFee()*(count-4);
						}
						else {
							return wFeeUpto500.getNationalFee()+wFeeUpto1000.getNationalFee()+wFeeUpto5000PerKg.getNationalFee()*4+wFeeUpto22500PerKg.getNationalFee()*(count-5);
						}
					}
				}
			}
			else {
				Integer count=weight/1000;
				if(zone.equalsIgnoreCase("Local")) {
					if(weight%1000 !=0) {
						return wFeefirst12Kg.getLocalFee()+wFeeAfter12KgPerKg.getLocalFee()*(count-11);
					}
					else {
						return wFeefirst12Kg.getLocalFee()+wFeeAfter12KgPerKg.getLocalFee()*(count-12);
					}	   
				}
				else if(zone.equalsIgnoreCase("Regional")) {
					if(weight%1000 !=0) {
						return wFeefirst12Kg.getRegionalFee()+wFeeAfter12KgPerKg.getRegionalFee()*(count-11);
					}
					else {
						return wFeefirst12Kg.getRegionalFee()+wFeeAfter12KgPerKg.getRegionalFee()*(count-12);
					}
				}
				else {
					if(weight%1000 !=0) {
						return wFeefirst12Kg.getNationalFee()+wFeeAfter12KgPerKg.getNationalFee()*(count-11);
					}
					else {
						return wFeefirst12Kg.getNationalFee()+wFeeAfter12KgPerKg.getNationalFee()*(count-12);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(weightFeeBasedShippingAndZone(1200, "FBA", "Regional"));
	}
}
