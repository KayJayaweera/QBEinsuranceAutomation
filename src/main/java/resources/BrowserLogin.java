package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLogin {
	
	public WebDriver driver;
	//public String browser;

	public WebDriver initialization() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\777653\\eclipse-workspace\\QBE\\src\\main\\java\\resources\\data.properties");
		prop.load(fs);
		
		/*
		 * I also changed your browser setting quickly, just the line below.
		 * Now you can read it from command line if you saw 
		 * Just replace <browsertype> with chrome or firefox  which/ /you want
		 * This means that this only runs from command line now
		 */
		
		//This grabs from property file
		//String browsername = prop.getProperty("browser");
		
		//This grabs from command line mvn test -Dbrowser=<browsertype>
		String browsername = System.getProperty("browser");
		
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\777653\\Desktop\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(prop.getProperty("url"));
			return driver;
		}
	
		else if (browsername.equals("firefox"));
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\777653\\Desktop\\geckodriver.exe");
	
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get(prop.getProperty("url"));
			
			return driver;
		}
	
	}
}
