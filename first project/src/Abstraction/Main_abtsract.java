package Abstraction;

public class Main_abtsract {

	public static void main(String[] args) {
		Moblie_Abtract a;
		
		a= new Ios();    //we can see polymorphism here object a has multiple forms 
		a.click();
		
		a= new Android();
		a.click();
	
	

	    
	}

}
