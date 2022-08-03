
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	private String description;
	private int choosenAm;
	
	Department d;
	
	public static LinkedList<Product> plist = new LinkedList<Product>();
	
	public Product(String name, double p, int q) {
		this.name = name;
		this.price = p;
		this.quantity = q;
		
		plist.add(this);
	}
	
	public Product(String name, double p, int q, String s,Department d) {
		this.name = name;
		this.price = p;
		this.quantity = q;
		
		description = s;
		
		
		this.d = d;
		d.addProduct(this);
		
		plist.add(this);
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDescription(String s) {
		this.description = s;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice(double pr) {
		this.price = pr;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return this.getName();
	}
	
	public int getChoosen() {
		return this.choosenAm;
	}
	
	public boolean setChoosen(int d) {
		
		
		this.choosenAm = d;
		if(choosenAm <= quantity) {
		  this.quantity = this.quantity-this.choosenAm;
		  return true;
		}
		
		JOptionPane.showMessageDialog(null, "This Ammount Is Not Available ... Wait A MessageFrom EStore");
		return false;
		
	}
	
	public static int getIndex(String n,LinkedList<Product> l) {
		
		for(int i=0;i<l.size();i++)
			if(l.get(i).getName().equals(n))
				return i;
		return -1;
	}
	
	

}
