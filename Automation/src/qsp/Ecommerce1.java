package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;

public class Ecommerce1 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	public static void getOptions(RemoteWebDriver driver)
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter your id:");
	    String id=sc.nextLine();
		driver.get("file:///G:/seleniumdoc/eCommerce.html");
	    WebElement  listbox=driver.findElement(By.id(id));
	    Select select=new Select(listbox);
	    List<WebElement> alllist=select.getOptions();
	    int count=alllist.size();
	    
	    //printing the content from top to bottom 
	    System.out.println("printing the content from top to bottom" );
	    for(int i=0;i<count;i++)
	    {
	    WebElement options=alllist.get(i);
	    text=options.getText();
	    System.out.println(text);
	    	
	    }
	    
	    //printing the content in reverse order
	    System.out.println("printing the content in reverse order");
	    for(int i=count-1;i>0;i--)
	    {
	    WebElement options=alllist.get(i);
	    text=options.getText();
	    System.out.println(text);
	    	
	    }
	   
	    driver.quit();

	}
	static String text;
	public static void main(String[] args) 
	{
	    getOptions(new FirefoxDriver());
	    getOptions(new ChromeDriver());
	    
	}

}
