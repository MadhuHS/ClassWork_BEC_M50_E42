package com.alpha.db;

import com.alpha.entities.BookingDetails;

public interface BookingRepository 
{
	public void insertBookingDetails(BookingDetails bd);
	public void selectAllBookingDetails(String bookingID);
	public void selectBookingDetailsByID(String bookingID);
	public void selectBookingByHotel(String hotelName);
	public void selectBookingByDate(String hotelName);
}
