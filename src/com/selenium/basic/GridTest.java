package com.selenium.basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import okhttp3.internal.platform.Platform;

public class GridTest {

	public static void main(String[] args) throws Throwable {
		String huburl = "http://192.168.43.199/wd/hub";

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);

		ChromeOptions out = new ChromeOptions();
		out.merge(cap);

		WebDriver driver = new RemoteWebDriver(new URL(huburl), cap);
		driver.get("https://www.google.co.in/");
	}
}
