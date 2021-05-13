package Interview_Programs;

public class recursive_1_to_100 {
	
	public void print(int n) {
	if (n<=100) {
		System.out.println(n);
		n++;
		print(n);
	}
		
	}
	

	public static void main(String[] args) {
		recursive_1_to_100 obj =new recursive_1_to_100();
		obj.print(1);
	}

}
