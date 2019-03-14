package com.maximojo.hiring.utility;

import com.maximojo.hiring.exception.CustomException;
import com.maximojo.hiring.model.RateCalendarItem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class PopulateDataUtility {
	
//	This is utility function which populates RateCalendar Item list 
	public static ArrayList<RateCalendarItem> populateInputList() throws CustomException {
		
		ArrayList <RateCalendarItem> rateCalendarItems=new ArrayList<RateCalendarItem>();
		
//		populate by reading excel file (currently not in use)
//		return ExcelReader.populateFromExcel();
		
//		populate hardcoded data
		return HardcodedReader.populateHardcoded();
	}

}
