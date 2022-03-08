package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgetton_Password {

	WebDriver driver;
	
	private By email=By.id("input-email");
	private By ctnbtn=By.xpath("//input[@type='submit']");
	
	public Forgetton_Password(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterEmailAfterForgetpassword(String e)
	{
		driver.findElement(email).sendKeys(e);
	}
	
	public void ContinueAfterForgetPassword() {
		driver.findElement(ctnbtn).click();
	}
}
