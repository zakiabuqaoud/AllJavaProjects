package javaproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.* ; 
//no
     public class Deparment extends JFrame implements ActionListener,ItemListener{
    	 Container c ;
    	 JButton b1,b2,b3,b4 ;
    	 JLabel l1,l2,l3,l4,l5,l6 ;
    	 JTree tr1,tr2,tr3,tr4 ; ;
    	 JPanel p1,p2,p3 ;
    	 JComboBox cb ;
    	 int i[]= {1,2,3,4,5,6,7};
    	 
    	 
    	 public  Deparment (){
    		c = getContentPane();
    		b1 = new JButton("login");
    		b2 = new JButton("shope product");
    		b3 = new JButton("view cart");
    		l1 = new JLabel("cuantiter");
    		l2 = new JLabel("product");
    		l3 = new JLabel("price");
    		l4 = new JLabel("Guther Here m");
    		l5 = new JLabel(" ");
    		l6 = new JLabel("Descripllon");
    		cb = new JComboBox();
    	   
    		
    		
    		
    		c.add(b1);
    		c.add(b2);
    		c.add(b3);
    		
    		setTitle("Welcome to store");
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setVisible(true);
    		setResizable(false);
    		setSize(500,500);
    		setLayout(null);
    		
    		
    		
    		b1.setBounds(30,30,200,200);
    		
    		
    		b1.addActionListener(this);
    		b2.addActionListener(this);
    		b3.addActionListener(this);
    		
    		
    		
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 /*Container c ;
        JLabel l1,l2,l3 ;
        JButton b1,b2 ;
        JTextField t ;
     //   JTree t1,t2,t3    ;
        JTabbedPane tb1 ;
        JTextArea a ;
//        JFrame f ;

        public Deparment (){
        	c = getContentPane();

 //       	f =new JFrame() ;
        
   
        	tb1 = new JTabbedPane();
        	
        	
        

        	t = new JTextField();
        	//t1 = new JTree();
        	///t2 = new JTree();
        //	t3 = new JTree();
        	a = new JTextArea();
        	
        	this.setVisible(true);
        	this.setLayout(null);
        	this.setResizable(false);
        	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	this.setTitle("Manager Window");
        	this.setSize(800, 600);
      /*  	f1.setVisible(true);
        	f2.setVisible(true);
        	f3.setVisible(true);
        	*/
        /*	b1.setBounds(50,350,70,50);
        	b2.setBounds(120,350,70,50);
        	a.setBounds(300,200,100,90);
        	t.setBounds(300,150,100,40);
        	l1.setBounds(20,80,100,20);
        	l2.setBounds(140,150,60,20);
        	l3.setBounds(140,200,70,50);
        //	t1.setBounds(1,1,1,1);
        //	t2.setBounds(1,1,1,1);
        //	t3.setBounds(1,1,1,1);
        //	tb1.setBounds(0,0,500,500);
        	
        	
        	
        	c.add(tb1);
        	c.add(t);
        	c.add(b1);
        	c.add(b2);
        	c.add(l1);
        	c.add(l2);
        	c.add(l3);
        	c.add(a);
        //	c.add(t1);
        //	c.add(t2);
        //	c.add(t3);
        	
        	
        	
        	//b1.addActionListener(this);
        	//b2.addActionListener(this);
        
        }
        
	 
    	 	 
    	 
     }*/
    	 
    	 public void actionPerformed(ActionEvent e) {
			if (e.getSource()== b1){
				new Login();
			}
				
			
		}
	
    	 public static void main (String[] args){
    			new Deparment();
    		

}

		public void itemStateChanged(ItemEvent arg0) {}
			
			
	
		}