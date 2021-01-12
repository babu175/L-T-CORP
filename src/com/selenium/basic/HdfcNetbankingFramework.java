package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcNetbankingFramework {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver hdfc = new ChromeDriver();
		hdfc.get("https://www.google.co.in/");

		hdfc.navigate().to("https://netbanking.hdfcbank.com/netbanking/");

		WebElement frame = hdfc.findElement(By.xpath("//frame[@name='login_page']"));
		hdfc.switchTo().frame(frame);
		
		
		WebElement username = hdfc.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		username.sendKeys("484848484");
		
		WebElement login = hdfc.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img"));
		login.click();
		
		
	}
}
