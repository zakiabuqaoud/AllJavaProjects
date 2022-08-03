package Account;



public class AccountTest {
	
	public void f(){
	for(int i=152 ; i <= 216; i+=2){
		
		System.out.print(i);
		if(i == 216){
			return ;
			}
		System.out.print(",");
	}}


public static void main(String[] args){
	AccountTest a = new AccountTest();
	a.f();
	
}
}