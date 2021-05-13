package File_IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Duplicate_Words {

	public static void main(String[] args) throws IOException {
		File f2 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//f2.txt");

		
	
String str1 = FileUtils.readFileToString(f2, "UTF-8");
		
		str1 = str1.replaceAll("\n","");
		System.out.println(str1);
		System.out.println("**************************************************************************************");
		
		String [] arr = str1.split(" ");
		for (String y:arr) {
			
			System.out.println(y);
		}
		System.out.println("***************************************");
		String str2 = "";
		
		/*
		 * for (String x : arr) { if (!str2.contains(x) && x.trim()!="") { str2 = str2 +
		 * " " + x; } } System.out.println(str2); FileUtils.write(f2,
		 * str2,"UTF-8",false);
		 */
		
}

}
