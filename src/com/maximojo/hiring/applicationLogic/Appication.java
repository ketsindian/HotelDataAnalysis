package com.maximojo.hiring.applicationLogic;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Stack;

import com.maximojo.hiring.exception.CustomException;
import com.maximojo.hiring.model.RateCalendarItem;
import com.maximojo.hiring.model.RateCalendarItemCompact;
import com.maximojo.hiring.utility.PopulateDataUtility;


//This class contains main class
public class Appication {
	
	public static void main(String args[]){
		
		//Defining required datastructures
		Stack <RateCalendarItem> rateCalendarItemsStack=new Stack<RateCalendarItem>();	
		ArrayList<RateCalendarItemCompact> rateCalendarItemCompactList=new ArrayList<RateCalendarItemCompact>();
		ArrayList<RateCalendarItem> rateCalendarItemsList=new ArrayList<RateCalendarItem>();
		
		
		try {
			//taking populated list of rateCalendarItems
			rateCalendarItemsList= PopulateDataUtility.populateInputList();
		} catch (CustomException e) {
			e.printStackTrace();
		}
		
		//initializing the stack by pushing first value
		rateCalendarItemsStack.push(rateCalendarItemsList.get(0));
		
//		iterating over populated data of input list
		rateCalendarItemsList.forEach(rateCalendarItem ->{
			
			//create variables startVal and EndVal to store start and end date of compact data
			RateCalendarItem startVal=new RateCalendarItem();
			RateCalendarItem endVal=new RateCalendarItem();
			
//			pop recent item from stack and check whether all fields are same (except date)
			endVal=rateCalendarItemsStack.pop();
//			if popped data matches with current data in list of inputs then push both values into stack
			if (endVal.equalData(rateCalendarItem)) {
				rateCalendarItemsStack.push(endVal);
				rateCalendarItemsStack.push(rateCalendarItem);
			}
//			if current element in queue is not same as popped data then empty the stack 
			else {
				
				while(!(rateCalendarItemsStack.empty())) {
					startVal=rateCalendarItemsStack.pop();
				}
				
//				after making the stack empty fetch dates from startValue and endValue of stack and put these dates into compact structure RateCalendarItemCompact
				RateCalendarItemCompact rateCalendarItemCompact=new RateCalendarItemCompact();
				rateCalendarItemCompact.setStayDateStart(startVal.getStayDate());
				rateCalendarItemCompact.setAvailableRooms(startVal.getAvailableRooms());
				rateCalendarItemCompact.setRoomAmount(startVal.getRoomAmount());
				rateCalendarItemCompact.setRoomTypeId(startVal.getRoomTypeId());
				rateCalendarItemCompact.setTaxAmount(startVal.getTaxAmount());
				rateCalendarItemCompact.setStayDateEnd(endVal.getStayDate());
				
//				populate result list 
				rateCalendarItemCompactList.add(rateCalendarItemCompact);
				
				rateCalendarItemsStack.push(rateCalendarItem);
			}
			
		});
		
//		printing output list
		System.out.println("Output list is - ");
		rateCalendarItemCompactList.forEach(rateCalendarItemCompact1->{
			System.out.println(rateCalendarItemCompact1);
		});
		
	}	

}
