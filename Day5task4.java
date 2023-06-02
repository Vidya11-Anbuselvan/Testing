package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task4 {
	
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://j2store.net/free/");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)", "");
	    WebElement web = driver.findElement(By.linkText("Clothing (5)"));
	    web.click();
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.navigate().forward();
	    Thread.sleep(1000);
	    driver.navigate().refresh();
	    driver.quit();
	    
	}

}
