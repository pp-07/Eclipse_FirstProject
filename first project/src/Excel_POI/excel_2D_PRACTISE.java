package Excel_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_2D_PRACTISE {

	public static void main(String[] args) throws IOException {
	File f= new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//Book2.xlsx");
	
	                       
	XSSFWorkbook wkbook;
	XSSFSheet   sheet;
	
	Object [][] arr = new Object[0][0];
	FileInputStream excel =new FileInputStream(f);
	wkbook= new XSSFWorkbook(excel);
	sheet =wkbook.getSheet("Sheet1");
	
	int start = sheet.getFirstRowNum();
	int end =sheet.getLastRowNum();
	 int noc=3;
     arr = new Object[end-start +1][noc];
    
    for (int i =start;i<=end;i++) {
    	for(int j=0;j<=noc-1;j++) {   //if data type is same we can use 2 for loops 
    		arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
        	
    	}
    	
  }
	

	for (Object[] x :arr) {
		for(Object y: x) {
			
			
			System.out.println(y);
		}
		System.out.print("\n");
	}
	
	}

}
