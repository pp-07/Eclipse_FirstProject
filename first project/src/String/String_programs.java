package String;



public class String_programs {
	public static void main(String[] args) {
		//Reverse String 
	String  abc="ABCDE";
	String temp = " " ;
	
	for (int i =0; i<=abc.length()-1;i++ ){
		temp= abc.charAt(i) +temp ;
	}
	System.out.println(temp);
	//System.out.println(abc.length());
	
StringBuilder sb =new StringBuilder("LMNOP"); //using StringBuilder Class to reverse directly 

sb.reverse();
sb.deleteCharAt(1);

System.out.println(sb.substring(0,2));
System.out.println(sb);

//regEX
String a=  "@#$%&*&^%&***%^*()_+()abc";
String b="[^a-z A-Z 0-9]";
String c= a.replaceAll(b,"");
System.out.println(c);

//int to String conversion 
int no = 100;
String number = Integer.toString(no);
System.out.println(number.charAt(0));

//string to int conversion 
String num2 = "122";
int no2 = Integer.parseInt(num2);
double no3= Double.parseDouble(num2);
System.out.println(no2);

//concat String 
String s="hello";
System.out.println(s.concat(" hi"));
System.out.println(s.toUpperCase());
System.out.println(s.isEmpty());
System.out.println(s.contains("lo"));
System.out.println(s.charAt(2));
System.out.println(s.substring(0,3));
System.out.println(s.equalsIgnoreCase("HELLO"));




//try catch, multiple catch blocks 

try {
Integer y = Integer.parseInt(s);
System.out.println(y);
}
catch(ArithmeticException e) {
	System.out.println(e.getMessage());
	System.out.println("arithmetic error");
	
	}
catch (Exception e) {
	e.printStackTrace();
	System.out.println("exception");
}
finally {
	System.out.println("sab moh maya hai");            
}

String l= "AbCd";
String ll ="abcd";
System.out.println(l.equalsIgnoreCase(ll));

for (int i=0,j=0;i<1;++i,j++) {
	
	System.out.println(i +"jjj" +j);
}


  


}
}

