package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon_program{
	
	 WebDriver driver;
	 @Test(priority=1)
	 void OpenApp()
	 {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
	 }
	 @Test(priority=2)
	 void Login()
	 {
		 driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		 driver.findElement(By.name("email")).sendKeys("9640797296");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.name("password")).sendKeys("Sai@123@");
		 driver.findElement(By.id("signInSubmit")).click();
		 /*Select title = new Select(driver.findElement(By.name("url")));
		 title.selectByVisibleText("Electronics");
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("electronics");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		 driver.findElement(By.name("submit.addToCart")).click(); */
		 
	 }
	 @Test(priority=3)
	 void Search()
	 {
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("electronics");
		 driver.findElement(By.id("nav-search-submit-button")).click();
	 }
	 @Test(priority=4)
	 void SelectItem()
	 {
		 Select title = new Select(driver.findElement(By.name("url")));
		 title.selectByVisibleText("Electronics");
	 }
	 @Test(priority=5)
	 void AddtoCart()
	 {
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		 driver.findElement(By.name("submit.addToCart")).click(); 
	 }
	 @Test(priority=3)
	 void CloseApp()
	 {
		 driver.close();
	 }
	
}