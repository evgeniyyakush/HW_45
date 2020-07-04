package core;

import org.openqa.selenium.WebDriver;

public class SignUp_PageFactory {
	static String borwser = "firefox";
	
	public static void validate(WebDriver driver, String url) {
		
		Common_PageFactory.open(borwser, url);
		
		Common_PageFactory.pageValidation("01.01 Element [Quotes (dynamic)]", 			Common_PageFactory.pf_el_01);
		Common_PageFactory.pageValidation("02.02 Element [Current Location]", 	    		Common_PageFactory.pf_el_02);
		Common_PageFactory.pageValidation("03.03 Element [Weather Icon]", 		    		Common_PageFactory.pf_el_03);
		Common_PageFactory.pageValidation("04.04 Element [Quotes (dynamic)]", 			Common_PageFactory.pf_el_04);
		Common_PageFactory.pageValidation("05.05 Element [Title]",									Common_PageFactory.pf_el_05);
		
		Common_PageFactory.pageValidation("06.06 Element [First Name (label)]",			    Common_PageFactory.pf_el_06);
		Common_PageFactory.pageValidation("07.07 Element [First Name (field)]",				Common_PageFactory.pf_el_07);
		Common_PageFactory.pageValidation("08.08 Element [Last Name (label)]", 			Common_PageFactory.pf_el_08);
		Common_PageFactory.pageValidation("09.09 Element [Last Name (field)]", 				Common_PageFactory.pf_el_09);
		Common_PageFactory.pageValidation("10.10 Element [Email (label)]", 					Common_PageFactory.pf_el_10);
			
		Common_PageFactory.pageValidation("11.11 Element [Email (filed)]", 						Common_PageFactory.pf_el_11);
		Common_PageFactory.pageValidation("12.12 Element [Phone (label)]", 					Common_PageFactory.pf_el_12);
		Common_PageFactory.pageValidation("13.13 Element [Phone (field)]", 					Common_PageFactory.pf_el_13);
		Common_PageFactory.pageValidation("14.14 Element [Genre (label)]", 					Common_PageFactory.pf_el_14);
		Common_PageFactory.pageValidation("15.15 Element [Male (label)]", 					    Common_PageFactory.pf_el_15);
		
		Common_PageFactory.pageValidation("16.16 Element [Male (radio button)]",		   Common_PageFactory.pf_el_16);
		Common_PageFactory.pageValidation("17.17 Element [Female (label)]", 				   Common_PageFactory.pf_el_17);
		Common_PageFactory.pageValidation("18.18 Element [Female (radio button)]",	   Common_PageFactory.pf_el_18);
		Common_PageFactory.pageValidation("19.19 Element [State (label)]", 					   Common_PageFactory.pf_el_19);
		Common_PageFactory.pageValidation("20.20 Element [State (drop-down)]", 		   Common_PageFactory.pf_el_20);
		
		Common_PageFactory.pageValidation("21.21 Element [State California (item)]", 		Common_PageFactory.pf_el_21);
		Common_PageFactory.pageValidation("22.22 Element [Terms (label)]", 			 	    Common_PageFactory.pf_el_22);
		Common_PageFactory.pageValidation("23.23 Element [Terms (checkbox)]", 		    Common_PageFactory.pf_el_23);
		Common_PageFactory.pageValidation("24.24 Element [Image (facebook)]", 		  		Common_PageFactory.pf_el_24);
		Common_PageFactory.pageValidation("25.25 Element [Image (twitter)]", 		      		Common_PageFactory.pf_el_25);
				
		Common_PageFactory.pageValidation("26.26 Element [Image (flickr)]", 			 		Common_PageFactory.pf_el_26);
		Common_PageFactory.pageValidation("27.27 Element [Image (youtube)]", 		 		Common_PageFactory.pf_el_27);
		Common_PageFactory.pageValidation("28.28 Element [Reset (button)]", 			 		Common_PageFactory.pf_el_28);
		Common_PageFactory.pageValidation("29.29 Element [Submit (button)]", 			 	Common_PageFactory.pf_el_29);
		Common_PageFactory.pageValidation("30.30 Element [Timestamp (dynamic)]", 		Common_PageFactory.pf_el_30);
		
		Common_PageFactory.pageValidation("31.31 Element [Copyright (dynamic)]",	     Common_PageFactory.pf_el_31);
		Common_PageFactory.pageValidation("32.32 Element [OS & Browser (dynamic)]", Common_PageFactory.pf_el_32);
		Common_PageFactory.pageValidation("33.33 Element [Error Line]", 						 Common_PageFactory.pf_el_33);
		Common_PageFactory.pageValidation("34.34 Element [First Name Error]", 		       	 Common_PageFactory.pf_el_34);
		Common_PageFactory.pageValidation("35.35 Element [Last Name Error]", 		         Common_PageFactory.pf_el_35);
		
		Common_PageFactory.pageValidation("36.36 Element [Email Error]", 			       		 Common_PageFactory.pf_el_36);
		Common_PageFactory.pageValidation("37.37 Element [Phone Error]", 			       		 Common_PageFactory.pf_el_37);
		Common_PageFactory.pageValidation("38.38 Element [First Name Error (img)]",		 Common_PageFactory.pf_el_38);
		Common_PageFactory.pageValidation("39.39 Element [Last Name Error (img)]", 	 Common_PageFactory.pf_el_39);
		Common_PageFactory.pageValidation("40.40 Element [Email Error (img)]", 		     Common_PageFactory.pf_el_40);
		Common_PageFactory.pageValidation("41.41 Element [Phone Error (img)]", 		     Common_PageFactory.pf_el_41);
		}
}
