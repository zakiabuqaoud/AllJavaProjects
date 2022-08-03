package ConceptProgramLangHomework1;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//Zaki Khaled Zaki Abu Qaoud 
//20172106
public class MyTimeFour {
	private String time;
	//Constructor1
	public MyTimeFour(int hour, int minute,int second){
		setTime(hour + "-" + minute + "-" +second);
	}
	//Constructor2
	public MyTimeFour(int time){
		int hour= time/3600;
		int minute =time%3600/60;
		int second =time%3600%60%60;
		setTime(hour + "-" + minute + "-" +second);
	}
	//Constructor3
	public MyTimeFour(String time){
		setTime(time);
	}
	//set method
	public void setTime(String time){
		this.time = time;
	}
	//get method
	public String getTime(){
		return this.time;
	}
	//to string
	public String toString(){
		return "time is: " + this.time + "\n";
	}
	//difference method
	public MyTimeFour difference(MyTimeFour time){
		//int time for Parameter
		int[] timeArray = new int[3];
		String[] timeArrayString = time.time.split("-");
		for(int i=0; i<=2;i++){
			timeArray[i] = Integer.parseInt(timeArrayString[i]);
		}
		//int time for object which call
		int[] timeArrayObj = new int[3];
		String[] timeArrayObjStr = this.time.split("-");
		for(int i=0; i<=2;i++){
			timeArrayObj[i] = Integer.parseInt(timeArrayObjStr[i]);
		}
		int sumTimeParameter = ((timeArray[0]*60*60)+ (timeArray[1]*60)+ (timeArray[2]));
		int sumTimeObj = ((timeArrayObj[0]*60*60)+ (timeArrayObj[1]*60)+ (timeArrayObj[2]));
		//difference
		int diff = sumTimeObj - sumTimeParameter;
		MyTimeFour t = new MyTimeFour(diff);
		return t;
	}
	//main
	public static void main(String[] args){
		MyTimeFour t1 = new MyTimeFour(5, 43, 36);
		System.out.print(t1.toString());
		//-----------------------------------------------
		MyTimeFour t2 = new MyTimeFour(11453);
		System.out.print(t2.toString());
		//------------------------------------------------
		MyTimeFour t3 = new MyTimeFour("3-18-50");
		System.out.print(t3.toString());
		//--------------------------------------------------
		MyTimeFour t4 = t3.difference(t2);
		System.out.print(t4.toString());
		//-------------------------------------------------
	}
}
