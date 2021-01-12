package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.automation.pom.HomePage;

public class AutomationFullDemo extends BaseClassSelenium {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Askar\\eclipse-workspace\\SeleniumConcepts\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

//		driver.get("http://automationpractice.com/index.php");

//		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
//		signin.click();

		driver=getBrowser("chrome");
		
		driver.manage().window().maximize();
		
		geturl("http://automationpractice.com/index.php");

		HomePage hp = new HomePage(driver);
		clickOnWebelement(hp.getSignin());

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions s = new Actions(driver);
		s.moveToElement(women).perform();
		Thread.sleep(2000);

		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		s.moveToElement(tshirt).perform();
		s.click().perform();
		Thread.sleep(2000);

		WebElement image = driver.findElement(By.xpath("//a[@title='Fdrivered Short Sleeve T-shirts']"));
		s.moveToElement(image).perform();
		s.click().perform();
		Thread.sleep(4000);

		driver.switchTo().frame(0);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		WebElement size = driver.findElement(By.id("group_1"));
		Select s1 = new Select(size);
		s1.selectByIndex(1);

		driver.findElement(By.xpath("//a[@id='color_13']")).click();

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		driver.findElement(By.id("email")).sendKeys("mohamedthabresh@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		driver.findElement(By.xpath("//a[@class='bankwire']")).click();

		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();

	}

}
