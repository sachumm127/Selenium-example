import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
    public static void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run headless
        options.addArguments("--no-sandbox"); // Required in many CI environments
        options.addArguments("--disable-dev-shm-usage"); // Fix shared memory issues
        options.addArguments("--disable-gpu"); // Disable GPU (just in case)
        options.addArguments("--remote-debugging-port=9222"); // Prevent DevToolsActivePort issue

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://example.com");

        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
