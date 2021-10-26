package com.alpha.db;

import com.alpha.entities.Hotel;

public interface HotelRepository extends Repository{

	public Hotel[] selectAllHotels();
	public Hotel[] selectHotelsByCity(String hotelCity);
	public Hotel selectHotel(String hotelName);
	public Hotel selectHotel(String hotelName,String hotelCity);
}
