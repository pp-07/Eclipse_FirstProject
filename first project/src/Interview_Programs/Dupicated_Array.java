package Interview_Programs;

public class Dupicated_Array {
//sorted 
	public static void main(String[] args) {
		int a[]= {1,2,2,2,3,4,5,6,6,6,7,8,8};
		int temp [] = new int	[a.length];
		
		int j =0;
		for (int i=0;i< a.length-1;i++) {
			if (a[i] != a[i+1]) {
				temp[j]= a[i];
				j++;
				
			}else {
				System.out.println("duplicate charcater "+ a[i] );
			}
		}
		temp[j] =a[a.length-1];
		for (int x: temp) {
			System.out.println(x);
		}

	}

}
