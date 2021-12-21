package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hotel.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep extends BaseClass {
	
	WebDriver driver;
	
	@Given("User is on AdactinHotel")
	public void user_is_on_AdactinHotel() {
	}

	@When("User should enter {string} , {string} and login")
	public void user_should_enter_and_login(String string, String string2) {
	}

	@When("User should search hotel {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_search_hotel_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	}

	@When("User should select one hotel and continue")
	public void user_should_select_one_hotel_and_continue() {
	}

	@When("User should enter the details {string},{string},{string},{string} and Book Now")
	public void user_should_enter_the_details_and_Book_Now(String string, String string2, String string3, String string4, io.cucumber.datatable.DataTable dataTable) {
	}

	@When("User should go to the booked itinerary page from booking confirmation page")
	public void user_should_go_to_the_booked_itinerary_page_from_booking_confirmation_page() {
	}

	@Then("Cancel the order ID and verify {string} message")
	public void cancel_the_order_ID_and_verify_message(String string) {
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
