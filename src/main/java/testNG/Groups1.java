package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Groups1 {

	WebDriver driver;
	@Test(priority=1,groups= {"sanity"})
	void OpenApp()
	{
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/v4/");
	}
	@Test(priority=2,groups= {"sanity","regression"})
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr541723");
		driver.findElement(By.name("password")).sendKeys("sUdAgEv");
		driver.findElement(By.name("btnLogin")).click();
	}
	@Test(priority=3,groups= {"regression"})
	void Search()
	{
		System.out.println("This is a groups search method option");
	}
	@Test(priority=4,groups= {"sanity"})
	void CloseApp()
	{
		driver.close();
	}
}
