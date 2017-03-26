package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class tab 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
	}

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Actions a1=new Actions(driver);
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("username"));
		Thread.sleep(3000);
		a1.contextClick(element).perform();
		a1.sendKeys(Keys.CONTROL+"A");
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_T);
		//

	}

}
