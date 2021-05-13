package String;

public class Regex {

	public static void main(String[] args) {
		try {
			String str1= "tgata1121@#$%^&*(*())))_(*^%$##&&&**";
			String str2= str1.replace("tga", "");
			System.out.println(str2);
			
			String pat = "[^A-Za-z0-9]";
			 String str3= str1.replaceAll(pat,"");
			System.out.println(str3);
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		}
		
	}

}
