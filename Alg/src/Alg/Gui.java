package Alg;

import javax.swing.*;

import java.awt.* ;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener,ItemListener {
     Container c ;
     JButton b1,b2,b3,b4,b7 ;
     JTextField t ;
     JLabel l0,l1,l2,l3,l7;
     QueList q = new QueList();

	
	public Gui(){
		c= getContentPane();
		b1=new JButton("insert");
		b2=new JButton("back");
		b3=new JButton("remove");
		b4=new JButton("Exit");
		b7=new JButton("sort");
	
		t= new JTextField();
		l0 =  new JLabel("write num");
		l1 = new JLabel("insert");
		l2 = new JLabel("back");
		l3 = new JLabel("remove");
	
	
		/////////////////////////////////////
		setLayout(null);
		c.setBackground(Color.CYAN);
		setSize(400,400);
		setVisible(true);
		setResizable(true);
		setTitle("alg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	c.add(t);
	c.add(b1);
	c.add(b2);
	c.add(b3);
	c.add(b4);
	c.add(b7);
	c.add(l0);
	c.add(l1);
	c.add(l2);
	c.add(l3);
	

	
	
	
	l0.setBounds(30,30,100,30);
	t.setBounds(150,30,200,30);
	l1.setBounds(10,100,100,30);
	l2.setBounds(10,150,100,30);
	l3.setBounds(10,200,100,30);
	b1.setBounds(100,100,100,30);
	b2.setBounds(100,150,100,30);
	b3.setBounds(100,200,100,30);
    b4.setBounds(60,250,100,30);
    b7.setBounds(180,250,100,30);
  
	
	
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b7.addActionListener(this);
	
	
	}

	

	
	public void itemStateChanged(ItemEvent e) {
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b1){
			if(Integer.parseInt(t.getText()) < 0  ){
				JOptionPane.showMessageDialog(null, "error");
				t.setText("");
			}
			else if(Integer.parseInt(t.getText()) > 999 ){
				JOptionPane.showMessageDialog(null, "error");
				t.setText("");
			}
			else{
			q.insert(Integer.parseInt(t.getText()));
			t.setText("");
			JOptionPane.showMessageDialog(null,"insert");
			}
			
		}
	if(e.getSource()== b2){
		t.setText("");
			
		}
	if(e.getSource()== b3){
		if(q.empty())
	      b3.setEnabled(false);
		else{
		q.remove();}
			
		}
	if(e.getSource()== b4){
		System.exit(0);
}
	if(e.getSource()== b7){
		int[] arr = q.sort();
		for(int i =0;i<arr.length;i++){
			JOptionPane.showMessageDialog(null, arr[i]);
		}
	
	}

		
		
	}
	public static void main(String[]args){
		new Gui();
		
	}
}
