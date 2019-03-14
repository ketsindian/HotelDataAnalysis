package com.maximojo.hiring.model;


import java.util.Date;

import com.maximojo.hiring.utility.Constants;

//RateCalendarItem Class
public class RateCalendarItem {
	
	//	Stay date
	private Date stayDate;
		
	//	room type ID
	private String roomTypeId;
	
	//	number of available rooms
	private int availableRooms;
	
	//	number of rooms
	private int roomAmount;
	
	//	amount of tax
	private int taxAmount;

	
	
	public RateCalendarItem(Date stayDate,String roomTypeId,int availableRooms,int roomAmount,int taxAmount) {
		this.stayDate=stayDate;
		this.roomTypeId=roomTypeId;
		this.availableRooms=availableRooms;
		this.roomAmount=roomAmount;
		this.taxAmount=taxAmount;
	}
	
	
	public RateCalendarItem() {
		
	}


	public Date getStayDate() {
		return stayDate;
	}

	public void setStayDate(Date stayDate) {
		this.stayDate = stayDate;
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
	
	
	// this method checks whether all fields except date are same or not	
	public boolean equalData(Object o) {
		if (o == this) { 
            return true; 
        } 
  
        if (!(o instanceof RateCalendarItem)) { 
            return false; 
        }
        
        RateCalendarItem rateCalendarItem=(RateCalendarItem) o;
        
        return (this.roomTypeId.equals(rateCalendarItem.getRoomTypeId()) && this.availableRooms==rateCalendarItem.getAvailableRooms() && this.roomAmount==rateCalendarItem.getRoomAmount() && this.taxAmount==rateCalendarItem.getTaxAmount());
        
	}

	@Override
	public String toString() {
		return ("stayDate - "+Constants.df.format(this.stayDate)+" , roomTypeId - "+this.roomTypeId+" , availableRooms - "+this.availableRooms+" , roomAmount - "+this.roomAmount+" , taxAmount - "+this.taxAmount);
	}
}
