package Grafic;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame ;

public class g extends JFrame {
	public g(){
		setTitle("java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,700);
		setVisible(true);
	}
	public void paint(Graphics gr){
		super.paint(gr);
		gr.setColor(Color.red);
		gr.setFont(new Font("Tahoma",Font.BOLD,18));
		gr.drawString("zaki", 20,50);
		gr.drawRect(100,100,100,100);
		gr.fillRect(300,200,100,100);
		gr.drawOval(400,300,100,100);
		gr.fillOval(600,200,200,100);
	}
	public static void main(String[] args ){
		new g();
		
	}
}
