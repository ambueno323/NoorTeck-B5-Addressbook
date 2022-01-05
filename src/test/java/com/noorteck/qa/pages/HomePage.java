package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	@FindBy(linkText = "home")
	WebElement homeButton;

	@FindBy(linkText = "addresses")
	WebElement addressesButton;
	
	@FindBy(linkText = "sign-out")
	WebElement signOutButton;
	
	@FindBy(xpath = "/html/body/div/div/h1")
	WebElement welcomeToAddressBookMessage;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickHome() {
		click(homeButton);
	}

	public void clickAddress() {
		click(addressesButton);
	}
	public void clickSignOut() {
		click(signOutButton);
	}
	public void getWelcomeMessage() {
		getText(welcomeToAddressBookMessage);
	}

}
