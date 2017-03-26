package Encalsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{ 
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	
	@FindBy(id="loginButton")
	private WebElement logBT;
	
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicklogin(String un,String pw)
	{
	 unTB.sendKeys(un); 	
	 pwTB.sendKeys(pw);
	 logBT.click();
	 
	}
	
}
