package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebPage {
	
WebDriver driver;
	

		public WebPage(WebDriver driver) {
		this.driver = driver;

		}	
	
	By carsvehicles = By.xpath("//*[@id=\"main-container\"]/header/div[2]/div/div[2]/div/div[2]/ul/li[1]/a");
	By ctp = By.xpath("//*[@id=\"main-container\"]/header/div[2]/div/div[2]/div/div[2]/ul/li[1]/ul/li[2]/ul/li[2]/ul/li[2]/a");
	By nsw = By.xpath("//*[@id=\"main-container\"]/main/section/div[4]/div[2]/div[1]/div[2]/a");
	By renewGreenSlip = By.xpath("//*[@id=\"actionbar\"]/li[2]/a/div[2]/h4");
	By greenSlipQuote = By.xpath("//*[@id=\"button_get-quote\"]");
	By anonymous = By.xpath("//*[@id=\"gsp\"]/div[4]/div/div[1]/qbe-question/div[2]/div[3]/label/div/b");
	By currentVehicle = By.xpath("//*[@id=\\\"rms_vehicle_origin\\\"]/option[2]");
	By istheVehicle=By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/qbe-answer[1]/div[1]/form[4]/div[2]/div[1]/select[1]");
	By insuranceStartDate = By.xpath("//*[@id=\"form-3_start_date\"]");	
	By date = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a");
	By continuebutton = By.xpath("/html/body/div[@id='gsp']/div[@class='qbe-content']/div[@class='row']/div[@class='col-sm-6']/qbe-answer/div[@class='jumbotron']/form[@id='form-3']/div[@class='form-group']/div[@class='col-sm-offset-2 text-right']/button[@id='btn_continue']");
	By manufactureYear = By.xpath("//*[@id=\"a1\"]");
	By vehiclemake = By.xpath("/html/body/div[@class='container']/div[@class='qbe-content']/form[@id='vehicle_details']/div[@id='q2']/div[@class='col-sm-7']/qbe-answer/select[@id='a2']");
	By vehicleShape = By.xpath("/html/body/div[@class='container']/div[@class='qbe-content']/form[@id='vehicle_details']/div[@id='q3']/div[@class='col-sm-7']/qbe-answer/select[@id='a3']");
	By vehicleUsage = By.xpath("/html/body/div[@class='container']/div[@class='qbe-content']/form[@id='vehicle_details']/div[@id='q4']/div[@class='col-sm-7']/qbe-answer/select[@id='a4']");
	By postcode = By.xpath("/html/body/div[@class='container']/div[@class='qbe-content']/form[@id='vehicle_details']/div[@id='q5']/div[@class='col-sm-7']/qbe-answer/select[@id='a5']");
	By VDContinuebutton = By.xpath("/html/body/div[@class='container']/span[@id='process_map_end']/div[@class='row qbe-action']/div[@class='col-xs-4 col-md-6 text-right viz']/button[@id='button_forward']");
	By customertype = By.xpath("//*[@id=\"q1\"]/div[2]/qbe-answer/div[1]/label/input");
	By term = By.xpath("//*[@id=\"q2\"]/div[2]/qbe-answer/div[1]/label/input");
	By taxcredit = By.xpath("/html/body/div[@class='container']/form[@id='full_quotes']/div[@class='qbe-content']/div[@id='q3']/div[@class='col-sm-7']/qbe-answer/div[@class='radio'][1]/label/input[@class='qbe-action-radio']");	
	By DOB = By.xpath("//*[@id=\"dob\"]");
	By underage = By.xpath("/html/body/div[@class='container']/form[@id='full_quotes']/div[@class='qbe-content']/div[@id='q5']/div[@class='col-sm-7']/qbe-answer/div[@class='radio'][1]/label");
	By NSWlicence = By.xpath("/html/body/div[@class='container']/form[@id='full_quotes']/div[@class='qbe-content']/div[@id='q6']/div[@class='col-sm-7']/qbe-answer/div[@class='radio'][1]/label");
	By detailscontinuebutton = By.xpath("/html/body/div[@class='container']/div[@class='row qbe-action']/div[@class='col-xs-4 col-md-6 text-right viz']/button[@id='button_forward']");
	By finish = By.xpath("/html/body/div[@class='container']/form[@id='fullquotes_estimated']/div[@class='row qbe-action']/div[@class='col-xs-4 col-md-6 text-right viz']/button[@id='button_forward']");
	
	
	
	
	public WebElement CarsandVehicles() {
		return driver.findElement(carsvehicles);
	}
	
	public WebElement CTP() {
		return driver.findElement(ctp);
	}
	
	public WebElement State() {
		return driver.findElement(nsw);
	}
	
	public WebElement GreenSlipRenewal() {
		return driver.findElement(renewGreenSlip);
	}
	
	public WebElement NewGreenSlipQuote() {
		return driver.findElement(greenSlipQuote);
	}
	
	public WebElement AnonymousRadioButton() {
		return driver.findElement(anonymous);
	}
	
	public Select IsthevehicleDropDown() {
		Select s=new Select(driver.findElement(istheVehicle));
        return s;
    	
	}
	
	public WebElement InsuranceStart() {
		return driver.findElement(insuranceStartDate);
	}
	
	public WebElement StartDate() {
		return driver.findElement(date);
	}
	
	
	public WebElement SubmitContinueButton() {
		return driver.findElement(continuebutton);
	}
	
	public WebElement YearofManufacture() {
		return driver.findElement(manufactureYear);
	}
	

	public Select MakeofVehicleDropdown() {
		Select v=new Select(driver.findElement(vehiclemake));
        return v;

	}
	
	public Select VehicleShapeDropdown() {
		Select w=new Select(driver.findElement(vehicleShape));
        return w;

	}
	
	public Select VehicleUsageDropdown() {
		Select x=new Select(driver.findElement(vehicleUsage));
        return x;

	}
	
	public Select PostcodeDropdown() {
		Select y=new Select(driver.findElement(postcode));
        return y;

	}
	
	public WebElement VDContinueButton() {
		return driver.findElement(VDContinuebutton);
	}
	
	public WebElement CustomertypeRadioButton() {
		return driver.findElement(customertype);
	}
	
	public WebElement TermRadioButton() {
		return driver.findElement(term);
	}
	
	public WebElement TaxcreditRadioButton() {
		return driver.findElement(taxcredit);
	}
	
	public WebElement DOBofinsurer() {
		return driver.findElement(DOB);
	}
	
	public WebElement UnderAgeRadioButton() {
		return driver.findElement(underage);
	}
	
	public WebElement NSWlicenceRadioButton() {
		return driver.findElement(NSWlicence);
	}
	
	public WebElement InsurerDetailContinueButton() {
		return driver.findElement(detailscontinuebutton);
	}
	
	public WebElement FinishButton() {
		return driver.findElement(finish);
	}
	 


}




	
