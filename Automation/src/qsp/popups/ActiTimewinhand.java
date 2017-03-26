package qsp.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;


public class ActiTimewinhand 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable 
	{  
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("licenseLink")).click();
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
	     Set<String>  allwh=driver.getWindowHandles();
	     System.out.println(allwh.size());
	     for(String aw:allwh)
	     {
	    	 driver.switchTo().window(aw);
	    	 System.out.println(driver.switchTo().window(aw));
	    	 driver.close();
	     }
		
		

	}

}
