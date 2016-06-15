package a.PagesTest.steps.serenity;

import a.PagesTest.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class HomeSteps extends ScenarioSteps {
	HomePage homePage;

	public void openHomePage(String url) {
		homePage.getDriver().manage().window().maximize();
		homePage.getDriver().get(url);
	}

	@Step
	public void typeLocationOnSearchField(String locationName) {
		homePage.typeLocationOnSearchField(locationName);
	}

	@Step
	public void pressTheEnterKey() {
		homePage.pressTheEnterKey();
	}

	@Step
	public void assertWarningTextAppears(String textToVerify) {
		homePage.assertWarningTextAppears(textToVerify);
	}

	@Step
	public void clickOnTheDegreesOptionTab() {
		homePage.clickOnTheDegreesOptionTab();
	}

	@Step
	public void clickOnCelsiusDegreesOption() {
		homePage.clickOnCelsiusDegreesOption();
	}
}
