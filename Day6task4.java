package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6task4 {
	
	public static void main( String[] args ) throws InterruptedException
	{
	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    driver.manage().window().maximize();
    WebElement uname=driver.findElement(By.name("username"));
	  uname.sendKeys("Admin");
	  Thread.sleep(3000);
	  WebElement pass=driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  
	 //driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	// driver.findElement(By.name("password")).sendKeys("admin123");
	 Thread.sleep(4000);
	 
    String login = driver.getCurrentUrl();
    Thread.sleep(2000);
    
    if(!login.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
    {
    	System.out.println("Login is Successful");
    }
	}

}
