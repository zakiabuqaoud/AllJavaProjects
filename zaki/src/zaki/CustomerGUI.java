package zaki;
import javax.swing.*;
import java.awt.*;
import java.awt.event.* ;
public class CustomerGUI extends JFrame implements ItemListener,ActionListener{
	
	 

	
	         Container c ;
	         JPanel p1,p2,p3 ;
	         JButton b1,b2,b3,b4 ;
	         JLabel l1,l2,l3,l4,l5,l6 ;
	         JTextArea a ;
	         JComboBox cb ;
	         JList tr ;
	         String[] s ={"1","2","3","4","5","6","7","8","9"};
	         
	         public CustomerGUI(){
	        	p1=new JPanel();
	        	p2=new JPanel();
	        	p3=new JPanel();
	        	b1 =new JButton("login");
	        	b2 =new JButton("shop product");
	        	b3 =new JButton("view card");
	        	b4 =new JButton("Add to card");
	        	l1 = new JLabel("Quantity");
	        	l2 = new JLabel("product");
	        	l3 = new JLabel("");
	        	l4 = new JLabel("price");
	        	l5 = new JLabel("");
	        	l6 = new JLabel("Discription");
	        	a  =new JTextArea();
	        	cb = new JComboBox();
	        	tr = new JList();
	        	cb.setModel(new DefaultComboBoxModel(s));
	        	cb.setSelectedIndex(0);
	        	////////////////////
	        	setTitle("Customer Window ");
	    	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    setResizable(false);
	    	    setVisible(true);
	    	    setLayout(null);
	    	    setSize(1000,1000);
	    	    p1.setLayout(null);
	    	    p2.setLayout(null);
	    	    p3.setLayout(null);
	          //////////////////////////  
	        	p1.add(b1);
	        	p1.add(b2);
	        	p1.add(b3);
	        	///////////////
	        	p2.add(b4);
	        	p2.add(a);
	        	p2.add(l1);
	        	p2.add(l2);
	        	p2.add(l3);
	        	p2.add(l4);
	        	p2.add(l5);
	        	p2.add(l6);
	        	p2.add(cb);
	        	////////////////
	        	p3.add(tr);
	        	//////////////
	        	p1.setBounds(10,10,900,200);
	        	p2.setBounds(10,250,450,700);
	        	p3.setBounds(470,250,450,700);
	        	///////////////// 
	        	b1.setBounds(60,100,80,50);
	        	b2.setBounds(200,100,80,50);
	        	b3.setBounds(302,100,80,50);
	        	b4.setBounds(700,350,80,200);
	        	l1.setBounds(600,350,50,50);
	        	l2.setBounds(600,420,100,50);
	        	l3.setBounds(710,420,100,50);
	        	l4.setBounds(600,500,100,50);
	        	l5.setBounds(720,500,100,50);
	        	l6.setBounds(600,570,100,50);
	        	a.setBounds(600,650,200,1200);
	        	tr.setBounds(20,300,400,400);
	        	cb.setBounds(710,350,50,50);
	        	 
	        	 b1.addActionListener(this);
	        	 b2.addActionListener(this);
	        	 b3.addActionListener(this);
	        	 b4.addActionListener(this);
	         }
	         
	         
	      public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
			//	new Login();
			}
			if(e.getSource()==b2){
				
			}
	        if(e.getSource()==b3){
				
			}
	        if(e.getSource()==b4){
				
			}
			
		}

		
		public void itemStateChanged(ItemEvent e) {
			
			
		}
		public static void main (){
			new CustomerGUI();
		}

	}


