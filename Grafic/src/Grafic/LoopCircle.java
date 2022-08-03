package Grafic;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame ;

public class LoopCircle extends JFrame {
	int xc =250 , yc = 250 ;
	public LoopCircle(){
		setTitle("java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
		}
	
	public void paint(Graphics gr){
		super.paint(gr);
		for(int i =10 ;i<=150 ;i+=10){
			gr.drawOval(xc-i,yc-i,2*i,2*i);
		}
			
	}
	
	
}
