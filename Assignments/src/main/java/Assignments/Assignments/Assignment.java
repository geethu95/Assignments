package Assignments.Assignments;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Assignment {
	public WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeth\\eclipse-workspace\\Assignments\\src\\main\\java\\Resourses\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.in/");
	}

	/*
	 * public static void main(String[] args) { Assignment obj=new Assignment();
	 * obj.initializeBrowser();
	 * 
	 * }
	 */
	@AfterMethod
	public void browserQuit() {
		driver.quit();
}
}
