
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.browserhelper;

public class HomePage {
	WebDriver driver;



	
	
	@FindBy(xpath = "/html//div[@id='header']//ul[@class='ShoppingLinks']//a[@href='//www.homedepot.com/c/diy_projects_and_ideas']")
	public WebElement DIYLink;
	
	
	
	@FindBy(id = "headerMyAccountTitle") // <- need to declare it
	public WebElement myAccount;
	@FindBy(xpath = "//*[@id=\"SPSOSignIn\"]/a/span")
	public WebElement signinButton;

	@FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[4]/div/ul/li[7]/a")
	public WebElement localAdlink;

	@FindBy(css = "iframe[title='Navigation Bar']")
	public WebElement iframe;

	@FindBy(css = "flipp-filmstrip-pub:nth-of-type(2) > button[role='tab'] > .flipp-filmstrip-pub-details")
	public WebElement weeklyAdlink;

	@FindBy(css = "li:nth-of-type(2) > flipp-publication  .flipp-publication-image")
	public WebElement weeklytitle;

	@FindBy(id = "zoomInButton")
	public WebElement zoominbtn;

	@FindBy(id = "zoomLevels")
	public WebElement zoomlvls;

	@FindBy(id = "zoomOutButton")
	public WebElement zoomoutbtn;

	@FindBy(css = ".HeaderLogo")
	public WebElement logo;

	@FindBy(css = "a[title='The Home Depot']  title")
	public WebElement hdtitle;

	public HomePage() {
		driver = browserhelper.driver;
		PageFactory.initElements(driver, this); // <- use this in a same class name>
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/") { // <- this way it will not reload the page twice. only if the
															// url is not the same page>
			driver.get("https://www.homedepot.com/");
		}
	}
}

/*
 * package pages;
 * 
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * import Utils.browserhelper;
 * 
 * public class HomePage { WebDriver driver;
 * 
 * @FindBy(css =
 * "[class='section-heading__text--6fd88 section-heading__text--plain--6fd88']")
 * public WebElement DIYText;
 * 
 * public HomePage() { driver = browserhelper.driver;
 * PageFactory.initElements(driver, this);
 * 
 * }
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
