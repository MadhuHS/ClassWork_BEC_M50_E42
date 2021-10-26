package com.alpha.entities;

//Entity
public class Hotel {

	private String hotelID;
	private String hotelCity;
	private String hotelName;
	private String hotelAddrs;
	private String hotelDesc;
	private String hotelCost;
	private String hotelPhone1;
	private String hotelPhone2;
	private String hotelRating;
	private String hotelEmail;
	
	public Hotel()
	{
		
	}

	public Hotel(String hotelID, String hotelCity, String hotelName, String hotelAddrs, String hotelDesc,
			String hotelCost, String hotelPhone1, String hotelPhone2, String hotelRating, String hotelEmail) {
		super();
		this.hotelID = hotelID;
		this.hotelCity = hotelCity;
		this.hotelName = hotelName;
		this.hotelAddrs = hotelAddrs;
		this.hotelDesc = hotelDesc;
		this.hotelCost = hotelCost;
		this.hotelPhone1 = hotelPhone1;
		this.hotelPhone2 = hotelPhone2;
		this.hotelRating = hotelRating;
		this.hotelEmail = hotelEmail;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddrs() {
		return hotelAddrs;
	}

	public void setHotelAddrs(String hotelAddrs) {
		this.hotelAddrs = hotelAddrs;
	}

	public String getHotelDesc() {
		return hotelDesc;
	}

	public void setHotelDesc(String hotelDesc) {
		this.hotelDesc = hotelDesc;
	}

	public String getHotelCost() {
		return hotelCost;
	}

	public void setHotelCost(String hotelCost) {
		this.hotelCost = hotelCost;
	}

	public String getHotelPhone1() {
		return hotelPhone1;
	}

	public void setHotelPhone1(String hotelPhone1) {
		this.hotelPhone1 = hotelPhone1;
	}

	public String getHotelPhone2() {
		return hotelPhone2;
	}

	public void setHotelPhone2(String hotelPhone2) {
		this.hotelPhone2 = hotelPhone2;
	}

	public String getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}

	public String getHotelEmail() {
		return hotelEmail;
	}

	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}
	
	
}
