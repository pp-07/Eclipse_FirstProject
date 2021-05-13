package Maps;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Iterator;



public class HashMaps {

	public static void main(String[] args) {
var map =new TreeMap<String,Integer>();
map.put("a",208);
map.put("e",27);
map.put("d",29);
//map.put("a",202);
map.put("c",267);
map.put("b",207);
System.out.println(map);


Iterator it=map.values().iterator();	  //iterating on values
while(it.hasNext()) {
	System.out.println(it.next());
}
Iterator it1=map.keySet().iterator();	  //iterating on keys
while(it1.hasNext()) {
	System.out.println(it1.next());
}


System.out.println("\n");
for(String x:map.keySet()) {         //iterating by using advance for loop 
	System.out.println(x);
}
for(Integer y:map.values()) {
	System.out.println(y);
	}

for(Entry<String, Integer> e:map.entrySet()) {
	System.out.println(e);
	}


}
	
}
