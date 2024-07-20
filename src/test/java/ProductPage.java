import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 * page of the first product
 */

public class ProductPage {
    private final SelenideElement buyButton = $x("//div[@class = 'button']");

    protected void addToCart() {
        buyButton.click();
    }

    protected void goToCart() {
        buyButton.click();
    }
}
