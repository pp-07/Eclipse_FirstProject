package String;

public class Max_Characters_String {

	public static void main(String[] args) {
		String s = "aaaabbbbbbccce";
		int arr[]=new int[127];
		for (int i =0;i<=s.length()-1;i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] +1;
			}
		
		int max = -1;
		char maxChar=' ';
		for (int i =0;i<s.length();i++) {
			if (arr[s.charAt(i)] >max) {
				max= arr[s.charAt(i)];
						maxChar = s.charAt(i);
			}
		}
		
		System.out.println(maxChar);

	}

}
