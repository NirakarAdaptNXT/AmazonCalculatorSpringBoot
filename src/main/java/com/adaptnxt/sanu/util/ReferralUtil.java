package com.adaptnxt.sanu.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReferralUtil {
	
	private static Map<String,Map<String,Double>> category;
	
	private static Map<String,Double> subCategoryAutomotive;
	private static Map<String,Double> subCategoryBabyProduct;
	private static Map<String,Double> subCategoryBookMusic;
	private static Map<String,Double> subCategoryIndustrialMedical;
	private static Map<String,Double> subCategoryClothingFashion;
	private static Map<String,Double> subCategoryElectronics;
	private static Map<String,Double> subCategoryGrocery;
	private static Map<String,Double> subCategoryHealthBeauty;
	private static Map<String,Double> subCategoryHomeDecor;
	private static Map<String,Double> subCategoryKitchenAppliances;
	private static Map<String,Double> subCategorySportsGym;
	private static Map<String,Double> subCategoryOthers;
	
	static {
		subCategoryAutomotive=new HashMap<>();
		subCategoryAutomotive.put("Automotive - Helmets, Oils & Lubricants, Batteries, Pressure washer, Vacuum cleaner, Air Freshener, Air purifiers and Vehicle Tools",Double.valueOf(6.5));
		subCategoryAutomotive.put("Automotive - Tyres & Rims",Double.valueOf(5));
		subCategoryAutomotive.put("Automotive Vehicles - 2-Wheelers, 4-Wheelers and Electric Vehicles",Double.valueOf(2));
		subCategoryAutomotive.put("Automotive – Car and Bike parts, Brakes, Styling and body fittings, Transmission, Engine parts, Exhaust systems, Interior fitting, Suspension and Wipers",Double.valueOf(11));
		subCategoryAutomotive.put("Automotive - Other Subcategories",Double.valueOf(18));
		subCategoryAutomotive.put("Automotive – Cleaning kits (Sponges, Brush, Duster, Cloths and liquids), Car interior & exterior care (Waxes, polish, Shampoo and other), Car and Bike Lighting and Paints", Double.valueOf(9));
		subCategoryAutomotive.put("Automotive Accessories (Floor Mats, Seat/Car/Bike Covers) and Riding Gear (Face Covers and Gloves)",Double.valueOf(16));
		subCategoryAutomotive.put("Car Electronics Devices",Double.valueOf(5.5));
		subCategoryAutomotive.put("Car Electronics Accessories",Double.valueOf(10.5));
		
		subCategoryBabyProduct=new HashMap<>();
		subCategoryBabyProduct.put("Baby Products - Other Products", Double.valueOf(6));
		subCategoryBabyProduct.put("Baby Hardlines - Swings, Bouncers and Rockers, Carriers, Walkers Baby Safety - Guards & Locks Baby Room Décor Baby Furniture Baby Car Seats & Accessories appa Strollers, Buggies & Prams", Double.valueOf(6));
		subCategoryBabyProduct.put("Craft Materials", Double.valueOf(8));
		subCategoryBabyProduct.put("Toys - Other Products", Double.valueOf(10));
		subCategoryBabyProduct.put("Toys - Drones", Double.valueOf(11));
		subCategoryBabyProduct.put("Toys - Balloons and Soft Toys", Double.valueOf(11));
		
		subCategoryBookMusic=new HashMap<>();
		subCategoryBookMusic.put("Books", Double.valueOf(9));
		subCategoryBookMusic.put("Movies", Double.valueOf(6.5));
		subCategoryBookMusic.put("Music", Double.valueOf(6.5));
		subCategoryBookMusic.put("Musical Instruments (excluding Guitars and Keyboards)", Double.valueOf(7.5));
		subCategoryBookMusic.put("Musical Instruments - Guitars", Double.valueOf(8));
		subCategoryBookMusic.put("Musical Instruments - Keyboards", Double.valueOf(5));
		subCategoryBookMusic.put("Musical Instruments - DJ & VJ Equipment,Recording and Computer,Cables & Leads,Microphones,PA & Stage", Double.valueOf(9.5));
		subCategoryBookMusic.put("Video Games - Online game services", Double.valueOf(2));
		subCategoryBookMusic.put("Video Games - Accessories", Double.valueOf(12));
		subCategoryBookMusic.put("Video Games - Consoles", Double.valueOf(8));
		subCategoryBookMusic.put("Video Games", Double.valueOf(9));
		
		subCategoryIndustrialMedical=new HashMap<>();
		subCategoryIndustrialMedical.put("Business and Industrial Supplies - Robotics, Lab supplies, Soldering equipment, Personal Protective equipment (excluding masks) and PPE kits",Double.valueOf(11.5));
		subCategoryIndustrialMedical.put("Janitorial & Sanitation (Cleaners & deodorisers, Mops/buckets, tissues & wipes, commercial vacuum cleaners, dispensers etc.), Medical and Healthcare supplies",Double.valueOf(5.5));
		subCategoryIndustrialMedical.put("Pharmacy - Prescription Medicines",Double.valueOf(5.5));
		subCategoryIndustrialMedical.put("Masks",Double.valueOf(6));
		subCategoryIndustrialMedical.put("Weighing Scales & Fat Analyzers",Double.valueOf(15));
		subCategoryIndustrialMedical.put("Business and Industrial Supplies - Material Handling Equipment, Janitorial & Sanitation, Medical & Dental Supplies, Commercial kitchen and refrigeration Equipment",Double.valueOf(5.5));
		subCategoryIndustrialMedical.put("Business and Industrial Supplies - Electrical Testing, Dimensional Measurement, 3D Printer, Thermal Printers, Barcode Scanners",Double.valueOf(5));
		subCategoryIndustrialMedical.put("Business and Industrial Supplies -Power tools & accessories, Welding machines, Microscopes, Industrial Electrical products",Double.valueOf(9));
		subCategoryIndustrialMedical.put("Occupational Safety Supplies (Mask, gloves, Safety shoes, Face shields & other PPE products)",Double.valueOf(5));
		subCategoryIndustrialMedical.put("Business and Industrial Supplies - Testing & Measuring instruments, Tapes & Adhesives, Packaging material, 3D printer, Thermal printer and Barcode scanner",Double.valueOf(7));
		subCategoryIndustrialMedical.put("Office products - Office supplies, stationary, Paper products, Art and craft supplies, Pens, Pencils & Writing Supplies",Double.valueOf(8));
		subCategoryIndustrialMedical.put("Office - Other products",Double.valueOf(8.5));
		
		subCategoryClothingFashion=new HashMap<>();
		subCategoryClothingFashion.put("Apparel - Accessories",Double.valueOf(18));
		subCategoryClothingFashion.put("Apparel - Sweat Shirts and Jackets",Double.valueOf(19));
		subCategoryClothingFashion.put("Apparel - Shorts",Double.valueOf(19));
		subCategoryClothingFashion.put("Apparel - Baby",Double.valueOf(15));
		subCategoryClothingFashion.put("Apparel - Ethnic wear",Double.valueOf(18.5));
		subCategoryClothingFashion.put("Apparel - Other innerwear",Double.valueOf(12.5));
		subCategoryClothingFashion.put("Apparel - Sleepwear",Double.valueOf(13));
		subCategoryClothingFashion.put("Apparel - Other Products",Double.valueOf(18));
		subCategoryClothingFashion.put("Apparel - Sarees and Dress Materials",Double.valueOf(19.5));
		subCategoryClothingFashion.put("Apparel - Men's T-shirts (except Polos, Tank tops and full sleeve tops)",Double.valueOf(17));
		subCategoryClothingFashion.put("Apparel - Womens' Innerwear / Lingerie",Double.valueOf(12));
		subCategoryClothingFashion.put("Backpacks",Double.valueOf(10));
		subCategoryClothingFashion.put("Eyewear - Sunglasses, Frames and zero power eye glasses",Double.valueOf(14));
		subCategoryClothingFashion.put("Fashion Jewellery",Double.valueOf(24));
		subCategoryClothingFashion.put("Fine Jewellery - Gold Coins",Double.valueOf(2.5));
		subCategoryClothingFashion.put("Fine Jewellery - studded",Double.valueOf(10));
		subCategoryClothingFashion.put("Fine Jewellery - unstudded and solitaire",Double.valueOf(5));
		subCategoryClothingFashion.put("Flip Flops, Fashion Sandals and Slippers",Double.valueOf(12.5));
		subCategoryClothingFashion.put("Handbags",Double.valueOf(8));
		subCategoryClothingFashion.put("Luggage - Suitcase & Trolleys",Double.valueOf(5.5));
		subCategoryClothingFashion.put("Luggage - Travel Accessories",Double.valueOf(10));
		subCategoryClothingFashion.put("Luggage - Other Subcategories",Double.valueOf(5.5));
		subCategoryClothingFashion.put("Silver Jewellery",Double.valueOf(10.5));
		subCategoryClothingFashion.put("Shoes",Double.valueOf(16));
		subCategoryClothingFashion.put("Kids footwear",Double.valueOf(15));
		subCategoryClothingFashion.put("Shoes - Sandals & Floaters",Double.valueOf(10.5));
		subCategoryClothingFashion.put("Wallets",Double.valueOf(12));
		subCategoryClothingFashion.put("Watches",Double.valueOf(13.5));
		
		subCategoryElectronics=new HashMap<>();
		subCategoryElectronics.put("Cables - Electronics, PC, Wireless", Double.valueOf(20));
		subCategoryElectronics.put("Camera Accessories", Double.valueOf(11));
		subCategoryElectronics.put("Camera Lenses", Double.valueOf(7));
		subCategoryElectronics.put("Camera and Camcorder", Double.valueOf(5));
		subCategoryElectronics.put("Cases, Covers, Skins, Screen Guards", Double.valueOf(20));
		subCategoryElectronics.put("Desktops", Double.valueOf(8));
		subCategoryElectronics.put("Electronic Accessories (Electronics, PC & Wireless)", Double.valueOf(17));
		subCategoryElectronics.put("Electronic Devices (except TV, Camera & Camcorder, Camera Lenses and Accessories, GPS Devices, Speakers)", Double.valueOf(9));
		subCategoryElectronics.put("Entertainment Collectibles", Double.valueOf(15));
		subCategoryElectronics.put("Fashion Smartwatches", Double.valueOf(14.5));
		subCategoryElectronics.put("GPS Devices", Double.valueOf(13.5));
		subCategoryElectronics.put("Hard Disks", Double.valueOf(8.5));
		subCategoryElectronics.put("Headsets, Headphones and Earphones", Double.valueOf(18));
		subCategoryElectronics.put("Keyboards and Mouse", Double.valueOf(13));
		subCategoryElectronics.put("Kindle Accessories", Double.valueOf(25));
		subCategoryElectronics.put("Laptop Bags & Sleeves", Double.valueOf(10));
		subCategoryElectronics.put("Laptop and Camera Battery", Double.valueOf(12));
		subCategoryElectronics.put("Laptops", Double.valueOf(6));
		subCategoryElectronics.put("Memory Cards", Double.valueOf(13));
		subCategoryElectronics.put("Mobile phones", Double.valueOf(5));
		subCategoryElectronics.put("Tablets (including Graphic Tablets)",Double.valueOf(6));
		subCategoryElectronics.put("Modems & Networking Devices",Double.valueOf(14));
		subCategoryElectronics.put("Monitors",Double.valueOf(6.5));
		subCategoryElectronics.put("PC Components (RAM, Motherboards)",Double.valueOf(5.5));
		subCategoryElectronics.put("Power Banks & Chargers",Double.valueOf(20));
		subCategoryElectronics.put("Printers & Scanners",Double.valueOf(9));
		subCategoryElectronics.put("Software Products",Double.valueOf(9.5));
		subCategoryElectronics.put("Speakers",Double.valueOf(11));
		subCategoryElectronics.put("Television",Double.valueOf(6));
		subCategoryElectronics.put("Landline Phones",Double.valueOf(7));
		subCategoryElectronics.put("USB Flash Drives (Pen Drives)",Double.valueOf(16));
		subCategoryElectronics.put("Projectors, Home Theatre Systems, Binoculars and Telescopes",Double.valueOf(6));
		
		subCategoryGrocery=new HashMap<>();
		subCategoryGrocery.put("Grocery and Gourmet - Other Products",Double.valueOf(5.5));
		subCategoryGrocery.put("Grocery and Gourmet - Hampers and gifting",Double.valueOf(9.5));
		subCategoryGrocery.put("Pet Products",Double.valueOf(11.5));
		
		subCategoryHealthBeauty=new HashMap<>();
		subCategoryHealthBeauty.put("Beauty - Fragrance", Double.valueOf(14));
		subCategoryHealthBeauty.put("Beauty - Haircare, Bath and Shower", Double.valueOf(7));
		subCategoryHealthBeauty.put("Beauty - Makeup", Double.valueOf(6));
		subCategoryHealthBeauty.put("Beauty Products", Double.valueOf(6));
		subCategoryHealthBeauty.put("Deodrants", Double.valueOf(6.5));
		subCategoryHealthBeauty.put("Facial steamers", Double.valueOf(7));
		subCategoryHealthBeauty.put("Prescription Medicine", Double.valueOf(2.5));
		subCategoryHealthBeauty.put("Health & Personal Care (HPC) - Medical Equipment & Contact Lens", Double.valueOf(8));
		subCategoryHealthBeauty.put("Health and Personal Care - Ayurvedic products, Oral care, hand sanitizers, Pooja supplies", Double.valueOf(8));
		subCategoryHealthBeauty.put("Health & Personal Care (HPC) - Nutrition", Double.valueOf(9));
		subCategoryHealthBeauty.put("Health & Personal Care (HPC) - Other Subcategories", Double.valueOf(11));
		subCategoryHealthBeauty.put("Health and Personal Care - Other Household Supplies", Double.valueOf(6.5));
		subCategoryHealthBeauty.put("Health and Personal Care - Contact lens and reading glasses", Double.valueOf(12));
		subCategoryHealthBeauty.put("Luxury Beauty", Double.valueOf(5));
		subCategoryHealthBeauty.put("Car Cradles, Lens Kits and Tablet Cases", Double.valueOf(23));
		subCategoryHealthBeauty.put("Personal Care Appliances - Electric Massagers", Double.valueOf(14.5));
		subCategoryHealthBeauty.put("Personal Care Appliances (Grooming & Styling)", Double.valueOf(9));
		subCategoryHealthBeauty.put("Personal Care Appliances - Glucometer and Glucometer Strips", Double.valueOf(5.5));
		subCategoryHealthBeauty.put("Personal Care Appliances - Thermometers", Double.valueOf(10.5));
		subCategoryHealthBeauty.put("Personal Care Appliances - Weighing Scales and Fat Analyzers", Double.valueOf(12));
		subCategoryHealthBeauty.put("Personal Care Appliances - Other Products", Double.valueOf(7.5));
		
		subCategoryHomeDecor=new HashMap<>();
		subCategoryHomeDecor.put("Bean Bags & Inflatables", Double.valueOf(11));
		subCategoryHomeDecor.put("Mattresses", Double.valueOf(14));
		subCategoryHomeDecor.put("Clocks", Double.valueOf(8));
		subCategoryHomeDecor.put("Furniture - Other products", Double.valueOf(13));
		subCategoryHomeDecor.put("Home - Fragrance & Candles", Double.valueOf(10.5));
		subCategoryHomeDecor.put("Carpets, Bedsheets, Blankets and covers", Double.valueOf(10.5));
		subCategoryHomeDecor.put("Home Furnishing", Double.valueOf(12));
		subCategoryHomeDecor.put("Containers, Boxes, Bottles, and Kitchen Storage", Double.valueOf(11.5));
		subCategoryHomeDecor.put("Home improvement - Wallpapers", Double.valueOf(13.5));
		subCategoryHomeDecor.put("Home improvement (excl. accessories), including Home Security Systems", Double.valueOf(9));
		subCategoryHomeDecor.put("Ladders, Kitchen and Bath fixtures", Double.valueOf(8));
		subCategoryHomeDecor.put("Home Storage (Excluding Kitchen Containers, Boxes, Bottles, and Kitchen Storage)", Double.valueOf(14));
		subCategoryHomeDecor.put("Wallpapers & Wallpaper Accessories", Double.valueOf(11));
		subCategoryHomeDecor.put("Home - Other Subcategories", Double.valueOf(17));
		subCategoryHomeDecor.put("Home - Waste & Recycling", Double.valueOf(6));
		subCategoryHomeDecor.put("Home - Posters", Double.valueOf(17));
		subCategoryHomeDecor.put("Home improvement - Kitchen & Bath, Cleaning Supplies, Paints, Electricals, Hardware, Building Materials", Double.valueOf(9));
		subCategoryHomeDecor.put("Home Safety & Security Systems", Double.valueOf(6));
		subCategoryHomeDecor.put("Ladders", Double.valueOf(7));
		subCategoryHomeDecor.put("Indoor Lighting - Others", Double.valueOf(16));
		subCategoryHomeDecor.put("Indoor Lighting – Wall, ceiling fixture lights, lamp bases, lamp shades and Smart Lighting", Double.valueOf(13));
		subCategoryHomeDecor.put("LED Bulbs and Battens", Double.valueOf(12));
		subCategoryHomeDecor.put("Cushion Covers", Double.valueOf(10));
		subCategoryHomeDecor.put("Slipcovers and Kitchen Linens", Double.valueOf(14.50));
		subCategoryHomeDecor.put("Safes and Lockers with Locking Mechanism", Double.valueOf(11));
		subCategoryHomeDecor.put("Lawn & Garden - Commercial Agricultural Products", Double.valueOf(3));
		subCategoryHomeDecor.put("Lawn & Garden- Chemical Pest Control, Mosquito nets, Bird control, Plant protection, Foggers", Double.valueOf(8));
		subCategoryHomeDecor.put("Lawn & Garden - Solar Devices (Panels, Inverters, Charge controller, Battery, Lights, Solar gadgets)", Double.valueOf(8));
		subCategoryHomeDecor.put("Lawn and Garden - Planters, Fertilisers, Watering and other subcategories",Double.valueOf(10));
		subCategoryHomeDecor.put("Lawn and Garden - Plants, Seeds & Bulbs",Double.valueOf(10));
		subCategoryHomeDecor.put("Lawn & Garden - Outdoor equipments (Saws, Lawn Mowers, Cultivator, Tiller, String Trimmers, Water Pumps, Generators, Barbeque Grills, Greenhouses)",Double.valueOf(5.5));
		subCategoryHomeDecor.put("Lawn and Garden - Other products",Double.valueOf(10));
		
		
		subCategoryKitchenAppliances=new HashMap<>();
		subCategoryKitchenAppliances.put("Kitchen- Non Appliances",Double.valueOf(11.5));
		subCategoryKitchenAppliances.put("Kitchen - Glassware & Ceramicware",Double.valueOf(13.5));
		subCategoryKitchenAppliances.put("Kitchen - Gas Stoves & Pressure Cookers",Double.valueOf(7.5));
		subCategoryKitchenAppliances.put("Kitchen Tools & Supplies - Choppers, Knives, Bakeware & Accessories",Double.valueOf(11.5));
		subCategoryKitchenAppliances.put("Large Appliances (excl. Accessories, Refrigerators and Chimneys)",Double.valueOf(5.5));
		subCategoryKitchenAppliances.put("Large Appliances - Accessories",Double.valueOf(16));
		subCategoryKitchenAppliances.put("Large Appliances - Chimneys",Double.valueOf(7.5));
		subCategoryKitchenAppliances.put("Large Appliances – Refrigerators",Double.valueOf(5));
		subCategoryKitchenAppliances.put("Small Appliances",Double.valueOf(7.5));
		subCategoryKitchenAppliances.put("Fans and Robotic Vacuums",Double.valueOf(7.5));
		
		subCategorySportsGym=new HashMap<>();
		subCategorySportsGym.put("Bicycles", Double.valueOf(6));
		subCategorySportsGym.put("Gym Equipments", Double.valueOf(10));
		subCategorySportsGym.put("Sports-Cricket and Badminton Equipments,Tennis,Table Tennis,Squash,Football,Volleyball,Basketball,Throwball,Swimming", Double.valueOf(8));
		subCategorySportsGym.put("Sports & Outdoors - Footwear", Double.valueOf(15));
		subCategorySportsGym.put("Sports & Outdoors - Other Products (excl. cricket and badminton equipments)", Double.valueOf(13));
		
		subCategoryOthers=new HashMap<>();
		subCategoryOthers.put("Coin Collectibles", Double.valueOf(15));
		subCategoryOthers.put("Consumable Physical Gift Card", Double.valueOf(5));
		subCategoryOthers.put("Fine Art", Double.valueOf(20));
		subCategoryOthers.put("Silver Coins & Bars", Double.valueOf(2.5));
		subCategoryOthers.put("Sports Collectibles", Double.valueOf(17));
		subCategoryOthers.put("Wall Art", Double.valueOf(13.5));
		subCategoryOthers.put("Warranty Services", Double.valueOf(25));
		
		category=new HashMap<>();
		category.put("Automotive, Car & Accessories", subCategoryAutomotive);
		category.put("Baby Products, Toys & Education", subCategoryBabyProduct);
		category.put("Books, Music, Movies, Video Games, Entertainment", subCategoryBookMusic);
		category.put("Industrial, Medical, Scientific Supplies & Office Products", subCategoryIndustrialMedical);
		category.put("Clothing, Fashion, Fashion Accessories, Jewellery, Luggage, Shoes",subCategoryClothingFashion );
		category.put("Electronics (Camera, Mobile, PC, Wireless) & Accessories", subCategoryElectronics);
		category.put("Grocery, Food & Pet Supplies",subCategoryGrocery);
		category.put("Health, Beauty, Personal Care & Personal Care Appliances",subCategoryHealthBeauty);
		category.put("Home, Décor, Home Improvement, Furniture, Outdoor, Lawn & Garden",subCategoryHomeDecor );
		category.put("Kitchen, Large & Small Appliances",subCategoryKitchenAppliances);
		category.put("Sports, Gym & Sporting Equipment",subCategorySportsGym);
		category.put("Others",subCategoryOthers);
		
		System.out.println("ReferralFeeUtil static block executed");
	}
	
	//get all category as set
	public static Set<String> allCategory(){
		return category.keySet();
	}
	
	//get all subcategory as set of a category
	public static Set<String> allSubCategoryOfACategory(String categoryName){
		Map<String,Double> map=category.get(categoryName);
		return map.keySet();
	}
	
	//get referral fee of a subcategory
	public static Double getReferralOfSubCategory(String categoryName,String subCategoryName) {
		Map<String,Double> map=category.get(categoryName);
		return map.get(subCategoryName);
	}
	
	public static void main(String[] args) {
		System.out.println(allCategory());
		System.out.println(allSubCategoryOfACategory("Electronics (Camera, Mobile, PC, Wireless) & Accessories"));
		System.out.println(getReferralOfSubCategory("Electronics (Camera, Mobile, PC, Wireless) & Accessories","Camera Accessories"));
	}
}
