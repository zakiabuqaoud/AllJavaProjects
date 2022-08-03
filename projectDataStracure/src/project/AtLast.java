package project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AtLast extends JFrame implements ActionListener ,ItemListener {
	Container c;
	JPanel p;
	JButton b1,b2,b3;
	Font f;
	public JTextField t1,t2,t3,t4,t5,t6,t7;
	JLabel l2,l3,l4,l5,l6,l7,l8,l9;
	Creat cr;
	Student st;
	StudentsList list=null;
public AtLast(StudentsList l) {
	this.list=l;
	c=getContentPane();
	setLayout(null);
	Font font =new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,40);
	p=new JPanel();
	p.setLayout(null);
	b1=new JButton("OK");
	b3=new JButton("Back");
	setResizable(false);
	b2=new JButton("more");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	
	
	l2=new JLabel("Enter number");
	l3=new JLabel("Enter FirstName");
	l4=new JLabel("Enter lastName");
	l5=new JLabel("Enter mid");
	l6=new JLabel("Final");
	l7=new JLabel("Totel");
	l8=new JLabel("Add new Student");
	l9=new JLabel("Great");
	
	//this.s1=t1.getText();
	
	/*this.s2=t4.getText();
	this.s3=t5.getText();*/
	
	
	
	Color color=new Color(255,176,176);
	
	f=new Font("Crushed Out Girl",Font.BOLD,30);
	l8.setFont(f);
	
	c.setBackground(new Color(213,213,255));
	p.setSize(550,450);
	p.setBounds(0,70,600,450);
	p.setBackground(new Color(150,224,252));
	l2.setBounds(30,55,100,50);
	l3.setBounds(270,55,100,50);
	l4.setBounds(30,155,100,50);
	l5.setBounds(270,155,100,50);
	l6.setBounds(30,255,100,50);
	l7.setBounds(270,255,100,50);
	l8.setBounds(140,0,300,100);
	l9.setBounds(270,305,100,50);
	
	t1.setBounds(140,60,100,30);
	t2.setBounds(389,60,100,30);
	
	t3.setBounds(140,160,100,30);
	t4.setBounds(389,160,100,30);
	
	t5.setBounds(140,260,100,30);
	t6.setBounds(389,260,100,30);
	
	t7.setBounds(389,310,100,30);
	
	
	b1.setBounds(200,390,100,30);
	b2.setBounds(320,390,100,30);
	b3.setBounds(200,390,100,30);
	b3.setVisible(false);
	
	b1.setBackground(Color.WHITE);
	b2.setBackground(Color.WHITE);
	b3.setBackground(Color.WHITE);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	p.add(l2);
	p.add(t1);
	
	p.add(l3);
	p.add(t2);
	
	p.add(l4);
	p.add(t3);
	
	p.add(l5);
	p.add(t4);
	
	p.add(l6);
	p.add(t5);
	
	p.add(l7);
	p.add(t6);
	
	p.add(l9);
	p.add(t7);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	
	t6.setEditable(false);
	t7.setEditable(false);
	
	
	//p.add(t7);
	add(p);
	add(l8);
	
	setSize(600,600);
	setVisible(true);
}



public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b2) {
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
	}
		
	if(e.getSource()==b1) {
		if(((Integer.parseInt(t4.getText()))<0) ||(Integer.parseInt(t4.getText())>40)) {
			JOptionPane.showMessageDialog(null,"Error","MessageError",0);
			t4.setText("");	
	}
		if(((Integer.parseInt(t5.getText()))<0) ||(Integer.parseInt(t5.getText())>50)) {
			JOptionPane.showMessageDialog(null,"Error","MessageError",0);
			t5.setText("");	
	}
		st=new Student(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),Integer.parseInt(t4.getText()),Integer.parseInt(t5.getText()));
		list=new StudentsList();
		this.list.addLast(st);
		
		t6.setText(""+(Integer.parseInt(t4.getText())+Integer.parseInt(t5.getText())));
		t7.setText(""+st.getGreat());
		b3.setVisible(true);
		b1.setVisible(false);
	}
	if(e.getSource()==b3)
		setVisible(false);
}
public void itemStateChanged(ItemEvent e) {
		}
/*public static void main(String[]args) {
		new AtFirst();
	}*/
}


