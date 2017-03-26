package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoF {
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}
	static public void getChrome(RemoteWebDriver driver) throws Throwable
	{
		driver.get("file:///G:/seleniumdoc/Demo1.html");
		driver.findElement(By.xpath("//input[@value='A']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='B']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='C']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='D']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
		
	public static void main(String[] args) throws Throwable 
	{
		RemoteWebDriver driver=new ChromeDriver();
		DemoF.getChrome(driver);
		RemoteWebDriver driver1=new FirefoxDriver();
		DemoF.getChrome(driver1);
		

	}

}
