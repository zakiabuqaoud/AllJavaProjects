package Home;

class Rec extends Shape{

	 double x,y ;
	
	public Rec (double x , double y,String name,String color){ 
		super (name, color );
    	this.x =x ;
	    this.y =y ;
		
	
	}
	
	public double area() {
       return x* y ;
		
	}
	
}
