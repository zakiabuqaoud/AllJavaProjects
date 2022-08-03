package javaproject;
import javax.swing.border.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.* ;
import java.awt.event.* ;

public class CartP extends JPanel implements ActionListener ,ItemListener{
	
	JLabel l3,l4,l5,l6,l7,l8,l9 ;
	JButton b1,b2 ;
	JTextArea a ;
	JPanel p1,p2 ;
	
	public CartP (){
		
		
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
    	
		setVisible(true);
		setLayout(null);
		setSize(1000,700);
		
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
		p1.add(p2);
		p1.setLayout(null);
		p2.setLayout(null);
		p1.setBounds(10,70,850,300);
		p2.setBounds(180,50,600,200);
		p1.add(b2);
		b2.setBounds(20,120,100,50);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setBorder(BorderFactory.createLineBorder(Color.blue));
		p1.setBackground(Color.darkGray);
		p1.setBorder(BorderFactory.createLineBorder(Color.blue));
	
		
		//*************************
		l3.setBounds(20,10,80,40);
		l4.setBounds(100,10,200,40);
		l5.setBounds(200,10,90,40);
		l6.setBounds(280,10,40,40);
		l7.setBounds(20,60,90,40);
		l8.setBounds(100,60,90,40);
		l9.setBounds(20,100,120,40);
		a.setBounds(100,130,300,60);
		a.setLayout(null);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(l9);
		p2.add(a);
		
		
		b2.addActionListener(this);
		
		this.add(p1);
		
		
	}






	public void itemStateChanged(ItemEvent e) {
		
		
	}






	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){}
		if(e.getSource()==b2){}
	}
	
	public static void main (String[] args){
		JFrame f = new JFrame();
		f.add(new CartP());
		f.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
} 