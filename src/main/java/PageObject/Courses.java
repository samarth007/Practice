package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Courses {

	WebDriver driver;
	By login = By.xpath("//a[@class='theme-btn register-btn']");
	By jobs = By.xpath("//a[text()='Jobs']");
	
	
	public Courses(WebDriver driver) {
		this.driver= driver;
	}
	
	public CoursesLogin Login() {
		driver.findElement(login).click();
		CoursesLogin cl = new CoursesLogin(driver);
		return cl;
	}
	
}
