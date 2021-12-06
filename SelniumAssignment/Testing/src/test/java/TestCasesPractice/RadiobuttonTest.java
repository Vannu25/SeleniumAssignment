package TestCasesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		
		 WebElement radio = driver.findElement(By.id("bookFlights"));
	        radio.click();
	        System.out.println(radio.isSelected()); 
	 
	                            WebElement radio2 = driver.findElement(By.id("redeemFlights"));
	        radio2.click();
		
	}

}
