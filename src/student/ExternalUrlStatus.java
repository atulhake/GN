package student;
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import library.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExternalUrlStatus 
{
		WebDriver wd;
	@Test(priority= 1)
	public void GeneoStudentURL() throws InterruptedException
	{
		System.out.println("===============GeneoStudentURL testing================\n");
		//System.out.println("GeneoStudentURL testing\n");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.aspx");
		wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		//Thread.sleep(3000);
		String title = wd.getTitle();
		String ActualTitle="Geneo Student Login";
		if(ActualTitle.equals(title))
		{
			System.out.println("URL : Student.geneo.in is working fine.\n");
		}
		else
		{
			System.out.println("URL : Student.geneo.in is NOT WORKING.......\n");
			Assert.assertEquals("12", "13"); // added just to make method fail
			
    	}
	
	}
	
	//@Test(priority= 2)  // commented as URL is changed.
	public void GeneoURL() throws InterruptedException
	{
		System.out.println("===============GeneoURL testing================\n");
		//System.out.println("GeneoURL testing\n");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://geneo.in");
		wd.manage().window().maximize();

		Thread.sleep(3000);
		String title = wd.getTitle();
		String ActualTitle="Geneo";
		if(ActualTitle.equals(title))
		{
			System.out.println("URL : https://geneo.in is working fine.\n");
		}
		else
		{
			System.out.println("URL : https://geneo.in is NOT WORKING.......\n");
			Assert.assertEquals("12", "13");// added just to make method fail
			
		}
	}
	@Test(priority= 3)
	public void ExplorimentsURL() throws InterruptedException, Exception
	{
		System.out.println("===============Exploriments testing================\n");
		//System.out.println("Exploriments testing\n");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://exploriments.com/");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		String title = wd.getTitle();
		String ActualTitle="Exploriments";
		if(ActualTitle.equals(title))
		{
			System.out.println("URL : https://exploriments.com is working fine.\n");
		}
		else
		{
			System.out.println("URL : https://exploriments.com is NOT WORKING......\n");
			Assert.assertEquals("12", "13");  // added just to make method fail
			
		}
	}
	//@Test(priority= 4)
	public void CapacityswapURL() throws InterruptedException, Exception
	{
		System.out.println("===============CapacityswapURL testing================\n");
		//System.out.println("Exploriments testing\n");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://exploriments.com/");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		String title = wd.getTitle();
		String ActualTitle="Exploriments";
		if(ActualTitle.equals(title))
		{
			System.out.println("URL : https://exploriments.com is working fine.\n");
		}
		else
		{
			System.out.println("URL : https://exploriments.com is NOT WORKING......\n");
			Assert.assertEquals("12", "13");  // added just to make method fail
			
		}
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
