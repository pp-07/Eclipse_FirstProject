package Excel_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_2d_array {
	
	public static Object [][] read() {
		File f1 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//Book1.xlsx");
	XSSFWorkbook wkbook;
	XSSFSheet sheet;
	Object [][] arr=new Object[0][0];
	
	
		try {
			FileInputStream execl=new FileInputStream(f1);
			wkbook=new XSSFWorkbook(execl);
			sheet=wkbook.getSheet("Sheet1");
			
			int start= sheet.getFirstRowNum();
			int end =sheet.getLastRowNum();
			arr=new Object [end-start+1][4];
			
			for (int i=start;i<= end ; i++) {
			
				arr[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][1] =sheet.getRow(i).getCell(1).getStringCellValue();
			    arr[i][2] =sheet.getRow(i).getCell(2).getNumericCellValue();
				arr[i][3] = sheet.getRow(i).getCell(3).getStringCellValue();
				
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	return arr;
		
		
		
		
		}
		
}
