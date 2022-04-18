package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	protected WebDriver driver;
	private By txt_username = By.id("login");
	private By txt_password = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(btn_login).click();
	}

	public void checkLogoutButtonDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}
}
