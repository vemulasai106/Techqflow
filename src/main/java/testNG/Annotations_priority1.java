package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Annotations_priority1 {
	WebDriver driver;
	@Test(priority=1)
	 void OpenApp()
	 {
		 driver = new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 }
	@Test(priority=2)
	 void Login()
	 {
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	 }
	@Test(priority=3)
	 void Search()
	 {
		 System.out.println("This is a search");
		 
	 }
	@Test(priority=4)
     void CloseApp()
     {
    	 driver.close();
     }
}
