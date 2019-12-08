package applitools.hackathon;

/**
 * Created by Roman Iovlev on 10.11.2018
 * Email: roman.iovlev.jdi@gmail.com; Skype: roman.iovlev
 */

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static applitools.hackathon.pages.DriverUtils.killDrivers;
import static applitools.hackathon.pages.DriverUtils.runChromeDriver;

public class TestsInit {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        runChromeDriver();
    }
    @AfterSuite(alwaysRun = true)
    public static void teardown() { killDrivers(); }
}
