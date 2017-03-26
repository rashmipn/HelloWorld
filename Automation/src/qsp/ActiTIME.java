package qsp;

import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTIME 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	static public void getBrowser1(RemoteWebDriver driver) throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//instead of thread
		driver.get("http://localhost/login.do");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Keys.CONTROL+"P");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		
		driver.findElement(By.xpath("//td[@class='logoCell navCell']/../td[2]/a/div[1]")).click();
		
		Thread.sleep(200);
		Actions act=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//td[@class='logoCell navCell']/../td[3]/a"));
		Thread.sleep(200);
		act.moveToElement(e).perform();
		Thread.sleep(200);                               //web element on which you want to move cursor
		e=driver.findElement(By.xpath("//td[@class='logoCell navCell']/../td[3]/a"));
		Thread.sleep(200);
		act.moveToElement(e).perform();
		Thread.sleep(200); 
		e=driver.findElement(By.xpath("//td[@class='logoCell navCell']/../td[4]/a"));
		Thread.sleep(2000);
		act.moveToElement(e).perform();
		Thread.sleep(2000);
		
		e=driver.findElement(By.xpath("//td[@class='logoCell navCell']/../td[5]/a"));
		Thread.sleep(2000);
		act.moveToElement(e).perform();
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

	public static void main(String[] args) throws Throwable 
	{
		
		ActiTIME.getBrowser1(new ChromeDriver());
		
		//ActiTIME.getBrowser1(new FirefoxDriver());

	}

}
