package com.noorteck.qa.test;

import java.util.concurrent.TimeUnit;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "http://a.testaddressbook.com/sign_up/";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		
		initializeClassObj();
		signUpTestOne();
		CommonUI.quitBrowser();
		
		String urlTwo = "http://a.testaddressbook.com/sign_in";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(urlTwo);
		initializeClassObj();
		signInTestOne();
		CommonUI.quitBrowser();
		
	}
	
	public static void signUpTestOne() {
		
		signUpObj.enterEmailSignUp("johncena007@email.com");
		signUpObj.enterPasswordSignUp("12345jonncena");
		signUpObj.clickSignUp();
		}
		public static void signInTestOne() {

			signInObj.enterEmailSignIn("johncena007@email.com");
			signInObj.enterPasswordSignIn("12345jonncena");
			signInObj.clickSignIn();
			
			addressPageObj.clickAddressButton();
			addressPageObj.clickAddressPage();
			addressPageObj.enterFirstName("john");
			addressPageObj.enterLastName("cena");
			addressPageObj.enterAddress("1234 Strawberry Lane");
			addressPageObj.enterCity("Reston");
			addressPageObj.enterStateDropDown("text", "Virginia");
			addressPageObj.clickCountry();
			addressPageObj.enterAge("22");
			addressPageObj.enterPhone("123-2334-3434");
			addressPageObj.clickDance();
			addressPageObj.enterNote("Automation is Fun");
			addressPageObj.clickCommit();
			addressPageObj.clickList();

		
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

