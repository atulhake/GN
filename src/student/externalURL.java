package student;
import java.util.concurrent.TimeUnit;

import library.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class externalURL 
{
	WebDriver wd;
	@Test(priority= 1)
	public void Capacityswap() throws InterruptedException
	{
		System.out.println("===============Capacityswap URL testing================\n");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.navigate().to("http://capacityswap.com");
		wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		//wd.manage().window().setSize(new org.openqa.selenium.Dimension(200,200));
		//System.out.println(wd.manage().window().getSize().getWidth());
		//wd.findElement(By.tagName(name))
		Thread.sleep(3000);
		String title = wd.getTitle();
		String ActualTitle="CapacitySwap";
		Assert.assertEquals(title, ActualTitle,"URL : http://capacityswap.com is NOT WORKING.......\n");
		System.out.println("URL : http://capacityswap.com is working fine.\n");
		
	}
	
	@AfterMethod
	public void TearDown(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{	
			Utility.capturescreenshots(wd, result.getName());
		}
		wd.close();
	}
	
}
