package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utils.browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.DIYPage;

public class VideoPlaybackDefination extends browserhelper {

	@Given("DIY Projects & Ideas page")
	public void diy_projects_ideas_page() {
		HomePage DIYLinkA = new HomePage();
		DIYLinkA.DIYLink.click();
	}

	@When("Click on the first video")
	public void click_on_the_first_video() throws InterruptedException {
		DIYPage DIYvideo = new DIYPage();
		DIYvideo.DIYvideolink.click(); 
		Thread.sleep(4000);
	}
	
	@Then("User can watch the first video")
	public void user_can_watch_the_first_video() throws InterruptedException {
		Thread.sleep(1500);
		String diypageURL = driver.getCurrentUrl();
		Assert.assertEquals(diypageURL, "https://www.homedepot.com/c/diy_projects_and_ideas#overlay");
	}
}
