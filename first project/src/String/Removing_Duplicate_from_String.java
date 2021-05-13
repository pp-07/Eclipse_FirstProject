package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removing_Duplicate_from_String {

	public static void main(String[] args) {
String s = "i love my country i country love";

String Arr[] = s.split(" "); //converting String to array bu using split
var hset= new LinkedHashSet<String>();
for(String x:Arr) {
	hset.add(x);   //adding elements to linked hashset
} 
System.out.println(hset); //hashset without duplicates 
s=String.join(" ", hset); //converting haset to String 
System.out.println(s);


	}

}
