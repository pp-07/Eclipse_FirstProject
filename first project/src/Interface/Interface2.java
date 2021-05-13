package Interface;

public interface Interface2 extends Interface1  { //Interface extending another interface will not force to add the interface 1 methods)
	void method2();
	
	
	//Interface can have methods other than abstract (static and default) 
   static void method4() {
		System.out.println("static method 4 from interface2");
		
	} 
    default void method5() {
	System.out.println(" method5 from interface2 ");
	
	

}

}
