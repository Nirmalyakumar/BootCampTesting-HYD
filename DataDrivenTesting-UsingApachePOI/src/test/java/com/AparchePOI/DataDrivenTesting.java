package com.AparchePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenTesting {
String apacheUrl = "\"C:\\Coforge BootCamp Automation Testing\\AparcheTestData\\AparcheTestData.xlsx\"";
	
	
	@Test
	public void setUp() throws Exception
	{
		File src = new File(apacheUrl);
		FileInputStream file = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data0 : " +data0);
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data1 : "+data1);	
		wb.close();	
	}
}