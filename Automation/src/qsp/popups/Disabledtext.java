package qsp.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Disabledtext 
{
 
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///G:/seleniumdoc/Text.html");
		RemoteWebDriver r=(RemoteWebDriver)driver;
		r.executeScript("document.getElementById('t2').value='jesteena'");
		r.executeScript("document.getElementById('t1').value='rashmi'");
		r.executeScript("document.getElementById('t1').value=''");
	

	}

}
