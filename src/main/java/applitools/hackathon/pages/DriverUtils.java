package applitools.hackathon.pages;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Runtime.getRuntime;

public class DriverUtils {
    public static WebDriver DRIVER;

    public static void runChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        DRIVER = new ChromeDriver();
        DRIVER.manage().window().maximize();
    }
    public static void killDrivers() {
        try {
            getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
