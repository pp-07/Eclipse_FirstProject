package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_to_Array {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(209);
		list.add(345);
		list.add(32);
		list.add(45);
		list.set(1, 347);
		 System.out.println(list);

	

		int[] arr = new int[(list.size())];
		for (int i = 0; i <= list.size() - 1; i++) {  	// converting list to aaray without using .toArray method
			arr[i] = list.get(i);
		}

		for (int x : arr) {
			System.out.println(x);
		}
System.out.println("  ");
		
		Integer[] arr1 = new Integer[list.size()];
		arr1 = list.toArray(arr1);                    //converting list to array using .toArray method
		for (int y : arr1) {
			System.out.println(y);
		}
		
System.out.println("  ");
		
		// sorting the array
		Arrays.sort(arr);
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println(arr.equals(arr1));

	}
}
