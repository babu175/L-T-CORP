package com.selenium.basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.KeyRep;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver amazon = new ChromeDriver();
		amazon.get("https://www.google.com/");

		amazon.navigate().to("https://www.amazon.in/");

		amazon.manage().window().maximize();

		WebElement bs = amazon.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions act = new Actions(amazon);
		act.contextClick(bs).perform();

		Thread.sleep(2000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mob = amazon.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(mob).perform();

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement sign = amazon.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
		act.moveToElement(sign).click().perform();

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String windowHandle = amazon.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = amazon.getWindowHandles();
		System.out.println(windowHandles);

		for (String allId : windowHandles) {
			String allTitles = amazon.switchTo().window(allId).getTitle();
			System.out.println(allTitles);

		}

		for (String id : windowHandles) {
			if (id.equals(windowHandles)) {
				WebDriver window = amazon.switchTo().window(id);
				System.out.println(window);

			}
		}

	}

}
