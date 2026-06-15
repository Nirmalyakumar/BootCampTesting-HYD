package DataDrivenTesting_UsingApachePOI.DataDrivenTesting_UsingApachePOI;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class AppTest {
String apacheUrl = "\"C:\\Coforge BootCamp Automation Testing\\AparcheTestData\\AparcheTestData.xlsx\"";

@Test
public void setUp() throws Exception {
	File src = new File(apacheUrl);
	FileInputStream file = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	System.out.println("UserName                Password" );
	for(int i=0;i<6;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(sheet1.getRow(i).getCell(j).getStringCellValue());
			System.out.print("       ");
		}
		System.out.println();
	}
	wb.close();
	}
}
