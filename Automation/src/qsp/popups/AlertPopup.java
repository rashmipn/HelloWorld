package qsp.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup 
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
	    driver.get("http://www.actimind.com/contact.php");
	    driver.findElement(By.xpath("//input[@value='Submit Request']")).click();
	    Alert al=driver.switchTo().alert();
	    String s=al.getText();
	    System.out.println(s);
	    Thread.sleep(2000);
	    al.accept();

	}

}
