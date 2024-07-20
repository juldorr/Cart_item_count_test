import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 * page found through a search request
 */

public class SearchPage {
    private final SelenideElement firstProduct = $x("//div[@id = 'tileBlock']/div[3]");

    protected void findFirstProduct() {
        firstProduct.click();
    }
}
