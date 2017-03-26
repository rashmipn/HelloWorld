package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("masthead-search-term")).sendKeys("amruthavarshini songs");
		driver.findElement(By.id("search-btn")).click();
		driver.findElement(By.linkText("Amruthavarshini")).click();
	}

}
