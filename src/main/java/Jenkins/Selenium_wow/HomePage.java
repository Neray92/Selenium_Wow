package Jenkins.Selenium_wow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Jenkins.Selenium_wow.LardeurSearchTest;
import Jenkins.Selenium_wow.ResultPage;

 

public class HomePage  {
	private WebDriver driver;
	
	String recherche="Lardeur";

	@FindBy(how = How.XPATH, using = "//input[@name='q']")
	WebElement searchBar;
	
	@FindBy(xpath="//div[@class='header-search']//input")
	WebElement searchBtn;
	
	LardeurSearchTest lst;
	
	public ResultPage searchLardeur() {
		
		
		System.out.println("clique sur la barre de recherche");
		searchBar.sendKeys(recherche);
		System.out.println("recherche de lardeur");
		searchBar.submit();
		System.out.println("clique sur search");
		return PageFactory.initElements(driver, ResultPage.class);
	}

}
