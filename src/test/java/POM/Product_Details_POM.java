package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Details_POM {

	WebDriver driver;
	
	private By productDetails_1=By.xpath("//div[@class='product-thumb']//div[@class='image']//a");
	
	private By BrandName=By.xpath("//div[@class='col-sm-4']//ul[@class='list-unstyled']//li[1]");
	private By Product_Code=By.xpath("//div[@class='col-sm-4']//ul[@class='list-unstyled']//li[2]");
	
	
	
	public Product_Details_POM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickProduct() {
		driver.findElement(productDetails_1).click();
	}

	public void product_ReRelated() {
		String brandName=driver.findElement(BrandName).getText();
		String P_Code=driver.findElement(Product_Code).getText();
		System.out.println("Product BrandName :"+brandName+" "+"Product Code "+P_Code);
	}
}
