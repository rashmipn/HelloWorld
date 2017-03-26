package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MagicBRICKS 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	static public void getBrowser1(RemoteWebDriver driver) throws Throwable
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.magicbricks.com/");
		driver.findElement(By.id("rentTab")).click();
		driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[11]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'mainInput') and contains(@id,'buy')]")).click();
	}

	public static void main(String[] args) throws Throwable 
	{
		MagicBRICKS.getBrowser1(new FirefoxDriver());
		//MagicBRICKS.getBrowser1(new ChromeDriver());

	}

}
