package lambdaAllureStepsExample;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;


@Epic("Epic annotation - Simple example with Allure")
@Feature("Feature annotation - Allure with Lambda Steps")
@DisplayName("DisplayName annotation- Allure with Lambda Steps")
public class LambdaStepsTest extends TestBase {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static Integer ISSUE_NUMBER = 68;

    @Test
    @Story("Story annotation - Github test with Lambda")
    @DisplayName("DisplayName annotation - Check issue name on Github")
    public void testGithub() {
        step("Open main page on Github", () -> open("https://github.com"));

        step("Search repository with name " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });

        step("Click to repository name " + REPOSITORY, () -> $(linkText(REPOSITORY)).click());

        step("Click on tab Issues", () -> $(partialLinkText("Issues")).click());

        step("Check Issue with number " + ISSUE_NUMBER, () -> {
            $(byText("#" + ISSUE_NUMBER)).should(Condition.visible);
        });
    }
}
