package Grafic;

import java.awt.Graphics; 
import javax.swing.JFrame;  
public class Home extends JFrame { 
 int x,y;  
 	  public Home () {   
 	  	setSize(700,450); 	setVisible(true); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  }
public void paint(Graphics g) { 
	super.paint(g); 
	g.drawLine(0, 200, 699, 200);  
	g.drawLine(200, 0, 200, 449);
	for (int x = 34; x <=65; x++) {   
	g.drawLine(200+x, 200-(int)Math.round(y(x)), 201+x, 200-(int)Math.round(y(x+1)));
	  } }  
public static void main(String[] args) {   
		new Home (); }  
public double y(int x){
double y = -Math.pow((x -50),2) +40.0;      return y;	
	}}
