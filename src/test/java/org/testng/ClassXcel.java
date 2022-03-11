package org.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ClassXcel {

	public static  void getExcel() throws FileNotFoundException {

		File f=new File("C:\\Users\\New PC\\eclipse-workspace\\mavetng\\src\\test\\resources\\ClassXcel.xlsx");
		FileInputStream fi=new FileInputStream(f);
//        Workbook w=new XSSFWorkbook(fi);		
//		Sheet s = w.getSheet("loginData");
//		Row r = s.getRow(0);
//		
//		int numberOfRows = s.getPhysicalNumberOfRows();
//		int numberOfCells = r.getPhysicalNumberOfCells();
//		
//		
		
	}
	
	
	
}
