package HomeWork7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

//    public final WebElement searchField = findBy(By.xpath(("//input[@id='js-site-search-input']")));
//    public final WebElement searchButton = findBy(By.xpath(("//input[@id='js-site-search-input']")));
//    private final By searchField = By.xpath("//input[@id='js-site-search-input']");
//    private final By searchButton = By.xpath("//button[@class='btn btn-link js_search_button']");

    @FindBy(xpath = "//input[@id='js-site-search-input']")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='btn btn-link js_search_button']")
    WebElement searchButton;

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void open() {
        getDriver().get(TextConstants.URL);
    }


//    public HomePage enterValueToSearchField(String productId)
//    {
//        searchField.findElement(driver).sendKeys(productId);
//        return this;
//    }

    public HomePage enterValueToSearchField(String productId) {
        setField(searchField, productId);
        return this;
    }

    public SearchResultPage clickSearchButton() {
        clickButton(searchButton);
        return new SearchResultPage(driver);
    }

}
