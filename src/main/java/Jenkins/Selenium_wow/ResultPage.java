package Jenkins.Selenium_wow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
	private WebDriver driver;
	
	//@FindBy(css="[href='\\#npcs'] div")
//	WebElement pnjBtn;
	
	@FindBy(css=".icon-boss-padded .listview-cleartext")
	WebElement lardeurBtn;
	
	@FindBy(xpath="//button[@class='banner_save--3Xnwp']")
	WebElement continueUsingSiteBtn;
	
	@FindBy(xpath="//ul[@class='tabs']//a[@href='#npcs']")
	WebElement pnjBtn;
	
	public void accessLardeur() throws InterruptedException {
		
		//WebElement pnjBtn = tabs.findElement(By.xpath("//a[@href='#npcs']"));
		
		pnjBtn.click();
		lardeurBtn.isDisplayed();
		lardeurBtn.click();
		
	}
	
}
