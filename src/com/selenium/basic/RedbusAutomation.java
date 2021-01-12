package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.events.Event.ID;

public class RedbusAutomation extends BaseClassSelenium {

	public static void main(String[] args) throws InterruptedException {
		getBrowser("chrome");

		geturl("https://www.google.co.in/");

		driver.navigate().to("https://www.redbus.in/");

		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("SALEM");
		Select s = new Select(source);
		s.selectByIndex(0);

		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("CHENNAI");
		s.selectByIndex(0);
		
		driver.findElement(By.xpath("//td[text()='16']")).click();
		
		driver.findElement(By.id("search_btn")).click();
	}

}
