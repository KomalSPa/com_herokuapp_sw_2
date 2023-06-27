package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
    public class BaseTest {
        public static WebDriver driver;

        public void openBrowser(String baseUrl) {
            // String baseUrl = "http://the-internet.herokuapp.com/login";
            // Launch the Chrome Browser
            driver = new ChromeDriver();
            // Open the URL into Browser
            driver.get(baseUrl);
            //Maximise Browsert
            driver.manage().window().maximize();
            // We give Implicit wait to Driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }

        public void closeBrowser() {
            driver.quit();
        }
    }

