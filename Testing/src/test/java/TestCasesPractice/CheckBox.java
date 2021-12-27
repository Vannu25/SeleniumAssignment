package TestCasesPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.yatra.com/");
			driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[3]/div[1]/div[1]/a/i")).click();
			System.out.println(driver.findElement(By.xpath("")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("")).getText());
			Thread.sleep(3000);
			driver.close();
				

	}

}
