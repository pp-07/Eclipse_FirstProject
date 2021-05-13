package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Reverse_List {

	public static void main(String[] args) {
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(1);
list.add(34);
list.add(13);
list.add(23);
Collections.sort(list);
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);

int temp=0;
int j= list.size()-1;
for (int i=0;i<=(list.size()-1)/2;i++) {
	temp= list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
    j--;
}
Iterator it1= list.listIterator();
while(it1.hasNext()) {
	System.out.println(it1.next());
}

	}

}
