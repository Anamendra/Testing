package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChangeCurrencyType extends LoginClass{

	@Test(priority=4)
	public void currencyType() {
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/div[2]/div/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/div[2]/div/ul/li[10]/a")).click();
	}
}
