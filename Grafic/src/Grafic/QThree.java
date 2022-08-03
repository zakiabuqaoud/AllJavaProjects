package Grafic;


import java.awt.Graphics; 
import javax.swing.JFrame; 
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;
import java.awt.Color;
public class QThree extends JFrame { 
 	 Polygon p;
 	  public QThree() {   
 	  	setSize(700,450);
 	  	setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new Polygon();
		p.addPoint(160, 130); 
		p.addPoint(220, 130);
	    p.addPoint(220, 160);
		p.addPoint(190, 180);
		p.addPoint(160, 160); 
		  }
public void paint(Graphics g) { 
	super.paint(g); 
	Graphics2D g2d = (Graphics2D)g;
	g2d.drawLine(0,500,500,0);
	g2d.drawPolygon(p);  
	g2d.drawPolygon(p);
	g2d.rotate(-45*Math.PI/180,500,0);  
	g2d.transform(new AffineTransform(1,0,0,-1,0,0));  
	g2d.rotate(45*Math.PI/180,500,0);
	g2d.setColor(Color.blue); 
	g2d.drawPolygon(p); 	
		}  
		  	   	 		 	   		
public static void main(String[] args) {   
		new QThree(); }  }

