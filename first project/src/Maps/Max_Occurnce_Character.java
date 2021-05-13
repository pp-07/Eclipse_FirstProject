package Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Max_Occurnce_Character {

	public static void main(String[] args) {
		String s = "ssillyspider";
		char[] arr=s.toCharArray();
		var hmap=new LinkedHashMap<Character,Integer>();
		int i=0;
		while (i <=arr.length-1) {
			if (hmap.containsKey(arr[i])==false) {
				hmap.put(arr[i], 1);
			} 
			else { int oldvalue =hmap.get(arr[i]);
			       int newvalue = oldvalue +1 ;
			       hmap.put(arr[i], newvalue);
				
			}
			i++;
		
		}
		char maxkey= ' ';
		int maxvalue = 0;
		for (Entry<Character,Integer> x:hmap.entrySet()) {
			if (x.getValue()>maxvalue) {
				maxvalue=x.getValue();
				maxkey=x.getKey();
			}
		}
			System.out.println(maxvalue + "  "+ maxkey);
		}
		
		
		
		
	}


