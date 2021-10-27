package com.alpha.db;

import java.util.List;

import com.alpha.entities.Hotel;

public interface HotelRepository extends Repository{

	public List<Hotel> selectAllHotels();
	public List<Hotel>  selectHotelsByCity(String hotelCity);
	public Hotel selectHotel(String hotelName);
	public Hotel selectHotel(String hotelName,String hotelCity);
}
