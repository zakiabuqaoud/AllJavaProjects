package Grafic;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame ;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Timer ;
public class VegetaTimer extends JFrame implements ActionListener {
	int xc = 250 ,yc = 250,i = 10 ;
	Timer time ;
	public VegetaTimer(){
		time = new Timer(700,this);
		time.start();
		setTitle("java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics gr){
		super.paint(gr);
		gr.drawOval(xc-i,yc-i,2*i,2*i);
	}
	public void actionPerformed(ActionEvent a) {
		
		if(i<150){
			i+=10 ;
			//getGraphics().drawOval(xc-i,yc-i,2*i,2*i);//ÊÑÓã ÏÇÆÑÉ ÇÎÑì
			repaint() ;//ÊÚíÏ ÇáÑÓã
		}
		else
			time.stop();
		
	}
	public static void main(String[] args ){
		new VegetaTimer();
	}
}
