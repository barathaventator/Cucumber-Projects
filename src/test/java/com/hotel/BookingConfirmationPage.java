package com.hotel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass {

	
	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
	public void bookingConfirmation() throws IOException {
		
		createCell(1, 18, getAttribute(orderNo));
	}
	
	


}
