package H2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.*;
public class EStore extends JFrame implements ActionListener,ItemListener{
	
	LinkedList<Department> depList = new LinkedList<Department>();
	LinkedList<Product> productsList = new LinkedList<Product>();
	LinkedList<Customer> customersList = new LinkedList<Customer>();
	//public LinkedList<Product> cartProducts=new LinkedList<Product>();
	
	Container c;
	JLabel l1,l2;
	JMenu m ;
	JMenuItem mi1 ,mi2,mi3;
	
	ManagerWindow manager;
	CustomerWindow customer;
	
	
public EStore() { 
	c=getContentPane();
	setLayout(null);
	setResizable(false);
	
	JMenuBar mb = new JMenuBar();
	setJMenuBar(mb);
	
	manager = new ManagerWindow(this);
	manager.setVisible(false);
	
	 m = new JMenu("eSlore");
	mb.add(m);
	
	 mi1 = new JMenuItem("Manager Window");
	m.add(mi1);
	mi1.addActionListener(this);
	
	mi2 = new JMenuItem("Customer Window");
	m.add(mi2);
	mi2.addActionListener(this);
	
	 mi3 = new JMenuItem("Exit");
	m.add(mi3);
	mi3.addActionListener(this);
	
	
	l1 = new JLabel("");
	l1.setIcon(new ImageIcon("C:\\Users\\sdc\\Desktop\\٢٠١٨١٢١٣_١٨٥١٠٢.jpg"));
	l1.setHorizontalAlignment(SwingConstants.CENTER);
	l1.setBounds(0, 0, 1184, 650);
	add(l1);
	setVisible(true);
	
	Font f=new Font("Cleaver's_Juvenia_Bloc..",Font.BOLD,40);
	l2=new JLabel("Hello Buys");
	l2.setFont(f);
	l2.setBounds(0,300,1184,60);
	l2.setHorizontalAlignment(SwingConstants.CENTER);
	add(l2);
	
	/* Department d1 =new Department("123","456");
	 Department d2 =new Department("555","\"jdjddfghhhhhhhhhhhhhhhh\"");
	 Product p58 = new Product("p1",5,5,"p1 test",d1);
	 Product p55 = new Product("p2",55,55,"p2 test",d1);
	 Product p33 = new Product("p3",555,555,"p3 test",d2);
	 
	 cartProducts.add(p58);
	 cartProducts.add(p55);
	cartProducts.add(p33);*/
	
	setSize(1200,700);
}
@Override
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==mi1)
		{manager.setVisible(true); //customer.setVisible(false);
		}
	if(e.getSource()==mi2)
		{customer = new CustomerWindow(this);; manager.setVisible(false);}
	if(e.getSource()==mi3)
		System.exit(0);
		
	
}
public static void main(String[] args) {
	new EStore();
}

public static boolean checkName(Object o, LinkedList l) {
	for (int i=0;i<l.size();i++)
		if(l.get(i).toString().compareTo(o.toString())==0)return false;
	return true;
}

}

