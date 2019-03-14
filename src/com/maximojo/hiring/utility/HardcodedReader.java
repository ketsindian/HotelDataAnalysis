package com.maximojo.hiring.utility;

import java.text.ParseException;
import java.util.ArrayList;

import com.maximojo.hiring.exception.CustomException;
import com.maximojo.hiring.model.RateCalendarItem;

// generating hardcoded input data
public class HardcodedReader {

//	method to return hardcoded data
	public static ArrayList<RateCalendarItem> populateHardcoded() throws CustomException{
		
		ArrayList <RateCalendarItem> rateCalendarItems=new ArrayList<RateCalendarItem>();
		
		try {
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("01/Jan/2017"), "DLX", 15, 15000, 2475));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("02/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("03/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("04/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("05/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("06/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("07/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("08/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("09/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("10/Jan/2017"), "DLX", 15, 8000, 1320));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("11/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("12/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("13/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("14/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("15/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("16/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("17/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("18/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("19/Jan/2017"), "DLX", 15, 5000, 825));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("20/Jan/2017"), "DLX", 15, 5000, 825));
		
		
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("31/Mar/2017"), "DLX", 15, 5000, 825));
		
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("1/Apr/2017"), "DLX", 15, 4000, 660));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("2/Apr/2017"), "DLX", 15, 4000, 660));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("15/Apr/2017"), "DLX", 15, 4000, 660));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("29/Apr/2017"), "DLX", 15, 4000, 660));
		rateCalendarItems.add(new RateCalendarItem(Constants.df.parse("30/Apr/2017"), "DLX", 15, 4000, 660));
		
		
	} catch (ParseException e) {

		throw new CustomException("ParseException", "due to unexpected format of date");
	}
		
		return rateCalendarItems;

	}
	
	
}
