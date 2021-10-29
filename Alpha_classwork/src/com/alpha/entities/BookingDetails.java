package com.alpha.entities;

public class BookingDetails {

	private String bookingID;
	private String roomID;
	private int userID;
	private String bookedFrom;
	private String bookedTo;
	private int noOfAdults;
	private int noOfChildren;
	private double amount;
	private String bookingStatus;

	public BookingDetails() {

	}

	public BookingDetails(String bookingID, String roomID, int userID, String bookedFrom, String bookedTo,
			int noOfAdults, int noOfChildren, double amount) {
		super();
		this.bookingID = bookingID;
		this.roomID = roomID;
		this.userID = userID;
		this.bookedFrom = bookedFrom;
		this.bookedTo = bookedTo;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.amount = amount;
	}

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getBookedFrom() {
		return bookedFrom;
	}

	public void setBookedFrom(String bookedFrom) {
		this.bookedFrom = bookedFrom;
	}

	public String getBookedTo() {
		return bookedTo;
	}

	public void setBookedTo(String bookedTo) {
		this.bookedTo = bookedTo;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

}
