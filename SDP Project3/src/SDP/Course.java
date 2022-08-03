package SDP;

public class Course{
	public int id;
	public String name;
	public int price;
	public int NoHour;
	public String content;
	
	public Course(int id,String name,int price,int NoHour,String content){
		this.id =id;
		this.name =name;
		this.price =price;
		this.NoHour =NoHour;
		this.content =content;
	}
	public String toString(){
		return id + " " + name + " " + price + " " + NoHour + " " + "content";  
	}
	
	
}
