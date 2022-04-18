package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googleSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
	WebDriver driver = null;
	googleSearchPage google;

	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com/");
	}

	@When("user enters text in search field")
	public void user_enters_text_in_search_field() {
		google = new googleSearchPage(driver);
		google.enterSearchText("Cucumber is awesome");
	}

	@And("hit the enter key")
	public void hit_the_enter_key() {
		google.pressEnter();
	}

	@Then("user is naviagetd to search results page")
	public void user_is_naviagetd_to_search_results_page() {
		driver.getTitle().contains("Cucumber is awesome");
		driver.close();
	}

}
