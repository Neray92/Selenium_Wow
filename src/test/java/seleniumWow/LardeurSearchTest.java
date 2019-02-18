package seleniumWow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumWow.HomePage;
import seleniumWow.LardeurPage;
import seleniumWow.ObjectPage;
import seleniumWow.ResultPage;


public class LardeurSearchTest {

	WebDriver driver;
	private String BROWSER = System.getProperty("browser");

	@Before
	public void accesSite() {

		if(BROWSER.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installation\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver", "C:\\Installation\\geckodriver.exe");
			driver = new FirefoxDriver();				
		}	
		
		driver.manage().window().maximize();
		driver.get("https://fr.wowhead.com/");		
	}




	/*	System.setProperty("webdriver.chrome.driver", "C:\\Installation\\chromedriver.exe");
	driver = new ChromeDriver();*/

	//	driver.manage().deleteAllCookies();


	@Test
	public void searchLardeur() throws InterruptedException {

		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ResultPage rp = PageFactory.initElements(driver, ResultPage.class);
		LardeurPage lp = PageFactory.initElements(driver, LardeurPage.class);
		ObjectPage op = PageFactory.initElements(driver, ObjectPage.class);

		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement continueUsingSiteBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/button[contains(text(),'Continue Using Site')]")));	
		continueUsingSiteBtn.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-search']//input[@type='text']")));
		Thread.sleep(1000);
		WebElement cookieBtn = driver.findElement(By.xpath("//div//button[@class='cookie-settings-actions-opt-in btn btn-small btn-site']"));
		cookieBtn.click();
		System.out.println("Accès a la page d'acceuil et recherche de Lardeur");
		hp.searchLardeur();
		rp.accessLardeur();
		lp.assertObjets();
		lp.accesPremierObjet();
		op.verifStat();

	}



	@After
	public void closeSitre() {
		driver.close();


	}
}