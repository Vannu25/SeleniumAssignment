package TestCasesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(1000);
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
		dropdown.selectByVisibleText("7");
		System.out.println("option chosen is number 7");
		Thread.sleep(2000);
		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select")));
		dropdown1.selectByVisibleText("2");
		System.out.println("child age is 2 years...");
		Thread.sleep(2000);
		driver.close();
	}

}
