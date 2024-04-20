package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Dependsonmethod {
	
	WebDriver driver;
	@Test(priority=1)
	void OpenApp()
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10));
		driver.get("https://www.instagram.com");
	}
	@Test(priority=2,dependsOnMethods= {"OpenApp"})
	void Login()
	{
		driver.findElement(By.name("username")).sendKeys("9550669760");
		driver.findElement(By.name("password")).sendKeys("Likith@123@");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	}
	@Test(priority=3,dependsOnMethods= {"Login"})
	void Search()
	{
		System.out.println("This is a search");
	}
	@Test(priority=4,dependsOnMethods= {"OpenApp"})
	void CloseApp()
	{
		driver.close();
	}

}
