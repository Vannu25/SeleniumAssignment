package TestCasesPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		  		Actions act=new Actions(driver);
		  		driver.findElement(By.name("userLoginId")).sendKeys("vanubandla25@gmail.com");
		  		Thread.sleep(1000);
		  		act.sendKeys(Keys.ENTER).perform();
    	
        
		Thread.sleep(3000);
	driver.close();
	}


}
