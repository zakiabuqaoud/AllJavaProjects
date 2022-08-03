package Account;
import java.util.*;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//20172106
public class Account {
	double initialBalance,balance ;
	List<Double> deposites,withdrawals ;
	String currency,owner ;
	
	public Account(){
		initialBalance =0;
		balance =0;
		deposites = new ArrayList<>();
		withdrawals = new ArrayList<>();
		currency = "$";
		owner = "zaki" ;
	}
	public double getBalance(){
		return balance ;
	}
	public void makeDeposite(double money){
		balance += money;
		deposites.add(money);	
	}
	public void makeWithDrawal(double money){
		if(money >= balance){
			throw new IllegalArgumentException("The money you ask for is greater than your balance");
		}
		balance -=money;
		withdrawals.add(money);
	}
	public void empty(){
		initialBalance =0;
		balance =0;
		deposites = new ArrayList<>();
		withdrawals = new ArrayList<>();
		currency = null;
		owner = null ;
	
	}
	public double sumDeposites(){
		double sum =0 ;
		for(int i = 0; i < deposites.size(); i++){
		    sum += deposites.get(i);
		}
		return sum;
	}
	public double sumWithdrawals(){
		double sum =0 ;
		for(int i = 0; i < withdrawals.size(); i++){
		    sum += withdrawals.get(i);
		}
		return sum;
	}
	public double sumBalance(){
		double sumBalance = initialBalance + sumDeposites() - sumWithdrawals() ;
		return sumBalance ;
	}
	public static void main(String[]args) throws Exception{
		Account acc = new Account();
		acc.makeDeposite(20.5);
		acc.makeWithDrawal(10.5);
		System.out.print(acc.getBalance());
		acc.empty();
		System.out.print(acc.deposites.size());
		acc.makeDeposite(4.5);
		acc.makeWithDrawal(1.5);
		System.out.print(acc.sumWithdrawals());
		System.out.print(acc.sumDeposites());
		System.out.print(acc.sumBalance());
		
	}
	
}
