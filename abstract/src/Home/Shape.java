package Home;

abstract public class Shape {
	private String name ,color;

	abstract public double area();
	
	Shape(String name , String color ){
		this.name = name ;
		this.color = color ;

	}
	
	public String getname (String name)
	{
		return name ;
		}
	public void setname ()
	{
	this.name = name ;
		
	}
	
	public String getcolor( String color){
		return color ;
	} 
	public void setcolor(){
		this.color = color ;
	}
	
}
