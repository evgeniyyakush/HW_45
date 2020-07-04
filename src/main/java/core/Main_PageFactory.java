package core;

import org.openqa.selenium.WebDriver;

public class Main_PageFactory {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//It's a Simple Version without expiration, browser and username not as in HW_44
		
		////////////////////////  - Process -  /////////////////////
		
		SignUp_PageFactory.validate(driver, "http://alex.academy/exe/signup/www/index.php");
		Common_PageFactory.quit();
		
		Confirmation_PageFactory.validate(driver, "http://alex.academy/exe/signup/www/confirmation.php");
		Common_PageFactory.quit();
	}
}
