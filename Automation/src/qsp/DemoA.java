package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class DemoA {

	public static void main(String[] args) throws Throwable 
	{
		String key="webdriver.gecko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key,value);
		RemoteWebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Demo.html");
		Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Inbox"));
		
		//String s1=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//s1=driver.getTitle();
		System.out.println(driver.getTitle());
		//s1=driver.getPageSource();
		System.out.println(driver.getPageSource());
		//s1=driver.getWindowHandle();
		//System.out.println(s1);
		driver.quit();

	}

}
