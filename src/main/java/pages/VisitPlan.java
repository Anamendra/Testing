package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VisitPlan extends LoginClass {

//	WebDriver driver;

	@Test(priority = 4)
	public void planToVisit() throws InterruptedException {
//		loginPage(email, password);
//		goToHomePage();
		driver.findElement(By.id("select2-hotels_city-container")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Goa");
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath(
				"/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("15-03-2022");
		System.out.println("==================");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("28-03-2022");
		System.out.println("++++++++++++++++++++");
		// driver.findElement(By.id("adults")).sendKeys("4");
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/button[1]"))
				.click();

	}

//	@Test(priority = 5, dependsOnMethods = { "planToVisit" })
//	public void viewMyBookings() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/a")).click();
//	}

}
