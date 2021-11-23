package TestCasesPractice;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class Navigation {	

		public static void main(String[] args)throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.save70.com/find/hotels/");
			Thread.sleep(5000);
			driver.navigate().back();  //click back button
			Thread.sleep(5000);
			driver.navigate().forward();  //click forward button
			Thread.sleep(3000);
			driver.navigate().back();  //click back button
			Thread.sleep(5000);
			driver.navigate().to("https://www.netflix.com/in/");
			Thread.sleep(5000);
			driver.navigate().back();  //click back button
			Thread.sleep(5000);
			driver.navigate().to("https://www.shiksha.com/it-software/ai-robotics/colleges/colleges-mumbai-all");
			Thread.sleep(5000);
			driver.navigate().back();  //click back button
			driver.manage().window();
			Thread.sleep(5000);
			driver.close();
			
		}

	}