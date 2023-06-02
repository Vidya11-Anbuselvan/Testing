package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5task2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    String url="https://j2store.net/free/";
	    driver.navigate().to(url);
		driver.manage().window().maximize();
		
		String homeUrl = driver.getCurrentUrl();
		//driver.manage().window().maximize();
		
		//String Actualtext = driver.findElement(By.linkText("http://localhost:8080/imdb/homepage")).getText();
		//Assert.assertEquals(Actualtext, "http://localhost:8080/imdb/homepage" );
		//System.out.println("URL matching --> Part executed");
		
		if(homeUrl.equals("https://j2store.net/free/"))
			System.out.println("The Home URL is Verified");
		else
			System.out.println("The Home URL is not Verified");
        
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,900)","");
			
			driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
			
			String shopUrl = driver.getCurrentUrl();
			if(shopUrl.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
				System.out.println("The Shop URL is Verified");
			else
				System.out.println("The Shop URL is not Verified");
	}
}
