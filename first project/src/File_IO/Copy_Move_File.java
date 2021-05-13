package File_IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Copy_Move_File {

	public static void main(String[] args) throws IOException {
		File f1 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//f1.txt");
		File f4 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//f4.txt");
		File f3 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//f3.txt");
		File d1 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//d1");
		File d2 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//d2");
		
		
		FileUtils.copyFile(f1, f3);  //content of f1 overrides f3 
		FileUtils.write(f3, "f3", "UTF-8", false);
		FileUtils.copyFileToDirectory(f3, d2);  //f3 is copied to d2 folder 
		FileUtils.moveFile(f1, f4);   //f4 gets created with content of f1 and f1 gets deleted
		
	}

}
