package Array;

import java.util.Arrays;
import java.util.Collections;

public class Array_Descending {

	public static void main(String[] args) {

		Integer [] arr = { 9,2,5,8 };
		//Arrays.sort(arr, Collections.reverseOrder());  (using direct aarays class.. no neend for below code )
		int temp = 0;
		int[] arr1= { 9,2,5,8 };

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i +1; j <= arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;       //for swapping the i and j element 

				} //System.out.println(arr[i]); 
			
				
			}
		
		
		

	 }
		for (int x:arr) {
				System.out.println(x);
	}
		System.out.println(arr1.equals(arr));
	
	}}
