package Interview_Programs;

public class Fibonacii_Recursion {
	static int a =0;
	static int b=1;
    int c;
   public  void fibo(int i) {
	   if(i<=8) {
		   c=a+b;
		   System.out.print(" " +c);
		   a=b;
		   b=c;
		   i++;
		   fibo(i);
	   }
	   
    	
    }
    
	public static void main(String[] args) {
		System.out.print(a+ " "+ b);
		 Fibonacii_Recursion obj=new  Fibonacii_Recursion();
		 
                  obj.fibo(1);
	}

}
