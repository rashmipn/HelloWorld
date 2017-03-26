package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement ele1=driver.findElement(By.xpath("(//h1)[2]"));
		WebElement ele2=driver.findElement(By.xpath("(//h1)[3]"));
		WebElement ele3=driver.findElement(By.xpath("(//h1)[4]"));
		Actions a1=new Actions(driver);
		//Thread.sleep(2000);
		a1.dragAndDrop(ele2, ele1).perform();
		//Thread.sleep(2000);
		a1.dragAndDrop(ele3, ele2).perform();
		a1.contextClick(ele3).perform();
		a1.doubleClick().perform();
		driver.quit();	}

}
