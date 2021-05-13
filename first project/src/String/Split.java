package String;

public class Split {

	public static void main(String[] args) {
 String mix="prerak.patel@gmail.com";
 String [] name= mix.split("@");
 for(String x: name) {
	 System.out.println(x);
 }
 
System.out.println("  ");
 
String a = name[0];
String [] firstname = a.split("\\.");


String b = name[1];

String [] domainname = b.split("\\.");

String f1= firstname[0];
String f2= firstname[1];
String f3= domainname[0];
String f4= domainname[1];

System.out.println(f1);
System.out.println(f2);
System.out.println(f3);
System.out.println(f4);
System.out.println(" ");

//converting String in an array using split

String p ="abcdefghijkkk";
char[] arr1 =p.toCharArray();
for (char t:arr1) {
	System.out.println(t);
}





String [] x =p.split("");
x[0]="b"; 
String temp="";
int j=x.length-1;
for(int i= 0;i<=(x.length-1)/2;i++) {   //reverseing the array
		temp = x[i];
		x[i]=x[j];
		x[j]=temp;
	j--;
	
		}

for (String y:x) {
	System.out.println(y);
}
	}
}

	
