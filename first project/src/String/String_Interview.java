package String;

import java.util.HashMap;

public class String_Interview{

	public static void main(String[] args) {
	String s= "i love java and coding very much";
	 
	s=s.replaceAll(" ", "");  //remove all spaces 
System.out.println(s);



String x = "Love java";
String a= x.split(" ")[0];
String b= x.split(" ")[1];

StringBuilder sb = new StringBuilder (a);
  sb.reverse();
a= sb.toString();
System.out.println(a);

StringBuilder sb1 = new StringBuilder (b);
sb1.reverse();
b= sb1.toString();
System.out.println(b);


x= a+" "+b;
System.out.println(x);


	}

}
