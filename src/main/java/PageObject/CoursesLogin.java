package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursesLogin {

	
	WebDriver driver;
	By email = By.cssSelector("input[id='user_email']");
	By pwd = By.cssSelector("input[name='user[password]']");
	By log = By.xpath("//input[@type='submit']");
	
	
	public CoursesLogin(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Email() {
		return driver.findElement(email);
	}
    public WebElement Pwd() {
    	return driver.findElement(pwd);
    }
    public WebElement Login() {
    	 return driver.findElement(log);
    }
}
