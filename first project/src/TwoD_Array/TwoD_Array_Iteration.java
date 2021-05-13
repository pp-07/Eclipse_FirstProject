package TwoD_Array;

public class TwoD_Array_Iteration {

	public static void main(String[] args) {
Object [][] arr= {{1,2,3},{"ab","cs"},{1.2,"dwddqad",0.888888}
		};
for (Object[]  x:arr) {
	for (Object y: x ) {
		System.out.println(y + " ");
	}
	System.out.print("\n");
	}

}
}