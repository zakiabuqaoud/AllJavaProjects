package ds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CreatNewList  extends JFrame implements ActionListener {
	Container c;
	JPanel p;
	
	JButton b1,b2,b3;
	
	Font f;
	
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JLabel l2,l3,l4,l5,l6,l7,l8,l9;
	
	MainGui prog;
	//StudentsList list;
public CreatNewList(MainGui prog) {
	
	this.prog = prog;
	
	c=getContentPane();
	setLayout(null);
	Font font =new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,40);
	p=new JPanel();
	p.setLayout(null);
	b1=new JButton("OK");
	setResizable(false);
	b2=new JButton("Cancel");
	b3=new JButton("Back");
	b3.setVisible(false);
	
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	
	
	l2=new JLabel("ID Number");
	l3=new JLabel("FirstName");
	l4=new JLabel("lastName");
	l5=new JLabel("Mid.Mark(50)");
	l6=new JLabel("FinalMark(50)");
	l7=new JLabel("Total From(100)");
	l8=new JLabel("Add First Student In A New List");
	l9=new JLabel("Grade");
	
	
	Color color=new Color(239,253,208);
	f=new Font("Cleaver's_Juvenia_Bloc...",Font.HANGING_BASELINE,20);
	l8.setFont(f);
	
	c.setBackground(new Color(218,244,254));
	p.setSize(550,450);
	p.setBounds(0,70,600,450);
	p.setBackground(Color.cyan);
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
	
			
	
	b1.setBackground(Color.WHITE);
	b2.setBackground(Color.WHITE);
	b3.setBackground(Color.WHITE);
	
	b3.addActionListener(this);
	b2.addActionListener(this);
	b1.addActionListener(this);
	
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
	
	add(p);
	add(l8);
	
	setSize(600,600);
	setVisible(true);
}
	
	
	
	
	
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b2 || e.getSource()==b3)
		this.setVisible(false);
	if(e.getSource()==b1) {
		int m1=-1;
		int m2=-1;
		int m3=-1;
		int m4=-1;
		int m5=-1;
		int id=0,mid=0,fn=0;
		
		//If Statements For Checking Inputs****************************************************************
		
		if(t1.getText()==null||t2.getText()==""||t3.getText()==""||t4.getText()==""||t5.getText()=="")
			JOptionPane.showMessageDialog(null,"Complete All Informations","Error",0);
		else {
			m5=1;
		
			try {
				if(Student.checkName(t2.getText()))m3=1;
				else {JOptionPane.showMessageDialog(null,"Invalued Student Name !!!","MessageError",0); t2.setText("");}
				if(Student.checkName(t3.getText()))m4=1;
				else {JOptionPane.showMessageDialog(null,"Invalued Student Name !!!","MessageError",0); t3.setText("");}
			}catch(Exception exp) {
				JOptionPane.showMessageDialog(null,"Invalued Student Number !!!","MessageError",0);
				
			}
				
			if(Student.checkMark((Integer.parseInt(t4.getText())))) {
				mid = Integer.parseInt(t4.getText());
				m1=1;
			}
			else{
					JOptionPane.showMessageDialog(null,"Invalued Mark !!!","MessageError",0);
					t4.setText("");	
			}
				
			if(Student.checkMark((Integer.parseInt(t5.getText())))) {
					fn = Integer.parseInt(t5.getText());
					m2=1;
			}
			else{
					JOptionPane.showMessageDialog(null,"Invalued Mark !!!","MessageError",0);
					t5.setText("");	
			}
		}
		
		//If All Inputs Are Right*******************************************************************
		
		if(m1 == 1&&m2 == 1&&m3 == 1&&m4 == 1&&m5==1){
			Student s = new Student(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),mid,fn);
			MainGui.list = new StudentsList(s);
			if(MainGui.list != null){
				prog.creat.setEnabled(false);
				prog.Delet.setEnabled(true);
				prog.Print.setEnabled(true);
				prog.atfirst.setEnabled(true);
				prog.atsecond.setEnabled(true);
				prog.atlast.setEnabled(true);
			}
			
			t6.setText(""+s.total);
			t7.setText(s.getGrade());
			
			b3.setVisible(true);
			b1.setVisible(false);
			
		}
		}
	
			
}

public static void main(String[]args) {
		new CreatNewList(new MainGui());
	}
}

