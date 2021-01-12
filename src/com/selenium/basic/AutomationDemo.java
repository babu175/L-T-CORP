package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver ad = new ChromeDriver();
		ad.get("http://automationpractice.com/index.php");

		ad.manage().window().maximize();

		WebElement login = ad.findElement(By.xpath("//a[@class='login']"));
		login.click();

		ad.findElement(By.id("email_create")).sendKeys("mohamedthabresh@gmail.com");

		WebElement create_BTn = ad.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Thread.sleep(10000);
		create_BTn.click();

		Thread.sleep(6000);
		ad.findElement(By.id("id_gender1")).click();

		Thread.sleep(6000);
		ad.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Mohamed");

		Thread.sleep(6000);
		ad.findElement(By.id("customer_lastname")).sendKeys("Thabresh");

		Thread.sleep(6000);
		ad.findElement(By.id("passwd")).sendKeys("123456789");

		WebElement day = ad.findElement(By.id("days"));
		Select d = new Select(day);
		d.selectByValue("30");

		WebElement month = ad.findElement(By.id("months"));
		Select m = new Select(month);
		m.selectByIndex(10);

		WebElement year = ad.findElement(By.id("years"));
		year.click();
		Select y = new Select(year);
		Thread.sleep(6000);
		y.selectByValue("1995");

		ad.findElement(By.id("newsletter")).click();

		ad.findElement(By.id("company")).sendKeys("GreenTechnologies");

		ad.findElement(By.id("address1")).sendKeys("Ashok Nagar, Ammmapet, Salem-636015");

		ad.findElement(By.id("city")).sendKeys("Salem");

		WebElement state = ad.findElement(By.xpath("//select[@id='id_state']"));
		state.click();
		Select s = new Select(state);
		s.selectByIndex(1);

		ad.findElement(By.id("postcode")).sendKeys("00000");

		WebElement country = ad.findElement(By.id("id_country"));
		country.click();
		Select cou = new Select(country);
		cou.selectByIndex(1);

		Thread.sleep(6000);
		ad.findElement(By.id("other")).sendKeys("summa");

		ad.findElement(By.id("phone")).sendKeys("7598064072");
		ad.findElement(By.id("alias")).sendKeys("salem");

		Thread.sleep(6000);

		WebElement Register_Btn = ad.findElement(By.xpath("//button[@id='submitAccount']"));
		Register_Btn.click();

	}

}
