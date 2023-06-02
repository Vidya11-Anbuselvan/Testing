package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task5 {
	
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://demo.smart-hospital.in/site/login");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[1]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
	    
	    ////*[@id="sibe-box"]/ul[2]/li[4]/a
	    ///html/body/div[1]/div[1]/section/div/div/div/div[1]/h3
	    ////*[@id="search-btn"]/i
	    ////*[@id="alert2"]/form/div/input  //*[@id="alert2"]/form/div/input
	    ////*[@id="alert2"]/form
	    ////*[@id="search-btn"]
	  //*[@id="search-btn"]
	    System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getText());
	    
	  // WebElement search= driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/form/div/input"));
	   WebElement search= driver.findElement(By.xpath("//*[@id=\"search-btn\"]"));
	  // System.out.println(openqa.selenium.Dimension dim= search.getSize());
	   System.out.println(search.getCssValue("color"));
	   System.out.println(search.getSize());
	   
}

}
