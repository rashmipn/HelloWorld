package Encalsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testpage1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		LoginPage1 l=new LoginPage1(driver);
		l.clicklogin("abc","123");
		Thread.sleep(2000);
		l.clicklogin("admin","manager");
		driver.quit();
		
		
    }
	
	
	
	
	
	

}
