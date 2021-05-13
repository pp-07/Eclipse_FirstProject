package Excel_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creating_Tables_Excel {

	public static void main(String[] args) {
		File f1 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//Book4.xlsx");
		XSSFWorkbook wkbook = new XSSFWorkbook();
		XSSFSheet sheet= wkbook.createSheet("Sheet1");
		
		Row r;
		Cell c;
		for (int i=0;i<=9;i++) {
			r= sheet.createRow(i);
			for(int j=0;j<=7;j++) {  //till which table u want
				c= r.createCell(j);
				c.setCellValue((i+1)*(j+1));
			}
		}

	try{
			FileOutputStream excel = new FileOutputStream(f1);
			wkbook.write(excel);
			excel.close();
			wkbook.close();
			
		}
		catch(IOException e){
			e.getMessage();
			
	}

}}
