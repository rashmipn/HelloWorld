package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sqlblog 
{

	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	
	static public void getBrowser1(RemoteWebDriver driver) throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);//instead of thread
		driver.get("http://abclst.blogspot.in/");
		
		driver.findElement(By.xpath("//a[text()='SQL/DATABASE']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'operators:')]")).click();
		driver.findElement(By.xpath("//a[text()='SQL/DATABASE']")).click();
		driver.findElement(By.xpath("//span[text()='Assignment on Grouping']")).click();
		driver.findElement(By.xpath("//span[text()='Assignment on Grouping']")).sendKeys(Keys.CONTROL+"P");
	}
	static public void getBrowser2(RemoteWebDriver driver) throws Throwable
	{
		
		driver.get("http://www.magicbricks.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'mainInput') and contains(@id,'buy')]")).click();
	}
	public static void main(String[] args) throws Throwable 
	{
	    
		Sqlblog.getBrowser1(new FirefoxDriver());
        Sqlblog.getBrowser1(new ChromeDriver());
        
	}

}
