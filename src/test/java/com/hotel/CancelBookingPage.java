package com.hotel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass{


	public CancelBookingPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement itenary;

	@FindBy(id = "order_id_text")
	private WebElement txtsearch;

	@FindBy(id = "search_hotel_id")
	private WebElement go;

	@FindBy(xpath = "//input[contains(@name,'btn')]")
	private WebElement btncancel;

	public WebElement getItenary() {
		return itenary;
	}

	public WebElement getTxtsearch() {
		return txtsearch;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getbtncancel() {
		return btncancel;
	}

	public void cancelBooking(String search) throws IOException {

		click(itenary);
		type(txtsearch, search);
		click(go);
		click(btncancel);
		alertAccept();

	}



}
