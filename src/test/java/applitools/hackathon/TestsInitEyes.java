package applitools.hackathon;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

import static applitools.hackathon.pages.ApplitoolsUtils.APP_NAME;
import static applitools.hackathon.pages.ApplitoolsUtils.eyes;
import static applitools.hackathon.pages.DriverUtils.*;
import static java.lang.String.format;

public class TestsInitEyes {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        runChromeDriver();
    }
    @AfterSuite(alwaysRun = true)
    public static void teardown() { killDrivers(); }

    //region Before/After
    private String getTestName(Method method) {
        return format("%s.%s", method.getDeclaringClass().getSimpleName(), method.getName());
    }
    @BeforeMethod
    public void before(Method method) {
        eyes().open(DRIVER, APP_NAME, getTestName(method));
    }
    @AfterMethod()
    public void after(Method method) {
        eyes().close(false);
    }
    //endregion
}
