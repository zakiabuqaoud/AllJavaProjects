package ConceptProgramLangHomework1;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//Zaki Khaled Zaki Abu Qaoud 
//20172106
public class MYTimeThree {
	private int time;
	//Constructor1
	public MYTimeThree(int hour, int minute,int second){
		setTime(hour*60*60 + minute*60 + second);
	}
	//Constructor2
	public MYTimeThree(int time){
		setTime(time);
	}
	//Constructor3
	public MYTimeThree(String time){
		int timeArray[] = new int[3]; 
		String[] timeArrayString = time.split("-");
		for(int i=0;i<=2;i++){
			timeArray[i] = Integer.parseInt(timeArrayString[i]);
		}
		setTime(timeArray[0]*60*60 + timeArray[1]*60 + timeArray[2]);
	}
	//set Method
	public void setTime(int time){
		this.time=time;
	}
	//get method
	public int getTime(){
		return this.time;
	}
	//to string
	public String toString(){
		return "The time By Second is: " + this.time +" Second\n";
	}
	//difference method
	public MYTimeThree difference(MYTimeThree time){
		int diff = this.time - time.time;
		MYTimeThree t = new MYTimeThree(diff);
		return t;
	}
	//main
	public static void main(String[] args){
		MYTimeThree t1 = new MYTimeThree(8, 18, 33);
		System.out.print(t1.toString());
		//---------------------------------------------
		MYTimeThree t2 = new MYTimeThree(11525);
		System.out.print(t2.toString());
		//----------------------------------------------
		MYTimeThree t3 = new MYTimeThree("5-20-58");
		System.out.print(t3.toString());
		//------------------------------------------------
		MYTimeThree t4 = t3.difference(t2);
		System.out.print(t4.toString());
		//----------------------------------------------
	}
}
