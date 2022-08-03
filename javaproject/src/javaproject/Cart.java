package javaproject;
import javax.swing.*;

import java.awt.* ;
import java.awt.event.* ;

public class Cart extends JFrame implements ActionListener ,ItemListener{
	Container c ;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9 ;
	JButton b1,b2 ;
	JTextArea a ;
	JPanel p1,p2 ;
	
	public Cart (){
		c = getContentPane();
		l1 =new JLabel("Total amount price of items in cart is");
		l2 =new JLabel("empty");
		l3 =new JLabel("product:");
		l4 =new JLabel("empty");
		l5 =new JLabel("Totalprice:");
		l6 =new JLabel("empty");
		l7 =new JLabel("Quantity:");
		l8 =new JLabel("empty");
		l9 =new JLabel("Description:");
		b1 = new JButton("proceed to checkout");
		b2 = new JButton("remove");
		p1 = new JPanel();
		p2 = new JPanel();
		a = new JTextArea();
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    	setResizable(false);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cart Window");
		setSize(1000,700);
		
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
		
		
		c.add(p1);
		p1.add(p2);
		p1.setLayout(null);
		p2.setLayout(null);
		p1.setBounds(10,70,990,300);
		p2.setBounds(180,90,600,260);
		p1.add(b2);
		b2.setBounds(20,160,100,50);
		p2.setBackground(Color.green);
		p1.setBackground(Color.cyan);
		//********img***********************
		
		//***************************
		c.add(b1);
		c.add(l1);
		c.add(l2);
		b1.setBounds(200,10,200,50);
		l1.setBounds(420,10,260,50);
		l2.setBounds(650,10,100,50);
		//*************************
		l3.setBounds(20,10,80,40);
		l4.setBounds(100,10,200,40);
		l5.setBounds(200,10,90,40);
		l6.setBounds(280,10,40,40);
		l7.setBounds(20,60,90,40);
		l8.setBounds(100,60,90,40);
		l9.setBounds(20,100,120,40);
		a.setBounds(100,150,300,60);
		a.setLayout(null);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(l9);
		p2.add(a);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		
	}






	public void itemStateChanged(ItemEvent e) {
		
		
	}






	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){}
		if(e.getSource()==b2){}
	}
	
	public static void main (String[] args){
		new Cart();
	}
	
	
	
	
	
	
	
	
	
	
	
} 