package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.InlineGroupMainPage;

import static io.qameta.allure.Allure.step;
import static utils.TestData.INVALID_VALUE_FOR_SEARCH;
import static utils.TestData.VALUE_FOR_POSITIVE_SEARCH;

@Tag("regressionTests")
@Owner("Evgeniia Liasheva")
public class HeaderTests extends TestBase {
    InlineGroupMainPage inlineGroupMainPage = new InlineGroupMainPage();

    @Test
    @DisplayName("Successful search")
    void successfulSearchTest() {

        step("Open main page", () -> {
            inlineGroupMainPage.openPage();
        });

        step("Click on search icon", () -> {
            inlineGroupMainPage.clickOnSearchIcon();
        });

        step("Insert search value", () -> {
            inlineGroupMainPage.insertSearchValue(VALUE_FOR_POSITIVE_SEARCH);
        });

        step("Verify: search result is not empty", () -> {
            inlineGroupMainPage.verifySearchResultIsNotEmpty();
        });
    }

    @Test
    @DisplayName("Search with invalid value")
    void searchWithInvalidValueTest() {

        step("Open main page", () -> {
            inlineGroupMainPage.openPage();
        });

        step("Click on search icon", () -> {
            inlineGroupMainPage.clickOnSearchIcon();
        });

        step("Insert search value", () -> {
            inlineGroupMainPage.insertSearchValue(INVALID_VALUE_FOR_SEARCH);
        });

        step("Verify search result: nothing found", () -> {
            inlineGroupMainPage.verifySearchResultNothingFound();
        });
    }

    @Test
    @DisplayName("Check default language: RU")
    void checkDefaultLanguageLinkTest() {

        step("Open main page", () -> {
            inlineGroupMainPage.openPage();
        });

        step("Verify default language", () -> {
            inlineGroupMainPage.verifyDefaultLanguage();
        });
    }

    @Test
    @DisplayName("Verify switching language to EN")
    void checkSwitchingLanguageToENTest() {

        step("Open main page", () -> {
            inlineGroupMainPage.openPage();
        });

        step("Click on language icon to switch language", () -> {
            inlineGroupMainPage.clickOnLanguageIcon();
        });

        step("Verify switching the language to EN", () -> {
            inlineGroupMainPage.verifySwitchingLanguageToEN();
        });
    }

    @Test
    @Disabled("Selected language doesn't correlate to the language of the error message. To be confirmed")
    @DisplayName("Verify page not found error message")
    void checkPageNotFoundErrorMessageTest() {

        step("Open not existing page", () -> {
            inlineGroupMainPage.openNotExistingPage();
        });

        step("Verify error message", () -> {
            inlineGroupMainPage.verifyErrorMessage404();
        });
    }

    @Test
    @DisplayName("Verify social links opening: VK")
    void checkVKOpeningTest() {

        step("Open not existing page", () -> {
            inlineGroupMainPage.openPage();
        });

        step("Get number of opened tabs", () -> {
            inlineGroupMainPage.getTabsCount();
        });

        step("Click on VK", () -> {
            inlineGroupMainPage.clickOnVK();
        });

        step("Check a new tab was opened", () -> {
            inlineGroupMainPage.checkNewTabOpened();
        });
    }

    @Test
    @DisplayName("Verify social links opening: YouTube")
    void checkYouTubeOpeningTest() {

        step("Open not existing page", () -> {
            inlineGroupMainPage.openPage();
        });

        step("Get number of opened tabs", () -> {
            inlineGroupMainPage.getTabsCount();
        });

        step("Click on YouTube", () -> {
            inlineGroupMainPage.clickOnYouTube();
        });

        step("Check a new tab was opened", () -> {
            inlineGroupMainPage.checkNewTabOpened();
        });
    }

    @Test
    @Disabled("To be updated soon")
    @DisplayName("Verify social links opening: Telegram")
    void checkTelegramOpeningTest() {

        step("Open not existing page", () -> {
            inlineGroupMainPage.openPage();
        });

        step("Get number of opened tabs", () -> {
            inlineGroupMainPage.getTabsCount();
        });

        step("Click on Telegram", () -> {
            //inlineGroupMainPage.;
        });

        step("Check a new tab was opened", () -> {
            inlineGroupMainPage.checkNewTabOpened();
        });
    }
}
