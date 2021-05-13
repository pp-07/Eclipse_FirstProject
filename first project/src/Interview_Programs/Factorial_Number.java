package Interview_Programs;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter a number ");
	int n = s1.nextInt();
	int f =1;
	for (int i=n; i>0;i--) {
		f=f*i;
	}
	System.out.println("Factorial of number is "+f);
	}

}
