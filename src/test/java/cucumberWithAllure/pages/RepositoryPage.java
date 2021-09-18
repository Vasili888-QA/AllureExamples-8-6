package cucumberWithAllure.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class RepositoryPage {
    public void clickToRepositoryName(String repositoryName) {
        $(linkText(repositoryName)).click();
    }

    public void clickOnTabIssues() {
        $(partialLinkText("Issues")).click();
    }

    public void checkIssueWithNumber(String issueNumber) {
        $x("//span[@class='opened-by']").shouldHave(text(issueNumber));
    }
}
