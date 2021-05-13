package TwoD_Array;

public class two_D_array_exercise {

	public static void main(String[] args) {
	int [] [] arr = new int [6][10];
	for (int i=1;i<=6;i++) {
		for(int j=1;j<=10;j++) {
			arr[i-1][j-1]= i*j;
		}
		
	}
	for (int[] x: arr) {
		for (int y:x) {
			System.out.println(y);
		}
		System.out.println("----------------------------------");
	}
	

	}

}
