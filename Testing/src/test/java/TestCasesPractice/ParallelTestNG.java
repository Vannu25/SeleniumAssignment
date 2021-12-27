package TestCasesPractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestNG {
	WebDriver driver;
	
	
	@Test()
	
public void test1() throws InterruptedException {
	System.out.println("I am inside test 1"+Thread.currentThread().getId());
	//String projectPath = System.getProperty("user.dir");
	//System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	driver.close();
	
}
	@Test()
public void test2() throws InterruptedException {
	System.out.println("I am inside test 2"+Thread.currentThread().getId());
	//String projectPath = System.getProperty("user.dir");
	//System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.close();
	}	
		@AfterClass
		public void close()
		{
			driver.quit();
		}
		

}
