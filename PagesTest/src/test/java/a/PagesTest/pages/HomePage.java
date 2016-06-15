package a.PagesTest.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	public void typeLocationOnSearchField(String locationName) {
		WebElement searchField = getDriver().findElement(By.cssSelector("div > div:nth-child(2) form > input"));
		searchField.sendKeys(locationName);
	}

	public void pressTheEnterKey() {
		WebElement enterKey = getDriver().findElement(By.cssSelector("div > div:nth-child(2) form > input"));
		enterKey.sendKeys(Keys.ENTER);

	}

	public void clickOnTheDegreesOptionTab() {
		WebElement degreesTab = getDriver().findElement(By.cssSelector("span span.wx-iconfont-global.wx-icon-arrow-down-2"));
		degreesTab.click();
	}

	public void clickOnCelsiusDegreesOption() {
		WebElement celsiusOption = getDriver().findElement(By.cssSelector("span div div:nth-child(2)"));
		celsiusOption.click();
		waitABit(2000);
	}

	public void assertWarningTextAppears(String textToVerify) {
		WebElement elementThatContainsText = getDriver().findElement(By.className("loc-container"));
		Assert.assertTrue(elementThatContainsText.getText().contains(textToVerify));
		System.out.println("textul afisat este: " + textToVerify);

	}
}