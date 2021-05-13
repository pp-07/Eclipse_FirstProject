package Static_Keyword;

public class Main_Static {

	public static void main(String[] args) {
		
		
		STA call=  new  STA();
		STA ko=    new  STA();
		STA k=     new   STA();
	
		
		  call.a= 88;
		  call.b= "hello";
		
		
		
		   ko.a = 1;
		   ko.b="GHJH";
		
		
		  k.a = 19;
          k.b="GHJH";   //Since this is the last changed value ,all the methods will take this new changed value as the variables are static.
          
		 
		call.lol();
		ko.lo();
		k.l();
		STA.lol();      //We can directly call the static method by using class name.
		
		
	
	}

}
