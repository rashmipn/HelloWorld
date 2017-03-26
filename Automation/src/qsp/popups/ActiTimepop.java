package qsp.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimepop {

	static
	{
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable 
	{
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.get("http://localhost/login.do");
	    
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        driver.findElement(By.xpath("//td[@class='logoCell navCell']/../td[5]/a")).click();
        driver.findElement(By.xpath("//span[.='User']")).click();
        driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("adb");
        driver.findElement(By.id("closeUserDataLightBoxBtn")).click();
   	    Alert al=driver.switchTo().alert();
  	    String s=al.getText();
	    System.out.println(s);
	    Thread.sleep(5000);
	    //al.accept();
	    al.dismiss();
	    driver.close();

	}

}
