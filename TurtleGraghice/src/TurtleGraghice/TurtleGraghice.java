package TurtleGraghice;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//20172106
//zaki khalid abu qaoud
import java.awt.*;

import javax.swing.*;

import java.util.*;

public class TurtleGraghice extends JFrame {
	int x,y,len,ang,dir;
	String s ;
	
	
	public TurtleGraghice(){}
	public TurtleGraghice(int x ,int y ,int len ,int ang ,int dir,String s){
		this.x = x ;
		this.y = y ;
		this.len = len ;
		this.ang = ang ;
		this.dir = dir ;
		this.s= s ;
	}
	
	public void moveTo(Graphics2D g2d){
		g2d.translate(x,y);
	}
	public void moveToDir(Graphics2D g2d){
		g2d.rotate(dir*Math.PI/180);
	}
	public void forward(Graphics2D g2d){
		g2d.drawLine(0,0,len,0);
		g2d.translate(len,0);
	}
	public void forwardNotPaint(Graphics2D g2d){
		g2d.translate(len,0);
	}
	public void right(Graphics2D g2d){
		g2d.rotate(ang*Math.PI/180);
	}
	public void left(Graphics2D g2d){
		g2d.rotate(-ang*Math.PI/180);
	}
	public void checkString(Graphics2D g2d){
		char c ;
		for(int i=0;i<s.length();i++){
		c = s.charAt(i);
		if(c=='F')
			forward(g2d);
		else if(c=='f')
			forwardNotPaint(g2d);
		else if(c=='+')
			right(g2d);
		else if(c=='-')
			left(g2d);
		else if(c=='g')
			g2d.setColor(Color.green);
		else if (c=='r')
			g2d.setColor(Color.red);
		else if(c=='b')
			g2d.setColor(Color.blue);
		}
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		moveTo(g2d);
		moveToDir(g2d);
		checkString(g2d);
		
		}
	
}
