package com.selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutliSelectDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.google.com/");

		d.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		WebElement single = d.findElement(By.xpath("//select[@id='select-demo']"));
		single.click();
		Select s = new Select(single);
		s.selectByIndex(3);
		
		WebElement ml = d.findElement(By.xpath("//select[@id='multi-select']"));
		ml.click();
		
		Select s1 = new Select(ml);
		for (int i = 0; i <=7; i++) {
			if (i==3||i==5||i==7) {
				s1.selectByIndex(i);
						
		}
		}

		WebElement first = s1.getFirstSelectedOption();
		System.out.println(first.getText());
		
		List<WebElement> allSel = s1.getAllSelectedOptions();
		for (WebElement web : allSel) {
			System.out.println(web.getText());
		}
	
	
	}

}