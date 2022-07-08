package com.datadriven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\DELL\\Documents\\write.xlsx");
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook();
	Sheet createsheet = wb.createSheet("Studentinfo");
	Row createRow = createsheet.createRow(0);
	Cell createcell = createRow.createCell(0);
	createcell.setCellValue("stuname");
	
	
	Cell createcell1 = createRow.createCell(1);
	createcell1.setCellValue("age");
	
	wb.getSheet("Studentinfo").createRow(1);
	wb.getSheet("Studentinfo").createRow(2);
	wb.getSheet("Studentinfo").createRow(3)
	
	
	
	wb.getSheet("Studentinfo").getRow(1).createCell(0).setCellValue("kumar");
	wb.getSheet("Studentinfo").getRow(1).createCell(1).setCellValue("16");
	
	wb.getSheet("Studentinfo").getRow(2).createCell(0).setCellValue("kannan");
	wb.getSheet("Studentinfo").getRow(2).createCell(1).setCellValue("18");
	
	wb.getSheet("Studentinfo").getRow(3).createCell(0).setCellValue("sankar");
	wb.getSheet("Studentinfo").getRow(3).createCell(1).setCellValue("17");
	
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	 System.out.println("finished");
	
	
	
	
	
}
}
