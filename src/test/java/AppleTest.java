import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * this is where the checking logic takes place
 */

public class AppleTest extends BaseTest {

    private final static String BASE_URL = "https://eldorado.ua/uk/";
    private final static String SEARCH_STRING = "iPhone 11";

    @Test
    public void checkCartItemCount() throws InterruptedException {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(SEARCH_STRING);

        SearchPage searchPage = new SearchPage();
        searchPage.findFirstProduct();

        ProductPage productPage = new ProductPage();
        productPage.addToCart();
        Thread.sleep(1000);
        productPage.goToCart();

        CartPage cartPage = new CartPage();
        cartPage.addProduct();
        Thread.sleep(2000);                         //for presentation
        String count = cartPage.getNumberOfProducts();
        assertEquals("2", count, String.format("Expected count to be 2, but was %s", count));
    }
}
