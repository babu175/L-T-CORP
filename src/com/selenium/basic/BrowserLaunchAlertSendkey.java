package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchAlertSendkey {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in/");

		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value' , 'amazzon')", textbox);
		js.executeScript("arguments[0].click()", textbox);
	}

}
