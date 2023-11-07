package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.hotel.BaseClass;
import com.hotel.BookHotelPage;
import com.hotel.BookingConfirmationPage;
import com.hotel.LoginPage;
import com.hotel.SearchHotelPage;
import com.hotel.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends BaseClass { 

	WebDriver driver;

	@Given("user is on the adactin hotel")
	public void user_is_on_the_adactin_hotel() {

		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		implicitWait();

	}

	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) throws IOException {

		LoginPage l = new LoginPage();

		l.login(string, string2);

	}

	@Then("user should search hotel {string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_should_search_hotel(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) throws IOException {

		SearchHotelPage s = new SearchHotelPage();
		s.searchHotel(string, string2, string3, string4, string5, string6, string7, string8);

	}

	@Then("user should select the hotel")
	public void user_should_select_the_hotel() {

		SelectHotelPage s = new SelectHotelPage();
		s.selectHotel();
	}

	@Then("user should book hotel {string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_should_book_hotel(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) throws IOException, InterruptedException {

		BookHotelPage b = new BookHotelPage();
		b.bookHotel(string, string2, string3, string4, string5, string6, string7, string8);

	}

	@Then("user should confirm hotel by order id")
	public void user_should_confirm_hotel_by_order_id() throws IOException {

		BookingConfirmationPage b = new BookingConfirmationPage();
		b.bookingConfirmation();

	}

}
