package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox1 {
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	

	public static void main(String[] args)
	{
		
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///G:/seleniumdoc/Checkbox.html");
			
			List<WebElement> allwe=driver.findElements(By.xpath("//input[@type='checkbox'][position() mod 2=0]"));
            System.out.println(allwe.size());
            for(WebElement ae:allwe)
            {
            	ae.click();
            }
	}
   
}
