package Grafic;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.*;

import javax.swing.JFrame ;
public class Reflection extends JFrame {
	int xc=200,yc=200; 
	Polygon p ;
	double m[];
	public Reflection() {
		setTitle("Reflection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,400);
		setVisible(true);
		p = new Polygon(); 
		p.addPoint(160,130);
		p.addPoint(220,130);
		p.addPoint(220,160);
		p.addPoint(190,180);
		p.addPoint(160,160);
		m = new double[6];
	}
	public void paint(Graphics gr){
		super.paint(gr);
		Graphics2D g2d = (Graphics2D)gr;
		gr.drawLine(0,500,500,0);
		gr.drawPolygon(p);
		g2d.rotate(-45*Math.PI/180,500,0);
		AffineTransform t1 = new AffineTransform(1,0,0,-1,0,0);
		g2d.transform(t1);
		g2d.rotate(45*Math.PI/180,500,0);
		gr.drawPolygon(p);
		AffineTransform t2 = g2d.getTransform();
		t2.getMatrix(m);
		for(int i =0;i<6;i++)
			System.out.print(m[i]);
		
	}
	public static void main (String[] args){
		new Reflection();
	}
}
