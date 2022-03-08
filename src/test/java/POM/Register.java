package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {

	WebDriver driver;

	private By myAccount = By.xpath("//div[@id='top-links']//ul//li[@class='dropdown']");
	private By registerBtn = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li");
	private By fname_txt = By.name("firstname");
	private By lname_txt = By.name("lastname");
	private By email = By.name("email");
	private By telephone = By.name("telephone");
	private By password = By.name("password");
	private By confirmPassword = By.name("confirm");
	private By policy_accept = By.name("agree");
	private By continueBtn = By.xpath("//input[@type='submit' and @value='Continue']");
	private By ctnueMe = By.xpath("//div[@class='pull-right']/a");
	

	
	public Register(WebDriver driver) {
		this.driver = driver;
	}

	public void clickMyAccount() {
		driver.findElement(myAccount).click();
	}

	public void clickRegister() {
		driver.findElement(registerBtn).click();
	}

	public void EnterFirstName(String f) throws InterruptedException {

		driver.findElement(fname_txt).sendKeys(f);

	}

	public void EnterLname(String l) throws InterruptedException {

		driver.findElement(lname_txt).sendKeys(l);
	}

	public void EnterEmail(String e) throws InterruptedException {

		driver.findElement(email).sendKeys(e);
	}

	public void telephone(String t) {
		driver.findElement(telephone).sendKeys(t);
	}

	public void password(String p) {
		driver.findElement(password).sendKeys(p);
	}

	public void confirmPassword(String c) {
		driver.findElement(confirmPassword).sendKeys(c);
	}

	public void acceptPolicy() {
		driver.findElement(policy_accept).click();
	}

	public void continueMe() {
		driver.findElement(continueBtn).click();
	}

	public void againCtnue() {
		driver.findElement(ctnueMe).click();
	}

	public void tearDown() {
		driver.quit();
	}

}
