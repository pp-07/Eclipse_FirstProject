package Interview_Programs;

public class pattern_for_loop {

	public static void main(String[] args) {

		int c = 5;
		int num = 1;
		char ch= 'a' ;
		//for printing numbers without repetition 

//printing basic triangle 	
		for (int i = 0; i <= c; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				    //num = num + 1;     //for printing numbers without repetition  
				ch++;
			}
			System.out.print("\n");
		}
		System.out.println(" ");

		
		
//printing basic reverse triangle 
		for (int i = 0; i <= c; i++) {

			for (int j = c; j >=i; j--) {

				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println(" ");
		
		

//Printing  Pyramid 
		for (int i = 0; i <= c; i++) {

			for (int j = c; j >= i; j--) {

				System.out.print(" ");  //printing reverse basic triangle  with space 

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");   //printing basic triangle with star+space 
			}
			System.out.print("\n");  
		}

		System.out.println(" ");
		
		

//Printing Reverse Pyramid 
		for (int i = 0; i <= c; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" "); //printing basic traingle with space 

			}

			for (int j = c; j >= i; j--) {

				System.out.print("* ");   //printing reverse basic traingle with star+space 
			}
			System.out.print("\n");
		}
	}
}
