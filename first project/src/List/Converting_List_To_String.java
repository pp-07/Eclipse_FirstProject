package List;

import java.util.ArrayList;


public class Converting_List_To_String {

	public static void main(String[] args) {
		var list =new ArrayList<String>();
		
list.add("i");
list.add("love");
list.add("my");
list.add("country");
list.add("yeah");
System.out.println(list);
String l= String.join(" ", list);
System.out.println(l);
String arr[]= new String[list.size()];

arr= list.toArray(arr);
for(String x: arr) {
	System.out.println(x);
}

	}

}
