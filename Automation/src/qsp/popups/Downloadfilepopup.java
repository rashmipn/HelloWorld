package qsp.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Downloadfilepopup {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		FirefoxProfile profile=new FirefoxProfile();
		
		
		//download location is desktop(0)
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.dir","D:");
		//settings, to not display download popup in firefox driver
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		
		
		WebDriver driver=new FirefoxDriver(profile);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[.='Java']/../td[4]/a")).click();
		String title=driver.getCurrentUrl();
		System.out.println(title);
		driver.close();
	
	}

}
