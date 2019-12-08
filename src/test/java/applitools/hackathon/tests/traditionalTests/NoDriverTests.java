package applitools.hackathon.tests.traditionalTests;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import applitools.hackathon.TestsInit;
import applitools.hackathon.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static applitools.hackathon.pages.ApplitoolsUtils.eyes;
import static applitools.hackathon.pages.DriverUtils.DRIVER;

public class NoDriverTests extends TestsInit {
    @Test
    public void noOpenThrowsNullPointer() {
        DRIVER.navigate().to(LoginPage.URL);
        // without eyes().open(...) will throw null pointer exception that looks strange
        eyes().checkElement(By.cssSelector(".os-icon-user-male-circle"));
    }
}
