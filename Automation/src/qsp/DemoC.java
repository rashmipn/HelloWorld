package qsp;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoC {

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();//opens the new browser we cannot continue 
	                                        //opens the new browser
	   driver.get("file:///D:/Demo.html");//enter the url
	   
	   String s1=driver.getTitle();
	   System.out.println("title= "+s1);
	   
	   s1=driver.getCurrentUrl();
	   System.out.println("url= "+s1);
	   
	   s1=driver.getPageSource();
	   System.out.println(s1);
	   
	   driver.close();
	   
	   

	}

}
