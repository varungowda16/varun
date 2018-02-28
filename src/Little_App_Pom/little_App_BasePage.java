package Little_App_Pom;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class little_App_BasePage {
	
	
	public void verifyelement(WebElement element){
		
		if(element.isDisplayed()){
			String element_name =element.getText();
			Reporter.log(element_name+": is displayed successfully ");
			}
		else{
			SoftAssert sa=new SoftAssert();
			sa.fail();
		}
		}
}