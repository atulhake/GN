package com.geneo.pages;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginToTextPage
{
	WebDriver wd;
	
	
	public loginToTextPage(WebDriver wd)
    {
	    this.wd = wd;
    }
       
	
	 public void select_std_sub(int std,String subject) throws InterruptedException
     {
		 if(wd.getTitle().equals("Geneo Student Cover Page"))
			{
				wd.findElement(By.xpath(".//img[@class='landing_user']")).click();   // menu option
				wd.findElement(By.xpath(".//a[contains(text(),'Geneo')]")).click(); //GENEO OPTION OF MENU BAR 
			}
		 
		
		Thread.sleep(2000);  
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/button")).click(); 
		 
     switch (std) {
     case 8:  
     	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[3]/a")).click(); //10th Standard
        
	     	System.out.println("\n\n8th standard");
     	      break;
     case 9:  
        	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[2]/a")).click();  //9th standard
 		
 		System.out.println("\n\n9th standard");
 		      break;
     case 10:  
     	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/a")).click();  //8th standard
		
		System.out.println("\n\n10th standard");
		      break;
     			}
	
	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/span/span")).click();  //subject dropdown

     switch (subject) {
         case "SCIENCE": 
         	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[2]/a")).click();  //science 
         	System.out.println("Science");
         	     break;
         case "MATHAMATICS":  
         	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[1]/a")).click(); //Maths 
     		System.out.println("Mathamatics");
                  break;
         case "ENGLISH":  
         	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[3]/a")).click(); //English 
     		System.out.println("English");
                  break;
         default:
        	 System.out.println("Subject selection failed");
        	 Assert.assertEquals("12", "13");
     				}
		 Thread.sleep(1000);
		 By done_button =By.xpath("//button[contains(text(),'DONE')]");
		 wd.findElement(done_button).click();
   //============================cover page =================================//
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@class='chat_note_content']/a/img")).click(); // cover page click event
		Thread.sleep(1000);
		System.out.println("Index page displayed.");
		By chapter_no=By.xpath(".//*[@class='col-lg-11 col-sm-11 left_space_index']/span[contains(text(),'2')]"); //chapter no selection
		wd.findElement(chapter_no).click();
		Thread.sleep(4000);
		assertEquals("Geneo Reader", wd.getTitle(), "text page not dispalyed");
		System.out.println("Text page displayed.");
		
  	  
     }
}
