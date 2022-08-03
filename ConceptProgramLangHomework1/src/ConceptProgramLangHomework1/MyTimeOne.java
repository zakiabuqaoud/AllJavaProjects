package ConceptProgramLangHomework1;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//Zaki Khaled Zaki Abu Qaoud 
//20172106
public class MyTimeOne {
	private int hour;
	private int minute;
	private int second;
	
	//Constructor1
	public MyTimeOne(int hour, int minute, int second ){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	//Constructor2, time is seconds
	public MyTimeOne(int time){
		setHour(time/3600);
		setMinute(time%3600/60);
		setSecond(time%3600%60%60);
	}
	//Constructor3 , time is String
	public MyTimeOne(String time){
		String[] timeArray = time.split("-");
		//Hour
		setHour(Integer.parseInt(timeArray[0]));
		//Minute
		setMinute(Integer.parseInt(timeArray[1]));
		//second
		setSecond(Integer.parseInt(timeArray[2]));
	}
	//Set Methods
	public void setHour(int hour){
		this.hour = hour;
	}
	public void setMinute(int minute){
		this.minute = minute;
	}
	public void setSecond(int second){
		this.second = second;
	}
	//Get Methods
	public int getHour(){
		return this.hour;
	}
	public int getMinute(){
		return this.minute;
	}
	public int getSecond(){
		return this.second;
	}
	//to String
	public String toString(){
		return "The hour is " + this.hour + " the minute is "+ this.minute + " " +  "the socond is " + this.second +"\n";
	}
	//difference method
	public MyTimeOne difference(MyTimeOne time){
		// Sum Time =>Parameter
		int hourParameterBySecond = time.hour*60*60;
		int minuteParameterBySecond = time.minute*60;
		int timeParameterSum = hourParameterBySecond+minuteParameterBySecond+time.second;
		//Sum => object which call method
		int hourBySecond = hour*60*60;
		int minuteBySecond = minute*60;
		int timeSum = hourBySecond + minuteBySecond + second;
		//difference
		int diff = timeSum - timeParameterSum;
		MyTimeOne t = new MyTimeOne(diff)  ;
		return t;
	}
	
	//main
	public static void main(String[] args){
		MyTimeOne t1 = new MyTimeOne(1,2,3);
		System.out.print(t1.toString());
		//------------------------------------
		MyTimeOne t2 = new MyTimeOne(9925);
		System.out.print(t2.toString());
		//------------------------------------
		MyTimeOne t3 = new MyTimeOne("8-13-10");
		System.out.print(t3.toString());
		//---------------------------------------
		MyTimeOne t4 = t3.difference(t2);
		System.out.print(t4.toString());
		//----------------------------------------
	} 
}


