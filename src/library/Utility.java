package library;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void capturescreenshots(WebDriver wd, String screenshotName) throws Exception
	{
		try {
			DateFormat df = new SimpleDateFormat("ddMMYYHHmmss");
			Date DateTime = new Date();
			String ss=df.format(DateTime);
			TakesScreenshot ts=(TakesScreenshot)wd;
			File source =ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/"+screenshotName+ss+".png"));
			System.out.println("screenshot taken");
		} catch (Exception e)
		{
			System.out.println("Exception while taking screenshot =  "+e.getMessage());
		}
	}
	public static void  Current_Date_Time()
	{
		{
			DateFormat df = new SimpleDateFormat("ddMMYYHHmmss");
			Date DateTime = new Date();
			String ss=df.format(DateTime);
		System.out.println(ss);
		}
	}
}
