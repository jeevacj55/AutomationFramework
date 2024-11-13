package products;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.AllProductsPage;
import objectRepository.ProductPage;
import objectRepository.YourCartPage;

@Listeners(genericUtilities.ListenersImplementation.class)
public class AddProductToCartTest extends BaseClass {

	@Test(groups = "SmokeSuite")
	
	public void tc001_addSingleProductToCartTest() throws IOException, InterruptedException
	{
		{
			//Read test data from excel file
			String PRODUCTNAME = eUtil.readDataFromExcel("Products", 1, 2);
			System.out.println(PRODUCTNAME);
										
		   //Step 1: Click on Sauce Labs BagPack - Product
		   Thread.sleep(1000);
		   AllProductsPage app = new AllProductsPage(driver);
		   String productTitle = app.clickOnProduct(driver, PRODUCTNAME);
			 
		   //Step 2: Add the product to cart
		    ProductPage pp = new ProductPage(driver);
		    pp.clickOnAddToCartBtn();
							
			//Step 3: Navigate to cart and validate for the product
			 pp.clickOnCartContainer();
			 
			//Assert.fail();
				
			//step 4: Capture the product name in cart
			YourCartPage co = new YourCartPage(driver);
			String productTitleInCart = co.captureProductNameInCart();
			Thread.sleep(1000);
				
			//Step 5: validate
			Assert.assertEquals(productTitleInCart, productTitle);}
		
		}
		
		@Test(groups = "RegressionSuite")
	    public void removeProductTest() {
	       
	        System.out.println("Product removed");
	}
}
