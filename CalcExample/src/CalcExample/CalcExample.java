package CalcExample;

public class CalcExample {

	public CalcExample(){
		
	}
	public int add(int a,int b){
		return a + b;
	}
	public int multiply(int a,int b){
		return a * b;
		}
	public double divide(int a,int b){
		if(b ==0){
			throw new ArithmeticException("error");
		}
		return a / b;
		}
}
