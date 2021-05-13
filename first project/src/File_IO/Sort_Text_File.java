package File_IO;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;



public class Sort_Text_File {

	public static void main(String[] args) throws IOException {
		File f= new File ("C:\\Users\\PRERAK PATEL\\Dropbox\\My PC (LAPTOP-1GOPOLA3)\\Desktop\\Java Selenium\\f2.txt");
		
		List <String> l = FileUtils.readLines(f,"UTF-8");
		Collections.sort(l);
		FileUtils.write(f, " ", "UTF-8", false);
		
		for (String x:l) {
			FileUtils.write(f, x +"\n", "UTF-8", true);
			System.out.println(x);
		}
	}

}
