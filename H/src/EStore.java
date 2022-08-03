import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;
import javax.swing.*;
public class EStore extends JFrame implements ActionListener,ItemListener{
	
	static LinkedList<Department> depList = new LinkedList<Department>();
	static LinkedList<Product> productsList = new LinkedList<Product>();
	static LinkedList<Customer> customersList = new LinkedList<Customer>();
	
	Container c;
	JLabel l1,l2;
	JMenu m ;
	JMenuItem mi1 ,mi2,mi3;
	
	ManagerWindow manager;
	CustomerWindow customer;
	
	
	
public EStore() { 
	c=getContentPane();
	setLayout(null);
	
	JMenuBar mb = new JMenuBar();
	setJMenuBar(mb);
	
	manager = new ManagerWindow(this);
	manager.setVisible(false);
	customer = new CustomerWindow();
	customer.setVisible(false);
	
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
		{manager.setVisible(true); customer.setVisible(false);}
	if(e.getSource()==mi2)
		{customer.setVisible(true); manager.setVisible(false);}
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
