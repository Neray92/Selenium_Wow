package Jenkins.Selenium_wow;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ObjectPage {
	
	@FindBy(xpath="//div[@id='tt2168']//span")
	List<WebElement> stats;
	
	public void verifStat() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		 int i=0;
		 System.out.println(stats.size());
		 
		 	for(i=3; i<5; i++) {
		 		stats.get(i).getText();
		 		list.add(stats.get(i).getText());
		 		System.out.println(stats.get(i).getText());
		 	}
		
		 	String intelligence = "+5 Intelligence";
		 	String endurance = "+8 Endurance";
		 	
		 	assertEquals("Les statistiques d'endurance sont verifié", list.get(0), intelligence);
		 	assertEquals("Les statistiques d'endurance sont verifié", list.get(1), endurance);
		 
	}

}
