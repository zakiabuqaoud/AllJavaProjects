package TurtleGraghice;
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ
//20172106
import java.awt.*;
import java.util.*;

import javax.swing.*;

import java.awt.Graphics;

public class TurtlePaint extends JFrame {
	TurtleGraghice tg = new TurtleGraghice() ;
	TurtlePaint(){
		
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		tg.moveTo(g2d);
		tg.moveToDir(g2d);
		tg.checkString(g2d);
		
		}
	
	}

