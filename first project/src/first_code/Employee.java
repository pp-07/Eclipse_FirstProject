package first_code;

public class Employee {

	String name ="";
	int Id= 118;
	int Salary= 10000;
	
	public void bonus() {

		System.out.println( name + " will get bonus of Rs "+ Salary*0.30);
	
		
	}
		public void tax() {
			System.out.println(name + " will pay tax of Rs "+ Salary*0.10 +"\n" );
	
		}
	}


