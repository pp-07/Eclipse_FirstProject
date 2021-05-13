package Constructor;

public class Constructor_Road_Toll {

	String Type;
	int Tirecount ;

	public void calculate_toll() {
		if (Tirecount == 2) {
			System.out.println("Car type is " + Type);
			System.out.println("Total amountis 0 Rs");
		} else if (Tirecount == 4) {
			System.out.println("Car type is " + Type);
			System.out.println("Total amountis 40 Rs");
		} else if (Tirecount > 4) {
			System.out.println("Car type is " + Type);
			System.out.println("Total amountis 70 Rs");
		} else {

			System.out.println("Incorrect Tire count");
		}

	}
	
	  public Constructor_Road_Toll (String a,int t) 
	  { this.Type=a;
	  this.Tirecount=t;
	  }
	 
}
