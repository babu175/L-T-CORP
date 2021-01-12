package com.selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver table = new ChromeDriver();
		table.get("https://www.google.co.in/");

		table.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		table.manage().window().maximize();
		
		List<WebElement> alldata = table.findElements(By.xpath("//table[@id='customers']"));
	for (WebElement data : alldata) {
		System.out.println(data.getText());
	}
	
	System.out.println("***************************************************");
	
	List<WebElement> parRow = table.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
	for (WebElement row : parRow) {
		System.out.print(row.getText());
	}
	
	List<WebElement> parColumn = table.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	for (WebElement row : parColumn) {
		System.out.println(row.getText());
	}
	
	System.out.println("*****************************************************");
	
	List<WebElement> header = table.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	for (WebElement row : header) {
		System.out.print(row.getText());
	}
	}
}