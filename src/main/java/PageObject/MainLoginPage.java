package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainLoginPage {

	WebDriver driver;
	By email= By.id("user_email");
	By pwd =  By.id("user_password");
	By submit= By.name("commit");
	By valid = By.cssSelector("div.alert.alert-danger.alert-show.mb-5");
	
	public MainLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement EnterEmail() {
		 return driver.findElement(email);
	}
	public WebElement EnterPwd() {
		return driver.findElement(pwd);
	}
	public WebElement Submit() {
		return driver.findElement(submit);
	}
	public WebElement validate() {
		return driver.findElement(valid);
	}
}
