package ds;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AddSeccoundGui  extends JFrame implements ActionListener {
	Container c;
	JPanel p;
	
	JButton b1,b2,b3;
	
	Font f;
	
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JLabel l2,l3,l4,l5,l6,l7,l8,l9;
	
	MainGui prog;
	
public AddSeccoundGui(MainGui prog) {
	
	this.prog = prog;
	
	c=getContentPane();
	setLayout(null);
	setResizable(false);
	setBackground(new Color(213,213,255));
	setSize(600,600);
	setVisible(true);

	f=new Font("Cleaver's_Juvenia_Bloc...",Font.HANGING_BASELINE,20);

	p=new JPanel();
	p.setLayout(null);
	
	b1=new JButton("OK");
	b3=new JButton("Back");
	b2=new JButton("more");
	
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
	l8=new JLabel("Add new Student At Seccound");
	l9=new JLabel("Grade");
	
	//this.s1=t1.getText();
	
	/*this.s2=t4.getText();
	this.s3=t5.getText();*/
	
	
	
	//Color color=new Color(255,176,176);
	
	l8.setFont(f);
	
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
	
	
	b1.setBounds(140,390,100,30);
	b2.setBounds(260,390,100,30);
	b3.setBounds(380,390,100,30);
	
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
	
	add(p);
	add(l8);
	
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
		
if(e.getSource()==b1) {//تم عمل الكثير من التعديلات ومنها فحص الاسمين والعلامتين ولكن يبقى فحص try catch لم تضبط
		int m1=-1;
		int m2=-1;
		int m3=-1;
		int m4=-1;
		int mid=0,fn=0;
		int m5=-1;
		int m6=-1;
		
		if(t1.getText()==null||t2.getText()==null||t3.getText()==null||t4.getText()==null||t5.getText()==null)
			JOptionPane.showMessageDialog(null,"Complete All Informations","Error",0);
		else
			m6=1;
		
		if((MainGui.list.search(Integer.parseInt(t1.getText())))) {
			JOptionPane.showMessageDialog(null, "This Student Is Alredy Founded");
			t1.setText("");
		}
		else
			m5=1;
		
		//try {
			if(Student.checkName(t2.getText()))m3=1;
			else {JOptionPane.showMessageDialog(null,"Invalued Student Name !!!","MessageError",0); t2.setText("");}
			if(Student.checkName(t3.getText()))m4=1;
			else {JOptionPane.showMessageDialog(null,"Invalued Student Name !!!","MessageError",0); t3.setText("");}
		//}catch(Exception exp) {
		//	JOptionPane.showMessageDialog(null,"Invalued Student Number !!!","MessageError",0);
			
		//}
			
		if(Student.checkMark((Integer.parseInt(t4.getText())))) {
			mid = Integer.parseInt(t4.getText());
			m1=1;
		}
		else{
				JOptionPane.showMessageDialog(null,"Invalued Mark !!!","MessageError",0);
				t4.setText("");	
		}
			
		if(Student.checkMark((Integer.parseInt(t5.getText())))) {
				fn = Integer.parseInt(t4.getText());
				m2=1;
		}
		else{
				JOptionPane.showMessageDialog(null,"Invalued Mark !!!","MessageError",0);
				t5.setText("");	
		}
		
		if(m1 == 1&&m2 == 1&&m3 == 1&&m4 == 1 && m5 == 1 && m6==1){
		
			Student s = new Student(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),mid,fn);
			t6.setText(""+s.total);
			t7.setText(s.getGrade());
			MainGui .list.addSecound(s);
			
			/*b3.setVisible(true);
			b1.setVisible(false);*/
		}
	
}
if(e.getSource()==b3) {
	this.setVisible(false);
}
}

public static void main(String[]args) {
		new AddSeccoundGui(new MainGui());
	}
}


