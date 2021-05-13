package Polymorphism;

public class Main_Polymorphism {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.whoami();
		
		
		a= new Dog();  //a object has the ability to get into multiple forms ie. Polymorphism 
		a.whoami();      //all the methods should be same 
		
		a =new Cat();
		a.whoami();

	}

}
