package stepdefination;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Utils.browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;
import pages.HomePage;


public class WoodProjectsKitchenCheckboxDefination extends browserhelper {

	@Given("DIY Projects & Ideas page is open")
	public void diy_projects_ideas_page_is_open() {
		HomePage DIYLinkA = new HomePage();
		DIYLinkA.DIYLink.click();
	}

	@When("click on DIY Wood Projects sub menu")
	public void click_on_diy_wood_projects_sub_menu() {
		DIYPage DIYwood = new DIYPage();
		DIYwood.DIYwoodlink.click();
	}

	@When("Kitchen checkbox is checked by user")
	public void kitchen_checkbox_is_checked_by_user() throws InterruptedException {
		DIYPage DIYwood = new DIYPage();
		DIYwood.DIYwoodkitchenlink.click();
		Thread.sleep(2000);
	}

	@Then("the user can see Home Area: Kitchen message")
	public void the_user_can_see_home_area_kitchen_message() {
		DIYPage kitchenmessage = new DIYPage();
		Assert.assertEquals(kitchenmessage.kitchenMessage.getText(), "Home Area: Kitchen");
	}

}
