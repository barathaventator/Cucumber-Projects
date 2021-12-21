package com.hotel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{

	
	public SearchHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfrooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildRoom;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfrooms() {
		return dDnNoOfrooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void searchHotel(String location, String hotels, String roomType, String roomNos, String checkInDate,
			String checkOutDate, String adultRoom, String childRoom) throws IOException {

		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnHotels(), hotels);
		selectOptionByText(getdDnRoomType(), roomType);
		selectOptionByText(getdDnNoOfrooms(), roomNos);
		type(getTxtCheckInDate(), checkInDate);
		type(getTxtCheckOutDate(), checkOutDate);
		selectOptionByText(getdDnAdultRoom(), adultRoom);
		selectOptionByText(getdDnChildRoom(), childRoom);
		click(getBtnSubmit());

	}



}
