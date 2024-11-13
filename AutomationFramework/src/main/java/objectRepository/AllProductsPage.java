package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductsPage {

	//Declaration
	
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement menuBtn;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logoutLink;
	
	//Initialization
	public AllProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Utilization
	public WebElement getMenuBtn() {
		return menuBtn;
	}


	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	//Business Library
	/**
	 * This method will click on menu button
	 */
	public void ClickOnMenuBtn()
	{
		menuBtn.click();
	}
	/**
	 * This method will perform logout operation
	 */
	public void logoutOfApp()
	{
		menuBtn.click();
		logoutLink.click();
	}
	/**
	 * This method will click on a particular product and capture the product title
	 * @param driver
	 * @param PRODUCTNAME
	 * @return
	 */
	
	public String clickOnProduct(WebDriver driver, String PRODUCTNAME)
	{
		String productTitle = driver.findElement(By.xpath("//div[.='" + PRODUCTNAME +"']")).getText();
		driver.findElement(By.xpath("//div[.='" + PRODUCTNAME +"']")).click();
		return productTitle;
	}
}

