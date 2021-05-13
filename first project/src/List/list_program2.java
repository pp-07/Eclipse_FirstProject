package List;

import java.util.ArrayList;
import java.util.ListIterator;

public class list_program2 {

	public static void main(String[] args) {
		var list=new ArrayList<Integer>();
		list.add(1);
		list.add(25);
		list.add(38);
		list.add(99);
		list.add(101);
		System.out.println(list);
		
		Integer [] arr= new Integer[list.size()];
		arr= list.toArray(arr);
		
		for (int i=0;i<=list.size()-1;i++) {
			if (list.get(i)%2==1) {
				int a =list.get(i) +1 ;
				list.set(i, a);
				
			}
		}
		System.out.println(list);
		/*
		 * System.out.println(); ListIterator itr =list.listIterator();
		 * while(itr.hasNext()){ int i= (int) itr.next(); if(i% 2==1) { i++; itr.set(i);
		 * }
		 * 
		 * }
		 */
		 
		
		}
	}


