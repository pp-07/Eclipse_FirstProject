package Maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class Duplicate_Characters_Map {

	public static void main(String[] args) {
		String s = "abbbbccsddfeeee";
		char y[] = s.toCharArray();  //converting String to array

		var hmap = new HashMap<Character, Integer>();
		int i = 0;
		while (i <= y.length - 1) {
			if (hmap.containsKey(y[i]) == false) {
				hmap.put(y[i], 1);

			} else {
				int oldval = hmap.get(y[i]); // .get gives the value of value in hashmap(key,value)
				int newval = oldval + 1;
				hmap.put(y[i], newval);

			}
			i++;
		}
		System.out.println(hmap);

		for (Entry<Character, Integer> data : hmap.entrySet()) {
			if (data.getValue() > 1) {
				System.out.println(data);

			}

		}

	}
}