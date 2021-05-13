package String;

public class Remove_Duplicate_Character_WithoutSet {

	public static void main(String[] args) {
String s = "java rt  hrtht r h  s";


String output="";


for (int i=0;i<=s.length()-1;i++) {
	char ch= s.charAt(i);
	
	if(output.indexOf(ch)==-1)  {
		 
			output=output + ch;
	}
	
	}
System.out.println(output);
}
	}