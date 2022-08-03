package H2;

import java.util.Collection;
import java.util.LinkedList;

public class Customer {
	private String name;
	private String address;
	private String username;
	private String password;
	private int id;
	EStore s;
	
	public static LinkedList<Customer> clist = new LinkedList<Customer>();
	public LinkedList<Product> cartProducts = new LinkedList<Product>();
	public Cart cart;
	

	public Customer(String n, int id, String a, String un, String pass) {
		this.name = n;
		this.id = id;
		this.address = a;
		this.username = un;
		this.password = pass;
		clist.add(this);
		
	}
	
	public void setName(String s) {this.name = s;}
	public void setUsern(String s) {this.username = s;}
	public void setPassword(String s) {this.password = s;}
	public void setAddress(String s) {this.address = s;}
	public void setId(int id) {this.id = id;}
	
	public String getName() {return this.name;}
	public String getAddress() {return this.address;}
	public String getUsern() {return this.username;}
	public String getPassword() {return this.password;}
	public int getId() {return this.id;}
	
	public String toString() {
		return this.getUsern();
	}
	
	public static boolean userSearch(String user) {
		for(int i=0;i<clist.size();i++) {
			if(clist.get(i).getUsern().equals(user))
				return true;
		}
		return false;
	}
	
	public static Customer userSearch2(String user) {
		for(int i=0;i<clist.size();i++) {
			if(clist.get(i).getUsern().compareTo(user)==0)return clist.get(i);
		}
		return null;
	}

}
