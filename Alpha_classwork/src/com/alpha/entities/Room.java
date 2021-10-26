package com.alpha.entities;

public class Room {

	private String hotelID;
	private String roomID;
	private String roomNo;
	private String roomType;
	private String roomCost;
	private String roomAvilable;
	
	public Room()
	{
		
	}

	public Room(String hotelID, String roomID, String roomNo, String roomType, String roomCost, String roomAvilable) {
		super();
		this.hotelID = hotelID;
		this.roomID = roomID;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomCost = roomCost;
		this.roomAvilable = roomAvilable;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(String roomCost) {
		this.roomCost = roomCost;
	}

	public String getRoomAvilable() {
		return roomAvilable;
	}

	public void setRoomAvilable(String roomAvilable) {
		this.roomAvilable = roomAvilable;
	}
	
	
}
