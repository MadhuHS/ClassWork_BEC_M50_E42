package com.alpha.db;

public interface HotelRepository extends Repository{

	public void selectAllHotels();
	public void selectHotelsByCity(String hotelCity);
	public void selectHotel(String hotelName);
	public void selectHotel(String hotelName,String hotelCity);
}
