package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFrameWork {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		driver.navigate().to("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		
		WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frame2.click();

		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);

		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);

		WebElement textbox1 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		textbox1.sendKeys("hello");
	}

}
