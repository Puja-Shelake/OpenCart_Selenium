package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Forgetton_Password;
import POM.LoginPage;
import POM.Register;
import POM.SearchProduct;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Product {

	WebDriver driver;
	SearchProduct sobj;

	//@Before
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sobj = new SearchProduct(driver);
		// driver.get("https://www.google.com/");

	}

	@Given("Open URL")
	public void open_url() {
		driver.navigate().to("https://demo.opencart.com/");
	}

	@Then("Enter any existing product {string} into the Search text box")
	public void enter_any_existing_product_into_the_search_text_box(String product_name) {
		sobj.SearchBoxData(product_name);

	}

	@When("Click on the button having search icon")
	public void click_on_the_button_having_search_icon() throws InterruptedException {
		Thread.sleep(2000);
		//sobj.clickOnSearchIcon();
	}
//-----------------------------------------------------------------------------------------------

	@When("Enter any existing product name into the {string} text box field")
	public void enter_any_existing_product_name_into_the_text_box_field(String Product_Name) {
		sobj.SearchBoxData(Product_Name);
		//sobj.clickOnSearchIcon();
	}

	@When("Select List option")
	public void select_list_option() {
		sobj.ClickOnList();

	}

	@Then("Click on the Image of the Product and name of the product")
	public void click_on_the_image_of_the_product_and_name_of_the_product() {
		sobj.clickOnProduct();

	}

	@Then("Repeat Steps first to second and Select Grid option")
	public void repeat_steps_first_to_second_and_select_grid_option() {
		driver.navigate().back();

	}

	@Then("Click on the Image of the Product and name of the product After Selection of Gird")
	public void click_on_the_image_of_the_product_and_name_of_the_product_after_selection_of_gird() {
		sobj.ClickOnGrid();
		sobj.clickOnProduct();

	}
//---------------------------------------------------------------------------------------------

	@Then("Do not enter anything into the Search text box field")
	public void do_not_enter_anything_into_the_search_text_box_field() {
		sobj.clickOnSearchIcon();

	}

	@Then("Enter any text from the Product Description into the {string}")
	public void enter_any_text_from_the_product_description_into_the(String p) {
		sobj.SearchCriteria_Items(p);
	}

	@Then("Select Search in product descriptions checkbox option")
	public void select_search_in_product_descriptions_checkbox_option() {
		sobj.selectProductCategories();
		sobj.CheckMeCat_SubCat();

	}

	@Then("Click on Search button")
	public void click_on_search_button() {
		sobj.select_after_Desc();
	}

	@Then("Select Compare this Product option")
	public void select_compare_this_product_option() throws InterruptedException {
		Thread.sleep(3000);
		sobj.addCompareProduct();
		
	}

	@Then("Click on product comparision link from the displayed success message")
	public void click_on_product_comparision_link_from_the_displayed_success_message() throws InterruptedException {
		Thread.sleep(3000);
		sobj.compareProduct();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		sobj.addCompareProduct();
		Thread.sleep(3000);
		sobj.compareProduct();

	}

	@After
	public void Close() {
		// driver.close();
	}

}
