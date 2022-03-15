package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContactUs extends LoginClass {

	@Test(priority = 4)
	public void contactUs() {
		try {
			Thread.sleep(5000);

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0, 400)"); // if the element is on bottom.

			Thread.sleep(2000);
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("scroll(0, 400)"); // if the element is on bottom.

			
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("scroll(0, 500)"); // if the element is on bottom.
//			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
//			jse1.executeScript("scroll(0, 3000)"); // if the element is on bottom.

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
			Thread.sleep(10000);
			// if the element is on bottom.
			driver.findElement(By.xpath("/html/body/section[8]/div/div/div[1]/a/div[2]/h4")).click();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
