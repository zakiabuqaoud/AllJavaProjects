package TurtleGraghice;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//20172106
//zaki khalid abu qaoud
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.*;

public class TurtleGraghiceGUI extends JFrame implements ActionListener {
	Container c ;
	JPanel p ;
	JButton b ;
	JTextField t1,t2,t3,t4,t5,t6;
	JLabel l1,l2,l3,l4,l5,l6,l7 ;
	TurtleGraghice tg;
	Font font =new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,30);
	Font f =new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,15);
	JComboBox cs;
	String s[] = {"shape 1","shape 2","shape 3","shape 4","shape 5","shape 6"};
	   
	public TurtleGraghiceGUI() {
		c=getContentPane();
		setVisible(true);
    	setSize(900,600);
    	setResizable(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("Turtle Graphics");
    	setLayout(null);
    	c.setBackground(Color.WHITE);
    	
    	
    	///////////Jpanel/////////////
    	p = new JPanel();
    	p.setLayout(null);
    	p.setBackground(Color.CYAN);
    	c.add(p);
    	p.setBounds(0,300,900,300);
    	
    	//////////JButton////////////
    	b =new JButton("Draw");
    	p.add(b);
    	b.setBounds(350,160,100,50);
    	b.addActionListener(this);
    	////////////JTextField/////////////////
    	t1 = new JTextField();
    	t2 = new JTextField();
    	t3 = new JTextField();
    	t4 = new JTextField();
    	t5 = new JTextField();
    	t6 = new JTextField();
    	t1.setFont(font);
    	t2.setFont(font);
    	t3.setFont(font);
    	t4.setFont(font);
    	t5.setFont(font);
    	
    	t1.setBounds(130,10,100,50);
    	t2.setBounds(130,90,100,50);
    	t3.setBounds(370,10,100,50);
    	t4.setBounds(370,90,100,50);
    	t5.setBounds(610,10,100,50);
    	t6.setBounds(610,90,150,50);
    	
    	p.add(t1);
    	p.add(t2);
    	p.add(t3);
    	p.add(t4);
    	p.add(t5);
    	p.add(t6);
    	
    	///////////////JLabel///////////////////////
    	l1 = new JLabel("X");
    	l2 = new JLabel("Y");
    	l3 = new JLabel("Length");
    	l4 = new JLabel("Direction");
    	l5 = new JLabel("Angle");
    	l6 = new JLabel("Shape to draw");
    	l7 =new JLabel("Shape");
    	
    	l1.setBounds(10,10,100,50);
    	l2.setBounds(10,90,100,50);
    	l3.setBounds(250,10,100,50);
    	l4.setBounds(250,90,100,50);
    	l5.setBounds(490,10,100,50);
    	l6.setBounds(490,90,100,50);
    	l7.setBounds(10,160,100,50);
    	
    	p.add(l1);
    	p.add(l2);
    	p.add(l3);
    	p.add(l4);
    	p.add(l5);
    	p.add(l6);
    	p.add(l7);
    	////////////////////JComboBox/////////////////////////////
         cs = new JComboBox();
         cs.addItem(s[0]);cs.addItem(s[1]);cs.addItem(s[2]);cs.addItem(s[3]);cs.addItem(s[4]);cs.addItem(s[5]);
         cs.setBounds(130,160,100,50);
         p.add(cs);
         cs.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b){
			if(t1.getText()==null||t2.getText()==null||t3.getText()==null||t4.getText()==null||t5.getText()==null ||t6.getText()==null){
				JOptionPane.showMessageDialog(null,"Complete All Informations","Error",0);
			}
			else{
				int i1 = Integer.parseInt(t1.getText());
				int i2 = Integer.parseInt(t2.getText());
				int i3 = Integer.parseInt(t3.getText());
				int i4 = Integer.parseInt(t4.getText());
				int i5 = Integer.parseInt(t5.getText());
				String i6 = t6.getText();
				try{
				tg = new TurtleGraghice(i1,i2,i3,i4,i5,i6);
				
				}catch(Exception ex){
					t6.setText("");
					JOptionPane.showMessageDialog(null,"you mast enter string contain on F,f,+,-,r,g,b");
					
				 }
				   
				 }
			
		}
		
		 if(e.getSource()==cs){
			 if(cs.getSelectedIndex()==0){
				 tg.x =200;
				 tg.y=200;
	             tg.len=50 ;
	             tg.dir=0;
	             tg.ang=45;
	             tg.s="---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F++F-F-F-F-F-F-F-F";
	             tg = new TurtleGraghice(tg.x,tg.y,tg.len,tg.ang,tg.dir=0,tg.s);
	             
	            }
	            else if(cs.getSelectedIndex()==1){
	                tg.x =200;
	                tg.y=200;
	                tg.len=50 ;
	                tg.dir=0;
	                tg.ang=45;
	                tg.s="---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F";
	                tg = new TurtleGraghice(tg.x,tg.y,tg.len,tg.ang,tg.dir,tg.s);
		            
	            }
	            else if(cs.getSelectedIndex()==2){
	                tg.x =200;
	                tg.y=200;
	                tg.len=60 ;
	                tg.dir=0;
	                tg.ang=30;
	                tg.s="F--F++++F----F++++F++++F----F++++F----F++++F++++F----F++++F--F----F";
	                tg = new TurtleGraghice(tg.x,tg.y,tg.len,tg.ang,tg.dir,tg.s);
		           
	            }
	            else if(cs.getSelectedIndex()==3){
	                tg.x =200;
	                tg.y=200;
	                tg.len=50 ;
	                tg.dir=0;
	                tg.ang=30;
	                tg.s="-F-F++++F-F++++F-F++++F-F";
	                tg = new TurtleGraghice(tg.x,tg.y,tg.len,tg.ang,tg.dir,tg.s);
		           
	            }
	            else if(cs.getSelectedIndex()==4){
	                tg.x =200;
	                tg.y=200;
	                tg.len=80 ;
	                tg.dir=0;
	                tg.ang=30;
	                tg.s="F+++F+++F+++F+F++++F-F++++F-F++++F-F++++F";
	                tg = new TurtleGraghice(tg.x,tg.y,tg.len,tg.ang,tg.dir,tg.s);
		            
	            }
	            else if(cs.getSelectedIndex()==5){
	                tg.x =200;
	                tg.y=200;
	                tg.len=60 ;
	                tg.dir=0;
	                tg.ang=45;
	                tg.s="F-F++F-F+++F--F+++F-F++F-F+++F--F";
	                tg = new TurtleGraghice(tg.x,tg.y,tg.len,tg.ang,tg.dir,tg.s);
		            
	            }
	        }
	}
	
	public static void main(String[] args){
		new TurtleGraghiceGUI();
	}
}
