package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	}
	
	
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("Email")).sendKeys("rashmigowda0595@gmail.com");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("ammailoveu@_555");
	driver.findElement(By.id("signIn")).click();
	driver.findElement(By.partialLinkText("Spam")).click();
	List<WebElement> allcb=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement acb:allcb)
	{
		acb.click();
	}
	System.out.println("hhhh");
	
  }

}
