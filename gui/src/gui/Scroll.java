package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.*;
public class Scroll extends JFrame{
	Container c;
	JTextArea ta;
	JScrollPane sel ;
	JPanel p ;
	
	
	Scroll(){
		c=getContentPane();
		p = new JPanel();
		ta = new JTextArea();
		sel = new JScrollPane(p,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p.setBounds(20,20,1100,400);
	//	sel = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(sel);
		
		
		

	    
		
		/////////////////////////////////////
		//sel.setViewportView(gogo);
		///////////////////////////
		setSize(1200,700);
		setTitle("Scroll");
		setVisible(true);
	//	setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		//////////////////////////////
	}
	
	
	public static void main(String[]  args){
		new Scroll();
	}

}
