package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPage {

	WebDriver driver = null;
	private By txt_search = By.xpath("//input[@type='text']");

	public googleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterSearchText(String text) {
		driver.findElement(txt_search).sendKeys(text);
	}

	public void pressEnter() {
		driver.findElement(txt_search).sendKeys(Keys.ENTER);
	}
}
