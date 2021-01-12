package com.selenium.basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver amazon = new ChromeDriver();
		amazon.get("https://www.amazon.in/");

		amazon.manage().window().maximize();

		WebElement bs = amazon.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions act = new Actions(amazon);
		act.contextClick(bs).perform();

		Thread.sleep(2000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiles = amazon.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(mobiles).perform();

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String title = amazon.getWindowHandle();
		System.out.println(title);
		String title2 = amazon.switchTo().window(title).getTitle();
		System.out.println(title2);

		Set<String> allid = amazon.getWindowHandles();
		System.out.println(allid);
		for (String ids : allid) {
			String alltitle = amazon.switchTo().window(ids).getTitle();
			System.out.println(alltitle);

		}
	}
	
	
}
