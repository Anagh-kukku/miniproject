package org.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day10task {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayar\\eclipse-workspace\\Selenium_Sept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("http://automationpractice.com/index.php");
		
		Actions a = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		a.moveToElement(women).perform();
		
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[1]"));
		a.moveToElement(dress).click().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(.,'Evening Dresses')])[3]")).click();
		
		driver.findElement(By.xpath("//img[@alt='Printed Dress']")).click();
		
		driver.switchTo().frame(0);
	
		// driver.findElement(By.id("quantity_wanted")).sendKeys("3");
		 Thread.sleep(3000);
	//	 WebElement add = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		 WebElement add = driver.findElement(By.xpath("//a[contains(@class,'product_quantity_up')]"));
//		 add.click();
//		 add.click();
		 for (int i = 0; i <= 4; i++) {
			 
//				
//				if (i==4) {
					 add.click();
//				 break;
				 
			 }
	//	}
		
		Thread.sleep(4000);
		
		WebElement size = driver.findElement(By.xpath("//select[contains(@class,'con')]"));
		Thread.sleep(2000);
		
		Select s = new Select(size);
		s.selectByValue("2");
		
		driver.findElement(By.xpath("//a[@title='Pink']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		Thread.sleep(8000);
	driver.switchTo().defaultContent();
       
        driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[.='Proceed to checkout']")).click();
     
        driver.findElement(By.id("email")).sendKeys("anagh10lh1234@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456789@#$");
        Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("message")).sendKeys("kukku");
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("//span[.='I confirm my order']")).click();
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File s3 = ts1.getScreenshotAs(OutputType.FILE);
		File s4 = new File("C:\\Users\\jayar\\eclipse-workspace\\Selenium_Sept\\Screen_shot\\day10.png");
	    FileUtils.copyFile(s3, s4);
		
		
		
		
		
		
		
		
		
		//C:\Users\jayar\eclipse-workspace\Selenium_Sept\Screen_shot
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
