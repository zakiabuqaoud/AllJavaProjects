package System;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.awt.Desktop ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.File ;
import java.io.IOException ;

public class Systemz extends JFrame implements ActionListener {
	Container  c  ;
	JButton b1,b2,b3 ;
	JLabel l1,l2,l3 ;
	ProcessBuilder process ;
	public Systemz(){
		c = getContentPane();
	    b1 = new JButton ("Create Processor");
	    b2 = new JButton ("Close Processor");
	    b3 = new JButton ("Exit");
	
	    l1 = new JLabel("Create Processor");
	    l2 = new JLabel("Close Processor");
	    l3 = new JLabel("Exit");
	     
	   
	    
	    setVisible(true);
    	setSize(500,300);
    	setResizable(false);
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	this.setLayout(null);
    	
    	c.add(l1);
    	c.add(l2);
    	c.add(l3);
    	c.add(b1);
    	c.add(b2);
    	c.add(b3);
    	/**/
    	
    	b1.setBounds(180,30,220,30);
    	b2.setBounds(180,100,220,30);
    	b3.setBounds(180,150,220,30);
    	l1.setBounds(30,30,300,30);
    	l2.setBounds(30,90,100,40);
    	l3.setBounds(30,150,30,30);
    	
      	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
	
	}
	
	
    public void actionPerformed(ActionEvent e2) {
    	
    		if (e2.getSource() == b1){
    			/*Desktop.getDesktop().open(new File("F:\\Files\\myfile.txt"));*/
    			 process = new ProcessBuilder("C:\Program Files (x86)\Brackets \Brackets.exe") ;
    			 process.start();
    		
    		}
            if (e2.getSource() == b2){
            	 process = new ProcessBuilder("C:\Program Files (x86)\Brackets \Brackets.exe") ;
    			 process.exit() ;
    		}
            if (e2.getSource() == b3){
            	System.exit(0);
    		}
}
    public static void main (String[] args){
    	
    	new Systemz() ;

    	}
}
