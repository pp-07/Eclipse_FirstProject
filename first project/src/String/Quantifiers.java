package String;



public class Quantifiers {

	public static void main(String[] args) {
		String patt="abc{3,}";
		String str1="abccc";
	System.out.println(str1.matches(patt));
	
         //System.out.println(patt.equals(str1));	
         //Or regex
	
	
	
	String pattt="ab(a|b|%|^|$|$|$|$)?";
	
	String str2="ab";
	String p3= "abg.";
	System.out.println(str2.matches(p3));
	
	System.out.println(str2.matches(pattt));
	String p="abc+";
	String str3="ab";
	System.out.println(str3.matches(p));
	}
	
}
