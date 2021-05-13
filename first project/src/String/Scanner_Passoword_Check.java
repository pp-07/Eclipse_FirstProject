package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scanner_Passoword_Check {
	/*
	 * Must have at least one numeric character Must have at least one lowercase
	 * character Must have at least one uppercase character Must have at least one
	 * special symbol among @#$% Password length should be between 8 and 20
	 */

	public static void main(String[] args) {
		
	Scanner s1= new Scanner(System.in);
	System.out.println("Please enter a password");
	String pass= s1.nextLine();

	String patt= "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$" ; //positive lookahead--> ?=.* 
	
	
	
	
if(pass.matches(patt)) {
	System.out.println("Password is valid ");
}
else {
	System.out.println("Password is not valid");
} 


}

}

