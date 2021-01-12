package com.selenium.basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMouseHover {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
	WebDriver fk = new ChromeDriver();
	fk.get("https://www.flipkart.com/");
	
	fk.manage().window().maximize();
	
	fk.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	fk.switchTo().alert().accept();
	
//	WebElement electronic = fk.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"));
//	
//	Actions ac = new Actions(fk);
//	ac.contextClick(electronic).perform();
//	Thread.sleep(2000);
//	
//	Robot r = new Robot();
//
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
}
	
}
