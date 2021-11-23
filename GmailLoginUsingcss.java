package TestCasesPractice;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class GmailLoginUsingcss {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/");
			driver.findElement(By.id("identifierId")).sendKeys("vanubandla25@gmail.com");
			driver.findElement(By.cssSelector("#identifierNext > div > button")).click();
			driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Jesuslove");
			driver.findElement(By.cssSelector("#passwordNext > div > button")).click();
			Thread.sleep(9000);
			driver.close();
			
			
			

		}

	}