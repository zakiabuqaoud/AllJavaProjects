package ds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class MainGui extends JFrame implements ActionListener {
		
	Container c;
	
	JMenuItem creat,atfirst,atsecond,atlast,delfirst,dellast,delseccound,print,sort;
	JMenu Add,Delet,Print;
	
	JButton E;
	
	CreatNewList creatList;
	AddFirstGui first;
	AddLastGui last;
	AddSeccoundGui second;
	
	//The List We Work On *****************************************
	public static StudentsList list;



public MainGui() {
	
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(800,550);
	setVisible(true);
	setResizable(false);
	
	creatList = new CreatNewList(this);
	creatList.setVisible(false);
	//creatList.list = this.list;
	
	first = new AddFirstGui(this);
	first.setVisible(false);
	//first.list = this.list;
	
	last = new AddLastGui(this);
	last.setVisible(false);
	//last.list = this.list;

	
	second = new AddSeccoundGui(this);
	second.setVisible(false);
	//seccound.list = this.list;


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
	Delet.setEnabled(false);
		
	 Print = new JMenu("Print");
	menuBar.add(Print);
	Print.setEnabled(false);
			
	//************************JMenuItem*************************//
	creat = new JMenuItem("Creat");
	Add.add(creat);
	
	atfirst = new JMenuItem("At First");
	Add.add(atfirst);
	atfirst.setEnabled(false);
		
	atsecond = new JMenuItem("Second");
	 Add.add(atsecond);
	 atsecond.setEnabled(false);
		 
	atlast = new JMenuItem("At Last");
	 Add.add(atlast);
	 atlast.setEnabled(false);
	 
	 delfirst=new JMenuItem("Delet First");
	 Delet.add(delfirst);
	 
	 dellast=new JMenuItem("Delet last");
	 Delet.add(dellast);
	 
	 delseccound=new JMenuItem("Delet Secound");
	 Delet.add(delseccound);
	 
	 print=new JMenuItem("Print");
	 Print.add(print);
	 
	 sort=new JMenuItem("print Sort");
	 Print.add(sort);
		

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
	
	//*********************Label: Register students*************//
	JLabel l2 = new JLabel("Registationr students");
	l2.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 19));
	l2.setForeground(Color.WHITE);
	l2.setBounds(88, 0, 182, 72);
		panel.add(l2);
	//*************************************************************//
	
	//********************Label:By:Bilal & Saif & Zake************//
	
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
	atsecond.addActionListener(this);
	delfirst.addActionListener(this);
	dellast.addActionListener(this);
	delseccound.addActionListener(this);
	print.addActionListener(this);
	sort.addActionListener(this);
	E.addActionListener(this);
	
	
	/*if(list == null||list.first == null) {
		creat.setEnabled(true);
	}
	else {
		Delet.setEnabled(true);
		Print.setEnabled(true);
		atfirst.setEnabled(true);
		atseccound.setEnabled(true);
		atlast.setEnabled(true);
	}*/
}

public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==creat)
		creatList.setVisible(true);
	
	if(e.getSource()==atfirst)
		first.setVisible(true);
	
	if(e.getSource()==atsecond)
		second.setVisible(true);
	
	if(e.getSource()==atlast)
		last.setVisible(true);
		
	if(e.getSource()==E)
		System.exit(0);
	
	if(e.getSource()==dellast)
		list.delLast();
	
	if(e.getSource()==delfirst)
		list.delFirst();
	
	if(e.getSource()==delseccound)
		list.delSecond();
	
	if(e.getSource()==print)
		list.printTable();
	
	if(e.getSource()==sort)
		list.printSortedTable();
	
	}

public static void main(String[]args) {
	MainGui m = new MainGui();
}
}


