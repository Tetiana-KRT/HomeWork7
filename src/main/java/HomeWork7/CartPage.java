package HomeWork7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class CartPage extends BasePage {

//    private final By subtotal = By.xpath("//div[@class='col-xs-6 cart-totals-right text-right']");
//    private final By total = By.xpath("//div[@class='col-xs-6 cart-totals-right text-right grand-total']");
//    private final By checkOutButtonInCart = By.xpath("//div[@class='cart__actions']//button[contains(text(),'Check Out')]");

    @FindBy(xpath="//div[@class='col-xs-6 cart-totals-right text-right']")
    WebElement subtotal;
    @FindBy(xpath="//div[@class='col-xs-6 cart-totals-right text-right grand-total']")
    WebElement total;
    @FindBy(xpath="//div[@class='cart__actions']//button[contains(text(),'Check Out')]")
    WebElement checkOutButtonInCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

//    public CartPage verifySubtotalEqualsValue(String amount)
//    {
//        Assert.assertEquals(amount, subtotal.findElement(driver).getText());
//        return this;
//    }

    public CartPage verifySubtotalEqualsValue(String amount)
    {
        verifyFieldContainsValue(subtotal, amount);
        return this;
    }

//    public CartPage verifyTotalEqualsValue(String amount)
//    {
//        Assert.assertEquals(amount, total.findElement(driver).getText());
//        return this;
//    }

    public CartPage verifyTotalEqualsValue(String amount)
    {
        verifyFieldContainsValue(total, amount);
        return this;
    }

//    public RegisterPage clickCheckOutInCartButton()
//    {
//        checkOutButtonInCart.findElement(driver).click();
//        return new RegisterPage(driver);
//    }

    public RegisterPage clickCheckOutInCartButton()
    {
        clickButton(checkOutButtonInCart);
        return new RegisterPage(driver);
    }
}

