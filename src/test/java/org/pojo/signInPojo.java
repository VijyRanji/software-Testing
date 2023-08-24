package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPojo extends BaseClass {
	private void SignINPojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement FirstNametxtbox;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement SecondNametxtbox;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mobileorEmailtextbox;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement Newpassword;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstNametxtbox() {
		return FirstNametxtbox;
	}

	public WebElement getSecondNametxtbox() {
		return SecondNametxtbox;
	}

	public WebElement getMobileorEmailtextbox() {
		return mobileorEmailtextbox;
	}

	public WebElement getNewpassword() {
		return Newpassword;
	}

}
