package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_equals_check {

	public static void main(String[] args) {
	List <Integer> l1= new ArrayList <Integer>();
	
	l1.add(12);
	l1.add(34);
	l1.add(45);
	l1.add(2);
	
	List <Integer> l2= new ArrayList <Integer>();
	
	l2.add(2);
	l2.add(12);
	l2.add(34);
	l2.add(45);
	
	System.out.println(l1.equals(l2));

	}

}
