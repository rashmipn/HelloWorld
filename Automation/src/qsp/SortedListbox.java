package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedListbox 
{
    public static ArrayList<String> getAllTextFromListBox(WebElement listbox)
    {
		Select s1=new Select(listbox);
		List<WebElement> alloptions=s1.getOptions();
		ArrayList<String> alltext=new ArrayList<String>();
		
		for(WebElement options:alloptions)
		{
			String text=options.getText();
			alltext.add(text);
		}
		
		return alltext;
    	
    }
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///G:/seleniumdoc/eCommerce.html");
		WebElement listbox=driver.findElement(By.id("FlipKart"));
		ArrayList<String> alltext=getAllTextFromListBox(listbox);
		Collections.sort(alltext);
		for(String text:alltext)
		{
			System.out.println(text);
		}
	}

}
