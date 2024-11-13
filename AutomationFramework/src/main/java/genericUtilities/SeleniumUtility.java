package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * @author CJ
 */
public class SeleniumUtility {
    /**
     * This method will maximize the window
     * @param driver
     */
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	
	public void minimizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 *This method will add implicitly wait 
	 * @param driver
	 */
	public void addImplicitlyWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method will wait for the particular web element to be visible
	 * @param driver
	 * @param element
	 */

	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will wait for the specified web element to be clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
    /**
     * This method will wait for the specified web element to be present 
     * @param driver
     * @param locator
     */
	public void waitForElementToBePresent(WebDriver driver, By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * This method will wait until the specified text is present in the given web element
	 * @param driver
	 * @param element
	 * @param text
	 */
	
	public void waitForTextToBePresentInElement(WebDriver driver, WebElement element, String text) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
/**
 * 
 * @param element
 * @param index
 */
	public void handleDropDown(WebElement element, int index){
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void handleDropDownByValue(WebElement element, String value) {
	    Select s = new Select(element);
	    s.selectByValue(value);
	}
/**
 * 
 * @param element
 * @param visibleText
 */
	public void handleDropDownByVisibleText(WebElement element, String visibleText) {
	    Select s = new Select(element);
	    s.selectByVisibleText(visibleText);
	}
	/**
	 * This method will perform mouse over action on a web element
	 * @param driver
	 * @param element
	 */
	public void mouseOverAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This method will perform double click action on a web element
	 * @param driver
	 * @param element
	 */
	 public void doubleClickAction(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.doubleClick(element).perform();
	    }
	
	 /**
	  * This method will perform context click (right-click) action on a web element
	  * @param driver
	  * @param element
	  */
		 public void rightClickAction(WebDriver driver, WebElement element) {
	        Actions act = new Actions(driver);
	        act.contextClick(element).perform();
	    }
	 /**
	  * This method will perform drag and drop action
	  * @param driver
	  * @param src
	  * @param target
	  */
    public void dragAndDropAction(WebDriver driver, WebElement src, WebElement target)
    {
    	Actions act = new Actions(driver);
    	act.dragAndDrop(src, target).perform();
    }
    /**
     * This method will perform click and hold action
     * @param driver
     * @param element
     */
    public void clickAndHoldAction(WebDriver driver, WebElement element)
    {
    	Actions act = new Actions(driver);
    	act.clickAndHold(element).perform();
    }
    /**
     * This method will handle Frame by Frame index
     * @param driver
     * @param index
     */
    public void handleFrame(WebDriver driver, int index)
    {
    	driver.switchTo().frame(index);
    }
    /**
     * This method will handle Frame by Frame id or Name
     * @param driver
     * @param idOrName
     */
    public void handleFrame(WebDriver driver, String idOrName) {
    	driver.switchTo().frame(idOrName);
}
    /**
     * This method will handle frame by frame web element
     * @param driver
     * @param element
     */
    public void handleFrame(WebDriver driver, WebElement element)
    {
    	driver.switchTo().frame(element);
    }
    /**
     * This method switches to the parent frame of the current frame
     * @param driver
     */
    public void switchToParentFrame(WebDriver driver) {
        driver.switchTo().parentFrame();
    }
    /**
     * This method switches back to the default content (the main page)
     * @param driver
     */
    public void switchToDefaultContent(WebDriver driver) {
        driver.switchTo().defaultContent();
    }
    /**
     * This method will scroll to particular web element
     * @param driver
     * @param element
     */
    public void scrollToElementAction(WebDriver driver, WebElement element)
    {
    	Actions act = new Actions(driver);
    	act.scrollToElement(element).perform();
}
    /**
     * This method will perform scroll up action
     * @param driver
     */
    public void scrollUpAction(WebDriver driver) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,-500);", "");
    }
    
    /**
     * This method will perform scrolldown action
     * @param driver
     */
    
    public void scrollDownAction(WebDriver driver) {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)", "");
    }
    
    public String captureScreenshot(WebDriver driver, String screenshotName) throws IOException
    {
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dst = new File(".\\Screenshots.jpg");
    	Files.copy(src, dst);
    	FileUtils.copyFile(src, dst);
		return screenshotName;
    }
}
