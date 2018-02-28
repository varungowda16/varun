package Little_App_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Little_App_HomePage extends little_App_BasePage {
	
	@FindBy(xpath="//a[.='Bangalore']")
	private WebElement button ;
	
	
	@FindBy(xpath="//a[@class='header__brand']")
	private WebElement image;
	
	
	
	
	public Little_App_HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void click_on_banglore(){
		button.click();
	}
	
		
	
	
	
	
	
	
	
	

}
