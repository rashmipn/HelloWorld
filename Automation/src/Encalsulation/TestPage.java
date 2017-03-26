package Encalsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		LoginPgae login=new LoginPgae(driver);
		login.clicklogin("abc","678");
		Thread.sleep(2000);
		login.clicklogin("admin","manager");
		

	}

}
