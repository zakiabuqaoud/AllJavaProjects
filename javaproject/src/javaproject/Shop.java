package javaproject;
import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*;

public class Shop extends JFrame implements ActionListener ,ItemListener{
     Container c ;
	JPanel p1,p2,p3,p4,p5,p6,p0;
	JButton b1,b2,b3,b4 ;
	JTextArea a1,a2,a3 ;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18 ;
	
	
         public Shop (){
        	 c= getContentPane();
        	 p0 = new JPanel();
        	 p1 = new JPanel();
        	 p2 = new JPanel();
        	 p3 = new JPanel();
        	 p4 = new JPanel();
        	 p5 = new JPanel();
        	 p6 = new JPanel();
        	 l1 =new JLabel("total amount price of item imn Cart is : ");
        	 l2 =new JLabel("product");
        	 l3 =new JLabel("");
        	 l4 =new JLabel("total price:");
        	 l5 =new JLabel("quantity :");
        	 l5 =new JLabel("");
        	 l6 =new JLabel("Discription :");
        	 l7 =new JLabel("product");
        	 l8 =new JLabel("");
        	 l9 =new JLabel("total price:");
        	 l10 =new JLabel("quantity :");
        	 l11=new JLabel("");
        	 l12=new JLabel("Discription :");
        	 l13=new JLabel("product");
        	 l14=new JLabel("");
        	 l15=new JLabel("total price:");
        	 l16=new JLabel("quantity :");
        	 l17=new JLabel("");
        	 l18=new JLabel("Discription :");
        	
        	 
             b1 =new JButton("proceed to checkout");
             b2 =new JButton("Remove");
             b3 =new JButton("Remove");
             b4 =new JButton("Remove");
             a1 = new JTextArea();
             a2 = new JTextArea();
             a3 = new JTextArea();
            //////////////////////// 
             p0.setLayout(null);
             p1.setLayout(null);
             p2.setLayout(null);
             p3.setLayout(null);
             p4.setLayout(null);
             p5.setLayout(null);
             p6.setLayout(null);
             setVisible(true) ;
         	setResizable(false);
         	setSize(1000,1000);
         	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         	setLayout(null);
         	setTitle("cart Window");
            ///////////////////////////
         	c.add(p0);
         	p0.add(p1);
         	p0.add(p3);
         	p0.add(p5);
       ///////////////////////
             c.add(b1);
             c.add(l1);
             /////////////////////
             p1.add(p2);
             p3.add(p4);
             p5.add(p6);
             /////////////////////
             p1.add(b2);
             p3.add(b3);
             p5.add(b4);
             //////////////
             p2.add(l2);
             p2.add(l3);
             p2.add(l4);
             p2.add(l5);
             p2.add(l6);
             p2.add(l7);
             p2.add(l8);
             p2.add(a1);
             ///////////////////////////
             p4.add(l9);
             p4.add(l10);
             p4.add(l11);
             p4.add(l12);
             p4.add(l13);
             p4.add(l14);
             p4.add(a2);
             ////////////////////////
             p6.add(a3);
             p6.add(l15);
             p6.add(l16);
             p6.add(l17);
             p6.add(l18);
             
             
             ///////////////////////////
             p0.setBounds(0,0,1000,1000);
             p1.setBounds(3,50,1000,250);
             p2.setBounds(200,60,700,250);
             p3.setBounds(3,300,1,300);
             p4.setBounds(200,320,700,250);
             p5.setBounds(3,700,200,300);
             p6.setBounds(200,720,700,250);
             l1.setBounds(610,20,200,30);
             l2.setBounds(210,70,50,30);
             l3.setBounds(250,70,50,30);
             l4.setBounds(400,70,50,30);
             l5.setBounds(210,120,50,30);
             l6.setBounds(270,120,50,30);
             l7.setBounds(210,250,50,30);
             l8.setBounds(220,340,50,30);
             l9.setBounds(280,340,100,30);
             l10.setBounds(400,340,50,30);
             l11.setBounds(220,380,50,30);
             l12.setBounds(300,380,50,30);
             l13.setBounds(220,470,50,30);
             l14.setBounds(210,740,50,30);
             l15.setBounds(270,740,100,30);
             l16.setBounds(380,740,50,30);
             l17.setBounds(210,780,50,30);
             l18.setBounds(320,780,50,30);
            // l19.setBounds(210,780,100,30);
             b1.setBounds(400,20,200,30);
             b2.setBounds(10,100,50,30);
             b3.setBounds(10,400,50,30);
             b4.setBounds(10,800 ,50,30);
             a1.setBounds(270,270,500,100);
             a2.setBounds(300,500,300,100);
             a3.setBounds(260,820,200,100);
             /////////////////////////
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            
             
             

             
             
             
             
           ////////////////////////////////  
         }












public void itemStateChanged(ItemEvent arg0) {
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public static void main (String[] args){
		new Shop();
	}

	
	

}
