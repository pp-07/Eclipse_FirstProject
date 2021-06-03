package Maps;

import java.awt.List;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NonRepeated_Characters_Map {

	public static void main(String[] args) {
	String s = "sillyspider";
	char[] arr=s.toCharArray();
	var hmap=new LinkedHashMap<Character,Integer>();
	
	 for (int i=0;i<=arr.length-1;i++) {
		if (hmap.containsKey(arr[i])==false) {
			hmap.put(arr[i], 1);
		} 
		else { int oldvalue =hmap.get(arr[i]);
		       int newvalue = oldvalue +1 ;
		       hmap.put(arr[i], newvalue);
			
		}
		
	
	}
	for (Entry<Character,Integer> x:hmap.entrySet()) {
		if (x.getValue()==1) {
			
			System.out.println(x.getKey());
			System.out.println(x);
		}
	
		
	}
	


	}

}
