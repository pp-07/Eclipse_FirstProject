package first_code;

import java.util.Scanner;

public class Sacn_Input {

	public static void main(String[] args) {
		
 Scanner  s1= new Scanner(System.in);
 System.out.println("Enter a string");
 var ab= s1.nextLine();
 String temp=" ";
	/*
	 * System.out.println("Enter a number"); int a = s1.nextInt();
	 */ 
 for(int i=0;i<=ab.length()-1;i++) {
	 temp= ab.charAt(i) + temp;
	
 }
 System.out.println(temp);
	}

}
