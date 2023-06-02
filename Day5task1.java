package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    String url="https://j2store.net/free/";
	    driver.navigate().to(url);
		driver.manage().window().maximize();
		
		String hometitle = driver.getTitle();
		driver.manage().window().maximize();
		//String expectedTitle = "Home";
		if(hometitle.equals("Home"))
			System.out.println("The Title Home is Verified");
		else
			System.out.println("The Title Home is not Verified");
        
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,900)","");
			
			driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
			String shoptitle = driver.getTitle();
			if(shoptitle.equals("Shop"))
				System.out.println("The Title Shop is Verified");
			else
				System.out.println("The Title shop is not Verified");
	}
}
