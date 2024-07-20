import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

abstract public class BaseTest {

    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1536x864";
        Configuration.headless = false;
    }

    @BeforeAll
    public static void init() {
        setUp();
    }

    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }

}
