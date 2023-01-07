
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.browserhelper;

public class DIYPage {

	WebDriver driver;

	@FindBy(xpath = "//ul[@id='TasklinkList']//a[@href='//www.homedepot.com/l/']")
	public WebElement storelocatorlink;

	@FindBy(css = "[placeholder='Zip Code\\, City\\, State\\, or Store \\#']")
	public WebElement zipcodefield;

	@FindBy(xpath = "//*[@id=\"js-results\"]/div[1]/div[2]/div/div/div[2]/div[1]/div[2]")
	public WebElement NYlocation;

	@FindBy(xpath = "//*[@id=\"js-results\"]/div[1]/div[2]/div/div/div[2]/div[1]/div[2]")
	public WebElement NJlocation;

	@FindBy(xpath = "/html//div[@id='js-results']/div[1]/div[2]//p[.='Toronto, ON M4B 3L8']")
	public WebElement CADlocation;
	
	
	
	@FindBy(css = "[class='section-heading__text--6fd88 section-heading__text--plain--6fd88']")
	public WebElement DIYText;
	
	@FindBy(xpath = "//div[@id='topguides']/div[2]//div[@class='EtchVisualNav']/nav/div[1]/span[1]/img[@alt=' ']")
	public WebElement DIYvideolink; 
	
	@FindBy(linkText = "DIY Wood Projects")
	public WebElement DIYwoodlink; 
	
	@FindBy(css = "#tgw6")
	public WebElement DIYwoodkitchenlink; 
	
	@FindBy(css = "[class='pill-text--12gxt']")
	public WebElement kitchenMessage;

	public DIYPage() {
		driver = browserhelper.driver;
		PageFactory.initElements(driver, this);

	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/auth/view/signin?redirect=/&ref=null") {
			driver.get("https://www.homedepot.com/auth/view/signin?redirect=/&ref=null");
		}
	}


		
	
	
}
