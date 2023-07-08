package org.steps;

import org.baseClass.BaseClass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinHotel extends BaseClass1 {
 static WebDriver driver;
	
 @Given("User navigates to the loginpage")
 public void tc01() {
    try {
    	getDriver("Chrome", "https://adactinhotelapp.com/");
    	
		
	} catch (Exception e) {
		
	}
 }

 @When("User should enter {string} and {string}")
 public void user_should_enter_and(String user, String pass) {
     try {
		
    	 WebElement uname = locaterId("username");
    	 textSend(uname,user);
    	 
    	 WebElement pword = locaterId("password");
    	 textSend(pword,pass);
    	 
   } catch (Exception e) {
		
   } 
   }

 @When("User should click login page")
 public void user_should_click_login_page() {
     
	 WebElement login = locaterId("login");
	 buttonClick(login);
	 
 }

 @Then("User navigates to the search page")
 public void user_navigates_to_the_search_page() {
     
	System.out.println("User Successfully logged in the hotel");
	 
	 
 }

 @Then("User should select the {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
 public void user_should_select_the(String location, String hotels, String roomType, String numOfRooms, String string , String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15) {
 }

 @Then("User click the search option")
 public void user_click_the_search_option() {
 }  

 @Then("User navigates to the select page")
 public void user_navigates_to_the_select_page() {
 }   

 @Then("User should click the radio button and click the continue button")
 public void user_should_click_the_radio_button_and_click_the_continue_button() {
    
 }

 @Then("User navigates to the booking page and Click the booknow button")
 public void user_navigates_to_the_booking_page_and_Click_the_booknow_button() {
     
 }
 @Then("User successfully Booked the hotel")
 public void user_successfully_Booked_the_hotel() {
   
 }

 
}