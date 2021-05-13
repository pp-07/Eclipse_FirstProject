package String;

public class String_Replace {

	public static void main(String[] args) {
		
String a = "I lo#@2@@#$%%%^^&%^^^(*((^&%^7474% uou7 12131434";
String patt="[^A-Za-z]";
System.out.println(patt);
System.out.println(a.replaceAll(patt,"")); 
StringBuilder sb1=new StringBuilder("i love uyour fish");
sb1.append("hello");
System.out.println(sb1);
sb1.delete(0, 1);
System.out.println(sb1);
sb1.replace(0, 5, "okay");
	System.out.println(sb1);
sb1.reverse();
System.out.print(sb1);
}}
