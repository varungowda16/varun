package Little_App_Scripts;

import org.testng.annotations.Test;

import Little_App_Pom.Little_App_HomePage;
import Little_App_generic.BaseTest;

public class Test_HomePage extends BaseTest {
	
	@Test
	public void testhomepage(){
		
		Little_App_HomePage homepage=new Little_App_HomePage(driver);
		homepage.click_on_banglore();
//		homepage.verifyelement();
		
		
		
	}
	
	
	
	
	

}
