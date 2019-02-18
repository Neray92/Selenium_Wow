package seleniumWow;


import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;

public class LardeurPage {
	
	@FindBy(xpath="//tbody[@class='clickable']/tr")
	List<WebElement> objectList;
	
	@FindBy(xpath="//td[@style='text-align: left; border-left: none;']//a[@href='/item=2168']")
	WebElement element1;
	
	public int verifPresenceObject() {
		
		 int i=0;
		 System.out.println(objectList.size());
		 
		 	for(i=0; i<objectList.size(); i++) {
		 		objectList.get(i).isDisplayed();
		
		 	}
		  System.out.println("La liste d'objet est bien présente");
		 	
		  return objectList.size();
	}

	
	public void assertObjets() {
		
		int nbObj = verifPresenceObject();
		assertEquals("Il y a bien 5 éléments dans le tableau", nbObj, 5);	
		
	}
	
	public void accesPremierObjet() {
		
		element1.click();
	}
}
