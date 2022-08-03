package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.* ;

public class Reme extends JFrame implements ActionListener {
         Container c ;
         JButton b1,b2 ;
         JLabel l1,l2 ;
         JTextField t1,t2,result ;
	
       public Reme(){
    	   c = getContentPane();
    	   setTitle("zeko");
    	   setLayout(null);
    	   b1 = new JButton("calucted");
    	   b2 = new JButton("Exit");
    	   l1 =new JLabel("first number");
    	   l2 =new JLabel("socond number");
    	   t1 =new JTextField("write the first nummber",8);
    	   t2 =new JTextField("write the socond nummber",8);
    	   result = new JTextField();
    	   
    	   
    	   result.setEditable(false);
    	   setSize(500,500);
    	   setVisible(true);
    	   setResizable(false);
    	   setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	   
    	   b1.setBounds(100,300,100,80);
    	   b2.setBounds(200,300,100,80);
    	   l1.setBounds(20,20,70,30);
    	   l2.setBounds(20,80,100,30);
    	   t1.setBounds(120,20,200,50);
    	   t2.setBounds(120,80,200,50);
    	   result.setBounds(200,400,200,50);
    	   
    	   c.add(b1);
    	   c.add(b2);
    	   c.add(l1);
    	   c.add(l2);
    	   c.add(t1);
    	   c.add(t2);
    	   c.add(result);
    	   
    	    b1.addActionListener(this);
    	    b2.addActionListener(this);
    	   
    	   
       }

       
       public void actionPerformed(ActionEvent e1) {
    	
    	   if(e1.getSource()==b2)
    		   System.exit(0);
    	   
    	   if(e1.getSource()==b1){
    		   float x,y ;
    		   x=Float.parseFloat(t1.getText());
    		   //Õ«Ê·Ì «·Ì «‰« ﬂ » Â «—ﬁ„ ⁄‘—Ì
    	      y=Float.parseFloat(t2.getText());
    	      result.setText(Float.toString(x+y));
    	      }
    
    		  	   
       }
	
		
    public static void main (String[] args){
    	new Reme();
    }
	

}
