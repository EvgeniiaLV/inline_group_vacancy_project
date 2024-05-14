package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;


public class TestBase {
    @BeforeAll
    static void setUpConfig() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        Configuration.baseUrl = "https://inlinegroup.ru";
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = "https://user1:1234@" + System.getProperty("remoteDriverURL", "selenoid.autotests.cloud") + "/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "122");

    }

    @AfterEach
    void clearEnv() {
        Selenide.closeWebDriver();
    }

    @AfterEach
    void addAttachment() {
        Attach.pageSource();
        Attach.screenshotAs("Last screenshot");
        Attach.addVideo();
        if (!WebDriverRunner.isFirefox()) {
            Attach.browserConsoleLogs();
        }
    }
}
