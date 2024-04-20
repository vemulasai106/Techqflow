package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeandafterclass {
	
	WebDriver driver;
	@BeforeClass
	void OpenApp()
	{
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/v4/");
	}
	@Test(priority=1)
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr564034");
		driver.findElement(By.name("password")).sendKeys("qYqyquz");
		driver.findElement(By.name("btnLogin")).click();
	}
	@Test(priority=2)
	void Search()
	{
		System.out.println("This is a search method option");
	}
	@AfterClass
	void CloseApp()
	{
		driver.close();
	}
}
