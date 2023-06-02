package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Day4task31 
{
    public static void main( String[] args ) throws InterruptedException
    {     
    	
//    	Selecting the browser driver
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Vidya");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("A");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vidya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Vidya123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
       // driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
    }
}
