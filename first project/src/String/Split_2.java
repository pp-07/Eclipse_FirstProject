package String;

public class Split_2 {

	public static void main(String[] args) {
		String a = "patel.prerak@gamil.com";
String a1= a.split("@")[0];
String a2= a.split("@")[1];


 String lname= a1.split("\\.")[0];
 String fname=a1.split("\\.")[1];
 System.out.println(lname);
 System.out.println(fname);
 
String email= a2.split("\\.")[0];
 String domain=a2.split("\\.")[1];
System.out.println(email);
System.out.println(domain);


//interview iss question 
int arr [] ={1,2,3,4,5};


for (int i=0 ;i<=arr.length-1; i++){
for (int j=0; j<=arr.length-1;j++){

if (!(i==j)&&(arr[i] + arr[j]) == 6){
System.out.println(arr[i]+ " "+arr[j]);

	}

}}}}
