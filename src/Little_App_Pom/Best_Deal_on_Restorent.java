package Little_App_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Best_Deal_on_Restorent {

	
	@FindBy(xpath="//a[.='SPAS']")
	private WebElement spas_module;
	
	
	
	public Best_Deal_on_Restorent (WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void click_SPAS(){
		
		spas_module.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
