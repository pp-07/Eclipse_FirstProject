package File_IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Text_file {

	public static void main(String[] args) throws IOException {
		File f = new File ("C://Users//PRERAK PATEL//Dropbox//My PC (LAPTOP-1GOPOLA3)//Desktop//Java Selenium//test.txt");
		try {
			String x = FileUtils.readFileToString(f,"UTF-8");
			System.out.println(x);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	FileUtils.write(f, "pay rs 10009898 rs to view your file", "UTF-8",false);
		

	}

}
