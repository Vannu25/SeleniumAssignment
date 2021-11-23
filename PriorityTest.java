package TestCasesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriorityTest {
	public WebDriver driver;
	public String Url="https://opensource-demo.orangehrmlive.com/";
@BeforeSuite
public void MySetup() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
}

@BeforeTest
public void MySetup2() {	  
	  driver.manage().window().maximize();
	  System.out.println("Now we are ready for launching ..");
	 // Assert.assertEquals(title,"Google");  
	  }
@BeforeClass
public void MySetup3()
{
driver.get(Url);
System.out.println("Now we are running...");	  
}

@Test(priority=1,description="This is login check")
public void login() {  
	  driver.get(Url);
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  
	  System.out.println("login process");
}
@Test(priority=2,description="This is forget password")
public void forgetpass() {
	  
	  WebElement mylink = driver.findElement(By.linkText("Forgot your password?"));
	  mylink.click();
	  System.out.println("this is forget link");
  }

@Test(priority=3,description="This is Reset password")
public void Resetpass() {
	  
	  driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin123");;
	  WebElement myPass = driver.findElement(By.id("btnSearchValues"));
	  myPass.click();
	  System.out.println("this is Reset Password");
  }

@Test(priority=4,description="This is to cancel changes")
public void Cancel() throws InterruptedException {
	  
	  
	  WebElement Can = driver.findElement(By.id("btnCancel"));
	  Can.click();
	  System.out.println("this is to go back to log in page");
	  Thread.sleep(6000);
  }
@Test(priority=5,description="This is login check")
public void login2() throws InterruptedException {  
	driver.get(Url);
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.name("Submit")).click();
	  System.out.println("login process");
	  Thread.sleep(6000);
	  
}

@Test(priority=6,description="This is details for leave")
public void add() throws InterruptedException {  
	
	  WebElement adm = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img"));
	  adm.click();
	  Thread.sleep(6000);
	  System.out.println("assign leave");
	  
	  
}



//@Test(priority=7,description="This is details for hrm")
//public void Add() {  
	
	  //WebElement user = driver.findElement(By.id("welcome"));
	  //user.click();
	  //WebElement list = driver.findElement(By.id("aboutDisplayLink"));
	  //list.click();
	  //System.out.println("about"); }


@AfterTest
public void close()
{
	
	  driver.close();
	  System.out.println("we are closing now...");
}
@AfterSuite
public void cleanUp()
{
	  System.out.println("we are closing completely...");
}
}