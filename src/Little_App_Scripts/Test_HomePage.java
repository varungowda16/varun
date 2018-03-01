package Little_App_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Little_App_Pom.Best_Deal_on_Restorent;
import Little_App_Pom.Little_App_HomePage;
import Little_App_Pom.Spas_In_Bangalore_Page;
import Little_App_generic.BaseTest;

public class Test_HomePage extends BaseTest 
    {
	
	@Test
	public void testhomepage()
	    {
		try{
		Little_App_HomePage homepage=new Little_App_HomePage(driver);
		homepage.click_on_banglore();
		Best_Deal_on_Restorent bdr= new Best_Deal_on_Restorent(driver);
		bdr.click_SPAS();
		Spas_In_Bangalore_Page sib= new Spas_In_Bangalore_Page(driver);
		 List<WebElement> mrp=driver.findElements(By.xpath("//span[@class='mrp']"));
		 List<WebElement> sp=driver.findElements(By.xpath("//span[@class='sp']"));
		 
		 //Thread.sleep(10000);
		 
		 
	    for(int i=0;i<mrp.size()-1;i++){
	    	
	    	if(Integer.parseInt((mrp.get(i).getText()))>Integer.parseInt((sp.get(i).getText()))){
	    		
	    		System.out.println((mrp.get(i).getText()+" > "+sp.get(i).getText()));
	    		
	    		
	    		
	    	}
	    	else {
	    		Reporter.log("FAIL",true);
	    		Reporter.log(mrp.get(i).getText()+" < "+sp.get(i).getText(),true);
	    		
	    		
	    	}
	    	
	    	
	    }
		
		
		}
		
		catch(Exception e){
			
			driver.findElement(By.xpath("//p[.='Do not show this again.']")).click();
			System.out.println("Inspectable popup displayed");
			
		}
		
		
		
		
		
		
		}
	}
