package TestCasesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.123formbuilder.com/free-form-templates/Student-Registration-Form-4673056/");
		driver.findElement(By.xpath("//*[@id=\"radio-0000000c1\"]/label")).click();
		Thread.sleep(1000);
		System.out.println("clicked on radio button");
		driver.close();
		
	}

}