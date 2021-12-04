package EndToEndtesting;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class TripTest {
	
	@Test
	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        WebElement elementPopup =driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]"));
        elementPopup.click();
       	WebElement element = driver.findElement(By.xpath("//li[@data-cy ='roundTrip']//span"));
		element.click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//li[@data-cy ='oneWayTrip']//span"));
		element1.click();
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//div[@class=\"fsw_inputBox searchCity inactiveWidget \"]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"hsw_autocomplePopup autoSuggestPlugin \"]/div/input")).sendKeys("Kolkata");
        
        List<WebElement>list=driver.findElements(By.cssSelector("p[class=\"font14 appendBottom5 blackText\"]"));
        for(int i=0;i<list.size();i++)
        {
        	String text=list.get(i).getText();
        	System.out.println("Text is" +text);
        	if(text.contains("Kolkata"))
        	{
        		list.get(i).click();
        		break;
        	}
        }
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@class=\"fsw_inputBox searchToCity inactiveWidget \"]/label")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween\"]/div/input")).sendKeys("Delhi");
        
        List<WebElement>list1=driver.findElements(By.cssSelector("p[class=\"font14 appendBottom5 blackText\"]"));
        for(int i=0;i<list1.size();i++)
        {
        	String text=list1.get(i).getText();
        	System.out.println("Text is" +text);
        	if(text.contains("Delhi"))
        	{
        		list1.get(i).click();
        		break;
        	}
        }
  
	}

}