package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver gm = new InternetExplorerDriver();
		gm.get("https://www.google.com");

		gm.navigate().to("https://www.google.com/intl/en-GB/gmail/about/#");

		WebElement signin = gm.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a"));
		signin.click();

		WebElement username = gm.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("futureperfect@gmail.com");

		WebElement next = gm.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
		next.click();

	}

}
