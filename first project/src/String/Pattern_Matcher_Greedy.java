package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Matcher_Greedy {

	public static void main(String[] args) {
		
		  String
		  str1="your bill is $67.98 after discount your it is $$$89.9 bill and your tax is $78.90 bill  ";
		  String patt= "\\W{1}\\d{1,}\\.\\d{1,}"; // W is used for special character
		  //String patt="your.*?bill";
		  
		  Pattern p = Pattern.compile(patt); 
		  Matcher m = p.matcher(str1);
		  while(m.find())
		  { 
			  System.out.println(m.group()); 
			  }
		 
        try {	String str2="XXhdiuhiYYuhiuhiuhiXXihiuhiuYYhihXXoihoihoihYY";
        String pat= "XX.*?YY"; //non greedy match, for greedy match use .* only
        
        Pattern p1 = Pattern.compile(pat);
        Matcher m1 = p1.matcher(str2);
        System.out.println(m1.results().count()); //gives how many count are there for matches 
        m1.reset();   //we need to rest as pointer is at end of the last match 
        while(m1.find()) {
        System.out.println(m1.group());}
        }
			
		
        catch (Exception e) {
		System.out.println("pattern not matching");
		}	
    	
        
}}
