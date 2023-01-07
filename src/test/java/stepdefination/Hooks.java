package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.browserhelper;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	@BeforeAll
	public static void before_all() {
		browserhelper.setupDriver();
		browserhelper.driver.get("https://www.homedepot.com/");

	}

	@AfterAll
	public static void after_all() throws InterruptedException {
		Thread.sleep(5000);
		browserhelper.driver.close();
	}
	
}
