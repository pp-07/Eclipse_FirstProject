package Interview_ConceptBased;

import java.util.Arrays;

public class StringFirstNumbaerthenZeros {

	public static void main(String[] args) {
	String a= "102040050000";
	String num="";
	String zero="";
	for(int i =0; i<=a.length()-1;i++) {
		if (a.charAt(i) != '0') {
			num = num + a.charAt(i);
		}else {
			zero=zero+ a.charAt(i);
		}
	}
	
	System.out.println(num);
	System.out.println(zero);
	String  op= num+zero;
	System.out.println(op);
	
	
	int [] arr= {1,0,0,0,2,3,4,0,6,0,8,0};
	int zerocount=0;
	for (int i=0;i<=a.length()-1;i++) {
		if(arr[i]==0) {
			zerocount++;
			//System.out.println(zerocount);
		}
		else if (zerocount> 0) {
			System.out.println(zerocount);
			int temp =arr[i];
			arr[i]= 0;
			arr[i-zerocount]=temp;
			
		}
	}
	
System.out.println(Arrays.toString(arr));   //Arrays.asList will convert arr into list
	
	
	}

}
