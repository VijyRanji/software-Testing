package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.signInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registerfacebook extends BaseClass {

	signInPojo s;

	@Given("To Launch the Borwse and maximize the window")
	public void to_Launch_the_Borwse_and_maximize_the_window() {
		launchBrowser();
		windowmaxmize();

	}

	private void windowmaxmize() {

	}

	@When("To launch the Url of facebook application")
	public void to_launch_the_Url_of_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");

	}

	@When("To click the create NewAccountbutton")
	public void to_click_the_create_NewAccountbutton() {
		// s = new signInPojo();
		// click(s.getCreateNewAcc());
		WebElement Newacct = driver.findElement(By.xpath("//a[text()='Create new account']"));
		click(Newacct);
	}

	@When("To pass the FirstName in firstname textbox")
	public void to_pass_the_FirstName_in_firstname_textbox() throws InterruptedException {

		Thread.sleep(3000);

		// s = new signInPojo();
		// passText("vijay", s.getFirstNametxtbox());
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("vijay");
	}

	@When("To pass the SecondName in secondname textbox")
	public void to_pass_the_SecondName_in_secondname_textbox() {
		// s = new signInPojo();
		// passText("selvam", s.getSecondNametxtbox());
		WebElement secondname = driver.findElement(By.xpath("//input[@name='lastname']"));
		secondname.sendKeys("selvam");
	}

	@When("To pass mobileno or email in Email textbox")
	public void to_pass_mobileno_or_email_in_Email_textbox() {
		// s = new signInPojo();
		// passText("vijay888cool@gmail.com", s.getMobileorEmailtextbox());
		WebElement emailbox = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailbox.sendKeys("vijay888cool@gmail.com");
	}

	@When("To create new password using new password textbox")
	public void to_create_new_password_using_new_password_textbox() {
		// s = new signInPojo();
		// passText("Welcome@2023", s.getNewpassword());
		// WebElement newpwd =
		// driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		// newpwd.sendKeys("Welcome@2023");
	}

	@Then("To close the chromeBrowser")
	public void to_close_the_chromeBrowser() {
		closeEntireBrowser();

	}

	private void closeEntireBrowser() {

	}

}
