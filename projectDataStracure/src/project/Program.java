package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class Program extends JFrame implements ActionListener ,ItemListener{
Container c;
JMenuItem creat,atfirst,athead,atlast,delfirst,dellast,delsccand,print,sort;
JMenu Add,Delet,Print;
JButton E;
Creat d;
AtFirst f;
AtLast la;
Sccand sc;
DoubleList db;
Student st;
StudentsList list;



public Program() {
	
	setLayout(null);

	//*****************************menu****************************//	
	JMenuBar menuBar = new JMenuBar();
	menuBar.setBackground(Color.WHITE);
	menuBar.setBounds(0, 0, 794, 29);
		add(menuBar);
	
	//*************************JMenu*******************************//
	JMenu Add = new JMenu("Add");
	menuBar.add(Add);
		
	Delet = new JMenu("Delet");
	menuBar.add(Delet);
		
	 Print = new JMenu("Print");
	menuBar.add(Print);
		
	//************************************************************//
	
	//************************JMenuItem*************************//
	
	creat = new JMenuItem("Creat");
	Add.add(creat);
		 
	atfirst = new JMenuItem("At First");
	Add.add(atfirst);
		
	athead = new JMenuItem("Second");
	 Add.add(athead);
		 
	atlast = new JMenuItem("At Last");
	 Add.add(atlast);
	 
	 delfirst=new JMenuItem("Delet First");
	 Delet.add(delfirst);
	 
	 dellast=new JMenuItem("Delet last");
	 Delet.add(dellast);
	 
	 delsccand=new JMenuItem("Delet Secound");
	 Delet.add(delsccand);
	 
	 print=new JMenuItem("Print");
	 Print.add(print);
	 
	 sort=new JMenuItem("print Sort");
	 Print.add(sort);
		
		 //*************************************************************//
		
	
	 E = new JButton(" Exit");
	menuBar.add(E);
	E.setBackground(Color.WHITE);
	//***************************************************************//
	
	//***************************img********************************//
	JLabel l1= new JLabel("New label");
	l1.setBounds(0, 28, 350, 305);
	l1.setIcon(new ImageIcon("C:\\Users\\sdc\\Desktop\\3dlat.com_14147965224.png"));
		add(l1);
	//**************************************************************//
		
	JPanel panel = new JPanel();
	panel.setBounds(0, 333, 350, 188);
	panel.setBackground(new Color(51, 51, 51));
		add(panel);
	panel.setLayout(null);
	
	//*************************panel******************************//
		JPanel panel2 = new JPanel();
		panel2.setBounds(351, 28, 443, 493);
		panel2.setBackground(new Color(255, 255, 255));
			add(panel2);
		panel2.setLayout(null);
	//***********************************************************//
	
	//*********************Label: Registationr students*************//
	JLabel l2 = new JLabel("Registationr students");
	l2.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 19));
	l2.setForeground(Color.WHITE);
	l2.setBounds(88, 0, 182, 72);
		panel.add(l2);
	//*************************************************************//
	
	//********************Label:By:Bilal & Saife & Zake************//
	
	JLabel l3 = new JLabel("--By : Bilal & Saife & Zake--");
	l3.setForeground(Color.WHITE);
	l3.setBounds(105, 68, 166, 14);
	panel.add(l3);
	//************************************************************//
	
	//*************************Label:About The System :**********//
	JLabel l4= new JLabel("About The System :");
	l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
	l4.setHorizontalAlignment(SwingConstants.CENTER);
	l4.setForeground(Color.BLACK);
	l4.setBounds(10, 5, 433, 37);
	panel2.add(l4);
	//**********************************************************//
	
	creat.addActionListener(this);
	atfirst.addActionListener(this);
	atlast.addActionListener(this);
	athead.addActionListener(this);
	delfirst.addActionListener(this);
	dellast.addActionListener(this);
	delsccand.addActionListener(this);
	print.addActionListener(this);
	sort.addActionListener(this);
	E.addActionListener(this);
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(800,550);
	setVisible(true);
	setResizable(false);
}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()==creat)
		d=new Creat(list);
	if(e.getSource()==atfirst)
		f=new AtFirst(list);
	if(e.getSource()==athead)
		la=new AtLast(list);
	if(e.getSource()==atlast)
		sc=new Sccand(list);
	if(e.getSource()==print)
		list.printTable();
	//if(slist.first !=null) creat.setHideActionText(false);
	
	/*if(e.getSource()==E)
		System.exit(0);
	if(e.getSource()==creat)
		 d=new Creat(); 
	if(e.getSource()==atfirst)
		f=new AtFirst();
	if(e.getSource()==atlast)
		la=new AtLast();
	if(e.getSource()==athead)
		sc=new Sccand();
	if(e.getSource()==dellast)
		db.delLast();
	if(e.getSource()==delfirst)
		db.delFirst();
	if(e.getSource()==delsccand)
		db.delSecound();
	if(e.getSource()==print) { 
		slist = new StudentsList(st);
		slist.printTable();
	}*/
}
public void itemStateChanged(ItemEvent e) {
	}
public static void main(String[]args) {
	new Program();
}
}

