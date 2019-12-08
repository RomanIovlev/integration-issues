package applitools.hackathon.tests.traditionalTests;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import applitools.hackathon.TestsInitEyes;
import applitools.hackathon.pages.LoginPage;
import applitools.hackathon.pages.LoginPageNew;
import org.testng.annotations.Test;

import static applitools.hackathon.pages.DriverUtils.DRIVER;
import static applitools.hackathon.pages.LoginPage.loginPage;

public class LoginCheckTests extends TestsInitEyes {
    //region check elements by locator
    @Test
    public void loginPageNewCheckNew() {
        // PASS
        DRIVER.navigate().to(LoginPage.URL);
        LoginPageNew.checkNew();
    }
    @Test
    public void loginPageNewCheckRegionNew() {
        // PASS
        DRIVER.navigate().to(LoginPage.URL);
        LoginPageNew.checkRegionNew();
    }
    @Test
    public void loginPageNewCheckElementNew() {
        // Same as LoginPageNewCheckNew but FAIL
        DRIVER.navigate().to(LoginPage.URL);
        LoginPageNew.checkElementNew();
    }
    //endregion

    //region check elements in Page Objects
    @Test
    public void loginPageCheckNew() {
        // Same as LoginPageNewCheckRegionNew but FAIL
        DRIVER.navigate().to(LoginPage.URL);
        loginPage.check();
    }
    @Test
    public void loginPageCheckRegionNew() {
        // Same as LoginPageNewCheckNew but FAIL
        DRIVER.navigate().to(LoginPage.URL);
        loginPage.checkRegion();
    }
    @Test
    public void loginPageCheckElementNew() {
        // FAIL
        DRIVER.navigate().to(LoginPage.URL);
        loginPage.checkElement();
    }
    //endregion
}
