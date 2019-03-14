package com.maximojo.hiring.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.maximojo.hiring.exception.CustomException;
import com.maximojo.hiring.model.RateCalendarItem;

//This class reads data from excelsheet for using it in code (currently not in use)
public class ExcelReader {
	
	public static ArrayList<RateCalendarItem> populateFromExcel() throws CustomException{	
	
	ArrayList<RateCalendarItem> rateCalendarItemsList=new ArrayList<RateCalendarItem>();
	try {
		//import file
		FileInputStream fis = new FileInputStream(Constants.SAMPLE_XLSX_FILE_PATH);
		
		//create workbook
		Workbook workbook = new XSSFWorkbook(fis);
		
		//create sheet
		Sheet sheet=workbook.getSheetAt(0);
		
		//creating rowIterator
        Iterator rowIterator = sheet.iterator();
        
        while(rowIterator.hasNext()) {
        	RateCalendarItem rateCalendarItem=new RateCalendarItem();
        	Row row =(Row) rowIterator.next();
        	
        	//creating cell iterator
        	Iterator cellIterator = row.cellIterator();
        	
        	while(cellIterator.hasNext()) {
        		Cell cell = (Cell) cellIterator.next();
        		if (cell.getColumnIndex()==0) {
        			rateCalendarItem.setStayDate(Constants.df.parse(cell.getStringCellValue()));
        		}
        		else if(cell.getColumnIndex()==1) {
        			rateCalendarItem.setRoomTypeId(cell.getStringCellValue());
        		}
        		else if(cell.getColumnIndex()==2) {
        			rateCalendarItem.setAvailableRooms((int) cell.getNumericCellValue());
        		}
        		else if(cell.getColumnIndex()==3) {
        			rateCalendarItem.setRoomAmount((int) cell.getNumericCellValue());
        		}
        		else if(cell.getColumnIndex()==4) {
        			rateCalendarItem.setTaxAmount((int) cell.getNumericCellValue());
        		}	
        	}	
        	
        	rateCalendarItemsList.add(rateCalendarItem);
        }
        
        fis.close();
	}
	 catch (FileNotFoundException e) {
         throw new CustomException("FileNotFoundException ", " excel input file not found");
     } catch (IOException e1) {
    	 throw new CustomException("IOException ", " unable to read file stream");
     }
	catch (ParseException e) {
    	 throw new CustomException("ParseException ", " emproper date format");
	}
	return rateCalendarItemsList;
}
}
