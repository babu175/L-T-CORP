package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWork {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
//		driver.switchTo().frame("SingleFrame");
//		driver.switchTo().frame(0);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("Greens");
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frame2.click();
		
		
		
		
		
		
		
	}

}
