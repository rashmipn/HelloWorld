package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Listoflinks 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	public static void getBrowser(RemoteWebDriver driver)
	{ 
		driver.get("file:///G:/seleniumdoc/Demo3.html");
		
		List<WebElement> alllinks =driver.findElements(By.tagName("a"));
		int cunt=alllinks.size();
		System.out.println("count of all links"+cunt);
		for(int i=0;i<cunt;i++)
		{
			WebElement e=alllinks.get(i);
			System.out.println(e.getText());
			System.out.println(e.getAttribute("href"));
			
		}
		driver.quit();
	}

	public static void main(String[] args) 
	{
		getBrowser(new FirefoxDriver());
		getBrowser(new ChromeDriver());

	}

}
