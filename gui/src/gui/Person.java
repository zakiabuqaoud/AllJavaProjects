package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Person extends JFrame implements ActionListener 
{
	Container c ;
	JLabel l ;
	JButton btn ;
	JRadioButton r1 ;
	JRadioButton r2 ;
	JRadioButton r3 ;
	ButtonGroup g ;
	//        constractor
	public Person(){
		c = getContentPane();
		c.setLayout(null);
		setVisible(true);
		setSize(500,500);
		l =new JLabel("who is Preferred");
		btn = new JButton("print");
		r1 = new JRadioButton("gogo");
		r2 = new JRadioButton("gohan");
		r3 = new JRadioButton("tranks");
		g = new ButtonGroup();
		g.add(r1);
		g.add(r2);
		g.add(r3);
		l.setBounds(20,50,300,60);
		r1.setBounds(80,90,60,60);
		r2.setBounds(80,145,60,60);
		r3.setBounds(80,215,100,60);
		btn.setBounds(80,315,60,60);
		
		//«·«÷«›« 
		c.add(r1);
		c.add(r2);
		c.add(r3);
		c.add(btn);
		c.add(l);
		//·«  ÊÃœ «÷«›… ··„Ã„Ê⁄…
		btn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn){
		//⁄‘«‰ ⁄‰œÌ “— Ê«Õœ ⁄«œÌ ·Ê „Õÿ‰Â«‘
			if(r1.isSelected()){
				JOptionPane.showMessageDialog(null,"gogo");
			}
			if(r2.isSelected()){
				JOptionPane.showMessageDialog(null,"gohan");
			}
			if(r3.isSelected()){
				JOptionPane.showMessageDialog(null,"tranks");
			}	
		}
		
		
		
	} 
public static void main(String[] args){
	new Person();
}
}
