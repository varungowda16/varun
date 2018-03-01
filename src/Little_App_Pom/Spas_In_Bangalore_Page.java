package Little_App_Pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spas_In_Bangalore_Page {
	
	
	@FindBy(xpath="//a[.='Savings']")
	private WebElement savings;
	
	@FindBy(xpath="//span[@class='mrp']")
	public static WebElement mrp;
	
	
	@FindBy(xpath="//span[@class='sp']")
	public static WebElement sp;
	
	
	
	
	public Spas_In_Bangalore_Page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void varify(){
		
	ArrayList al= new ArrayList();
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
