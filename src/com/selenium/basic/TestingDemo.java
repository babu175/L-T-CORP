package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestingDemo extends BaseClassSelenium {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		getBrowser("chrome");
		geturl("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		sendkeysOnElement(username, "abc@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		
		
		
		
	}
}
