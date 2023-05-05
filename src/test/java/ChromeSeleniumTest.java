import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSeleniumTest {
    private WebDriver driver;
    @BeforeAll

    static void setUpAll() {System.setProperty("webDriver.chrome.driver", "./drivers/win/chromedriver.exe");
    }

    @BeforeEach
    void SetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get(" http://localhost:7777/");
    }

    @AfterEach

    void tearDown(){
        driver.quit();
        driver = null;
    }
}
