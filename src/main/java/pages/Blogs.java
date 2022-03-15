package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Blogs extends LoginClass {

//	WebDriver driver;

	@Test(priority = 4)
	public void viewBlogs() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")).click();

	}

	@Test(priority = 5)
	public void visitToABlog() {
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/ul/li/a"))
					.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
