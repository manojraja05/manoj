package com.datadriven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Read_Excel {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\DELL\\Documents\\write.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.getRow(0);
	Cell cell = row.getCell(1);
	CellType cellType = cell.getCellType();
	if(cellType.equals(cellType.STRING)) {
		String stringCellValue = cell.getStringCellValue();
		
		System.out.println("String:"+stringCellValue);
	}
	
	else if (cellType.equals(cellType.NUMERIC)) {
		
		double numericCellValue = cell.getNumericCellValue();
		
		System.out.println("number:" +numericCellValue);
		
	}
	
	
	int size = sheetAt.getPhysicalNumberOfRows();
	
	for (int i = 0; i < size; i++) {
		Row rownumber = sheetAt.getRow(i);
    	int cellcount = rownumber.getPhysicalNumberOfCells();
    	 
    	for (int j = 0; j < cellcount; j++) {
    		Cell cell2 = rownumber.getCell(j);
    		String stringCellValue = cell2.getStringCellValue();
    		System.out.println(stringCellValue);
    		
			
		}
    	
    	System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
