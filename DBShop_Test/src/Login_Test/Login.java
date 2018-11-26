package Login_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {

	//ºóÌ¨Ò³ÃæµÇÂ¼
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/DBShop/admin");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_passwd']")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(1000);
	}
}
