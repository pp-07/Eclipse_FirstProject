package first_code;

public class Balance_Check {
private long acno;
private String name;
private long acbalance;


public void withdraw(long amt) {
	if(amt>0) {
		acbalance = acbalance - amt;
		System.out.println("Witdraw amount is" + amt);
		System.out.println("Final balance of " + name +" is " + acbalance);
	} else {
		System.out.println("Cannot withdrwa negative amount"+ amt);
	}}
	public void deposit(long amt) {
		if(amt>0) {
			acbalance = acbalance + amt;
			System.out.println("deposit amount is" + amt);
			System.out.println("Final balance of " + name +" is " + acbalance);
		} else {
			System.out.println("Cannot deposit negative amount"+ amt);
		}
		
	}
	public Balance_Check (long acbalance, long acno,String name) {
		this.acbalance=acbalance;
		this.acno=acno;
	    this.name=name;
		
	}
}
