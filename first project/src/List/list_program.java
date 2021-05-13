package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class list_program {

	public static void main(String[] args) {
		var arr = new LinkedList<Double>();
		arr.add(1.2);
		arr.add(1.3);
		arr.add(null);
		arr.add(25.0);
		arr.add(1, 2.5);
		System.out.println(arr);
		
		Double [] arr1= new Double[arr.size()];
		arr1=arr.toArray(arr1);
		
		
		
		
	
		
		/*
		 * System.out.println(arr.size()); System.out.println(arr);
		 * System.out.println(arr.pollFirst()); System.out.println(arr);
		 * System.out.println(arr.pollLast()); System.out.println(arr);
		 * 
		 */

		/*
		 * for(double x: arr) { System.out.println(x);
		 * 
		 * }
		 */
		
		ListIterator itr = arr.listIterator();
		while (itr.hasNext()) {
			if (itr.next() == null) {
				itr.set(12);
			}
		}

		System.out.println(arr);
	}

}
