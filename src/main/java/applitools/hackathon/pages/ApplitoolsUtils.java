package applitools.hackathon.pages;

import com.applitools.eyes.selenium.Eyes;

public class ApplitoolsUtils {
    private static Eyes eyes;
    public static final String APP_NAME = "Issues Demo";
    public static Eyes eyes() {
        if (eyes == null) {
            eyes = new Eyes();
            eyes.setApiKey(System.getenv("APPLITOOLS_API_KEY"));
            eyes.setAppName(APP_NAME);
            eyes.setForceFullPageScreenshot(true);
        }
        return eyes;
    }
}
