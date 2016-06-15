package a.PagesTest.steps.serenity;

import a.PagesTest.pages.ForecastPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class ForecastSteps extends ScenarioSteps {
	ForecastPage forecastPage;

	@Step
	public void clickOnForecastMenu() {
		forecastPage.clickOnForecastMenu();
	}

	@Step
	public void clickOnHourlyTab() {
		forecastPage.clickOnHourlyTab();
	}

	@Step
	public void compareDegrees(int grade) {
		forecastPage.compareDegrees(grade);
	}

	@Step
	public void assertDate(String date) {
		forecastPage.assertDate(date);
	}

	public void numberOfWarmAndColdDays(int gr) {
		forecastPage.numberOfWarmAndColdDays(gr);
	}

	public void theDaysTemperature(int gr) {
		forecastPage.theDaysTemperature(gr);
	}
}
