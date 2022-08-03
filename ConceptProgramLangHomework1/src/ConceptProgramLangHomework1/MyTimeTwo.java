package ConceptProgramLangHomework1;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//Zaki Khaled Zaki Abu Qaoud 
//20172106
public class MyTimeTwo {
	private int time [] = new int[3];
	//Constructor1
		public MyTimeTwo(int hour, int minute, int second ){
			int timeArray[] = {hour,minute,second};
			setTime(timeArray);
		}
	//Constructor2, time is seconds
	public MyTimeTwo(int time){
		int hour = time/3600;
		int minute=time%3600/60;
		int second=time%3600%60%60;
		int timeArray[] = {hour,minute,second};
		setTime(timeArray);
		
	}
	//Constructor3 , time is String
	public MyTimeTwo(String time){
		int timeArray[] = new int[3]; 
		String[] timeArrayString = time.split("-");
		for(int i=0;i<=2;i++){
			timeArray[i] = Integer.parseInt(timeArrayString[i]);
		}
		setTime(timeArray);
		
	}
	//set method
	public void setTime(int[] time){
		for(int i=0; i<=2;i++){
			this.time[i] = time[i];
		}
	}
	//get method
	public int[] getTime(){
		return this.time;
	}
	//to string
	public String toString(){
		return "Hour is: "+ time[0] + " " + "minute is: "+ time[1]+ " "+ "Second is: "+ time[2]+ " \n" ;
	}
	//difference method
	public MyTimeTwo difference(MyTimeTwo time){
		int sumTimeParameter = ((time.time[0]*60*60)+ (time.time[1]*60)+ (time.time[2]));
		int sumTime = ((this.time[0]*60*60)+ (this.time[1]*60)+ (this.time[2]));
		//difference
		int diff = sumTime - sumTimeParameter;
		MyTimeTwo t = new MyTimeTwo(diff)  ;
		return t;
	}
	//main
	public static void main(String[] args){
		MyTimeTwo t1 = new MyTimeTwo(2,3,4);
		System.out.print(t1.toString());
		//-----------------------------------------------
		MyTimeTwo t2 = new MyTimeTwo(11000);
		System.out.print(t2.toString());
		//------------------------------------------------
		MyTimeTwo t3 = new MyTimeTwo("12-55-50");
		System.out.print(t3.toString());
		//-----------------------------------------------
		MyTimeTwo t4 = t3.difference(t2);
		System.out.print(t4.toString());
		//----------------------------------------------
	}
}
