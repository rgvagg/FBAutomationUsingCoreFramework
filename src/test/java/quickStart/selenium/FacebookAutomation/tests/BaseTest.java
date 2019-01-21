package quickStart.selenium.FacebookAutomation.tests;

import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;

import quickStart.selenium.coreFramework.utilities.DriverFactory;
import quickStart.selenium.coreFramework.utilities.ReadProperty;
import quickStart.selenium.coreFramework.utilities.extentReports.ExtentTestManager;
import quickStart.selenium.coreFramework.utilities.main.BasePage;

public class BaseTest extends BasePage{
	/*public static WebDriver driver;
	public static ExtentTest extent;
	
	static {
	driver = BasePage.driver;
	extent= BasePage.extentTest;
	}*/
	
	
	
	public static void navigateToUrl() throws IOException {
//		driver = DriverFactory.getDriver();
		extentTest = ExtentTestManager.getTest();
		String url = ReadProperty.readProperty("url");
		driver.get(url);
		extentTest.log(LogStatus.PASS, "Able to navigate to URL"+url);
	}
}
