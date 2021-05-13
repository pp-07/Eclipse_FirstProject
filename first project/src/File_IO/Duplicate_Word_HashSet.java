package File_IO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.commons.io.FileUtils;



public class Duplicate_Word_HashSet {
	public static void main(String[] args) throws IOException {
		File f2 = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//f2.txt");

		
	
String str1 = FileUtils.readFileToString(f2, "UTF-8");
		
	System.out.println(str1);
String [] arr= str1.split(" ");
	
	LinkedHashSet<String> set =new LinkedHashSet<String> ();
	for (String x :arr) {
		set.add(x);
	}
	System.out.println(set);
     FileUtils.write(f2,"","UTF-8" ,false);
     
     for (String Y : set) {
    	 FileUtils.write(f2,Y+" ","UTF-8" ,true); 
    	 
 		
 	}
	
	
	}
}
