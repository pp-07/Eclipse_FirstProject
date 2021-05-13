package List;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		var list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		System.out.println(list);
		for (Double x : list) {
			System.out.println(x);
		}
		Double first = list.get(0);
		System.out.println("the no is" + first);
		
		for(int i=list.size()-1; i<=list.size()-1;i--) {
			if(i>=0) {
		System.out.println(list.get(i));
			}
			
		}

		
		 System.out.println(" ");
		 ListIterator itr =list.listIterator();
		  while(itr.hasNext()){System.out.println(itr.next());}
		  
		  System.out.println(" ");
		  ListIterator itr2 =list.listIterator(list.size());
		  
		  while(itr2.hasPrevious()){System.out.println(itr2.previous());}
		 

	}

}
