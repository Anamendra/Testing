package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchForFlight extends LoginClass {

	@Test(priority = 4)
	public void flightSearch() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")).click();
		driver.findElement(By.id("one-way")).click();
		driver.findElement(By.xpath("/html/body/section[1]/section/div/div/form/div[1]/div[2]/select")).click();

		WebElement subMenuOption = driver
				.findElement(By.xpath("/html/body/section[1]/section/div/div/form/div[1]/div[2]/select/option[3]"));
		subMenuOption.click();
		System.out.println("Clicked on flightType = Bussiness");

		driver.findElement(By.id("autocomplete")).sendKeys("Indore");
		driver.findElement(By.xpath(
				"/html/body/section[1]/section/div/div/form/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]"))
				.click();
		driver.findElement(By.id("autocomplete2")).sendKeys("Delhi");
		driver.findElement(By.xpath(
				"/html/body/section[1]/section/div/div/form/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath("/html/body/section[1]/section/div/div/form/div[2]/div[4]/div/button")).click();

	}

	@Test(priority = 5)
	public void bookAFlight() {

		driver.findElement(By.xpath("/html/body/main/div/div[2]/section/ul/li[1]/div/form/div/div[2]/div/button"))
				.click();
	}

	@Test(priority = 6)
	public void travellersInfo() throws InterruptedException {

		driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/select"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/select/option[1]"))
				.click();
		driver.findElement(By
				.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/input"))
				.sendKeys("Nilesh");
		driver.findElement(By
				.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/input"))
				.sendKeys("Mishra");

		// nationality dropdown
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/select"))
				.click();
		WebElement nationalityMenuOption = driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/select/option[104]"));
		nationalityMenuOption.click();
		System.out.println("Clicked on Nationality=India");

		// date of birth of traveller
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[1]/select"))
				.click();
		WebElement monthMenuOption = driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[1]/select/option[6]"));
		monthMenuOption.click();
		System.out.println("Clicked on Month=05May");
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/select"))
				.click();
		WebElement dateMenuOption = driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/select/option[19]"));
		dateMenuOption.click();
		System.out.println("Clicked on Date=19");
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[3]/select"))
				.click();
		WebElement yearMenuOption = driver.findElement(By.xpath(
				"/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[3]/select/option[30]"));
		yearMenuOption.click();
		System.out.println("Clicked on Year=1993");

		// passportnumber
		driver.findElement(By
				.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/input"))
				.sendKeys("IND30021");

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

		// passport issue date month year
		driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/select"))
				.click();
		WebElement monthPassportIssueMenu = driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/select/option[13]"));
		monthPassportIssueMenu.click();

		driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/select"))
				.click();
		WebElement datePassportIssueMenu = driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/select/option[3]"));
		datePassportIssueMenu.click();
		System.out.println("Clicked on Date=03");

		driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/select"))
				.click();
		WebElement yearPassportIssueMenu = driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/select/option[4]"));
		yearPassportIssueMenu.click();
		System.out.println("Clicked on Year=2020");

		// passport expiry date month year
		driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/select"))
				.click();
		WebElement monthPassportExpiryMenu = driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/select/option[13]"));
		monthPassportExpiryMenu.click();
		System.out.println("Clicked on Month=12(December)");
		driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/select"))
				.click();
		WebElement datePassportExpiryMenu = driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/select/option[2]"));
		datePassportExpiryMenu.click();
		System.out.println("Clicked on Date=02");
		driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[3]/select"))
				.click();
		WebElement yearPassportExpiryMenu = driver.findElement(By.xpath(
				"//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[3]/select/option[19]"));
		yearPassportExpiryMenu.click();
		System.out.println("Clicked on Year=2024");

		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("scroll(0, 400)"); // if the element is on bottom.

		driver.findElement(By.xpath("//input[@id='gateway_pay-later']")).click();
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("scroll(0, 900)"); // if the element is on bottom.

		driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[4]/div/div/div")).click();
		driver.findElement(By.xpath("//button[@id='booking']")).click();

	}
	@Test(priority = 7)
	public void downloadInvoice() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 900)"); // if the element is on bottom.
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div[3]/strong/strong/div[2]/div/div[2]/button")).click();
	}
}
