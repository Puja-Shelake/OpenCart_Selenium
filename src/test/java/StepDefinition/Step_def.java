package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Comman_;
import POM.Forgetton_Password;
import POM.LoginPage;
import POM.Register;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def {

	WebDriver driver;
	Register r;
	LoginPage lobj;
	Forgetton_Password fobj;


	String p = "Puja@99";

	@Before
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		r = new Register(driver);
		lobj = new LoginPage(driver);
		fobj = new Forgetton_Password(driver);
	}

	@Given("Click on My Account Drop menu")
	public void click_on_my_account_drop_menu() {
		r.clickMyAccount();
	}

	@Then("Click on Register option")
	public void click_on_register_option() {
		r.clickRegister();
	}

	@Then("Enter new Account Details into the Mandatory Fields")
	public void enter_new_account_details_into_the_mandatory_fields() throws InterruptedException {

		r.EnterFirstName("Po   oja");
		r.EnterLname("Shelake");
		r.EnterEmail("pujashelke10@gmail.com");
		r.telephone("1234567890");
		r.password("Puja@99");
		r.confirmPassword("Puja@99");
		r.acceptPolicy();

	}

	@Then("Click on Continue button")
	public void click_on_continue_button() {
		r.continueMe();
	}

	@Then("Click on Continue button that is displayed in the Account Success")
	public void click_on_continue_button_that_is_displayed_in_the_account_success() {

		r.againCtnue();

	}

	@Then("Close Browser")
	public void close_browser() {
		/// r.tearDown();
	}

	// ---------------------------------------------------------------------------------

	@Then("Click on Login option")
	public void click_on_login_option() {
		lobj.ClickLogin();

	}

	@Then("Enter valid email address into the {string}")
	public void enter_valid_email_address_into_the(String email) {
		lobj.EnterEmail_login(email);

	}

	@Then("Enter valid password into the {string}")
	public void enter_valid_password_into_the(String password) {
		lobj.EnterPassword(password);

	}

	@Then("Click on Login button")
	public void click_on_login_button() {
		lobj.ClickOnLoginBtn();
	}

	@Then("Click on Forgotten Password link")
	public void click_on_forgotten_password_link() {
		lobj.ClickForgetLink();

	}

	@Then("Select Logout option")
	public void select_logout_option() {
		r.clickMyAccount();
		lobj.Click_Logout();

	}

	@Then("Click on Continue button for confirmation")
	public void click_on_continue_button_for_confirmation() {
		lobj.continueMeAfterALogout();
	}
//-------------------------------------------------------------------------------------------------

	@Then("Enter the {string} address of an existing account for which you have forgot the password")
	public void enter_the_address_of_an_existing_account_for_which_you_have_forgot_the_password(String emailId) {
		fobj.enterEmailAfterForgetpassword(emailId);
	}

	@Then("Click on Continue button after email updation")
	public void click_on_continue_button_after_email_updation() {
		fobj.ContinueAfterForgetPassword();
	}

	@When("Enter the {string} address into the E-Mail address field and the new resetted {string} into the Password field")
	public void enter_the_address_into_the_e_mail_address_field_and_the_new_resetted_into_the_password_field(String e,
			String p) throws InterruptedException {
		lobj.EnterEmail_login(e);
		lobj.EnterPassword(p);

	}

	@Then("Click on Login button After all updation")
	public void click_on_login_button_after_all_updation() {
		lobj.ClickOnLoginBtn();
	}

	@After
	public void closeMe() {
		// driver.close();
	}
}
