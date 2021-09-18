package cucumberWithAllure.stepDefinitions;

import cucumberWithAllure.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Given("Open main page on Github")
    public void openMainPageOnGithub() {
        mainPage.openMainPageOnGithub();
    }

    @When("Search repository with name {string}")
    public void searchRepositoryWithName(String repositoryName) {
        mainPage.searchRepositoryWithName(repositoryName);
    }
}
