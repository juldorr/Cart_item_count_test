import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 * cart page
 */

public class CartPage {
    private final SelenideElement addButton = $x("//div[@class = 'increase change-number']");
    private final SelenideElement numberOfProducts = $x("//div[@class = 'count-value']");

    protected void addProduct() {
        addButton.click();
    }

    protected String getNumberOfProducts() {
        return numberOfProducts.getText();
    }
}
