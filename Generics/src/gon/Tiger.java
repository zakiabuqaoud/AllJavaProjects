package gon;

// Generic 
//ÚÇã
public class Tiger {
	public static  void main (String[] args){
		
		Integer[] number = {13,14,15,16,17,18};
		String[] names ={"zaki","Ahmed","mohammed"};
		Double[] number2 = {1.1,2.2,3.3,4.4,2.0,5.5};
	        g(number);
	        g(names);
	        g(number2);
		}
		
	
	public static <t extends Object> void  g (t[] x  ){
		for(int i=0 ; i<x.length; i++){
			System.out.println(x[i]);
			
		}
			
		
		
		
	}
	
}
	


