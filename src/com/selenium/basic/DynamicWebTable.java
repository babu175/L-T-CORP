package com.selenium.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class DynamicWebTable {
	public static void main(String[] args) {
		int indexofCountryName = 0;
		int indexofTotalRecovered = 0;
		int indexofTotalCases = 0;
		int indexofActiveCases = 0;
		String countryName = "india";
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		driver.navigate().to("https://www.worldometers.info/coronavirus/?utm_campaign=homeAdvegas1?");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> allHeaders = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < allHeaders.size(); i++) {
			String text = allHeaders.get(i).getText();
			String value = text.replaceAll("\n", " ");
//			System.out.println(value);

			if (value.equalsIgnoreCase("Total Cases")) {
				indexofTotalCases = i;
				System.out.println("Index of Total Cases " + indexofTotalCases);
			} else if (value.equalsIgnoreCase("Total Recovered")) {
				indexofTotalRecovered = i;
				System.out.println("Index of Total Recovered " + indexofTotalRecovered);
			} else if (value.contains("Country")) {
				indexofCountryName = i;
				System.out.println("Index of Country Name " + indexofCountryName);

			} else if (value.equals("Active Cases")) {
				indexofActiveCases = i;
				System.out.println("Index of Active Cases " + indexofActiveCases);
			}

			List<WebElement> allRow = driver
					.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
			for (int j = 0; j < allRow.size(); j++) {
				List<WebElement> alldata = allRow.get(i).findElements(By.tagName("td"));
				for (int k = 0; k < alldata.size(); k++) {
					if (alldata.get(k).getText().equals(countryName)) {
						System.out.println("Country Name: " + alldata.get(indexofCountryName).getText());
						System.out.println("Total Cases " + alldata.get(indexofTotalCases).getText());
						System.out.println("Recovered Cases " + alldata.get(indexofTotalRecovered).getText());
						System.out.println("Active Cases " + alldata.get(indexofActiveCases).getText());

					}

				}
			}

		}

	}

}
