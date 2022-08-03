package gui;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Yara extends JFrame implements ActionListener ,ItemListener {
	Container con ;
	JLabel l1,l2,l3,l4 ;
	JButton b1 ;
	JTextField t1,t2,t3 ;
	String[] s ={"+","-","*"};
	JComboBox c ;
	public Yara(){
		con = getContentPane();
		l1 = new JLabel("n1");
		l2 = new JLabel("n2");
		l3 = new JLabel("oper");
		l4 = new JLabel("result");
		
		b1= new JButton("compute");
		c= new JComboBox();
		
		t1 =new JTextField("set the n1");
		t2 =new JTextField("set the n2");
		t3 =new JTextField();
		
		c.setModel(new DefaultComboBoxModel(s));
		
		setSize(500,400);
		setVisible(true);
		setResizable(false);
		setDefualtCloseOpertion(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		t3.setEditable(false);
		
		
		l1.setBounds(20,20,50,30);
		l2.setBounds(20,70,50,30);
		l3.setBounds(20,120,50,30);
		l4.setBounds(20,170,50,30);
		c.setBounds(100,120,100,40);
		t1.setBounds(100,20,100,40);
		t2.setBounds(100,70,100,40);
		t3.setBounds(100,170,100,40);
		b1.setBounds(130,300,140,100);
		
		
		con.add(t1);
		con.add(t2);
		con.add(t3);
		con.add(b1);
		con.add(l1);
		con.add(l2);
		con.add(l3);
		con.add(l4);
		con.add(c);
		
		
		b1.addActionListener(this);
		
	}
	


	private void setDefualtCloseOpertion(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}



	public void itemStateChanged(ItemEvent arg0) {
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			if(c.getSelectedItem().equals("+")){
				int x,y ;
				x = Integer.parseInt(t1.getText());
				y= Integer.parseInt(t2.getText());
				t3.setText(Integer.toString(x+y));
			}
			
			
			
			
	if(c.getSelectedItem().equals("-")){
		int x,y ;
		x = Integer.parseInt(t1.getText());
		y= Integer.parseInt(t2.getText());
		t3.setText(Integer.toString(x-y));		
			}
	
	
	
	if(c.getSelectedItem().equals("*")){
		int x,y ;
		x = Integer.parseInt(t1.getText());
		y= Integer.parseInt(t2.getText());
		t3.setText(Integer.toString(x*y));
	}
	
			
		}
		
	}
	public static void main (String[] args){
		new Yara();
	}
	

}
