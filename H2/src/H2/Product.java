package H2;



import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	private String description;
	private int choosenAm;
	
	Department d;
	JPanel main,secound;
	
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
		
		JOptionPane.showMessageDialog(null, "This Ammount Is Not Available ... Wait A Message From EStore");
		return false;
		
	}
	
	public static int getIndex(String n) {
		
		for(int i=0;i<plist.size();i++)
			if(plist.get(i).getName().equals(n))
				return i;
		return -1;
	}
	
public static int getIndex(String n,LinkedList<Product> l) {
		
		for(int i=0;i<l.size();i++)
			if(l.get(i).getName().equals(n))
				return i;
		return -1;
	}
	
	
	public JPanel creatPanel(JButton b) {
		main = new JPanel();
		JPanel sec = new JPanel();
		main.setBackground(new Color(0, 102, 153));
		//p2.setBounds(x,y, 1153, 239);
		main.setBorder(new MatteBorder(2, 2, 2, 2,new Color(135, 206, 250)));
		main.setLayout(null);
		main.add(b);
		
		sec.setBorder(new MatteBorder(1, 1, 1, 1, new Color(135, 206, 235)));
		sec.setBackground(new Color(153, 204, 255));
		sec.setBounds(109,11, 964,198);
		sec.setLayout(null);
		
		JLabel l3 = new JLabel("Product :");
		l3.setBounds(10, 11, 83, 25);
		l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sec.add(l3);
		
		JLabel l4 = new JLabel(this.getName());
		l4.setBounds(144, 18, 83, 25);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sec.add(l4);
		
		JLabel l5 = new JLabel("Quantity :");
		l5.setBounds(10, 47, 83, 25);
		l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sec.add(l5);
		
		JLabel l6 = new JLabel(this.getQuantity()+"");
		l6.setBounds(144, 54, 83, 25);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sec.add(l6);
		
		JLabel l7 = new JLabel("Description :");
		l7.setBounds(10, 95, 100, 25);
		l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sec.add(l7);
		
		JLabel l8 = new JLabel("Total Price :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l8.setBounds(451, 18, 100, 18);
		sec.add(l8);
		
		JLabel l9 = new JLabel(this.getPrice()*this.getChoosen()+"");
		l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l9.setBounds(561, 18, 91, 18);
		sec.add(l9);
		
		JTextArea a = new JTextArea();
		a.setBounds(10, 131, 944, 56);
		a.setEditable(false);
		a.setText(this.getDescription());
		a.setFont(new Font("Courier New", Font.PLAIN, 16));
		sec.add(a);
		
		main.setSize(1153, 225);
		main.setBounds(0,0, 1153, 239);
		main.add(b);
		main.add(sec);
		
		
		return main;
	}
	
	public void creatSecoundPanel() {  
		secound = new JPanel();
		
		secound.setBorder(new MatteBorder(1, 1, 1, 1, new Color(135, 206, 235)));
		secound.setBackground(new Color(153, 204, 255));
		secound.setBounds(109,11, 964,198);
		secound.setLayout(null);
		
		JLabel l3 = new JLabel("Product :");
		l3.setBounds(10, 11, 83, 25);
		l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		secound.add(l3);
		
		JLabel l4 = new JLabel(this.getName());
		l4.setBounds(144, 18, 83, 25);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		secound.add(l4);
		
		JLabel l5 = new JLabel("Quantity :");
		l5.setBounds(10, 47, 83, 25);
		l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		secound.add(l5);
		
		JLabel l6 = new JLabel(this.getQuantity()+"");
		l6.setBounds(144, 54, 83, 25);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		secound.add(l6);
		
		JLabel l7 = new JLabel("Description :");
		l7.setBounds(10, 95, 100, 25);
		l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		secound.add(l7);
		
		JLabel l8 = new JLabel("Total Price :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l8.setBounds(451, 18, 100, 18);
		secound.add(l8);
		
		JLabel l9 = new JLabel(this.getPrice()*this.getChoosen()+"");
		l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l9.setBounds(561, 18, 91, 18);
		secound.add(l9);
		
		JTextArea a = new JTextArea();
		a.setBounds(10, 131, 944, 56);
		a.setEditable(false);
		a.setText(this.getDescription());
		a.setFont(new Font("Courier New", Font.PLAIN, 16));
		secound.add(a);
		
	}
	
	/*public static void main(String[]args) {
		Product p = new Product("p1",5,10,"k",null);
		JFrame f = new JFrame();
		JButton b = new JButton("hi");
		b.setBounds(0, 0, 50, 20);
		p.setChoosen(5);
		p.creatPanel(b);
		//p.main.add(p.sec);
		
		f.setLayout(null);
		f.setVisible(true);
		//f.add(p.main);
		p.creatSecoundPanel();
		f.add(p.secound);
		
	}*/

}
