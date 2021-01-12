package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin extends BaseClassSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver gm = new ChromeDriver();
		gm.get("https://www.google.com");

		gm.navigate().to("https://en-gb.facebook.com/login/");

		WebElement username = gm.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("mohamedthabreh");

		WebElement password = gm.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("qweerrr");

		WebElement signup = gm.findElement(By.xpath("//a[@class='_97w5']"));
		signup.click();

	}

}
