package b;
import java.util.Scanner;
public class BolmaMain {
	public static void main  (String[] args){
		Scanner s =new Scanner(System.in);
		int gogo=s.nextInt();
		try {
			f(gogo);
		}
		catch (bolma b){
			System.out.println(b.getMessage());
		}
		}
	public static void f (int x)throws bolma {
		if(x<0){
			throw	new  bolma("m");
			
		}
		else{
			System.out.println(x);
		}
		
	}
		
	}

