package quickStart.selenium.FacebookAutomation.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import quickStart.selenium.FacebookAutomation.pages.LoginPage;
import quickStart.selenium.coreFramework.utilities.ReadProperty;

public class CheckFbLoginPage extends BaseTest{

	@Test
	public void checkWithInvalidCredentials() throws IOException {
		BaseTest.navigateToUrl();
		LoginPage lPage = new LoginPage();
		lPage.enterEmailId(ReadProperty.readProperty("username"));
		lPage.enterPassword("password");
		lPage.clickLoginButton();
	}
}