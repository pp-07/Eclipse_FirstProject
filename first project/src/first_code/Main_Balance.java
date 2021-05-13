package first_code;

public class Main_Balance {

	public static void main(String[] args) {
		Balance_Check b1 = new Balance_Check(1000,9,"ramesh");
	
		b1.withdraw(100);
		b1.deposit(100);
		b1.withdraw(500);
		b1.deposit(100);

	}

}
