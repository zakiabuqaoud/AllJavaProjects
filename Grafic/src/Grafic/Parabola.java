package Grafic;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame ;
public class Parabola extends JFrame {
	int x,y,xc=200,yc=200; 
	public Parabola(){
		setTitle("Parabola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,400);
		setVisible(true);
	}
	public double y(int x){
		double y = -Math.pow((x -50),2) +40.0;    
		return y;	
			}

	public void paint(Graphics gr){
		super.paint(gr);
		gr.drawLine(0,yc,699,yc);
		gr.drawLine(xc,0,xc,399);
		for ( x = 34; x <=65; x++) {   
			gr.drawLine(200+x, 200-(int)Math.round(y(x)), 201+x, 200-(int)Math.round(y(x+1)));
			  }
		}
	
	public static void main (String[] args){
		new Parabola();
	}		
	}

