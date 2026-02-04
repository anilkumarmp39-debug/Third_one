package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderexample {
	
	WebDriver driver;
	@Test(dataProvider="automationdata")

	public void logintest(String username, String password) throws InterruptedException
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		}
	@DataProvider(name="automationdata")
	public Object [][] passData()
	{
		Object [][] data= new Object[3][2];
		
		data[0][0] ="admin1";
		data[0][1] ="admin2";
		
		data[1][0] ="admi2";
		data[1][1] ="admin2";
		
		data[2][0] ="admin3";
		data[2][1] ="admin2";
		
		return data;
	}
}
