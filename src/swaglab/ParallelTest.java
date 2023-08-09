package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest {
	public static WebDriver driver;

	@Test
	public void verifyTitle() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void verifyLogo() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		Boolean display = logo.isDisplayed();
		System.out.println(display);
		Thread.sleep(2000);
		driver.close();
	}
}
