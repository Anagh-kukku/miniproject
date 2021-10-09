package org.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9miniproject {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayar\\eclipse-workspace\\Selenium_Sept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("anagh12345@gmail.com");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s1 =ts.getScreenshotAs(OutputType.FILE);
		File s2 = new File("C:\\Users\\jayar\\eclipse-workspace\\Selenium_Sept\\Screen_shot\\mini.png");
		FileUtils.copyFile(s1, s2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Anagh");
		driver.findElement(By.id("customer_lastname")).sendKeys("kukku");
		driver.findElement(By.id("passwd")).sendKeys("123456789@#$");
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.id("days"));
		a.click();
		Select s = new Select(a);
		s.selectByValue("20");
		
		
		WebElement b = driver.findElement(By.id("months"));
		b.click();
		 Select ss = new Select(b);
		 ss.selectByValue("4");
			
		 
		 WebElement c = driver.findElement(By.id("years"));
		 c.click();
		 Select sss = new Select(c);
		 sss.selectByValue("1996");
		 
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		 driver.findElement(By.id("firstname")).sendKeys("anagh");
		 driver.findElement(By.id("lastname")).sendKeys("kukku");
		 driver.findElement(By.id("company")).sendKeys("DAIMLER");
		 driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("oragadam 600017 daimler opp nissan");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("14/15");
		 driver.findElement(By.id("city")).sendKeys("chennai");
		 WebElement l = driver.findElement(By.id("id_state"));
		 l.click();
		 Select s8 = new Select(l);
		 s8.selectByValue("16");
		 
		 driver.findElement(By.id("postcode")).sendKeys("60001");
		 driver.findElement(By.id("other")).sendKeys("deliver to home");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		driver.findElement(By.id("alias")).sendKeys("t.nagar");
		driver.findElement(By.xpath("//span[contains(.,'Register')]")).click();
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File s11 =ts1.getScreenshotAs(OutputType.FILE);
		File s21 = new File("C:\\Users\\jayar\\eclipse-workspace\\Selenium_Sept\\Screen_shot\\mini2.png");
		FileUtils.copyFile(s11, s21);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
