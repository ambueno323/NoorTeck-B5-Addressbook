package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {
	
	@FindBy(name = "user[email]")
	WebElement emailSignUpField;
	
	@FindBy(name = "user[password]")
	WebElement passwordSignUpField;
	
	@FindBy(name = "commit")
	WebElement signUpButton;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterEmailSignUp(String emailSignUp) {
		enter(emailSignUpField, emailSignUp);
	}
	public void enterPasswordSignUp(String passwordSignUp) {
		enter(passwordSignUpField, passwordSignUp);
	}
	public void clickSignUp() {
		click(signUpButton);
	}

}
