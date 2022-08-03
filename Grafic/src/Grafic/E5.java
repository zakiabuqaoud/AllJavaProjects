package Grafic;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class E5 extends JFrame {
	JFrame f;
    Graphics2D g2d;
    public E5(){
    	setTitle("E5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
		setVisible(true);
		setLocationRelativeTo(null);
    }
    public void moveToDir (double ang,int x,int y){
        g2d.rotate((ang*Math.PI/180),x,y);
    }
    public void left (double ang){
        g2d.rotate((-ang*Math.PI/180));
    }
    public void Right (double ang){
        g2d.rotate(ang*Math.PI/180);
    }
    public void forward (int len,String t){
        if(t == "line"){
            g2d.drawLine(0,0,len,0);
        }else if(t == "oval"){
            g2d.drawOval(0,0,len,len/4);
        }
        g2d.translate(len,0);
    }
    public void moveTo (int x, int y){
        g2d.translate(x,y);
    }
    public void paint(Graphics g){
        super.paint(g);
        g2d=(Graphics2D)g;
        moveTo(300,300);
        for(int i=0;i<=3;i++){
            g2d.drawOval(0, -15, 120, 30);
            this.left(-60);
            this.forward(120, "line");
            this.left(120);
            g2d.setColor(Color.blue);
            g2d.drawOval(0, -15, 120, 30);
            this.left(-60);
            g2d.setColor(Color.blue);
            g2d.fillOval(0, -15, 120, 30);
            this.forward(120, "line");
            g2d.setColor(Color.red);
            g2d.fillRect(-90, 0, 60, 60);
            this.left(120);
            g2d.drawOval(0, -15, 120, 30);

        }
    }
    public static void main(String[] args) {
        new E5();
    }
}

