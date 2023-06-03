package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8task4 {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore");
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Chennai");
		WebElement datepicker=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','11/07/2023')", datepicker);
		
	}

}
