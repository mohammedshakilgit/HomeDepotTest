package stepdefination;

import java.util.concurrent.TimeUnit;

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

public class DIYPageClickURLDefination extends browserhelper {

	@Given("Open Home Depot HomePage")
	public void open_home_depot_home_page() {

	}

	@When("Click on DIY Projects & Ideas menu")
	public void click_on_diy_projects_ideas_menu() {
		HomePage DIYLinkA = new HomePage();
		DIYLinkA.DIYLink.click();
	}

	@Then("the DIY Projects & Ideas page appears with the correct url")
	public void the_diy_projects_ideas_page_appears_with_the_correct_url() throws InterruptedException {
		Thread.sleep(1500);
		String diypageURL = driver.getCurrentUrl();
		Assert.assertEquals(diypageURL, "https://www.homedepot.com/c/diy_projects_and_ideas");

	}
}
