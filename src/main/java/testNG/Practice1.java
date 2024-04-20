package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Practice1 {

	WebDriver driver;
	@Test(priority=1,groups= {"sanity"})
	void OpenApp()
	{
		driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/V4/");
	}
	@Test(priority=2,groups= {"sanity","regression"})
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr550315");
		driver.findElement(By.name("password")).sendKeys("EpebysY");
		driver.findElement(By.name("btnLogin")).click();
	}
	@Test(priority=3,groups= {"regression"})
	void Search()
	{
		System.out.println("This is a search method");
	}
	@Test(priority=4,groups= {"sanity"})
	void CloseApp()
	{
		driver.close();
	}
}
