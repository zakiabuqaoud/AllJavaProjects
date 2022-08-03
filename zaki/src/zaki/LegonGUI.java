package zaki;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LegonGUI extends JFrame implements ActionListener  {
	


	
		Container c ;
		JButton b1,b2;
		JTextField t1,t2 ;
		JLabel l1,l2 ;
		
		 public LegonGUI() {
	
			b1 = new JButton("login")  ;
			b2 = new JButton("cancel")  ;
			l1=new JLabel("user name");
			l2=new JLabel("passWort");
	     	t1 =new JTextField();
		    t2 =new JTextField();
		    
		    
		    c.add(b1);
		    c.add(b2);
		    c.add(l1);
		    c.add(l2);
		    c.add(t1);
		    c.add(t2);
		    
		    setTitle("Login window");
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setResizable(false);
		    setVisible(true);
		    setLayout(null);
		    setSize(500,500);
		    
		    b1.setBounds(60,400,60,50);
		    b2.setBounds(170,400,60,50);
		    l1.setBounds(20,50,60,30);
		    l2.setBounds(20,100,60,30);
		    t1.setBounds(300,50,200,30);
		    t2.setBounds(300,100,200,30);
		    
			
		
		    
		  b1.addActionListener(this);
		   b2.addActionListener(this);
		    
		    
		}



		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
				new   LegonGUI() ;
			}
				
				
				if(e.getSource()==b2){
					System.exit(0);
				}
		}
		public static void main(String[] args){
		new   LegonGUI();
		
		

	}

}
