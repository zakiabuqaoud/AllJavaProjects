package gui;
import javax.swing.*;

import java.awt.* ;
import java.awt.event.*;

public class Sale extends JFrame implements ActionListener,ItemListener {
    Container  c  ;
    String s1[] = {"Decimal","Binary","Hexa","Octal"};
    String s2[] = {"Decimal","Binary","Hexa","Octal"};
    JLabel l1,l2,l3,l4,l5,l6,l7 ;
    JButton b1,b2,b3 ;
    JComboBox gogo,bolma ;
	JTextField t1,t2 ;
	String maron ;
	int gohan ;
	public Sale(){
		c = getContentPane();
	    l1 = new JLabel("convert between numbering systems");
	    l2 = new JLabel("From");
	    l3 = new JLabel(">>");
	    l4 = new JLabel("to");
	    l5 = new JLabel("Enter the Number");
	    l6 = new JLabel("Result:<");
	    l7 = new JLabel("zaki @@@@");
	    
	    b1 = new JButton ("Convare");
	    b2 = new JButton ("ok");
	    b3 = new JButton ("Quit");
	    
	    t1 = new JTextField("write the numbers",15);
	    t2 = new JTextField();
	    t2.setEditable(false);
	    
	    gogo = new JComboBox();
	    bolma = new JComboBox();
	
	   gogo.setModel(new DefaultComboBoxModel(s1));
    	bolma.setModel(new DefaultComboBoxModel(s2));
	
    	setVisible(true);
    	setSize(700,700);
    	setResizable(false);
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	
    	c.add(l1);
    	c.add(l2);
    	c.add(l3);
    	c.add(l4);
    	c.add(l5);
    	c.add(l6);
    	c.add(l7);
    	c.add(b1);
    	c.add(b2);
    	c.add(b3);
    	c.add(t1);
    	c.add(t2);
    	c.add(gogo);
    	c.add(bolma);
    	this.setLayout(null);
    	
    	l1.setBounds(30,30,300,30);
    	l2.setBounds(30,90,40,40);
    	l3.setBounds(300,90,30,30);
    	l4.setBounds(340,90,30,30);
    	l5.setBounds(30,200,60,30);
    	l6.setBounds(30,250,60,30);
    	l7.setBounds(600,600,80,80);
    	t1.setBounds(90,200,200,30);
    	t2.setBounds(90,250,200,30);
    	gogo.setBounds(90,90,100,40);
    	bolma.setBounds(380,90,100,40);
    	b1.setBounds(300,200,120,30);
    	b2.setBounds(300,400,60,60);
    	b3.setBounds(400,400,60,60);
    	
    	
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	gogo.addItemListener(this);
    	bolma.addItemListener(this);
	}	


	
	public void itemStateChanged(ItemEvent e1) {
		
	}
	
	public void actionPerformed(ActionEvent e2) {
		if (e2.getSource() == b1){
			if(gogo.getSelectedItem().equals("Binary")){
			 gohan = (int)Long.parseLong(t1.getText());
			if(bolma.getSelectedItem().equals("Binary"))
			maron = t1.getText();	
			if(bolma.getSelectedItem().equals("Desimal"));
			maron = Integer.toString((int)Long.parseLong(t1.getText(),2));
				//if(bolma.)
				
			}
			
			
			
			
			
			
		}
			
		if (e2.getSource()== b3)
			System.exit(0);
		
		if (e2.getSource()== b2)
		JOptionPane.showMessageDialog(null,"like","zeko",3);
	
		//if (e2.getSource()== b2)
	}
	
		public static void main(String[]args){
			new Sale();
		}
	

}
