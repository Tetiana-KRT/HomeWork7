package HomeWork7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class ProductDetailsPage extends BasePage {

//    private final By addToCartButton = By.xpath("//button[@id='addToCartButton']");
    @FindBy(xpath="//button[@id='addToCartButton']")
    WebElement addToCartButton;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public AddProductToCartPopup clickAddToCartButton()
    {
        clickButton(addToCartButton);
        return new AddProductToCartPopup(driver);
    }
}
