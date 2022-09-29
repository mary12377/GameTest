package autotests.drivers;

import autotests.config.GamesConfig;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class GameDriver implements WebDriverProvider {

    static GamesConfig configLocal = ConfigFactory.create(GamesConfig.class, System.getProperties());
    @Override
    public WebDriver createDriver(Capabilities capabilities) {

        File app = getApp();

        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(configLocal.platformName());
        options.setDeviceName(configLocal.device());
        // options.setPlatformVersion("10.0");
        options.setApp(app.getAbsolutePath());

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    public static URL getAppiumServerUrl() {
        try {
            return new URL(configLocal.appURL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    private File getApp() {
        // String appUrl = "https://apkpure.com/ru/homescapes-android/com.playrix.homescapes/download";
        // String appPath = "src/test/resources/apps/Homescapes_v5.6.3_apkpure.com.apk";
        String appUrl = "https://apkpure.com/ru/merge-hotel-empire-design/" +
                "puzzle.merge.hotel.empire/download/1010-APK-6b290053dab61422f77e78c0dd71dd3b?from=variants%2Fversion";
        String appPath = "src/test/resources/apps/Merge Hotel Empire Design_v1.0.6_apkpure.com.apk";

        File app = new File(appPath);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download application", e);
            }
        }
        return app;
    }

}