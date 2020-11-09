package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
          
	      public WebDriver driver;
	      By course= By.xpath("//a[text()='Courses']");
	      By video=By.xpath("//a[text()='Videos']");
	      By practcie=By.xpath("//a[text()='Practice']");
	      By login=By.cssSelector("a[href*='sign_in']");
	      
	      public HomePage(WebDriver driver) {
	    	  this.driver= driver;
	      }
	      
	      
	    public Courses Course() {
		driver.findElement(course).click();
		Courses c= new Courses(driver);
		return c;
		}
	
	    public PracticesPage Practice() {
	    	driver.findElement(practcie).click();
	    	PracticesPage pp = new PracticesPage(driver);
	    	return pp;
	    }
	
	    public WebElement Log() {
	    	return driver.findElement(login);
	    }
	    
	    
	
	
	
}
