package zaki;
import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;
public class NewProductGUI extends JFrame implements ActionListener ,ItemListener {
	
	

	
	      Container c ;
	      JButton b1 ;
	 	  JLabel l1,l2,l3,l4,l5 ;
	 	  JTextField t1,t2,t3 ;
	 	  JTextArea a ;
	 	  JComboBox cb ;
	      
	 	public NewProductGUI(){
	 		c = getContentPane();
	        t1 = new JTextField();
	        t2 = new JTextField();
	        t3 = new JTextField();
	    	b1 = new JButton("Add new product");
	    	l1 = new JLabel("product name");
	    	l2 = new JLabel("price");
	    	l3 = new JLabel("Quantity");
	    	l4 = new JLabel("Discription");
	    	l5 = new JLabel("Deparment");
	    	cb = new JComboBox();
	    	a = new JTextArea();
	    	
	    	
	    	
	    	
	    	
	    	
	 	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	///////////////////////	
	    	setVisible(true) ;
	    	setResizable(false);
	    	setSize(800,800);
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setLayout(null);
	    	setTitle("Add new product");
	    /////////////////////////	
	 		
	 		c.add(t1);
	 		c.add(t2);
	 		c.add(t3);
	 		c.add(l1);
	 		c.add(l2);
	 		c.add(l3);
	 		c.add(l4);
	 		c.add(l5);
	 		c.add(a);
	 		c.add(cb);
	 		c.add(b1);
	 		///////////////////////////////////
	 		l1.setBounds(20,20,80,50);
	 		l2.setBounds(20,90,80,50);
	 		l3.setBounds(20,160,80,50);
	 		l4.setBounds(20,220,80,50);
	 		l5.setBounds(20,400,80,50);
	 		b1.setBounds(100,600,200,50);
	 		t1.setBounds(200,20,200,50);
	 		t2.setBounds(200,90,200,50);
	 		t3 .setBounds(200,160,100,50);
	 		a.setBounds(200,220,200,150);
	 		cb.setBounds(200,400,100,50);
	 		////////////////////////////////////
	 		b1.addActionListener(this);
	 		
	 		
	 		
	 	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void itemStateChanged(ItemEvent e1) {
			
			
		}

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== b1){
				new NewProductGUI();
			}
			
			
		}
		public static void main(String[] args){
			new NewProductGUI();
		}

	}


