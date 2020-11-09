package NewFramework.Demoo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Courses;
import PageObject.CoursesLogin;
import PageObject.HomePage;
import resource.DriverClass;

public class CourseloginTest extends DriverClass {

	
	
	@BeforeTest
	public void before() throws IOException {
		driver=driv();
	}
	
	@Test(dataProvider = "data")
	public void test(String user, String psd) {
		driver.get(p.getProperty("url"));
		HomePage h = new HomePage(driver);
		Courses c =h.Course();
		CoursesLogin cl =c.Login();
		cl.Email().sendKeys(user);
		cl.Pwd().sendKeys(psd);
		cl.Login().click();
	}
	
	
	@DataProvider
	public Object[][] data() {
		Object [][] d = new Object[2][2];
		d[0][0]="samarth";
		d[0][1]="77";
		
		d[1][0]="demo";
		d[1][1]="00";
		return d;
				
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
}
