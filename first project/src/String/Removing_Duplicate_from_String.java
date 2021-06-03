package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removing_Duplicate_from_String {

	public static void main(String[] args) {

String j ="java";
char arr[]= j.toCharArray(); //converting string to char array 
LinkedHashSet<Character> hset1 = new LinkedHashSet<Character>(); //convert the char arr into linked hashset 
for (char y:arr) {
	hset1.add(y);
	
}
System.out.println(hset1);   //hashset without duplicates 
StringBuilder sb = new StringBuilder();
for (char a: hset1) {
	sb.append(a);
	
}
j= sb.toString();
System.out.println(j);


String s = "i love my country i country love";

String Arr[] = s.split(" "); //converting String to array  using split
var hset= new LinkedHashSet<String>();
for(String x:Arr) {
	hset.add(x);   //adding elements to linked hashset
} 
System.out.println(hset); //hashset without duplicates 
s=String.join(" ", hset); //converting haset to String 
System.out.println(s);


	}

}
