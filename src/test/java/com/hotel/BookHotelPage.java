package com.hotel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	
	public BookHotelPage() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "first_name")
	private WebElement first_name;
	
	@FindBy(id = "last_name")
	private WebElement last_name;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cc_num;
	
	@FindBy(id = "cc_type")
	private WebElement cc_type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy(id = "book_now")
	private WebElement book_now;

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	
	public void bookHotel(String firstName, String lastName, String address, String ccNum, String cctype, String ccMonth, String ccYear,String ccCvv) throws IOException, InterruptedException {
		
		type(getFirst_name(), firstName);
		type(getLast_name(), lastName);
		type(getAddress(), address);
		type(getCc_num(), ccNum);
		type(getCc_type(), cctype);
		type(getCc_exp_month(), ccMonth);
		type(getCc_exp_year(), ccYear);
		type(getCc_cvv(), ccCvv);
		click(getBook_now());
		Thread.sleep(8000);
		
		
	}
	
	
	


}
