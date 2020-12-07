package HomeWork7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class AddProductToCartPopup extends BasePage {

//    private final By checkOutButton = By.xpath("//a[contains(text(),'Check Out')]");
    @FindBy(xpath="//a[contains(text(),'Check Out')]")
    WebElement checkOutButton;

    public AddProductToCartPopup(WebDriver driver) {
        super(driver);
    }

    public CartPage clickCheckOutButton()
    {
        clickButton(checkOutButton);
        return new CartPage(driver);
    }
}

