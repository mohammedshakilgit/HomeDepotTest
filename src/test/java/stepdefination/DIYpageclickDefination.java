package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.DIYPage;

public class DIYpageclickDefination {
	@Given("Open Home Depot Homepage")
	public void open_home_depot_homepage() {

	}

	@When("Click on the DIY Projects & Ideas menu")
	public void click_on_the_diy_projects_ideas_menu() {
		HomePage DIYLinkA = new HomePage();
		DIYLinkA.DIYLink.click();

	}

	@Then("the DIY Projects & Ideas page appears")
	public void the_diy_projects_ideas_page_appears() {
		DIYPage DIYLinkB = new DIYPage();
		Assert.assertEquals(DIYLinkB.DIYText.getText(), "DIY Projects and Ideas");
	}
}
