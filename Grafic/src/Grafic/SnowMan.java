package Grafic;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame ;

import java.awt.Insets;


public class SnowMan extends JFrame {
	public SnowMan(){
		setTitle("java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
	}
	
	public void paint(Graphics gr){
		super.paint(gr) ;
		Insets ins = getInsets();//Õ Ï ·« ÌÕ”» «ÿ«— frame
		int top =ins.top ;
		int left = ins.left;
		gr.setColor(Color.CYAN);
		gr.fillRect(left,top,500,500);
		//////////////////////////////
		gr.setColor(Color.BLUE);
		gr.fillRect(left,387,500,500-385);
		//////////////////////////////////
		gr.setColor(Color.YELLOW);
		gr.fillArc(left-100,top-100,200,200,0,360);
		/////////////////////////////////
		gr.setColor(Color.WHITE);
		gr.fillOval(127,265,245,120);
		gr.fillOval(168,152,157,115);
		gr.fillOval(215,96,65,65);
		//////////////////////////////////
		gr.setColor(Color.BLACK);
		gr.drawLine(168,205,135,155);
		gr.drawLine(324,205,386,205);
		gr.drawLine(215,92,278,92);
		gr.fillRect(219,66,56,27);
		/////////////////////////////////
		gr.fillOval(215+16,92+16, 7,7);
		gr.fillOval(215+39,92+16,7,7);
		gr.drawArc(225,102,45,45,180,180);
		
		
		
	}
	public static void main(String[] args ){
		new SnowMan();
	}
}
