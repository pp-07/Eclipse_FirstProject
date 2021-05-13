package Dataencapsulation;

import org.apache.commons.io.FileUtils;

public class Data_Encapsulation {
private String s;
private double u;  //even if variables are private we can use getter setter method and utilize it in different class

public String getS() {
	return s;
}
public void setS(String s) {
	 
	if (s.matches("[A-Z a-z]+")) {     //we can give conditions to the variables 
		this.s=s;
	}
	else {System.out.println("special chars not allowed");}
}
public double getU() {
	return u;
}
public void setU(double u) {
	if (u>=50) {
		System.out.println("Age is above legal criteria ");
	}
	else {this.u = u;}
	

}
}


