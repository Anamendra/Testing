package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AboutUsPage extends LoginClass {

//	WebDriver driver;
//	public void info() {
//		aboutUs();
//	}

	@Test(priority = 4)
	public void aboutUs() {
		try {
			Thread.sleep(5000);

			driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[8]/a")).click();
			Actions actions = new Actions(driver);
			WebElement menuOption = driver.findElement(By.xpath("//a[contains(text(),'Company')]"));
			actions.moveToElement(menuOption).perform();
			System.out.println("Hovered on company");

			WebElement subMenuOption = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
			subMenuOption.click();
			System.out.println("Hovered on AboutUs");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
