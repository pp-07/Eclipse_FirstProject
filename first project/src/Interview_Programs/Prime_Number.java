package Interview_Programs;

public class Prime_Number {

	public static void main(String[] args) {
//Concating two Integers

		int a = 23;
		int b = 43;
		String c = Integer.toString(a);
		String d = Integer.toString(b);
		String e = c + d;
		int f = Integer.parseInt(e);
		System.out.println(f);

// Finding the odd number

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 18, 19 };
		for (int x : num) {
			if (x % 2 != 0) {
				System.out.println(x + " is a odd number");
			}

		}
		System.out.println("  ");
//Prime number 
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 18, 19 ,20,77,99,45,56,67,78,71,97};
		
		for (int i=0;i<=num1.length-1;i++) {
			boolean isprime =true;
			if(num1[i]==1) {
				continue;
			}
			for (int j=2 ;j<num1[i];j++) {
				if (num1[i]%j==0) {
					isprime=false;
					break;
				}
				}
			
				if(isprime=true) {
					System.out.println(num1[i]+ " is prime number");
				}
				}
		
		
			}
			
		}



