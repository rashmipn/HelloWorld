package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///G:/seleniumdoc/Checkbox.html");
		driver.findElement(By.xpath("(//input)[1]")).click();
		driver.findElement(By.xpath("(//input)[last()]")).click();
//		WebDriver driver1=new ChromeDriver();
//		driver1.get("file:///G:/seleniumdoc/Checkbox.html");
//		driver1.findElement(By.xpath("(//input)[1] and (//input)[last()]")).click();
        
	}

}
