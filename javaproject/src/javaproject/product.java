package javaproject;
import javax.swing.* ;

import java.awt.*;
import java.awt.event.*; 


public class product extends JFrame implements ActionListener {

	 JFrame f ;
	 JTabbedPane p ;
	 JPanel p1,p2,p3 ;
	 ///////////////////
	 JButton b1,b2,b3,b4,b5,b6,b7 ;
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15 ;
	 JTextField t,t1,t2,t3,t4,t5,t6,t7,t8 ;
	 JTextArea a,a1,a2,a3 ;
	 JList tr1 ;  
	 JComboBox cb1 ;
	public product(){
		p= new JTabbedPane(JTabbedPane.TOP);
		f = new JFrame();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
    	p.addTab("Deparment", p1);
    	p.addTab("Product"  , p2);
    	p.addTab("Customer" , p3);
    	tr1 =new JTree();
       	t = new JTextField();
    	b1 = new JButton("Add new Debarment");
    	b2 = new JButton("ubadate Deparment");
    	l1 = new JLabel("Deparment List");
    	l2 = new JLabel("Deparment Name");
    	l3 = new JLabel("Discription");
    	a = new JTextArea();
    	
    	f.setVisible(true) ;
    	setResizable(false);
    	f.setSize(800,800);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	setTitle("Manager Window");
    	
    	f.getContentPane().add(p,BorderLayout.CENTER);
    	f.setBounds(0,0,500,700);
    	
    	
    	p1.add(b1);
    	p1.add(b2);
    	p1.add(l1);
    	p1.add(l2);
    	p1.add(l3);
    	p1.add(tr1);
    	p1.add(t);
    	p1.add(a);
    	
    	
    	
    	
    	
    	
    	p1.setLayout(null);
    	p2.setLayout(null);
    	p3.setLayout(null);
    	
    	
		tr1.setBounds(20,20,200,300);
		b1.setBounds(50,450,150,50);
		b2.setBounds(200,450,200,50);
		l1.setBounds(10,0,100,20);
		l2.setBounds(230,100,90,20);
		l3.setBounds(230,150,130,50);
		t.setBounds(350,50,60,20);
		a.setBounds(350,150,100,100);
		t.setEditable(false);
	//////////////p2////////////////////
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
    	b3 = new JButton("new product");
    	b4 = new JButton("ubdate");
    	l4 = new JLabel("product List");
    	l5 = new JLabel("product Name");
    	l6 = new JLabel("price");
    	l7 = new JLabel("Quantity");
    	l8 = new JLabel("Debarment");
    	l9 = new JLabel("Discription");
    	a1 =new JTextArea();
    	a2 =new JTextArea();
    	cb1 = new JComboBox();
    	
    	
    	p2.add(t1);
    	p2.add(t2);
    	p2.add(t3);
    	p2.add(l4);
    	p2.add(l5);
    	p2.add(l6);
    	p2.add(l7);
    	p2.add(l8);
    	p2.add(l9);
    	p2.add(b3);
    	p2.add(b4);
    	p2.add(a1);
    	p2.add(a2);
    	p2.add(cb1);
		
		
		
		
		t1.setBounds(500,10,200,60);
		t2.setBounds(500,80,100,50);
		t3.setBounds(500,110,100,50);
		l4.setBounds(0,0,80,80);
		l5.setBounds(400,10,70,50);
		l6.setBounds(400,80,70,50);
		l7.setBounds(400,110,70,50);
		l8.setBounds(400,180,70,50);
		l9.setBounds(400,250,70,50);
		a1.setBounds(50,100,300,300);
		a2.setBounds(500,250,200,100);
		cb1.setBounds(500,180,100,50);
		b3.setBounds(80,600,100,50);
		b4.setBounds(200,600,100,50);
		/////////////////////p3/////////////////////
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
    	b5 = new JButton("new customer");
    	b6 = new JButton("insert");
    	b7 = new JButton("ubdate customer");
    	l10 = new JLabel("customer List");
    	l11= new JLabel("customer id");
    	l12= new JLabel("customer Name");
    	l13= new JLabel("Address");
    	l14 = new JLabel("user name");
    	l15= new JLabel("passWord");
    	a3 =new JTextArea();
		
    	p3.add(t4);
    	p3.add(t5);
    	p3.add(t6);
    	p3.add(t7);
    	p3.add(t8);
    	p3.add(l10);
    	p3.add(l11);
    	p3.add(l12);
    	p3.add(l13);
    	p3.add(l14);
    	p3.add(l15);
    	p3.add(a3);
    	p3.add(b5);
    	p3.add(b6);
    	p3.add(b7);
		
    	t4.setBounds(500,10,70,50);
    	t5.setBounds(500,70,200,50);
    	t6.setBounds(500,120,150,50);
    	t7.setBounds(500,190,100,50);
    	t8.setBounds(500,280,100,50);
    	l10.setBounds(10,10,70,50);
    	l11.setBounds(400,10,100,50);
    	l12.setBounds(400,70,100,50);
    	l13.setBounds(400,120,100,50);
    	l14.setBounds(400,190,100,50);
    	l15.setBounds(400,280,100,50);
    	a3.setBounds(50,100,300,300);
    	b5.setBounds(70,500,100,50);
    	b6.setBounds(200,500,100,50);
    	b7.setBounds(300,500,100,50);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		////////////////////////////////////
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b3){
		//	new NewProduct();
		}
		
		
		if(e.getSource()==b4){}
		
		
		
	}
		
		public static void main(String[] args){
	         new product();

}}
