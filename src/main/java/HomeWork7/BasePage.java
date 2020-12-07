package HomeWork7;

import org.junit.Assert;
import org.openqa.selenium.*;

public class BasePage extends PageObject
{
    protected final WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebDriver getDriver()
    {
        return this.driver;
    }

    public Boolean isElementPresent(By locator)
    {
        return driver.findElements(locator).size() > 0;
    }

    public BasePage setField(By field, String value)
    {
        field.findElement(driver).sendKeys(value);
        return this;
    }
    public BasePage setField(WebElement field, String value)
    {
        field.sendKeys(value);
        return this;
    }

    public BasePage clickButton(By locator)
    {
        locator.findElement(driver).click();
        return this;
    }
    public BasePage clickButton(WebElement locator)
    {
        locator.click();
        return this;
    }

    public BasePage verifyFieldContainsValue(By field, String value)
    {
        Assert.assertEquals(value, field.findElement(driver).getText());
        return this;
    }
    public BasePage verifyFieldContainsValue(WebElement field, String value)
    {
        Assert.assertEquals(value, field.getText());
        return this;
    }

//    public WebElement findBy (By locator){
//        return new WebElement(this, waitFor(), new WebDriverElementLocator(locator));
//
//
//            }




}
