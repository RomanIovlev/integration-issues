package applitools.hackathon.tests.traditionalTests;

/**
 * Created by Roman Iovlev on 08.12.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import applitools.hackathon.TestsInitEyes;
import applitools.hackathon.pages.LoginPage;
import applitools.hackathon.test.data.TestDataProvider;
import applitools.hackathon.test.data.User;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static applitools.hackathon.pages.ApplitoolsUtils.eyes;
import static applitools.hackathon.pages.DriverUtils.DRIVER;
import static applitools.hackathon.pages.LoginPage.loginPage;
import static com.applitools.eyes.selenium.fluent.Target.region;

public class ZoomTests extends TestsInitEyes {

    @Test(dataProvider = "emptyUsers", dataProviderClass = TestDataProvider.class)
    public void loginFailedValidation(User user, String message) {
        login(user);
        // Makes wrong image while have 150% zoom in Windows
        // Even if correct (100% zoom) by some reasons will match all 3 checks to one baseline, expected 3 separate baselines for each message/tag
        eyes().check("Alert: " + message, region(By.cssSelector(".alert-warning")));
    }

    @Test(suiteName = "Table Sort Test")
    public void sortTableValidation() {
        login(new User("Roman", "Password"));
        DRIVER.findElement(By.id("amount")).click();
        // Makes wrong image while have 150% zoom in Windows
        eyes().checkElement(By.id("transactionsTable"), "Transactions Ascending");
        DRIVER.findElement(By.id("amount")).click();
        // Makes wrong image while have 150% zoom in Windows
        eyes().checkElement(By.id("transactionsTable"), "Transactions Descending");
    }
    private void login(User user) {
        DRIVER.navigate().to(LoginPage.URL);
        loginPage.username.sendKeys(user.name);
        loginPage.password.sendKeys(user.password);
        loginPage.logIn.click();
    }
    //endregion
}
