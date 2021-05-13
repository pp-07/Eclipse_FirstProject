
package List;

import java.util.ArrayList;
import java.util.List;

public class Largest_number_List {

	public static void main(String[] args) {
	List<Integer> list= new ArrayList<Integer>();
	list.add(23);
	list.add(345);
	list.add(1);
	list.add(76);
System.out.println(list);

int max= list.get(0);
for (int i=0;i<=list.size()-1;i++) {
	if (list.get(i)>max) {
		max= list.get(i);
	}
}
System.out.println(max);
	
	}
}
