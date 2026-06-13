package com.AparchePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {
	public static void main (String[] args ) throws Exception{
		
		File src = new File ("C:\\Coforge BootCamp Automation Testing\\AparcheTestData\\AparcheTestData.xlsx\"");
		FileInputStream fis = new FileInputStream (src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is.." + data0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is.." + data1);
	}

}
