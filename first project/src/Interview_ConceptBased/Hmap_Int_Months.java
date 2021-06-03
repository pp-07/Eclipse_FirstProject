package Interview_ConceptBased;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Hmap_Int_Months {

	
	
	
	
	public void method1(int p) {
		HashMap<Integer,String> hmap= new HashMap<Integer,String> ();
		int a;
		int b;
		int c;
		int d;
		Random r1= new Random();
for (int l =0;l<=10;l++) {
	System.out.println(r1.nextInt(10)); //random numbers print 
}
		for (int i =1 ;i<=1;i++) {
			
			 a = r1.nextInt(7);

				hmap.put(a, "January");			
}
	
		
		for (int i =1 ;i<=1;i++) {
			
			 b = r1.nextInt(7);
			 hmap.put(b,"Febuary");
							
}
		for (int i =1 ;i<=1;i++) {
			
			 c= r1.nextInt(7);
				hmap.put(c, "June");
							
}
		for (int i =1 ;i<=1;i++) {
			
			 d= r1.nextInt(7);
			 hmap.put(d,"July");
							
}

		Iterator it = hmap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		 if(hmap.containsKey(p)) {
					System.out.println(hmap.get(p));
				}
			 else if (hmap.containsKey(p)==false&& p<=6) {System.out.println("No luck");
				 
			 }else {
				 System.out.println("Enter no from 0 to 6 only");
			 }			 
			 }
			 } 
		

		
	


		
		

