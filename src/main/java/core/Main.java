package core;

import org.openqa.selenium.WebDriver;

public class Main {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//It's a Simple Version without expiration, browser and username not as in HW_44
		
		////////////////////////  - Process -  /////////////////////
		
		SignUp.validate(driver, "http://alex.academy/exe/signup/www/index.php");
		Common.quit();
		
		Confirmation.validate(driver, "http://alex.academy/exe/signup/www/confirmation.php");
		Common.quit();
	}
}
