package javaproject;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.* ;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class AddNewDeparment extends JFrame implements ActionListener ,ItemListener{
      Container c ;
      JButton b1,b2 ;
      JLabel l1,l2 ;
      JTextArea a ;
      JTextField t ;
      

    public  AddNewDeparment(){
    	
    b1 =new JButton("Add new Deparment");
    b2 =new JButton("cancel");
    l1 = new JLabel();
    l2 = new JLabel(); 
     t= new JTextField();
     a = new JTextArea();
     
     
     
     
       setTitle("Add new Deparment");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setResizable(false);
	   setVisible(true);
	   setLayout(null);
	   setSize(800,1000);
     
    	
	   c.add(a);
	   c.add(b1);
	   c.add(b2);
	   c.add(l1);
	   c.add(l2);
	   c.add(t);
	   
	   b1.setBounds(20,700,150,60);
	   b2.setBounds(300,700,150,60);
	   l1.setBounds(20,50,50,50);
	   l2.setBounds(20,120,70,50);
	   a.setBounds(20,200,500,500);
	   t.setBounds(100,50,200,50);
	   
	   
	   
    }




     public void actionPerformed(ActionEvent e){
    	 if (e.getSource()==b1){
    		 new AddNewDeparment() ;
    	 }
    	 
    	 
    	 if (e.getSource()==b2){
    		 this.setVisible(false);
    	 }
     }


     public void itemStateChanged(ItemEvent e){}




   public static void main(String[] args){}
   AddNewDeparment n =new  AddNewDeparment();


}








