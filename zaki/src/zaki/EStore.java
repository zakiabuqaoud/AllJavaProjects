package zaki;
import javax.swing.*;
import java.awt.*;
import java.awt.event.* ;
public class EStore extends JFrame implements ActionListener {
	 

	
		  Container c ;
         JMenuBar set ;
	     JMenu m1 ;
	     JMenuItem i1,i2,i8 ;
	     JPanel p1 ;
	     JLabel l ;
	    public EStore(){
	    	 c=getContentPane();
	    	 setVisible(true);
	    	 setTitle(" ");
	    	 setSize(400,400);
	    	 setResizable(false);
	    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	 
	    	 p1 = new JPanel();
	    	
	    	 l = new JLabel("zeko");
	         set = new JMenuBar(); 
	    	 JMenu m1 = new JMenu("eStore");
	    	 JMenuItem i1 = new  JMenuItem("Manager Window");
	    	 JMenuItem i2 = new  JMenuItem("Customer Window");
	    	 JMenuItem i8 = new  JMenuItem("Exit");
	    /*	 
	    	 p1.setLayout(new GridLayout(1,2));
	    	 c.add(p1);
	    	 p1.add(p2);
	    	 p2.setBackground(Color.RED);
	    	 p1.add(l);
	    	 */
	    	 
	    	//////////////////////////
	    	 l.setBounds(0,28,350,305);
	    	 l.setIcon(new ImageIcon("C:\\img\\gon.png"));
	    	 add(l);
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 ////////////////////////////
	    	 
	    	 c.add(set,BorderLayout.NORTH);
	    	 set.add(m1);
	    	 m1.add(i1);
	    	 m1.add(i2);
	    	 m1.add(i8);
	    	 
	    	 
	    	 i1.addActionListener(this);
	    	 i2.addActionListener(this);
	    	 i8.addActionListener(this);
	    	 
	     }

	     
		 public void actionPerformed(ActionEvent e1 ){
			 if(e1.getSource()== i1){
				// new product();			
			 }
			 if(e1.getSource()== i2){
				//new CustomerWindow();
				 }
			 
			 if(e1.getSource().equals(i8))
				System.exit(0);
				
		 }
		 
		public static void main(String[] args){
	         new EStore();}

	   }

