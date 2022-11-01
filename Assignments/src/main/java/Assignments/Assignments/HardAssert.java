package Assignments.Assignments;

import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert {
	public WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeth\\eclipse-workspace\\Assignments\\src\\main\\java\\Resourses\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.opesmount.in/grocerystore1/");
	}

	@Test
	public void verifyTitle() {
		String pageTitle, actualTitle = "Grocerystore";
		pageTitle = driver.getTitle();
		assertEquals(pageTitle, actualTitle);
	}

	@Test
	public void driverNull() {
		assertNotNull(driver);
	}

	@AfterMethod
	public void browserQuit() {
		driver.quit();
	}
}
