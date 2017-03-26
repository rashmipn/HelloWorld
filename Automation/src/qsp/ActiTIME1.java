package qsp;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ActiTIME1 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	static public void getBrowser1(RemoteWebDriver driver) throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//instead of thread
		driver.get("http://localhost/login.do");
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL+"p");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//Thread.sleep(20000);
		driver.findElement(By.xpath("//td[@class='logoCell navCell']/../td[3]/a")).click();
		//Thread.sleep(20000);
		
		driver.findElement(By.id("logoutLink")).click();
		
	
		
	}

	public static void main(String[] args) throws Throwable 
	{
		//ChromeDriver driver=new ChromeDriver();
		
		//ActiTIME1.getBrowser1(driver);
		FirefoxDriver driver1=new FirefoxDriver();
		ActiTIME1.getBrowser1(driver1);

	}

}
