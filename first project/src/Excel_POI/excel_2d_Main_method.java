package Excel_POI;

import java.io.IOException;

public class excel_2d_Main_method extends Data_2d_array{

	public static void main(String[] args) throws IOException {
		Object [][] arr2= read ();
		
		for (Object [] x :arr2) {
			for(Object  y: x) {
				
				
				System.out.println(y);
			}
			System.out.print("\n");
		}
		
		
	}


}
