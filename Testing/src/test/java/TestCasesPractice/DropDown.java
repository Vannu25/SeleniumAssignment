package TestCasesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/drag_drop.html");
	        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
	    		
	        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
	    	
	        
	        Actions action = new Actions(driver);
	        action.dragAndDrop(From, To).build().perform();
	        
	        WebElement From1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			
	        WebElement To1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	        System.out.println("bank is dragged to account section");
	    	
	        Thread.sleep(1000);
	        Actions action1 = new Actions(driver);
	        action.dragAndDrop(From1, To1).build().perform();
	        
	        System.out.println("amount 5000 is dragged to amount section");
	        
			Thread.sleep(1000);
//			driver.close();
	}

}
