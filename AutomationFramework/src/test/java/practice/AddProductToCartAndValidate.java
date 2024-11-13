package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddProductToCartAndValidate {

	public static void main(String[] args) throws InterruptedException 
	{
		//Step 1: Launch the browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 2: Load the URL
		driver.get("https://www.saucedemo.com/");
		
		//Step 3: Login to Application
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Step 4: Click on Sauce Labs BagPack
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='inventory_item_name ']")).click();
		String ProductTitle = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText();
		
		//Step 5: Add the product to cart
		driver.findElement(By.id("add-to-cart")).click();
		
		//Step 6: Navigate to cart and validate for the product
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(1000);
		String ProductTitleInCart = driver.findElement(By.className("inventory_item_name")).getText();
		
		if(ProductTitleInCart.equalsIgnoreCase(ProductTitle))
		{
			System.out.println("Product Added and Verified in cart successfully");
			System.out.println(ProductTitleInCart);
		}
		else
		{
			System.out.println("Product not verified in Cart");
		}
		
		//Step 7: Logout of Application
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("Logout Successful");
	}

}
