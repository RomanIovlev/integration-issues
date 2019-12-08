package applitools.hackathon.tests.traditionalTests;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import applitools.hackathon.TestsInitEyes;
import applitools.hackathon.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static applitools.hackathon.pages.ApplitoolsUtils.eyes;
import static applitools.hackathon.pages.DriverUtils.DRIVER;
import static com.applitools.eyes.selenium.fluent.Target.region;

public class ScrollTests extends TestsInitEyes {
    @Test
    public void scrollAndGet() {
        // Wrong image in Applitools Web Application. If remove scroll will be ok
        DRIVER.navigate().to(LoginPage.URL);
        scroll(By.cssSelector(".os-icon-user-male-circle"));
        eyes().check("userIcon", region(By.cssSelector(".os-icon-user-male-circle")));
        throw new RuntimeException("Wrong image in Applitools Web Application. If remove scrollIntoView will be ok");
    }
    private void scroll(By locator) {
        ((JavascriptExecutor)DRIVER).executeScript(
                "return arguments[0].scrollIntoView({behavior:'auto',block:'center',inline:'center'});",
                DRIVER.findElement(locator)
        );
    }
}
