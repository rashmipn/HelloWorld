package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoG {
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}
	static public void getChrome(RemoteWebDriver driver) throws Throwable
	{
		driver.get("file:///G:/seleniumdoc/Demo2.html");
		driver.findElement(By.tagName("A")).click();
		
		/*driver.findElement(By.id("a1")).click();
		
		driver.findElement(By.name("n1")).click();
		
		driver.findElement(By.className("c1")).click();*/
		
		driver.quit();
	}
		
	public static void main(String[] args) throws Throwable 
	{
		RemoteWebDriver driver=new ChromeDriver();
		DemoG.getChrome(driver);
		RemoteWebDriver driver1=new FirefoxDriver();
		DemoG.getChrome(driver1);
		

	}

}

