package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void loginpage(String browsername) throws InterruptedException
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		driver.quit();
			
			
		}
	}

