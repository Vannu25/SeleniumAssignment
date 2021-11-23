package TestCasesPractice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class MouseActTest {
		public static void main(String[] args)throws InterruptedException{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.netflix.com/in/");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[1]/div[2]/form/div/div/button/span[1]"));
			WebElement element1 = driver.findElement(By.linkText("Account"));
	        Actions action = new Actions(driver);
	        action.moveToElement(element).perform();
	        Thread.sleep(1000);
	        action.moveToElement(element1).perform();
			Thread.sleep(3000);
		driver.close();
		}

	}