package autotests.tests;

import autotests.drivers.BrowserstackMobileDriver;
import autotests.drivers.GameDriver;
import autotests.helpers.Attach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import java.util.Objects;

import static autotests.helpers.Attach.sessionId;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;


public class TestBase {
     static String deviceHost = System.getProperty("deviceHost", "local");

    //  static String deviceHost = System.getProperty("deviceHost", "browserstack");
    @BeforeAll
    public static void setup() {
       if (Objects.equals(deviceHost, "browserstack"))
           Configuration.browser = BrowserstackMobileDriver.class.getName();
       else {
           Configuration.browser = GameDriver.class.getName();
       }
           Configuration.timeout = 15000;
           Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());

        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        step("Close driver", Selenide::closeWebDriver);
        if (deviceHost.equals("browserstack")) {
            Attach.video(sessionId);
        }
    }
}
