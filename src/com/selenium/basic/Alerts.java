package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts extends BaseClassSelenium {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Askar\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");

		getBrowser("chrome");
		geturl("https://www.google.co.in/");
		navigating("http://demo.automationtesting.in/Frames.html");
		navigating("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		simpleAlert();
//		driver.switchTo().alert().accept();

//		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
//		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement second = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));

		second.click();
		Thread.sleep(5000);

		WebElement confirmbutton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmbutton.click();
		Thread.sleep(5000);
		confirmAlert("ok");
//		driver.switchTo().alert().dismiss();

		driver.findElement(By.cssSelector("a.analystic")).click();
		driver.findElement(By.cssSelector("button.btn.btn-info")).click();
		promptAlert("ok", "Mohamed");
	}

}
