package stepdefination;

import org.testng.Assert;

import Utils.browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;
import pages.HomePage;

public class VideoPlaybackCloseDefination extends browserhelper {

	@Given("the video player is playing a video in the DIY Projects & Ideas page")
	public void the_video_player_is_playing_a_video_in_the_diy_projects_ideas_page() throws InterruptedException {
		HomePage DIYLinkA = new HomePage();
		DIYLinkA.DIYLink.click();
		DIYPage DIYvideo = new DIYPage();
		DIYvideo.DIYvideolink.click();
		Thread.sleep(4000);
	}

	@When("Click on the browser back button")
	public void click_on_the_browser_back_button() {
		driver.navigate().back();
	}

	@Then("the video player closes")
	public void the_video_player_closes() throws InterruptedException {
		Thread.sleep(1500);
		String diypageURL = driver.getCurrentUrl();
		Assert.assertEquals(diypageURL, "https://www.homedepot.com/c/diy_projects_and_ideas");
	}

}
