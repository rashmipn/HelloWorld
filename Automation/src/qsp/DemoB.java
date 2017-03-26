package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoB {
	
	static String key="webdriver.chrome.driver";
	static String value="./software/chromedriver.exe";
	
	static String key1="webdriver.gecko.driver";
	static String value1="./software/geckodriver.exe";
	
	static 
	{
		System.setProperty(key, value);
		System.setProperty(key1, value1);
	}
	
	public static void geturl(RemoteWebDriver driver) throws Throwable
	{
		driver.get("file:///D:/Demo.html");
		Thread.sleep(2000);
		driver.quit();
		
	}
	/*public static void geturl1(ChromeDriver driver)
	{
		driver.get("file:///D:/DemoD.html");
		driver.quit();
	}*/

	public static void main(String[] args) throws Throwable 
	{
		
		
		ChromeDriver driver=new ChromeDriver();
		DemoB.geturl(driver);
		
		FirefoxDriver driver1=new FirefoxDriver();
		DemoB.geturl(driver1);

	}

}
