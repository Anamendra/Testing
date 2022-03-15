package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpPage {

	WebDriver driver;

	@Test(priority = 1, dataProviderClass = Utility.TestData.class, dataProvider = "data")
	public void signUp(String firstName, String lastName, String phone, String email, String password) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.phptravels.net/signup");
		driver.findElement(By.name("first_name")).sendKeys(firstName);
		driver.findElement(By.name("last_name")).sendKeys(lastName);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.className("select2-search__field")).click();
//		driver.findElement(By.id("select2-account_type-container")).sendKeys(accountType);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[7]/button")).click();

	}
}
