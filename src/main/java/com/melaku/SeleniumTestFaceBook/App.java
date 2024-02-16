
package com.melaku.SeleniumTestFaceBook;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Author Melaku Bogale
 * Selenium test Openning the facebookLogin Page: useing ChromeDrive, java, Maven, git, Github, Jenkin, 
 */

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //Before connectting to the cromeDriver in local
    	System.out.println( "Hello java code main!" );
          
        
		      
		      	
    	//Get the chromeDriver from external folder and connect locally
          // System.setProperty("webdriver.chrome.driver", "/Users/melakubogale/Chrome-Driver/chromedriver");
         
    	//chromeDriver maven dependency internal connection
          WebDriverManager.chromedriver().setup();
             
        
         ChromeOptions chromeOptions = new ChromeOptions(); 
       //1. headless makes invisable browther output.
  	     chromeOptions.addArguments("--headless");
  	  
  	   ChromeDriver driver = new ChromeDriver(chromeOptions);
  	   
  	   System.out.print("Opened facebook login page\n");
                      
        driver.get("https://www.facebook.com/");
             
      //2.enable wait of 3 seconds
       driver.manage(). timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        
      //3.Brother opened the facebook login page after loading.
        System.out.print("Opened facebook login page\n");
        	
       //4.Get the email addres on login page	
        driver.findElement(By.id("email")).sendKeys("mlkssyb@yahoo.com");
        // Thread.sleep(1000);
        
       //5.Get the pasward on login page
        driver.findElement(By.id("pass")).sendKeys("10101010101");
       // Thread.sleep(1000);
        
        //6.login to account or reject invalid email or password.
        System.out.print("loading finishe, Login accepted or rejected");
        
    }
}
