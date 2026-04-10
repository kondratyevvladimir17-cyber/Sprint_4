import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;
import pages.OrderPage;

import static pages.MainPage.URL_ADRESS;


public class BaseUITest {
     WebDriver driver;
     MainPage mainPage;
     OrderPage orderPage;

    @Before
    public void startBrowser() {
        String browser = System.getProperty("browser", "chrome"); // "chrome" — значение по умолчанию
        if (browser.equals("chrome")) {
            startBrowserChrome();
        } else if (browser.equals("firefox")) {
            startBrowserFirefox();
        }
    }

    public void startBrowserFirefox() {
        driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        mainPage = new MainPage(driver);
        orderPage = new OrderPage(driver);
        driver.get(URL_ADRESS);
    }

    public void startBrowserChrome() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        mainPage = new MainPage(driver);
        orderPage = new OrderPage(driver);
        driver.get(URL_ADRESS);
    }

    @After
   public void closeBrowser() {
        driver.quit();
    }
}
