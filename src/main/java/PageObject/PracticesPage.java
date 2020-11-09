package PageObject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticesPage {

    WebDriver driver;	
	Select s;
	Alert a;
	Actions aa;
	JavascriptExecutor js;
	
	By DropDown =By.id("dropdown-class-example");
	By check1=By.id("checkBoxOption1");
	By check2=By.id("checkBoxOption2");
	By check3=By.id("checkBoxOption3");
	By newindow=By.id("openwindow");
	By login= By.xpath("//span[text()='Login']");
	By suggest=By.id("autocomplete");
	By enter=By.name("enter-name");
	By confirm = By.id("confirmbtn");
	By aler = By.id("alertbtn");
	By elementDisplayedshow= By.id("show-textbox");
	By elementDisplayedhide= By.id("hide-textbox");
	By isdisplayed= By.id("displayed-text");
	By MouseHover= By.id("mousehover");
	
	public PracticesPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public Select Selects() {
		s= new Select(driver.findElement(DropDown));
		return s;
	}
	public WebElement Check1() {
		return driver.findElement(check1);
	}
	public WebElement Check2() {
		return driver.findElement(check2);
	}
	public WebElement Check3() {
		return driver.findElement(check3);
	}
	public void NewWindow() throws InterruptedException {
		    driver.findElement(newindow).click();
		    String mainwin= driver.getWindowHandle();
		    Set<String> s1= driver.getWindowHandles();
		    Iterator<String> i1= s1.iterator();
		    while(i1.hasNext()) {
			String childwin=i1.next();
			
			    if(!mainwin.equalsIgnoreCase(childwin)) {
	 			driver.switchTo().window(childwin);
	            driver.findElement(login).click();	
	           Thread.sleep(3000);
			    driver.close();
		}
		}	
	}
	
	public void Suggest(String as,String sd) {
		
		driver.findElement(suggest).sendKeys(as);
        List<WebElement>  op = driver.findElements(By.cssSelector("div.ui-menu-item-wrapper"));
        for(WebElement o:op) {
     
    	 if(o.getText().equalsIgnoreCase(sd)) {
    	       o.click();
    	       break;
    	 }
     }
}
	
	public void EnterName(String sx) {
		driver.findElement(enter).sendKeys(sx);
	}
	public WebElement EnternameConfirm() {
		return driver.findElement(confirm);
	}
	public Alert Alertt() {
		return a= driver.switchTo().alert();
	}
	public WebElement element() {
		return driver.findElement(elementDisplayedhide);
	}
	public void IsDisplay(String d) {
		
		WebElement present= driver.findElement(isdisplayed);
		
		if(present.isDisplayed()) {
			driver.findElement(isdisplayed).sendKeys(d);
		}
		else {
			System.out.println("element is not displayed");
		}
	}
	public Actions mouse() {
		aa= new Actions(driver);
		aa.moveToElement(driver.findElement(MouseHover)).build().perform();
		return aa;
	}
	
}