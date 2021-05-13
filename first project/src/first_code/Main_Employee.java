package first_code;

public class Main_Employee {

	public static void main(String[] args) {
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		
		E1.name="Janhavi";
		E1.Salary=1200000;
		E1.bonus();
	    E1.tax();
		
		
		E2.name="Palash";
		E2.Salary=10000;
		E2.bonus();
		E2.tax();
		
	
		
}

}
