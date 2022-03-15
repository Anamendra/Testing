package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Offers extends LoginClass {

	@Test(priority = 4)
	public void getOffers() {
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[7]/a")).click();
	}

	@Test(priority = 5)
	public void revealOffer() {
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div[2]/ul/li/a")).click();
	}
}
