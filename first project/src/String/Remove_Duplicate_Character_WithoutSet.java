package String;

public class Remove_Duplicate_Character_WithoutSet {

	public static void main(String[] args) {
String s = "javahhhhs";


String output="";


for (int i=0;i<=s.length()-1;i++) {
	char ch= s.charAt(i);

	
	if(output.indexOf(ch)==-1)  {
		 
			output=output + ch;
	}else {
		System.out.println(s.charAt(i)); //repeated characters
	}
	
	}
System.out.println(output);
}
	}