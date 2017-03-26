package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoD {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();//opens the new browser we cannot continue 
		    
		   driver.manage().window().maximize();                                    //opens the new browser
		   //driver.get("file:///D:/Demo.html");
		   
		   driver.navigate().to("file:///D:/DemoD.html");
		   Thread.sleep(2000);
		   
		   driver.navigate().to("file:///D:/Demo.html");
		   Thread.sleep(2000);
		   
		   
		   
		   driver.navigate().refresh();
		   Thread.sleep(9000);
		   
		   driver.navigate().forward();
		   Thread.sleep(3000);
		   
		   driver.navigate().forward();
		   Thread.sleep(3000);
		   
		   
		   
		   driver.quit();
		   
		   
		   

	}

}
