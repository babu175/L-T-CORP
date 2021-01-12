package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement downlogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", downlogo);
		Thread.sleep(2000);

		WebElement uplogo = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		js.executeScript("arguments[0].scrollIntoView();", uplogo);
		Thread.sleep(2000);

//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-2000)");
		
		
	}
}