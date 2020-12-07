package HomeWork7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class OrderSummaryPage extends BasePage {

//    private final By subtotalValue = By.xpath("//div[@class='subtotal']//span");
//    private final By totalValue = By.xpath("//div[@class='totals']//span");
//    private final By taxValue = By.xpath("//div[@class='realTotals']//p");

    @FindBy(xpath="//div[@class='subtotal']//span")
    WebElement subtotalValue;
    @FindBy(xpath="//div[@class='totals']//span")
    WebElement totalValue;
    @FindBy(xpath="//div[@class='realTotals']//p")
    WebElement taxValue;

    public OrderSummaryPage(WebDriver driver) {
        super(driver);
    }

    public OrderSummaryPage verifySubtotalEqualsAmount(String amount)
    {
        verifyFieldContainsValue(subtotalValue, amount);
        return this;
    }

    public OrderSummaryPage verifyTotalEqualsAmount(String amount)
    {
        verifyFieldContainsValue(totalValue, amount);
        return this;
    }

    public OrderSummaryPage verifyTaxEqualsAmount(String amount)
    {
        verifyFieldContainsValue(taxValue, amount);
        return this;
    }
}


