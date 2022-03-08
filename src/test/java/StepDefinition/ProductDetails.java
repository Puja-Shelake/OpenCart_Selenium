package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Product_Details_POM;
import POM.SearchProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductDetails {

	WebDriver driver;

	Product_Details_POM pobj;
	SearchProduct sobj;

	@Before
	public void setUP() {
		
		driver.get("https://demo.opencart.com/");
		pobj = new Product_Details_POM(driver);
	
	}

	@Given("Click on Url")
	public void click_on_url() {

	}

	@Then("Enter any existing Product name into the Search text box field")
	public void enter_any_existing_product_name_into_the_search_text_box_field() {
	
		sobj = new SearchProduct(driver);
		sobj.SearchBoxData("Mac");
		sobj.clickOnSearchIcon();

	}

	@Then("Click on the Product displayed in the Search results")
	public void click_on_the_product_displayed_in_the_search_results() {
		pobj.clickProduct();
	}

	@Then("Check the Product Name, Brand and Product Code in the displayed Product Display Page\"")
	public void check_the_product_name_brand_and_product_code_in_the_displayed_product_display_page() {
		pobj.product_ReRelated();
	}

}
