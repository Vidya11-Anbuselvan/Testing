package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6task1 {
	
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	    driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Vidya");
	    driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("A");
	    driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vidya@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Vidya123");
	    JavascriptExecutor js = (JavascriptExecutor)driver;	
	    js.executeScript("window.scrollBy(0,1500)", "");
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,1500)", "");
	    //driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div")).click();
	    driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	}

}
