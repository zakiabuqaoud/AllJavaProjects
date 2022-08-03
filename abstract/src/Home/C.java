package Home;

public class C extends Shape {
	 double r ;
	  
	 public C (String name,String color,double r){
		 super(name ,color);
		 this.r =r ;
		 
		 
	 }

	
	public double area() {
		
		return 3.14 * r*r;
	}
	 
	

}
