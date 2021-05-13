package List;

import java.util.ArrayList;
import java.util.HashSet;

public class Removing_Duplicate_from_ArrayList {

	public static void main(String[] args) {
	var list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(2);
	list.add(2);
	list.add(5);
	list.add(6);
	list.add(7);
	
	
	System.out.println(list);
	
	HashSet<Integer> set=new HashSet<Integer>(); //converting arraylist to hashset
	set.addAll(list);
System.out.println(set);

list.clear();     //removing all elements from the list
list.addAll(set); //adding the unique values of hashset in array list
System.out.println(list);
list.add(23);
System.out.println(list);


	}

}
