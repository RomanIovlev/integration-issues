package applitools.hackathon.test.data;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider
    public Object[][] emptyUsers() {
        return new Object[][] {
            { new User("",""),
                "Both Username and Password must be present"},
            { new User("", "p@s$w0rd"), "Username must be present"},
            { new User("Roman",""), "Password must be present"},
        };
    }
}
