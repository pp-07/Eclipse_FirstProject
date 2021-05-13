package Interface;

public class Main_Interface{

	public static void main(String[] args) {
	
		Class1 ic1 = new Class1();
		
	ic1.method1();
	ic1.method2();
	ic1.method3();
	ic1.method5();           //overriden default  method 
	Interface2.method4();   //we can directly call the static method of interface using the interface name . no need to create any object for it 
   


	
	
	
	}

	

}
