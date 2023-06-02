package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4task34 {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
	    driver.navigate().to(url);
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Vidya A");
	    driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("Vidya@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Vasundhra");
	    driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Vasundhra@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("purchase a gift certificate");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000)","");
	    driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Vidya A");
	    driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("0");
	    driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	    
	    //System.out.println(Featured.isDisplayed());
	    //System.out.println(Featured.isEnabled());//*[@id="input-theme-6"] 
	}
}