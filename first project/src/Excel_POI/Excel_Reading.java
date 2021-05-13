package Excel_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reading {

	public static void main(String[] args) {
		File f1 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//Book1.xlsx");
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		
		
			try {
				FileInputStream execl=new FileInputStream(f1);
				wkbook=new XSSFWorkbook(execl);
				sheet=wkbook.getSheet("Sheet1");
				System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
				
				int start= sheet.getFirstRowNum();
				int end =sheet.getLastRowNum();
				for (int i=start;i<= end ; i++) {
					System.out.print(sheet.getRow(i).getCell(0).getStringCellValue()+"\t");
					System.out.print(sheet.getRow(i).getCell(1).getStringCellValue()+"\t");
					System.out.print(sheet.getRow(i).getCell(2).getNumericCellValue()+"\t");
					System.out.println(sheet.getRow(i).getCell(3).getStringCellValue()+"\t");
					
				}
				
			} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		
		
		

	}

}
