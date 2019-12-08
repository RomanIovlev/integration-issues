package applitools.hackathon.pages;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static applitools.hackathon.pages.ApplitoolsUtils.eyes;
import static applitools.hackathon.pages.DriverUtils.DRIVER;
import static com.applitools.eyes.selenium.fluent.Target.region;
import static org.openqa.selenium.support.PageFactory.initElements;

public class LoginPage {
    public static LoginPage loginPage = initElements(DRIVER, LoginPage.class);
    public static final String URL = "https://demo.applitools.com/hackathon.html";
    @FindBy(css = ".auth-header") public WebElement header;
    @FindBy(css = ".logo-w img") WebElement circleImage;
    @FindBy(css = ".alert-warning") WebElement alert;
    @FindBy(xpath = "//*[.='Username']") WebElement userLabel;
    @FindBy(xpath = "//*[.='Password']") WebElement passwordLabel;
    @FindBy(css = ".os-icon-user-male-circle") WebElement userIcon;
    @FindBy(css = ".os-icon-fingerprint") WebElement fingerprintIcon;
    @FindBy(css = ".form-check-label") WebElement rememberMe;
    @FindBy(css = "[src*=twitter]") WebElement twitter;
    @FindBy(css = "[src*=facebook]") WebElement facebook;
    @FindBy(css = "[src*=linkedin]") WebElement linkedin;

    @FindBy(id = "username") public WebElement username;
    @FindBy(id = "password") public WebElement password;
    @FindBy(id = "log-in") public WebElement logIn;
    
    public void checkElement() {
        eyes().checkElement(header);
        eyes().checkElement(circleImage);
        eyes().checkElement(alert);
        eyes().checkElement(userLabel);
        eyes().checkElement(passwordLabel);
        eyes().checkElement(userIcon);
        eyes().checkElement(fingerprintIcon);
        eyes().checkElement(username);
        eyes().checkElement(password);
        eyes().checkElement(logIn);
        eyes().checkElement(rememberMe);
        eyes().checkElement(twitter);
        eyes().checkElement(facebook);
        eyes().checkElement(linkedin);
    }

    public void checkRegion() {
        eyes().checkRegion(header);
        eyes().checkRegion(circleImage);
        eyes().checkRegion(userIcon);
        eyes().checkRegion(fingerprintIcon);
        eyes().checkRegion(userLabel);
        eyes().checkRegion(username);
        eyes().checkRegion(password);
        eyes().checkRegion(logIn);
        eyes().checkRegion(rememberMe);
        eyes().checkRegion(twitter);
        eyes().checkRegion(facebook);
        eyes().checkRegion(linkedin);
    }

    public void check() {
        eyes().check("header", region(header));
        eyes().check("circleImage", region(circleImage));
        eyes().check("userIcon", region(userIcon));
        eyes().check("fingerprintIcon", region(fingerprintIcon));
        eyes().check("userLabel", region(userLabel));
        eyes().check("username", region(username));
        eyes().check("password", region(password));
        eyes().check("logIn", region(logIn));
        eyes().check("rememberMe", region(rememberMe));
        eyes().check("twitter", region(twitter));
        eyes().check("facebook", region(facebook));
        eyes().check("linkedin", region(linkedin));
    }
}
