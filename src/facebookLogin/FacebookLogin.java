package facebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLogin {
	public static WebDriver driver;

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void enterLoginDetails() throws InterruptedException {
		launchBrowser();
		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		un.sendKeys("prathameshdhasade2015@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys("Prat@1999");
		WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		login.click();
		Thread.sleep(2000);
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("validation pass");
		driver.quit();
	}
}
