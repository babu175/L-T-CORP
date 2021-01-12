package com.selenium.basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookScreenshots {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver gm = new ChromeDriver();
		gm.get("https://www.google.com");
		
		gm.navigate().to("https://en-gb.facebook.com/login/");
		
		gm.manage().window().maximize();
		
		WebElement username = gm.findElement(By.id("email"));
		username.sendKeys("mohamedthabreh");
		
		WebElement password = gm.findElement(By.id("pass"));
		password.sendKeys("qweerrr");
		
		WebElement signup = gm.findElement(By.name("login"));
		signup.click();
		
		TakesScreenshot ts = (TakesScreenshot)gm;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Askar\\eclipse-workspace\\SeleniumConcepts\\ScreenShots\\snaps.png");
		FileUtils.copyFile(source, destination);
		
	}


	}


