package Array;

public class Largest_Array_no {

	public static void main(String[] args) {
		int [] numbers= {1000,4,6,7,8,99,101,4,4,4,4,4,4,4,4,5,5,5,5,5,1001};
		
		int max= numbers[0];
		
		for(int i=0;i<=numbers.length-1;i++) {
			if ( numbers[i]> max) {
				max=numbers[i];
			
			}
					}
System.out.println(max);

	}

}
