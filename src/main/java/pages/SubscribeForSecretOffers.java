package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class SubscribeForSecretOffers extends LoginClass {

	@Test(priority = 4)
	public void subscribeWithEmail() throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("scroll(0, 500)"); // if the element is on bottom.
		driver.findElement(By.xpath("/html/body/section[10]"));
		driver.findElement(By.xpath("/html/body/section[9]/div/div/div[2]/div/div/div/div/input"))
				.sendKeys("Test1@malinator.com");
		Thread.sleep(5000);
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("scroll(0, 500)"); // if the element is on bottom.
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/section[9]/div/div/div[2]/div/div/div/div/button")).click();

	}
}
