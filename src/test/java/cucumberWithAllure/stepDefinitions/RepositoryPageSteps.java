package cucumberWithAllure.stepDefinitions;

import cucumberWithAllure.pages.RepositoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RepositoryPageSteps {
    RepositoryPage repositoryPage = new RepositoryPage();

    @And("Click to repository name {string}")
    public void clickToRepositoryName(String repositoryName) {
        repositoryPage.clickToRepositoryName(repositoryName);
    }

    @And("Click on tab Issues")
    public void clickOnTabIssues() {
        repositoryPage.clickOnTabIssues();
    }

    @Then("Check Issue with number {string}")
    public void checkIssueWithNumber(String issueNumber) {
        repositoryPage.checkIssueWithNumber(issueNumber);
    }
}
