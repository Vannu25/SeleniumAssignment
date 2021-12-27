package TestCasesPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			 driver.get("https://demoqa.com/alerts");
			  driver.manage().window().maximize();
			 // This step will result in an alert on screen
			  WebElement element = driver.findElement(By.id("confirmButton"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element); 
			  //This method executes JavaScript in the context of the currently selected frame or window.
			  Alert confirmationAlert = driver.switchTo().alert();
			  String alertText = confirmationAlert.getText();
			  System.out.println("Alert text is " + alertText);
			  confirmationAlert.accept();
			  Thread.sleep(1000);

	}

}
