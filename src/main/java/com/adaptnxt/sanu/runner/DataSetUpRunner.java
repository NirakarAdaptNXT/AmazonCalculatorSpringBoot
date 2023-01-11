package com.adaptnxt.sanu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adaptnxt.sanu.util.ClosingFeeUtil;
import com.adaptnxt.sanu.util.OtherFeeUtil;
import com.adaptnxt.sanu.util.ReferralUtil;
import com.adaptnxt.sanu.util.WeightHandlingFeeUtil;

@Component
public class DataSetUpRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
	
		System.out.println("DataSetUpRunner executed");
	    //Class cls1=ReferralUtil.class;
		
		Class.forName("com.adaptnxt.sanu.util.ReferralUtil");
		Class.forName("com.adaptnxt.sanu.util.ClosingFeeUtil");
		Class.forName("com.adaptnxt.sanu.util.WeightHandlingFeeUtil");
		Class.forName("com.adaptnxt.sanu.util.OtherFeeUtil");
		

	}

}
