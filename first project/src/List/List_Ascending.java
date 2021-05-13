package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_Ascending {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(209);
		list.add(345);
		list.add(32);
		list.add(45);
		list.set(1, 347);
		System.out.println(list);
		int temp = 0;
		for (int i = 0; i <= list.size() - 1; i++) {
			for (int j = i + 1; j <= list.size() - 1; j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j)); // unlike array[] we have to use .set method for arraylist
					list.set(j, temp);

				}
			}

		}
		for (int x : list) {
			System.out.println(x);

		}
		System.out.println(list);

		Collections.sort(list);
		System.out.println((list));

		Collections.sort(list, Collections.reverseOrder());
		System.out.println((list));

	}

}
