package Grafic;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

import javax.swing.*;
public class TranformMatrix extends JFrame {
	Polygon p ;
	double m[];
	public TranformMatrix(){
		setTitle("java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		p = new Polygon(); 
		p.addPoint(100,100);
		p.addPoint(200,100);
		p.addPoint(200,150);
		p.addPoint(100,150);
		m = new double[6];
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		g.drawPolygon(p);//or g
		g2d.rotate(90*Math.PI/180,100,100);//only g2d
		g2d.getTransform().getMatrix(m);
		//OR AffineTransform t =g2d.getTransform();t.getMatrix(m);
		for(int i=0;i<m.length;i++){
			System.out.print(m[i]+"\n");
		}
		
	}
	public static void main(String[] arg){
		new TranformMatrix();
		
	}
}
