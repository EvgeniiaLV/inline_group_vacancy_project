package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.numberOfWindows;
import static utils.TestData.*;

public class InlineGroupMainPage {

    private final SelenideElement searchIcon = $("div.header_search_icon"),
            searchField = $("div.header_search_popup input[type=search]"),
            searchResultNothingFound = $$("div.search_result").last(),
            languageSwitcherName = $("div.header_inner a.lang_link").$(By.tagName("span")),
            languageSwitcher = $("div.header_inner a.lang_link"),
            mainMenuAboutCompanyRU = $("nav.main_menu a[href='/about/'].root-item"),
            mainMenuSolutionsRU = $("nav.main_menu a[href='/solutions/'].root-item"),
            mainMenuProjectsRU = $("nav.main_menu a[href='/projects/'].root-item"),
            mainMenuPressCenterRU = $("nav.main_menu a[href='/press-center/'].root-item"),
            mainMenuContactsRU = $("nav.main_menu a[href='/contacts/'].root-item"),
            mainMenuAboutCompanyEN = $("nav.main_menu a[href='/en/about/'].root-item-selected"),
            mainMenuSolutionsEN = $("nav.main_menu a[href='/en/solutions/'].root-item"),
            mainMenuPartnersEN = $("nav.main_menu a[href='/en/partners/'].root-item"),
            mainMenuRatingsEN = $("nav.main_menu a[href='/en/ratings/'].root-item"),
            mainMenuContactsEN = $("nav.main_menu a[href='/en/contacts/'].root-item"),
            iconLinkVK = $$("div.social_block a.social_link").first(),
            iconLinkYouTube = $$("div.social_block a.social_link").last();

    private int tabsCount, quantityOfFoundDocuments;

    public InlineGroupMainPage openPage() {
        open("/");

        return this;
    }

    public InlineGroupMainPage openNotExistingPage() {
        open("/kjhj/");

        return this;
    }

    public InlineGroupMainPage clickOnSearchIcon() {
        searchIcon.click();

        return this;
    }

    public InlineGroupMainPage insertSearchValue(String value) {
        searchField.setValue(value).pressEnter();

        return this;
    }

    public InlineGroupMainPage verifySearchResultIsNotEmpty() {
        quantityOfFoundDocuments = $$("div.search_inner div.search_block").size();
        Assertions.assertTrue(quantityOfFoundDocuments >3, "Less than 3 documents were found");

        return this;
    }

    public InlineGroupMainPage verifySearchResultNothingFound() {
        searchResultNothingFound.shouldHave(text(MESSAGE_NOTHING_FOUND));

        return this;
    }

    public InlineGroupMainPage verifyDefaultLanguage() {
        languageSwitcherName.shouldHave(text(LANGUAGE_EN));
        mainMenuAboutCompanyRU.shouldHave(text(HEADER_ABOUT_COMPANY_RU));
        mainMenuSolutionsRU.shouldHave(text(HEADER_SOLUTIONS_AND_SERVICES_RU));
        mainMenuProjectsRU.shouldHave(text(HEADER_PARTNERS_COMPANY_RU));
        mainMenuPressCenterRU.shouldHave(text(HEADER_RATINGS_RU));
        mainMenuContactsRU.shouldHave(text(HEADER_CONTACTS_RU));

        return this;
    }

    public InlineGroupMainPage clickOnLanguageIcon() {
        languageSwitcher.click();

        return this;
    }

    public InlineGroupMainPage verifySwitchingLanguageToEN() {
        languageSwitcherName.shouldHave(text(LANGUAGE_RUS));
        mainMenuAboutCompanyEN.shouldHave(text(HEADER_ABOUT_COMPANY_EN));
        mainMenuSolutionsEN.shouldHave(text(HEADER_SOLUTIONS_AND_SERVICES_EN));
        mainMenuPartnersEN.shouldHave(text(HEADER_PARTNERS_COMPANY_EN));
        mainMenuRatingsEN.shouldHave(text(HEADER_RATINGS_EN));
        mainMenuContactsEN.shouldHave(text(HEADER_CONTACTS_EN));
        Assertions.assertEquals(URL_AFTER_SWITCHING_TO_ENG, Selenide.webdriver().driver().url());

        return this;
    }

    public InlineGroupMainPage verifyErrorMessage404() {
        searchResultNothingFound.shouldHave(text(ERROR_MESSAGE_404));

        return this;
    }

    public InlineGroupMainPage getTabsCount() {
        tabsCount = WebDriverRunner.getWebDriver().getWindowHandles().size();

        return this;
    }

    public InlineGroupMainPage clickOnVK() {
        iconLinkVK.click();

        return this;
    }

    public InlineGroupMainPage clickOnYouTube() {
        iconLinkYouTube.click();

        return this;
    }

    public InlineGroupMainPage checkNewTabOpened() {
        Selenide.webdriver().shouldHave(numberOfWindows(tabsCount+1));

        return this;
    }
}
