package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	private By Loginbtn=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li[2]");
	private By emailId=By.xpath("//input[@type='text' and @id='input-email']");
	private By password=By.name("password");
	private By ClickLoginBtn=By.xpath("//input[@type='submit']");
	private By forgetLink=By.xpath("//div[@class='form-group']/a");
	private By logout=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li[5]");
	private By aftLngContinue=By.xpath("//div[@class='pull-right']/a");

	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ClickLogin()
	{
		driver.findElement(Loginbtn).click();
	}

	public void EnterEmail_login(String e)
	{
		WebElement element=driver.findElement(emailId);
		//element.click();
		element.sendKeys(e);
	}
	
	public void EnterPassword(String p)
	{
		driver.findElement(password).sendKeys(p);
	}
	
	public void ClickOnLoginBtn() {
		driver.findElement(ClickLoginBtn).click();
		
	}
	
	public void ClickForgetLink()
	{
		driver.findElement(forgetLink).click();
	}
	
	public void Click_Logout()
	{
		driver.findElement(logout).click();
	}
	
	public void continueMeAfterALogout()
	{
		driver.findElement(aftLngContinue).click();
	}

}
