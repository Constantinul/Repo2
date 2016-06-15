package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import a.PagesTest.steps.serenity.ForecastSteps;
import a.PagesTest.steps.serenity.HomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)

public class TheWeatherChannelTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages()
	public Pages pages;

	@Steps
	public HomeSteps homeSteps;
	@Steps
	public ForecastSteps forecastSteps;

	String url = "https://weather.com/";
	String location = "Cluj Napoca";
	String text = "CLUJ-NAPOCA";
	int grade = 21;
	String date = "10 Jun 2016";

	@Test
	public void theWeatherChannelTests() {

		homeSteps.openHomePage(url);
		homeSteps.openHomePage("https://weather.com/weather/5day/l/ROXX0022:1:RO");
		forecastSteps.assertDate(date);
		forecastSteps.theDaysTemperature(grade);
		forecastSteps.clickOnForecastMenu();
		forecastSteps.clickOnHourlyTab();
		homeSteps.clickOnTheDegreesOptionTab();
		homeSteps.clickOnCelsiusDegreesOption();
		homeSteps.typeLocationOnSearchField(location);
		homeSteps.pressTheEnterKey();
		homeSteps.assertWarningTextAppears(text);
		forecastSteps.compareDegrees(grade);
	}

}
