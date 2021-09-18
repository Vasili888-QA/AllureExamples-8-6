package cucumberWithAllure.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void openMainPageOnGithub() {
        Selenide.open(baseUrl);
    }

    public void searchRepositoryWithName(String repositoryName) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repositoryName);
        $(".header-search-input").submit();
    }
}
