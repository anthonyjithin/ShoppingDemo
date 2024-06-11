package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShoppingAccCreated extends BasePage{
	public WebDriver driver;

	public ShoppingAccCreated() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	By accCreated = By.cssSelector(".text-center.title > b");
	By continueBtn = By.cssSelector(".btn.btn-primary");
	By homelink = By.cssSelector("li:nth-of-type(1) > a");
	
	public WebElement getAccCreated() throws IOException {
		this.driver = getDriver();
		return driver.findElement(accCreated);
	}
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	public String getCurrentUrl() throws IOException {
		this.driver = getDriver();
		return driver.getCurrentUrl();
		}
	public WebElement getHomeLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homelink);
		}
}
