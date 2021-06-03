package Interview_ConceptBased;

import java.util.Arrays;
import java.util.HashMap;

public class Highest_AverageMarks {

	public static void main(String[] args) {
		String a = "Ramesh";
		String b= "Ram";
		String c = "Rahul";
		int noOfStudents = 3;
		HashMap<String,Integer> hmapa= new HashMap<String,Integer> ();
		HashMap<String,Integer> hmapb= new HashMap<String,Integer> ();
		HashMap<String,Integer> hmapc= new HashMap<String,Integer> ();
		
		
		hmapa.put("Maths", 80);
		hmapa.put("English",75);
		hmapa.put("Marathi", 74);
		double suma =0;
		for (int ax: hmapa.values()) {
			suma= suma +ax;
		}
		double RameshAvg= suma/hmapa.size();
		System.out.println(RameshAvg);
		hmapb.put("Maths", 80);
		hmapb.put("English", 80);
		hmapb.put("Marathi", 89);
		double sumb =0;
		for (int bx: hmapb.values()) {
			sumb= sumb +bx;
		}
		double RamhAvg= sumb/hmapb.size();
		System.out.println(RamhAvg);
		
		hmapc.put("Maths", 99);
		hmapc.put("English", 45);
		hmapc.put("Marathi", 89);
		double sumc =0;
		for (int cx: hmapc.values()) {
			sumc= sumc+cx;
		}
		double RahulhAvg= sumc/hmapc.size();
		
		System.out.println(RahulhAvg);
		Double arr[] = new Double[noOfStudents];
		arr[0]= RameshAvg;
		arr[1]= RamhAvg;
		arr[2]=RahulhAvg;
		
		Arrays.sort(arr);
		
		double maxAvg=arr[arr.length-1];
		
		
		System.out.println(maxAvg);
		if(maxAvg ==RameshAvg) {
			System.out.println("Ramesh Is Topper");
		}
		else if (maxAvg ==RamhAvg) {
			System.out.println("Ram Is Topper");
		}else {
			System.out.println("Rahul is topper");
		}
		
	}

}
