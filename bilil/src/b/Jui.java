package b;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Jui extends JFrame implements ActionListener{
	Container c;
	ButtonGroup g;
	JButton b1,b2;
	JTextField t;
	JTextArea a;
	JRadioButton rb1,rb2;
	Queue q=new Queue();
	
	public Jui() {
	c=getContentPane();
	 g=new  ButtonGroup();
	getContentPane().setBackground(new Color(47, 79, 79));
	setBounds(100, 100, 570, 382);
	setLayout(null);
	
	JLabel l1 = new JLabel("Enter Noumber 1");
	l1.setForeground(new Color(255, 255, 255));
	l1.setBounds(46, 131, 102, 14);
	add(l1);
	
	t = new JTextField();
	t.setBounds(173, 128, 146, 20);
	add(t);
	
	b1 = new JButton("Enter");
	b1.setBounds(395, 127, 89, 23);
	b1.setForeground(new Color(255, 255, 255));
	b1.setBackground(new Color(0, 139, 139));
	b1.addActionListener(this);
	add(b1);
	
	b2 = new JButton("Print");
	b2.setForeground(new Color(255, 255, 255));
	b2.setBackground(new Color(139, 0, 0));
	b2.setBounds(395, 173, 89, 23);
	b2.addActionListener(this);
	add(b2);
	
	JLabel l2 = new JLabel("Print");
	l2.setBounds(61, 237, 48, 14);
	l2.setForeground(new Color(255, 255, 255));
	add(l2);
	
	JLabel l3 = new JLabel("The Sort Alogrithm");
	l3.setHorizontalAlignment(SwingConstants.CENTER);
	l3.setFont(new Font("Tahoma", Font.BOLD, 15));
	l3.setForeground(Color.WHITE);
	l3.setBounds(0, 23, 554, 42);
	add(l3);
	
	a = new JTextArea();
	a.setBounds(139, 229, 345, 22);
	add(a);
	
	rb1 = new JRadioButton("Sort ");
	g.add(rb1);
	rb1.setForeground(new Color(255, 255, 255));
	rb1.setBackground(new Color(47, 79, 79));
	rb1.setBounds(72, 173, 109, 23);
	add(rb1);
	
	rb2 = new JRadioButton("Non Sort");
	g.add(rb2);
	rb2.setForeground(new Color(255, 255, 255));
	rb2.setBackground(new Color(47, 79, 79));
	rb2.setBounds(210, 173, 109, 23);
	add(rb2);
	
	setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		String st[]=new String[10];
		if(e.getSource()==b1) {
		String s=t.getText();
		int a=Integer.parseInt(s);
		q.add(a);
		t.setText("");
		}
		if(e.getSource()==b2) {
			//q.print();
			q.sort();
			for(int i=0;i<10;++i)
			a.setText(t.getText()+"\t"+st[i]);
			}
		}
		
	public static void main(String[]args) {
		new Jui();
	}
}
