package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressPage extends CommonUI {
	
	@FindBy(linkText = "Addresses")
	WebElement addressButton;
	
	@FindBy(xpath = "//a[normalize-space()='New Address']")
	WebElement newAddressButton;
	
	@FindBy(name = "address[first_name]")
	WebElement firstNameField;
	
	@FindBy(name = "address[last_name]")
	WebElement lastNameField;
	
	@FindBy(name = "address[address1]")
	WebElement addressLineField;
	
	@FindBy(name = "address[address2]")
	WebElement addressSecondField;
	
	@FindBy(name = "address[city]")
	WebElement cityField;
	
	@FindBy(name = "address[state]")
	WebElement stateDropDown;
	
	@FindBy(name = "address[zip_code]")
	WebElement zipcodeField;
	
	@FindBy(xpath = "//input[@id='address_country_us']")
	WebElement countryRadio;
	
	@FindBy(name = "address[age]")
	WebElement ageField;
	
	@FindBy(name = "address[website]")
	WebElement websiteField;
	
	@FindBy(name = "address[phone]")
	WebElement phoneField;
	
	@FindBy(name = "address[interest_dance]")
	WebElement danceButton;
	
	@FindBy(name = "address[note]")
	WebElement noteField;
	
	@FindBy(name = "commit")
	WebElement commitButton;
	
	@FindBy(xpath = "//a[normalize-space()='List']")
	WebElement listButton;
	
	@FindBy(xpath = "/html/body/div/p[1]/span[2]")
	WebElement firstNameVerification;
	
	@FindBy(xpath = "/html/body/div/p[2]/span[2]")
	WebElement lastNameVerification;
	
	@FindBy(xpath = "/html/body/div/p[5]/span[2]")
	WebElement cityVerification;
	
	@FindBy(xpath = "/html/body/div/p[6]/span[2]")
	WebElement stateVerification;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickAddressButton() {
		click(addressButton);
	}
	public void clickAddressPage() {
		click(newAddressButton);
	}
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}
	public void enterAddress(String address) {
		enter(addressLineField, address);
	}
	public void enterSecondAddress(String addressTwo) {
		enter(addressSecondField, addressTwo);
	}
	public void enterCity(String city) {
		enter(cityField, city);
	}
	public void enterStateDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropDown, methodName, indexTextValue);
	}
	public void enterZip(String zipcode) {
		enter(zipcodeField, zipcode);
	}
	public void clickCountry() {
		click(countryRadio);
	}
	public void enterAge(String age) {
		enter(ageField, age);
	}
	public void enterWebsite(String website) {
		enter(websiteField, website);
	}
	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}
	public void clickDance() {
		click(danceButton);
	}
	public void enterNote(String note) {
		enter(noteField, note);
	}
	public void clickCommit() {
		click(commitButton);
	}
	public void clickList() {
		click(listButton);
	}
	public void getFirstName() {
		getText(firstNameVerification);
	}
	public void getLastName() {
		getText(lastNameVerification);
	}
	public void getCity() {
		getText(cityVerification);
	}
	public void getState() {
		getText(stateVerification);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
