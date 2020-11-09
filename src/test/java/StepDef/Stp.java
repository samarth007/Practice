package StepDef;

import PageObject.HomePage;
import PageObject.PracticesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resource.DriverClass;

public class Stp extends DriverClass {

   PracticesPage pp;
	
	@Given("^user enters the website$")
	public void user_enters_the_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver= driv();
	    driver.get(p.getProperty("url"));
	}

	@When("^user clicks on the pratice tab$")
	public void user_clicks_on_the_pratice_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    HomePage hp = new HomePage(driver);
	    pp = hp.Practice();
	}

	@Then("^Enters the \"([^\"]*)\" in the suggest box$")
	public void enters_the_in_the_suggest_box(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 pp.EnterName(arg1);
		
	}

	@Then("^click on the \"([^\"]*)\" button$")
	public void click_on_the_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  if (arg1.equalsIgnoreCase("confirm")) {
		  pp.EnternameConfirm().click();
		  pp.Alertt().accept();
	  }
	  else {
		  System.out.println("invalid");
	  }
	}

	
}
