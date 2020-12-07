package HomeWork7;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HomeWork7Test {

    public WebDriver driver;
    private HomePage homePage = new HomePage(driver);
    private SearchResultPage searchResultPagePage = new SearchResultPage(driver);
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
    private AddProductToCartPopup addProductToCartPopup = new AddProductToCartPopup(driver);
    private CartPage cartPage = new CartPage(driver);
    private RegisterPage registerPage = new RegisterPage(driver);
    private OrderSummaryPage orderSummaryPage = new OrderSummaryPage(driver);



    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Tetiana_Kryvytska\\\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @DisplayName("Add To Cart Test")
    @Tag("testTag")
    @Test
    public void addToCartTest() {
        driver.get("https://ecse00100fdb.epam.com:9002/yacceleratorstorefront/?site=electronics");
        String amount = "￥610.00";
        String taxAmount = "￥55.45";
        String testEmail = "test@user.com";
        String testProductId = "1934793";

        homePage.enterValueToSearchField(testProductId);
        homePage.clickSearchButton();
        searchResultPagePage.openProductDetails(testProductId);
        productDetailsPage.clickAddToCartButton();
        addProductToCartPopup.clickCheckOutButton();
        cartPage.verifySubtotalEqualsValue(amount);
        cartPage.verifyTotalEqualsValue(amount);
        cartPage.clickCheckOutInCartButton();
        registerPage.setGuestEmail(testEmail);
        registerPage.confirmGuestEmail(testEmail);
        registerPage.clickCheckOutAsGuestButton();
        orderSummaryPage.verifySubtotalEqualsAmount(amount);
        orderSummaryPage.verifyTotalEqualsAmount(amount);
        orderSummaryPage.verifyTaxEqualsAmount(taxAmount);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
