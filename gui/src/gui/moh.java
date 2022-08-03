package gui;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
public class moh extends JFrame implements ActionListener,ItemListener {
	
	

 
		
		Container con ;
		JLabel l1,l2,l3,l4 ;
		JTextField t1,t2 ;
		JTextArea a1 ;
		JComboBox c1 ;
		JButton b1 ;
		String s1[] ={"+","-","*"} ;

		public moh(){
			
			this.setTitle("Test");
			this.setSize(501,420);
			this.setResizable(false);
			this.setVisible(true);
			this.setLayout(null);
			
			con =getContentPane() ;
			l1 =new JLabel("Number1");
			l2 =new JLabel("Number2");
			l3 =new JLabel("Operation");
			l4 =new JLabel("Result");
			t1 =new JTextField();
			t2 =new JTextField();
			a1 =new JTextArea();
			c1 =new JComboBox(s1);
			b1 =new JButton("Compute") ;
			c1.setSelectedIndex(0);	
			l1.setBounds(20,20,50,30);
			l2.setBounds(20,70,50,30);
			l3.setBounds(20,120,50,30);
			l4.setBounds(20,170,50,30);
			t1.setBounds(100,20,100,40);
			t2.setBounds(100,70,100,40);
			a1.setBounds(100,170,100,40);
			c1.setBounds(100,120,100,40);
			b1.setBounds(130,300,140,100);

			con.add(l1);
			con.add(l2);
			con.add(l3);
			con.add(l4);
			con.add(t1);
			con.add(t2);
			con.add(a1);
			con.add(c1);
			con.add(b1);

	        b1.addActionListener(this);
			
		}
		
	public void actionPerformed(ActionEvent e){
	int a =Integer.parseInt(t1.getText());
	int b =Integer.parseInt(t2.getText());

		if(e.getSource() ==b1){
			if(c1.getSelectedItem().equals("+")){
				int r =a+b ;
				a1.setText(r+"");
			}
			
			if(c1.getSelectedItem().equals("-")){
				int r =a-b ;
				a1.setText(r+"");
			}
			if(c1.getSelectedItem().equals("*")){
				int r =a*b ;
				a1.setText(r+"");
				
			}
				
		
		}
	}	
	public void itemStateChanged(ItemEvent e){}

	public static void main(String[] args){
		new moh();
	}

	}

