package StepDefns;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {
	public ExcelReader er = new ExcelReader();
	private HomePage hPage = new HomePage(DriverFactory.getDriver());
	public String value;

	@Given("user navigate to amazon home page")
	public void i_navigate_to_home_page() {
		hPage.launchURL(ApplnHooks.prop.getProperty("url"));
	}

	@When("user verifies amazon home page")
	public void user_is_on_home_page() {

		Assert.assertTrue(hPage.getHomePageTitle().contains("Amazon"));
	}
	
	@When("user clicks on hamburger menu")
	public void user_clicks_on_hamburger_menu() {
		Assert.assertTrue(hPage.clickon_hamburger_button());
		
	}



	@Then("clicks on TV_Appliances_Electronics menu")
	public void clicks_on_tv_appliances_electronics_menu() {
	    // Write code here that turns the phrase above into concrete actions
		hPage.clickon_TV_Appliances_link();
	}
	@Then("clicks on Televisions menu")
	public void clicks_on_televisions_menu() {
	   hPage.clickon_Televisions_link();
	}
	@Then("selects brand checkbox as samsung")
	public void selects_brand_checkbox_as_samsung() {
	    // Write code here that turns the phrase above into concrete actions
	 hPage.check_Samsung_radiobutton();
	}
	@Then("sorts result as HighandLow price")
	public void sorts_result_as_highand_low_price() {
	    // Write code here that turns the phrase above into concrete actions
	    hPage.SortBy_HightoLow();
	}
	@Then("clicks on second highest item")
	public void clicks_on_second_highest_item() {
	    // Write code here that turns the phrase above into concrete actions
	    hPage.Selecting_Second_Product();
	}
	@Then("switch to next window")
	public void switch_to_next_window() {
	    // Write code here that turns the phrase above into concrete actions
	   hPage.SwitchWindow();
	}
	@Then("assert the aboutthisitem field")
	public void assert_the_aboutthisitem_field() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(hPage.Aboutthisitem_headertext(), "About this item");
	}





//
//	
//	@Then("user verify and enter {string} in username field")
//	public void i_verify_and_enter_in_username_field(String string) {
//		Assert.assertTrue(hPage.EnterUsername(string));
//	}
//
//	@Then("user verify and enter {string} in password field")
//	public void i_verify_and_enter_in_password_field(String string) {
//		Assert.assertTrue(hPage.EnterPassword(string));
//
//	}
//
//	@Then("user sign in with google account")
//	public void user_sign_in_with_google_account() {
//		Assert.assertTrue(hPage.clicksignin());
//
//	}
//
//
//	@When("user is on home page")
//	public void user_is_on_home_page() {
//
//		Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Google Forms: Sign-in");
//	}
//
//
//
//	@When("user verify and selects the item like to order checkbox")
//	public void user_verify_and_selects_the_checkbox() {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.selectcheckbox());
//		
//	}
//
//	@Then("user verify and enters {string} as liked color in editbox")
//	public void user_verify_and_enters_color(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.colorEditbox(string));
//		
//	}
//	@Then("user verify and selects {string} in able to find everything looking for radiobutton")
//	public void user_verify_and_enters_radiobutton(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.yes_checkbox(string));
//		
//	}
//
//	@Then("user verify and enters {string} in name editbox")
//	public void user_verify_and_enters_name(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.nameEditbox(string));
//		
//	}
//	
//	@Then("user performs file upload")
//	public void userperformsfileupload() {
//		// Write code here that turns the phrase above into concrete actions
//		
//		hPage.fileUpload();
//	}
//	
//	@When("user verify and selects date in the calendar")
//	public void user_verify_and_selects_the_date() {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.dateEditbox());
//		
//	}
//	@When("user verify and selects preferred notification from radio button")
//	public void user_verify_and_selects_notification() {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.Notificationradio());
//		
//	}
//	
//	@Then("user verify and enters {string} in email editbox")
//	public void user_verify_and_enters_email(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.emailforUpdates(string));
//		
//	}
//	
//	@Then("user verify and enters {string} in Phone editbox")
//	public void user_verify_and_enters_phone(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.phoneforUpdates(string));
//		
//	}
//	
//	@When("user verify and clicks on next button")
//	public void user_verify_and_selects_next() {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.next_Button());
//		
//	}
//	
//	@When("user verify and selects no for sms notification radio button")
//	public void user_verify_and_selects_radiobutton() {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.Noradiobutton());
//		
//	}
//	
//	@When("user verify and clicks on submit button")
//	public void user_verify_and_selects_submit() {
//		// Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(hPage.submit_button());
//		
//	}
	
}
