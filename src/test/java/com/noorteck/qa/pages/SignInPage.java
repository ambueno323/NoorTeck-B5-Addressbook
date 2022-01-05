package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {
	
	@FindBy(id = "session_email")
	WebElement emailSignInField;
	
	@FindBy(id = "session_password")
	WebElement passwordSignInField;
	
	@FindBy(name = "commit")
	WebElement signInButton;
	
	public SignInPage () {
		PageFactory.initElements(driver, this);
	}
	public void enterEmailSignIn(String email) {
		enter(emailSignInField, email);
	}
	public void enterPasswordSignIn(String password) {
		enter(passwordSignInField, password);
	}
	public void clickSignIn() {
		click(signInButton);
	}
}
