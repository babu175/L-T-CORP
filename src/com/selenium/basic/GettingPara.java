package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPara {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver green = new ChromeDriver();
		green.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");

		WebElement review = green.findElement(By.xpath("//div[@id='box-wrapper']/div[11]/p"));
		System.out.println(review.getText());

	}

}
