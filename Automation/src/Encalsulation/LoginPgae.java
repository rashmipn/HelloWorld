package Encalsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPgae {
    //declaration
	private WebElement logBT,userTB,pwTB;
	//initialization
	public LoginPgae(WebDriver driver)
	{
	  userTB=driver.findElement(By.id("username"));
	  pwTB=driver.findElement(By.name("pwd"));
	  logBT=driver.findElement(By.id("loginButton"));
	  
	}
	
	//utilization
	public void clicklogin(String un,String pw)
	{
	 userTB.sendKeys(un); 	
	 pwTB.sendKeys(pw);
	 logBT.click();
	 
	}
	

}
