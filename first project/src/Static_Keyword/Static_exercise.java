package Static_Keyword;

public class Static_exercise {

	static int a =12;
	public static  void print() {
		System.out.println(a);
		
	}
	static  {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
	//System.out.println(a); directly using the static variable in same class
	//print();     directly using method in the same class 
  
	}

}
