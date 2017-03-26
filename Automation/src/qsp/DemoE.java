package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoE 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}
	
	static public void getChrome(RemoteWebDriver driver) throws Throwable
	{
		driver.get("file:///G:/seleniumdoc/Demo1.html");
		driver.findElement(By.xpath("//input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

	public static void main(String[] args) throws Throwable 
	{
		RemoteWebDriver driver=new ChromeDriver();
		DemoE.getChrome(driver);
		RemoteWebDriver driver1=new FirefoxDriver();
		DemoE.getChrome(driver1);
	}

}
