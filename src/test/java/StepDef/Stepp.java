package StepDef;




import PageObject.HomePage;
import PageObject.MainLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resource.DriverClass;

public class Stepp extends DriverClass  {
    
	//WebDriver driver;
	//Properties p;
	MainLoginPage mm;
	
	
	@Given("^user enters the website$")
	public void user_enters_the_website() throws Throwable {
	    driver=driv();
	    driver.get(p.getProperty("url"));	
	 	}

	@Given("^click on login button$")
	public void click_on_login_button() throws Throwable {
		HomePage hh = new HomePage(driver);
		hh.Log().click();
	 	}

	@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String arg1, String arg2) throws Throwable {
 
	    mm = new MainLoginPage(driver);
		mm.EnterEmail().sendKeys(arg1);
		mm.EnterPwd().sendKeys(arg2);
		mm.Submit().click();
		
	}

	@Then("^validate the credantial$")
	public void validate_the_credantial() throws Throwable {
	  
		boolean a=mm.validate().isDisplayed();
		  System.out.println(a);
		
	}

}
