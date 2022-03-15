package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchForHotel extends LoginClass {

	@Test(priority = 4)
	public void searchHotels() {

		// Search for hotels
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")).click();

		driver.findElement(
				By.xpath("/html/body/section[1]/section/div/div/form/div/div/div[1]/div/div/div/span/span[1]/span"))
				.click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Goa");
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();

		//
		driver.findElement(By.xpath("/html/body/section[1]/section/div/div/form/div/div/div[3]/div/div/div/a")).click();
		driver.findElement(By.xpath(
				"/html/body/section[1]/section/div/div/form/div/div/div[3]/div/div/div/div/div[1]/div/div/div[3]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/section[1]/section/div/div/form/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]"))
				.click();
		driver.findElement(By.xpath("/html/body/section[1]/section/div/div/form/div/div/div[4]/div/button")).click();

	}
	
	@Test(priority =5)
	public void searchHotelByName() {
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]/div/form/div[1]/div/input")).sendKeys("Hotel Rajeshwar ");
	}
	
	@Test(priority = 6)
	public void viewHotelDetails() {
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/section/ul/li[2]/div/div[2]/div/div[2]/div/a")).click();
	}
}
