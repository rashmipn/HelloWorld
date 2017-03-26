package qsp.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zoho 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/crm/lp/login.html");
		WebElement element=driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("lid")).sendKeys("rashmi");
		driver.findElement(By.id("pwd")).sendKeys("123");
		driver.findElement(By.id("submit_but")).submit();

	}

}
