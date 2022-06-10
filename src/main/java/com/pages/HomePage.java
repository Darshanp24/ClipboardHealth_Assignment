package com.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private static WebDriver driver;
	// Locators
	private By hamburger_button = By.xpath("//a[@id='nav-hamburger-menu']");
	private By TV_Appliances_link = By.xpath("//a[@class='hmenu-item']/div[text()='TV, Appliances, Electronics']");
	private By Televisions_link = By.xpath("//a[text()='Televisions']");
	private By Samsung_radiobutton = By.xpath("//span[text()='Samsung']");
	private By SortBy_dropdown = By.xpath("//span[@id='a-autoid-0-announce']");
	private By Low2High_option = By.xpath("//a[text()='Price: High to Low']");
	private By Second_Product = By.xpath("(//span[@data-component-type='s-product-image']/a)[2]");
	private By Aboutthisitem_header = By.xpath("//h1[@class='a-size-base-plus a-text-bold']");

	// constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void launchURL(String url) {
		driver.get(url);
	}

	public String getHomePageTitle() {

		return driver.getTitle();
	}

	public static boolean verifyWebElement(By wd) {
		if (driver.findElement(wd).getSize().getHeight() > 0) {
			return true;
		}
		return false;
	}

	public static void jclick(By ws) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display = 'block';", driver.findElement(ws));

		js.executeScript("arguments[0].click();", driver.findElement(ws));
	}

	public static void scrolltoElement(By ws) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display = 'block';", driver.findElement(ws));
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(ws));
	}

	public boolean clickon_hamburger_button() {
		try {
			verifyWebElement(hamburger_button);
			driver.findElement(hamburger_button).click();
			;

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean clickon_TV_Appliances_link() {
		try {
			scrolltoElement(TV_Appliances_link);
			verifyWebElement(TV_Appliances_link);
			jclick(TV_Appliances_link);

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean clickon_Televisions_link() {
		try {
			scrolltoElement(Televisions_link);
			verifyWebElement(Televisions_link);
			jclick(Televisions_link);

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean check_Samsung_radiobutton() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(Samsung_radiobutton));
		try {
			scrolltoElement(Samsung_radiobutton);
			verifyWebElement(Samsung_radiobutton);
			jclick(Samsung_radiobutton);

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean SortBy_HightoLow() {
		try {
			// scrolltoElement(Televisions_link);
			verifyWebElement(SortBy_dropdown);
			jclick(SortBy_dropdown);

			verifyWebElement(Low2High_option);
			jclick(Low2High_option);

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean Selecting_Second_Product() {
		try {
			scrolltoElement(Second_Product);
			verifyWebElement(Second_Product);
			jclick(Second_Product);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public void SwitchWindow() {
		String ParentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String c : childWindow) {
			if (!c.equals(ParentWindow)) {
				driver.switchTo().window(c);
				break;
			}
		}

	}

	public String Aboutthisitem_headertext() {
		try {
			verifyWebElement(Aboutthisitem_header);
			return driver.findElement(Aboutthisitem_header).getText();
		} catch (Exception e) {

			return null;
		}
	}
}