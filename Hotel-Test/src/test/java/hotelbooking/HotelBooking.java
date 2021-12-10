package hotelbooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[1]/div/div[1]/button/span[2]/span[1]")).click();	
	   
        String month = "December 2021";
		String date = "24";
		
		while(true)
		{
		String text = driver.findElement(By.xpath("//h2")).getText();
		if(text.equals(month))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
		}
	}
		List<WebElement> alldates=driver.findElements(By.xpath("//body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr/td/button[1]"));
		for(WebElement ele:alldates)
		{
			//System.out.println(ele.getText()); 
			String date_text=ele.getText();
			if(date_text.equals(date))
			{
			ele.click();
			break;
			}
			
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[1]/div/div[2]/button")).click();	
		   
        String month1 = "December 2021";
		String date1 = "30";
		
		while(true)
		{
		String text = driver.findElement(By.xpath("//h2")).getText();
		if(text.equals(month1))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
		}
	}
		List<WebElement> alldates1=driver.findElements(By.xpath("//body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr/td/button[1]"));
		for(WebElement ele1:alldates1)
		{
			//System.out.println(ele1.getText()); 
			String date_text=ele1.getText();
			if(date_text.equals(date1))
			{
			ele1.click();
			break;
			}
			
		}
	driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[2]/div/div/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
    Thread.sleep(1000);
    
    driver.close();
  
	}

}

