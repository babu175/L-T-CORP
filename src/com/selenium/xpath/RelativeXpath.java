 package com.selenium.xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Askar\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
		WebDriver gm = new ChromeDriver();
		gm.get("https://www.google.com");

		gm.manage().window().maximize();

		gm.manage().deleteAllCookies();

		gm.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		gm.navigate().to(
				"https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAiA2O39BRBjEiwApB2IksfhBjQV0vcn2uEPxn_c0brEkcrnVfFKdaBuqezDcjQsn-E721py5hoCQnIQAvD_BwE");

		gm.navigate().to("https://www.myntra.com/men-tshirts");

		List<Integer> prizeList = new ArrayList<Integer>();
		List<WebElement> list = gm.findElements(
				By.xpath("//span[@class='product-discountedPrice']//following::span[@class='product-strike']"));
		for (WebElement web : list) {
			String replace = web.getText().replace("Rs. ", "");
			System.out.println(replace);
			prizeList.add(Integer.parseInt(replace));
		}
		System.out.println(prizeList);
		System.out.println("Minimum Value " + Collections.min(prizeList));
	}

}
