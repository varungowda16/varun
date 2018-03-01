package Little_App_generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest {
	public WebDriver driver;
	Logger log;
	@BeforeMethod(alwaysRun=true) 
	public void openapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://littleapp.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		driver.manage().window().maximize();
//		
		Thread.sleep(5000);
		
		
		
	}
	@AfterMethod(alwaysRun=true)
	public void closeapp()
	{
//		driver.close();
			
	}
}
// github link
// https://github.com/varungowda16/varun.git