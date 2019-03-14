package com.maximojo.hiring.model;

import java.util.Date;

import com.maximojo.hiring.utility.Constants;

//RateCalendarItemCompact Class which is compact version of RateCalendarItem
public class RateCalendarItemCompact {

	//	Stay Start date
	private Date stayDateStart;
	
	//	Stay End date
	private Date stayDateEnd;
	
	//	id for room type	
	private String roomTypeId;
	
	//	number of available rooms	
	private int availableRooms;
	
	//	number of rooms 	
	private int roomAmount;
	
	//	amount of tax	
	private int taxAmount;

	public Date getStayDateStart() {
		return stayDateStart;
	}

	public void setStayDateStart(Date stayDateStart) {
		this.stayDateStart = stayDateStart;
	}

	public Date getStayDateEnd() {
		return stayDateEnd;
	}

	public void setStayDateEnd(Date stayDateEnd) {
		this.stayDateEnd = stayDateEnd;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public int getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}

	public int getRoomAmount() {
		return roomAmount;
	}

	public void setRoomAmount(int roomAmount) {
		this.roomAmount = roomAmount;
	}

	public int getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	@Override
	public String toString() {
		return ("stayDateStart - "+Constants.df.format(this.stayDateStart)+" , stayDateEnd - "+Constants.df.format(this.stayDateEnd)+" , roomTypeId - "+this.roomTypeId+" , availableRooms - "+this.availableRooms+" , roomAmount - "+this.roomAmount+" , taxAmount - "+this.taxAmount);
	}
}
