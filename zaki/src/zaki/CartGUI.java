package zaki;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CartGUI extends JFrame implements ActionListener,ItemListener {
	
	

	
	          Container c ;
	          JButton b1,b2 ;
	          JPanel p1,p2;
	          JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	          JTextArea a1,a2 ;
	          JTextField t ;
	          
	          
	            
		
		
		
		public CartGUI(){
			 c= getContentPane();
	    	 p1 = new JPanel();
	    	 p2 = new JPanel();
	    	 l1 =new JLabel("confirm order and subment");
	    	 l2 =new JLabel("shipping Aderss");
	    	 l3 =new JLabel("product");
	    	 l4 =new JLabel("");
	    	 l5 =new JLabel("quantity");
	    	 l5 =new JLabel("");
	    	 l6 =new JLabel("total Price");
	    	 l7 =new JLabel("");
	    	 l8 =new JLabel("Discription");
	    	 l9 =new JLabel("product");
	    	 l10 =new JLabel("");
	    	 l11=new JLabel("quantity");
	    	 l12=new JLabel("");
	    	 l13=new JLabel("total Price");
	    	 l14=new JLabel("");
	    	 l15=new JLabel("Total amount items in cart is");
	    	 l16=new JLabel("");
	    	 l17=new JLabel("Total amountitems price of items in cart is  ");
	    	 l18=new JLabel("");
	    	 
	    	 a1 = new JTextArea();
	         a2 = new JTextArea();
	         t= new JTextField();
	         b1 = new JButton("cancel checkout");
	         b2 = new JButton("confirmorder");
	         ////////////////////////////
			c.add(p1);
			c.add(p2);
			c.add(l15);
			c.add(l16);
			c.add(l17);
			c.add(l18);
			c.add(b2);
			c.add(a2);
		////////////////////////////
			p1.add(b1);
			p1.add(l1);
		///////////////////////////	
			p2.add(l2);
			p2.add(a1);
			//////////////////
			a2.add(l3);
			a2.add(l4);
			a2.add(l5);
			a2.add(l6);
			a2.add(l7);
			a2.add(l8);
			a2.add(l9);
			a2.add(l10);
			a2.add(l11);
			a2.add(l12);
			a2.add(l13);
			a2.add(l14);
			a2.add(t);
			///////////////////////////////
			setTitle("Cart Checked Window ");
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setResizable(false);
		    setVisible(true);
		    setLayout(null);
		    setSize(700,700);
		    p1.setLayout(null);
		    p2.setLayout(null);
		    a2.setLayout(null);
		    //////////////////////////////////
		    p1.setBounds(1,1,1,1);
		    p2.setBounds(1,1,1,1);
		    l1.setBounds(1,1,1,1);
		    l2.setBounds(1,1,1,1);
		    l3.setBounds(1,1,1,1);
		    l4.setBounds(1,1,1,1);
		    l5.setBounds(1,1,1,1);
		    l6.setBounds(1,1,1,1);
		    l7.setBounds(1,1,1,1);
		    l8.setBounds(1,1,1,1);
		    l9.setBounds(1,1,1,1);
		    l10.setBounds(1,1,1,1);
		    l11.setBounds(1,1,1,1);
		    l12.setBounds(1,1,1,1);
		    l13.setBounds(1,1,1,1);
		    l14.setBounds(1,1,1,1);
		    l15.setBounds(1,1,1,1);
		    l16.setBounds(1,1,1,1);
		    l17.setBounds(1,1,1,1);
		    l18.setBounds(1,1,1,1);
		    t.setBounds(1,1,1,1);
		    a1.setBounds(1,1,1,1);
		    a2.setBounds(1,1,1,1);
		    b1.setBounds(1,1,1,1);
		    b2.setBounds(1,1,1,1);
		    
		    
		    /////////////////////////
		    b1.addActionListener(this);
		    b2.addActionListener(this);
		    ///////////////////////////
			
			
		}

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
				
			}
			
			
			
			if(e.getSource()==b2){
				JOptionPane.showMessageDialog(null,"your order is subment  sucessfully \n Thankyou");
			}
			
		}

		
		public void itemStateChanged(ItemEvent e) {
		
			
		}
		public static void main(String[] args){
			
		}
		
		
		}



