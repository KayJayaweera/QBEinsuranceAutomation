package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import resources.BrowserLogin;
import pageObjects.WebPage;


@RunWith(Cucumber.class)
public class stepdefinition extends BrowserLogin
{

    @Given("^Initialise browser and navigate to website$")
    public void initialise_browser_and_navigate_to_website() throws Throwable {
    	
    	driver = initialization();
    }

    @When("^Enter details$")
    public void enter_details() throws Throwable {

    	Thread.sleep(1000);
		WebPage wp = new WebPage(driver);
		wp.CarsandVehicles().click();
		wp.CTP().click();
		wp.State().click();
		wp.GreenSlipRenewal().click();
		wp.NewGreenSlipQuote().click();
		wp.AnonymousRadioButton().click();
		wp.IsthevehicleDropDown().selectByValue("1");
		wp.InsuranceStart().click();
		wp.StartDate().click();
		wp.SubmitContinueButton().click();
		wp.YearofManufacture().sendKeys("2015");
		wp.MakeofVehicleDropdown().selectByValue("MITSUB");
		wp.VehicleShapeDropdown().selectByValue("WAG");
		wp.VehicleUsageDropdown().selectByValue("AIRP");
		wp.PostcodeDropdown().selectByValue("2000-HAYMARKET");
		wp.VDContinueButton().click();
		wp.CustomertypeRadioButton().click();
		wp.TermRadioButton().click();
		wp.TaxcreditRadioButton().click();
		wp.DOBofinsurer().sendKeys("13/11/1990");
		wp.DOBofinsurer().click();
		wp.UnderAgeRadioButton().click();
		wp.NSWlicenceRadioButton().click();
		
		Thread.sleep(1000);
	
    }

    @Then("^Get a quote$")
    public void Get_a_quote() throws Throwable {
    	WebPage wp = new WebPage(driver);
    	wp.InsurerDetailContinueButton().click();
		wp.FinishButton().click();

		
    }

    @And("^close the page$")
    public void close_the_page() throws Throwable {
    	Thread.sleep(2000);
		driver.close();

    }

}