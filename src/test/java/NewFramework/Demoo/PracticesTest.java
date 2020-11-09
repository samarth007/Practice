package NewFramework.Demoo;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.PracticesPage;
import resource.DriverClass;

public class PracticesTest extends DriverClass  {

	Select ss;
	PracticesPage pp;
	Alert a;
	
	@BeforeTest
	public void beforepra() throws IOException {
		driver= driv();
		driver.get(p.getProperty("url"));
	}
	
	@Test(priority = 0)
	public void attest() {
	   
	   HomePage hh = new HomePage(driver);
	    pp= hh.Practice();
	    ss =pp.Selects();
		ss.selectByValue("option1");
	}
	
	@Test(priority = 1)
	public void stest() {
	 pp.Check1().click();
	 pp.Check2().click();
	 pp.Check3().click();
		
	}
	/*@Test(priority = 3)
	public void rtest() throws InterruptedException {
		pp.NewWindow();	
	}*/
	/*@Test(priority = 2)
	public void ttest() {
		pp.Suggest("Ind","India");
	}*/
	/*@Test(priority = 2)
	public void mtest() {
		
		pp.EnterName("demo");
		pp.EnternameConfirm().click();
		a=pp.Alertt();
		a.accept();
	
	}*/
	@Test(priority = 2)
	public void ISDisplayed() {
		pp.element().click();
		pp.IsDisplay("done");
		
	}
	@Test(priority = 3)
	public void MouseHov() {
		pp.mouse();
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}
