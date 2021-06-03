package Maps;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Hashmap_1 {

	public static void main(String[] args) {
		//HashMap<String,Integer> hmap1 =new HashMap<String,Integer>();  //convential method to initialize a list/map/array
		
		var hmap= new HashMap<Integer,String>();
		hmap.put(1, "Prerak ");
		hmap.put(2, "Aniket");
		hmap.put(3, "Kevin");
		hmap.put(4, "Ankur");
		hmap.put(5, "Mitesh");
		
		
		Iterator it =hmap.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	System.out.println(" ");	
hmap.put(4, "Karen");
System.out.println(" ");	

Iterator it1=hmap.keySet().iterator();
while(it1.hasNext()) {
	System.out.println(it1.next());
}
System.out.println(" ");
Iterator it2=hmap.entrySet().iterator();
while(it2.hasNext()) {
	System.out.println(it2.next());	
		
	}

var hmap1= new HashMap<Integer,String>();
hmap1.put(1, "Prerak ");
hmap1.put(2, "Prashant");
hmap1.put(3, "Kevin");
hmap1.put(4, "Sanchit");
hmap1.put(5, "Mitesh"); 
 


var sethmap=hmap.values();   //converting from hashmap to set 
var sethmap1=hmap1.values();
System.out.println(sethmap);
System.out.println(sethmap1);

sethmap.retainAll(sethmap1);
System.out.println(sethmap);  //gives the intersection ie common elements 
/*
 * sethmap.removeAll(sethmap1); //gives the unique elements
 * System.out.println(sethmap);
 */

var list1= new ArrayList<String>();  //converting set to arraylist
list1.addAll(sethmap);
System.out.println(list1);

//reversin the list
for (int i=list1.size()-1;i<=list1.size()-1;i--) {
	if(i>=0) { 
	System.out.println(list1.get(i));
	}
}

}}
