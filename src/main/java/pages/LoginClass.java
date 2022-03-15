package pages;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.TestData;

public class LoginClass {
	static ExtentTest test;
	static ExtentReports report;

	@BeforeTest
	public static void startTest() {

		report = new ExtentReports(
				System.getProperty("C:\\Users\\anamendra.y(2420)\\eclipse-workspace\\automateDemo.dir")
						+ "ExtentReportResult.html");
		test = report.startTest("DemoLogin");

	}

	WebDriver driver;

	@Test(priority = 1)
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anamendra.y(2420)\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.phptravels.net/login");

		if (driver.getTitle().equals("Application Test Drive")) {
//			driver.findElement(By.xpath("")).click();
			test.log(LogStatus.PASS, "Navigated to the specified URL");

		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}

	@Test(priority = 2, dataProviderClass = Utility.TestData.class, dataProvider = "data")
	public void loginPage(String email, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();

	}

	@Test(priority = 3)
	public void goToHomePage() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a")).click();

	}

	
//	@AfterTest  //a[contains(text(),'About Us')]  /html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[8]/a
//	public void endTest() {
//		report.endTest(test);
//		report.flush();
//	}

}
