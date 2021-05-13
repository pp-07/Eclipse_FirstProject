package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array_to_List {

	public static void main(String[] args) {
		//For String Array
		String [] arr = { "9","2","5","8" };
		
		//method to convert String array to list
		List<String> list = new ArrayList<String>(arr.length);
		for (String x : arr) {
		 list.add(x);
		}
		
		//Sorting using directly the collection method 
		Collections.sort(list);
	    System.out.println(list);
	    Collections.sort(list, Collections.reverseOrder());
	    System.out.println(list);
	    
	    //For Integer Array to list
	    int[] arr1= {21,45,6,78,899,87};
	    List<Integer> list1= new ArrayList<Integer>(arr1.length);
	    for(int a: arr1) {
	    	list1.add(a);
	    }
		
		  Collections.sort(list1); System.out.println(list1);
		 
	         System.out.println( list.equals(list1));
	    
	  
	    }
	  
	    
}

