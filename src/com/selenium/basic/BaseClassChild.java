package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClassChild extends BaseClassSelenium {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=getBrowser("chrome");
		geturl("https://www.google.co.in/");

		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		sendkeysOnElement(textbox, "facebook");

		Thread.sleep(5000);

		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		clickOnWebelement(gmail);

	}

}
