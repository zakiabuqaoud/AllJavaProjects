package Grafic;

////////////////////////////////////////////////////////////////////
import java.awt.*;

import javax.swing.*;

import java.util.*;
/////////////////////////////////////////////////////////////////////
abstract class GraphicsObj extends JFrame {
private Color color;
//Create an object with default color blue
public GraphicsObj(){ 
Color colorBlue = new Color(0,0,255);
setColor(colorBlue);

}
//Create an object with the specified color
public GraphicsObj(Color color){
setColor(color);

}
public Color getColor() {
return color;
}
public void setColor(Color color) {
this.color = color ;

}
public abstract void draw(Graphics g);
}
////////////////////////////////////////////////////////////////////
class MyLine extends GraphicsObj {
private int x1, y1, x2, y2;
private int val,dx,dy;
private float xi,yi,x,y;



//Create a line with the two endpoints(x1,y1) and (x2,y2) with the default color
public MyLine(int x1, int y1, int x2, int y2){
this.x1=x1 ;
this.x2=x1 ;
this.y1=x1 ;
this.y2=x1 ;
dx=x2-x1 ;
dy=y2-y1 ;
x=x1;
y=y1;

if(Math.abs(dx)>Math.abs(dy)){
val = Math.abs(dx);
}
else{
val = Math.abs(dy);
}
xi=dx/val;
yi=dy/val;
}
//Create a line with the two endpoints(x1,y1) and (x2,y2) with the specified color
public MyLine(int x1, int y1, int x2, int y2, Color color){
setColor(color) ;
this.x1=x1 ;
this.x2=x1 ;
this.y1=x1 ;
this.y2=x1 ;
dx=x2-x1 ;
dy=y2-y1 ;
x=x1;
y=y1;

if(Math.abs(dx)>Math.abs(dy)){
val = Math.abs(dx);
}
else{
val = Math.abs(dy);
}
xi=dx/val;
yi=dy/val;
} 
public void draw(Graphics g){
	for(int i=0;i<=val;i++){
			g.drawLine(Math.round(x),Math.round(y),Math.round(x),Math.round(y));
			x += xi;
			y +=yi ;
}

}

}
//////////////////////////////////////////////////////////////////////
class Ellipse extends GraphicsObj {
private boolean fill = false;
private int x, y, w, h;
//Create an ellipse with the default color and the default values x,y,w,h
public Ellipse(){ 
	this.x=10;
	this.y=10;
	this.w=50;
	this.h=30;
//default value
} 
//Create an ellipse with the default color and the specified values x,y,w,h
public Ellipse(int x, int y, int w, int h){
	this.x=x ;
	this.y=y ;
	this.w=w ;
	this.h=h ;
}
//Create an ellipse with the specified color and the specified values x,y,w,h
public Ellipse(int x, int y, int w, int h,Color color){
	setColor(color);
	this.x=x ;
	this.y=y ;
	this.w=w ;
	this.h=h ;
} 
//(xc,yc) is the center point of the ellipse, r1 the horizontal radius, r2 is the vertical radius
public void set (int xc, int yc, int r1, int r2){
	this.x = xc-r1 ;
	this.y = yc-r2 ;
	this.w = 2*r1  ;
	this.h = 2*r2  ;
}
//Filling the ellipse if fill is true
public void setFill(boolean fill){
	this.fill=fill ;

}
public void draw(Graphics g){
	if(fill){
		g.fillOval(x,y,w,h);
	}
	else{
		g.drawOval(x,y,w,h);
	}
}

}
//////////////////////////////////////////////////////////////////////
class Circle extends Ellipse {
//Create a circle with the center point (xr,yr) and the default color 
public Circle (int xc, int yc, int r){

super.set(xc-r,yc-r,2*r,2*r);
}
//Create a circle with the center point (xr,yr), radius r and  the specified color c 
public Circle (int xc, int yc, int r, Color c){
setColor(c) ;
super.set(xc-r,yc-r,2*r,2*r);
}
}
//////////////////////////////////////////////////////////////////////
class MyPolygon extends GraphicsObj {
private boolean fill = false;
public int x[], y[];
public MyPolygon(){
}
//Create a polygon with the default color
public MyPolygon (int x[], int y[]){
	for(int i=0;i<x.length;i++){
		this.x[i]=x[i];
	}
	for(int i=0;i<y.length;i++){
		this.y[i]=y[i];
	}

}
//Create a polygon with the specified color
public MyPolygon (int x[], int y[], Color color){
	setColor(color);
	for(int i=0;i<x.length;i++){
		this.x[i]=x[i];
	}
	for(int i=0;i<y.length;i++){
		this.y[i]=y[i];
	}
}
//Fill the polygon if fill is true
public void setFill(boolean fill){
	this.fill =fill ;
}
public void draw(Graphics g){
	if(fill)
		g.fillPolygon(x,y,x.length);
	else
		g.drawPolygon(x,y,x.length);

}

}
//////////////////////////////////////////////////////////////////////
class MyRectangle extends MyPolygon {

//create a rectangle with the upper left point(x1,y1),the lower right point(x2,y2) and default color
public MyRectangle(int x1, int y1, int x2, int y2){
	this.x = new int[4] ;
	this.y = new int[4] ;
	x[0]=x1 ;x[1]=x2;x[2]=x2;x[3]=x1;
	y[0]=y1 ;y[1]=y1;y[2]=y2;y[3]=y2;

} 
//create a rectangle with the upper left point(x1,y1) , width and height and specified color
public MyRectangle(int x, int y, int w, int h,Color color){
	setColor(color);
	this.x = new int[4] ;
	this.y = new int[4] ;
	this.x[0] =x;
	this.x[1]=x+w;
	this.x[2]=x+w;
	this.x[3]=x;
	this.y[0] =y;
	this.y[1]=y;
	this.y[2]=y+h;
	this.y[3]=y+h;

}
}
///////////////////////////////////////////////
class Triangle extends MyPolygon {
//Create a rectangle with the deault color
public Triangle(int x1,int y1, int x2, int y2, int x3, int y3){
	this.x = new int[3] ;
	this.y = new int[3] ;
	this.x[0] =x1;
	this.x[1] =x2;
	this.x[2] =x3;

	this.y[0] =y1;
	this.y[1] =y2;
	this.y[2] =y3;


}
//Create a rectangle with the specified color
public Triangle(int x1,int y1, int x2, int y2, int x3, int y3, Color color){
	setColor(color);
	this.x = new int[3] ;
	this.y = new int[3] ;
	this.x[0] =x1;
	this.x[1] =x2;
	this.x[2] =x3;

	this.y[0] =y1;
	this.y[1] =y2;
	this.y[2] =y3;
}
}
//////////////////////////////////////////////////////////////////////////
class DrawingPanel extends JPanel {
private ArrayList <GraphicsObj> complexObject;

//Create a complex obejct which contains of some simple objects 
//For example a flag contains of anumber of objects of type GraphicsOj
public DrawingPanel(){
	complexObject = new ArrayList<> ()  ;
	GraphicsObj go =new Ellipse();
	addObj(go);
	
}
//add an object of type GraphicsObj to the complex object
public void addObj(GraphicsObj obj){
	complexObject.add(obj);

}
public void paint(Graphics g){
	super.paint(g);
	for(int i=0;i<complexObject.size();i++){
		complexObject.get(i).draw(g);
	}
}
}
//////////////////////////////////////////////////////////////////////////
class Main extends JFrame {
private DrawingPanel drawing = new DrawingPanel();
public Main(){
	setTitle("java");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,500);
	setVisible(true);
	add(drawing);

}
public static void main(String args[]){
	new Main();
}
}
//////////////////////////////////////////////////////////////////////////



