package testNG;


//import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dprovider {

	   WebDriver driver;
	   @Test(priority=1)
	   void OpenApp()
	   {
		   driver = new EdgeDriver();
		   //driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10));
		   driver.get("https://demo.guru99.com/v4/");
	   }
	   @Test(priority=2,dependsOnMethods= {"OpenApp"},dataProvider="DP")
	   void Login(String ID,String PWD)
	   {
		   driver.findElement(By.name("uid")).sendKeys(ID);
		   driver.findElement(By.name("password")).sendKeys(PWD);
		   driver.findElement(By.name("btnLogin")).click();
		   String ExpText = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		   String ActText = "Welcome To Manager's Page of Guru99 Bank";
		   Assert.assertEquals(ExpText, ActText,"Text not matching");
	   }
	   @Test(priority=3,dependsOnMethods= {"OpenApp"})
	   void CloseApp()
	   {
		   driver.close();
	   }
	   @DataProvider (name="DP")
	   String [][] LoginData()
	   {
		   String data[][] = {
				   {"sai@Gmail.com","XYZ"},
				   {"megu@Gmail.com","123"},
				   {"mngr541723","sUdAgEv"}
				   
		   }; return data;
	   }
	
	 /*WebDriver driver;
	 @Test(priority=1)
	 void OpenApp()
	 {
		 driver = new EdgeDriver();
		 driver.get("https://demo.guru99.com/v4/");
	 }
	 @Test(priority=2)
	 void Login()
	 {
		 driver.findElement(By.name("uid")).sendKeys("mngr529637");
		 driver.findElement(By.name("password")).sendKeys("YdygUmy");
		 driver.findElement(By.name("btnLogin")).click();
	 }
	 @Test(priority=3)
	 void Search()
	 {
		 System.out.println("It is a searching option");
	 }
	 @Test(priority=4)
	 void AdvanceSearch()
	 {
		 System.out.println("This is a advance search option");
	 }
	 @Test(priority=4)
	 void CloseApp()
	 {
		 driver.close();
	 }*/
	
}
