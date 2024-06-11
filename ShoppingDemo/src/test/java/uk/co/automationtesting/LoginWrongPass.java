package uk.co.automationtesting;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.ShoppingHome;
import PageObjects.ShoppingLoginPage;
import base.ExtentManager;
import base.Hooks;
import junit.framework.Assert;
@Listeners(resources.Listeners.class)

public class LoginWrongPass extends Hooks{

	public LoginWrongPass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginWrongPass() throws IOException{
		ShoppingHome home = new ShoppingHome();
		home.getCookie().click();
		home.getloginBtn().click();
		
		ExtentManager.pass("Login page loaded successfully");
		ShoppingLoginPage login = new ShoppingLoginPage();
		
		try {
			Assert.assertEquals(login.getLoginAccText().getText(), "Login to my account");
		}
		catch (AssertionError e) {
			Assert.fail("Login failed");
		}
		login.getLoginEmail().sendKeys("test@123.com");
		login.getLoginPwd().sendKeys("Password");
		ExtentManager.pass("Wrong email and password input");
		
		login.getLoginBtn().click();
		ExtentManager.pass("Login button clicked");
		try {
			Assert.assertEquals(login.getLoginIncorrect().getText(), "Your email or password is in-correct!");
		}catch (AssertionError e) {
			Assert.fail("Login Failed");
		}
		ExtentManager.pass("Login failed as expected");
	}

}
