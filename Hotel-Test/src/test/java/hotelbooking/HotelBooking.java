package hotelbooking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.hotels.com/");
		Thread.sleep(1000);
		
	//	driver.findElement(By.xpath("//div[@class=\"_2uJBvA\"]/span")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class=\"_2uJBvA\"]/span"));
		element.click();
		element.sendKeys("Lonavla");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[1]/div/div[1]/button/span[2]/span[1]")).click();		
		String month = "December 2021";
		String date = "24";
		
		while(true){
		String text = driver.findElement(By.xpath("/h2")).getText();
		if(text.equals(month));
		{
			break;
		}
		}
		
		

	}

}
