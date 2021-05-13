package Interview_Programs;

import java.util.Scanner;

public class Reversing_Integer {

	public static void main(String[] args) {
		//reverse a integer
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter a number you want to reverse");
			int num = s1.nextInt();
	      int rev = 0;

		    while(num != 0) {
		    
		      rev=rev*10 + num%10;  
		      num=num/10;
		
		    }

		    System.out.println("Reversed Number is : " + rev);
		    
		    // convert number ending with 0 in reverse
		    
		    Scanner s2 =new Scanner(System.in);
		    System.out.println("Enter a number ending with zero");
		  int a = s2.nextInt();
		  String b = Integer.toString(a);
		  String Temp="";
		for(int c=0; c<=b.length()-1;c++) {
			Temp= b.charAt(c) + Temp;
		}
		  System.out.println("Reverse number is :"+Temp);
	
		  
		    
		    
		  }
		
	} 


