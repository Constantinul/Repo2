package a.PagesTest.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ForecastPage extends PageObject {
	public void clickOnForecastMenu() {
		WebElement forecastMenu = getDriver().findElement(By.cssSelector("div.header-menu span:nth-child(1) > a"));
		forecastMenu.click();
	}

	public void clickOnHourlyTab() {
		WebElement hourlyTub = getDriver().findElement(By.cssSelector("div.sub-header nav > ul > li:nth-child(2) > a > span"));
		hourlyTub.click();
		waitABit(2000);
	}

	public void compareDegrees(int grade) {
		WebElement gradeAfisate = getDriver().findElement(By.cssSelector("div.today_nowcard-temp > span > span"));
		int g = Integer.valueOf(gradeAfisate.getText());
		if (g > grade) {
			System.out.println("Afara este cald.");
		} else {
			System.out.println("Afara este frig.");

		}
	}

	public void assertDate(String date) {
		WebElement dataActuala = getDriver().findElement(By.partialLinkText(date));
		Assert.assertTrue(dataActuala.getText().contains(date));
		System.out.println("Data de azi este: " + date);
	}

	public void numberOfWarmAndColdDays(int gr) {
		List<WebElement> degreesNumber = getDriver().findElements(By.cssSelector("span.hi-temp.temp-1 span"));
		int zc = 0;
		int zr = 0;
		for (WebElement e : degreesNumber) {
			int g = Integer.valueOf(e.getText());
			if (g > gr) {
				zc++;
			} else {
				zr++;
			}
		}
		System.out.println("zile calde: " + zc);
		System.out.println("zile reci: " + zr);

	}

	public void theDaysTemperature(int gr) {
		List<WebElement> degreesNumber = getDriver().findElements(By.cssSelector("span.hi-temp.temp-1 span"));
		int day = 1;
		for (WebElement e : degreesNumber) {
			int g = Integer.valueOf(e.getText());
			if (g > gr) {
				System.out.println("The day nuber: " + day + " its a warm day");

			} else {
				System.out.println("The day nuber: " + day + " its a cold day");
			}
			day++;

		}
	}
}