package applitools.hackathon.pages;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import com.applitools.eyes.selenium.fluent.SeleniumCheckSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static applitools.hackathon.pages.ApplitoolsUtils.eyes;
import static applitools.hackathon.pages.DriverUtils.DRIVER;
import static com.applitools.eyes.selenium.fluent.Target.region;
import static org.openqa.selenium.support.PageFactory.initElements;

public class LoginPageNew {
    private static SeleniumCheckSettings get(By locator) {
        return region(DRIVER.findElement(locator));
    }

    public static void checkNew() {
        eyes().check("header", get(By.cssSelector(".auth-header")));
        eyes().check("circleImage", get(By.cssSelector(".logo-w img")));
        eyes().check("userLabel", get(By.xpath("//*[.='Username']")));
        eyes().check("passwordLabel", get(By.xpath("//*[.='Password']")));
        eyes().check("userIcon", get(By.cssSelector(".os-icon-user-male-circle")));
        eyes().check("fingerprintIcon", get(By.cssSelector(".os-icon-fingerprint")));
        eyes().check("username", get(By.id("username")));
        eyes().check("password", get(By.id("password")));
        eyes().check("logIn", get(By.id("log-in")));
        eyes().check("rememberMe", get(By.cssSelector(".form-check-label")));
        eyes().check("twitter", get(By.cssSelector("[src*=twitter]")));
        eyes().check("facebook", get(By.cssSelector("[src*=facebook]")));
        eyes().check("linkedin", get(By.cssSelector("[src*=linkedin]")));
    }
    public static void checkElementNew() {
        eyes().checkElement(By.cssSelector(".auth-header"));
        eyes().checkElement(By.cssSelector(".logo-w img"));
        eyes().checkElement(By.xpath("//*[.='Username']"));
        eyes().checkElement(By.xpath("//*[.='Password']"));
        eyes().checkElement(By.cssSelector(".os-icon-user-male-circle"));
        eyes().checkElement(By.cssSelector(".os-icon-fingerprint"));
        eyes().checkElement(By.id("username"));
        eyes().checkElement(By.id("password"));
        eyes().checkElement(By.id("log-in"));
        eyes().checkElement(By.cssSelector(".form-check-label"));
        eyes().checkElement(By.cssSelector("[src*=twitter]"));
        eyes().checkElement(By.cssSelector("[src*=facebook]"));
        eyes().checkElement(By.cssSelector("[src*=linkedin]"));
    }
    public static void checkRegionNew() {
        eyes().checkRegion(By.cssSelector(".auth-header"));
        eyes().checkRegion(By.cssSelector(".logo-w img"));
        eyes().checkRegion(By.xpath("//*[.='Username']"));
        eyes().checkRegion(By.xpath("//*[.='Password']"));
        eyes().checkRegion(By.cssSelector(".os-icon-user-male-circle"));
        eyes().checkRegion(By.cssSelector(".os-icon-fingerprint"));
        eyes().checkRegion(By.id("username"));
        eyes().checkRegion(By.id("password"));
        eyes().checkRegion(By.id("log-in"));
        eyes().checkRegion(By.cssSelector(".form-check-label"));
        eyes().checkRegion(By.cssSelector("[src*=twitter]"));
        eyes().checkRegion(By.cssSelector("[src*=facebook]"));
        eyes().checkRegion(By.cssSelector("[src*=linkedin]"));
    }
}
