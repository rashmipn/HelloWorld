package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginActiTIME 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	}
    public static void verifyLogin(RemoteWebDriver driver) throws Throwable
    {
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.get("http://localhost/login.do");	
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	  driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
    }
	
	public static void main(String[] args) throws Throwable 
	{
		//verifyLogin(new ChromeDriver());
		verifyLogin(new FirefoxDriver());

	}

}
