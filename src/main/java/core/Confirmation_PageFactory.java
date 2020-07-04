package core;

import org.openqa.selenium.WebDriver;

public class Confirmation_PageFactory {
	
	static String borwser = "firefox";
	
	public static void validate(WebDriver driver, String url) {	
		
		Common_PageFactory.open(borwser, url);
		
		Common_PageFactory.pageValidation("42.05 Element [Title]", 						    Common_PageFactory.pf_el_05);	
		Common_PageFactory.pageValidation("43.06 Element [First Name (label)]",    Common_PageFactory.pf_el_06);
		Common_PageFactory.pageValidation("44.07 Element [First Name (field)]",     Common_PageFactory.pf_el_07);
		Common_PageFactory.pageValidation("45.08 Element [Last Name (label)]",     Common_PageFactory.pf_el_08);
		Common_PageFactory.pageValidation("46.09 Element [Last Name (field)]",     Common_PageFactory.pf_el_09);
			
		Common_PageFactory.pageValidation("47.10 Element [Email (label)]", 			Common_PageFactory.pf_el_10);
		Common_PageFactory.pageValidation("48.11 Element [Email (filed)]",				Common_PageFactory.pf_el_11);
		Common_PageFactory.pageValidation("49.12 Element [Phone (label)]", 			Common_PageFactory.pf_el_12);
		Common_PageFactory.pageValidation("50.13 Element [Phone (field)]", 			Common_PageFactory.pf_el_13);
		Common_PageFactory.pageValidation("51.14 Element [Genre (label)]", 			Common_PageFactory.pf_el_14);
			
		Common_PageFactory.pageValidation("52.42 Element [Genre (field)]", 			Common_PageFactory.pf_el_42);
		Common_PageFactory.pageValidation("53.43 Element [Back (button)]", 			Common_PageFactory.pf_el_43);	
		
		}
}
