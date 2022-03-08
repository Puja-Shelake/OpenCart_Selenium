package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchProduct {

	WebDriver driver;

	private By searchBox = By.name("search");
	private By searchIcon = By.xpath("//span[@class='input-group-btn']//button[@type='button']");
	private By listView = By.id("list-view");
	private By imgProduct = By.xpath("//div[@class='image']//a/img");
	private By girdView = By.id("grid-view");
	private By SearchCriteria = By.xpath("//div[@class='col-sm-4']//input");
	private By selectDropdown = By.xpath("//select[@name='category_id']");
	private By searchInSubCategories = By.name("sub_category");
	private By description = By.name("description");
	private By SearchAfterSelection_desc = By.id("button-search");
	
	private By compareProduct = By.xpath("//div[@class='button-group']//button[@type='button'][3]");

	private By Product_Compare = By.xpath("//div[@class='form-group']//a");

	public SearchProduct(WebDriver driver) {
		this.driver = driver;
	}

	public void SearchBoxData(String data) {
		driver.findElement(searchBox).sendKeys(data);
	}

	public void clickOnSearchIcon() {
		driver.findElement(searchIcon).click();
	}

	public void ClickOnList() {
		driver.findElement(listView).click();
	}

	public void clickOnProduct() {
		driver.findElement(imgProduct).click();
	}

	public void ClickOnGrid() {
		driver.findElement(girdView).click();
	}

	public void SearchCriteria_Items(String items) {
		driver.findElement(SearchCriteria).sendKeys(items);
	}

	public void selectProductCategories() {

		WebElement e = driver.findElement(selectDropdown);
		Select select = new Select(e);
		List<WebElement> list = select.getOptions();

		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i).getText();

			if (s.equals("Desktops")) {
				list.get(i).click();
			}
		}

		// select.selectByVisibleText("Desktops");

	}

	public void CheckMeCat_SubCat() {
		driver.findElement(searchInSubCategories).click();
		driver.findElement(description).click();
	}

	public void select_after_Desc() {
		driver.findElement(SearchAfterSelection_desc).click();
	}

	public void addCompareProduct() {
		driver.findElement(compareProduct).click();
	}

	public void compareProduct() {
		driver.findElement(Product_Compare).click();
	}

}
