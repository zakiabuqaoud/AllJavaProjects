import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ManagerWindow extends JFrame implements ActionListener,ItemListener,ListSelectionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l22,l33,l44,l55,l66,l77,l88,l99;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b11;
	NewDepartment nd;
	NewProduct np;
	JScrollPane s;
	
	static JList list1,list2,list3;
	static DefaultListModel model2, model1, model3;
	
	int length=3;
	
	JTextField t1,t2,t3,t4,t5,t6,productname,price,department,id,name,addres,user,pass;
	JTextArea a1,a2,a3,a4;
	
	EStore estore;
	
	JComboBox<Integer> quantity;
	
public ManagerWindow(EStore es) {
	super("Manager Window");
	
	this.estore = es;
	
	nd = new NewDepartment(this);
	nd.setVisible(false);
	
	np = new NewProduct(this);
	np.setVisible(false);
	
	setSize(1200,700);
	//setVisible(true);
	setResizable(false);
	
	///*******************************software************************//
	
	/*/Product pr1=new Product(1,22,3,d1);
	Department d2=new Department("Games","providing computer parts and hard");
	darr[1]=d2;
	//Product pr2=new Product(1,22,3,d1);
	Department d3=new Department("Toyes","providing computer parts and hard");
	darr[2]=d3;
	//Product pr3=new Product(1,22,3,d1);*/
	//***************************************************************//
	
	JTabbedPane tpane = new JTabbedPane(JTabbedPane.TOP);
	tpane.setBounds(0, 0, 1200, 661);
	add(tpane);
	
	////*************************** all panels********************************//
	//department****************************************
	JPanel p1 = new JPanel();
	p1.setLayout(null);
	p1.setBackground(new Color(0, 153, 204));
	tpane.addTab("Department", null, p1, null);
	
	//product*********************************************
	JPanel p2 = new JPanel();
	p2.setLayout(null);
	p2.setBackground(new Color(0, 153, 204));
	tpane.addTab("Product", null, p2, null);
	
	//customer**********************************************
	JPanel p3 = new JPanel();
	p3.setLayout(null);
	tpane.addTab("Customer", null, p3, null);
	p3.setBackground(new Color(0, 153, 204));
	tpane.setSelectedIndex(0);
	
	//pink************************************************
	JPanel p4= new JPanel();
	p4.setBackground(new Color(15,63,112));
	p4.setBounds(0, 0, 1200, 70);
	p1.add(p4);
	p4.setLayout(null);
	
	//************************** List & model***********************//
	//depList.add(new Department("123","456"));
	
	model1 = new DefaultListModel<Department>();
	for(int i=0;i<estore.depList.size();i++)
	model1.addElement(estore.depList.get(i));
	
	list1 = new JList<Department>(model1);
	list1.addListSelectionListener(this);
	list1.setBounds(10,120,200,200);
	s = new JScrollPane(list1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	p1.add(s);
	
	//******************************Jlabel:panel1*********************//
	JLabel img1 = new JLabel("");
	img1.setIcon(new ImageIcon("C:\\Users\\sdc\\Desktop\\resizedimage (1).png"));
	img1.setHorizontalAlignment(SwingConstants.CENTER);
	img1.setBounds(1063, 5, 108, 83);
	p4.add(img1);
	
	l1 = new JLabel("Department List");
	 l1.setForeground(Color.WHITE);
	l1.setFont(new Font("TheSans", Font.BOLD, 14));
	l1.setBounds(10, 81,128, 27);
	p1.add(l1);

	l2 = new JLabel("Department Name :");
	 l2.setForeground(Color.WHITE);
	l2.setFont(new Font("TheSans", Font.BOLD, 14));
	l2.setVerticalAlignment(SwingConstants.TOP);
	l2.setBounds(502, 138, 128, 27);
	p1.add(l2);
	
	 l3 = new JLabel("Description :");
	 l3.setForeground(Color.WHITE);
	l3.setFont(new Font("TheSans", Font.BOLD, 14));
	l3.setVerticalAlignment(SwingConstants.TOP);
	l3.setBounds(502,225, 128, 27);
	p1.add(l3);
	
	 l4 = new JLabel("Hello Managaer");
		l4.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 25));
		l4.setForeground(Color.WHITE);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setBounds(442, 11, 273, 33);
		p4.add(l4);
	//************************************************************/
	//******************************JTextField:panel1*********************/
		t1 = new JTextField();
		t1.setBounds(671, 138, 190, 27);
		p1.add(t1);
	
	//************************JTextArea:panel1************************************/

		a1 = new JTextArea();
		a1.setBounds(671, 225, 190, 170);
		p1.add(a1);
		s=new JScrollPane(a1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p1.add(a1);
		//a1.setEnabled(false);
	
	//************************************************************/
	//***********************JButton:panel1*************************************/
	b1=new JButton("Add new Department");
	b1.setBounds(128, 526, 160, 30);
	b1.addActionListener(this);
	p1.add(b1);
	
	b2=new JButton("Upadate Department");
	b2.setBounds(325, 526, 160, 30);
	b2.addActionListener(this);
	p1.add(b2);	
	
	b11 = new JButton("Remove");
	b11.setBounds(506,526, 160, 30);
	b11.setForeground(Color.WHITE);
	b11.addActionListener(this);
	b11.setBackground(new Color(204, 0, 51));
	p1.add(b11);
	
////*************************************************************************//
	
	///*******************************panel2*****************************//
	model2 = new DefaultListModel<Product>();
	for(int i=0;i<estore.productsList.size();i++)
		model2.addElement(estore.productsList.get(i));
	
	list2 = new JList<Product>(model2);
	list2.addListSelectionListener(this);
	list2.setBounds(10,152,250,200);
	p2.add(list2);
	
	l4 = new JLabel("Product List");
	l4.setForeground(Color.WHITE);
	l4.setFont(new Font("TheSans", Font.BOLD, 14));
	l4.setBounds(10, 103,128, 27);
	p2.add(l4);
	
	

	JPanel p5= new JPanel();
	p5.setBackground(new Color(15,63,112));
	p5.setBounds(0, 0, 1200, 70);
	p2.add(p5);
	p5.setLayout(null);

	JLabel img2 = new JLabel("");
	img2.setIcon(new ImageIcon("C:\\Users\\sdc\\Desktop\\resizedimage (1).png"));
	img2.setHorizontalAlignment(SwingConstants.CENTER);
	img2.setBounds(1063, 5, 108, 83);
	p5.add(img2);
	
	l5 = new JLabel("Hello Managaer");
	l5.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 25));
	l5.setForeground(Color.WHITE);
	l5.setHorizontalAlignment(SwingConstants.CENTER);
	l5.setBounds(442, 11, 273, 33);
	p5.add(l5);
	
	l6=new JLabel("Poduct Name");
	 l6.setForeground(Color.WHITE);
	l6.setBounds(550, 115,128, 27);
	p2.add(l6);
	
	l7=new JLabel("Price");
	 l7.setForeground(Color.WHITE);
	l7.setBounds(550, 168,128, 27);
	p2.add(l7);
	
	l8=new JLabel("Quantity");
	 l8.setForeground(Color.WHITE);
	l8.setBounds(550, 218,128, 27);
	p2.add(l8);
	
	l9=new JLabel("Departmet");
	 l9.setForeground(Color.WHITE);
	l9.setBounds(550, 274,128, 27);
	p2.add(l9);
	
	l11=new JLabel("Description");
	 l11.setForeground(Color.WHITE);
	l11.setBounds(550, 334,128, 27);
	p2.add(l11);
	
	productname=new JTextField();
	productname.setBounds(700, 115,128, 27);
	p2.add(productname);
	
	price=new JTextField();
	price.setBounds(700, 168,80, 27);
	p2.add(price);
	
	department =new JTextField();
	department.setBounds(700, 218,80, 27);
	p2.add(department);
	
	Integer []q = {1,2,3,4,5,6,7,8,9,10};
	quantity=new JComboBox<Integer>(q);
	quantity.setBounds(700, 274,120, 27);
	p2.add(quantity);
	
	a2=new JTextArea();
	a2.setBounds(704, 363,230, 160);
	p2.add(a2);
	
	b3=new JButton("New Product");
	b3.setBounds(130, 526, 160, 30);
	p2.add(b3);
	b3.addActionListener(this);
	
	b4=new JButton("Update");
	b4.addActionListener(this);
	b4.setBounds(325, 526, 160, 30);
	b4.addActionListener(this);
	p2.add(b4);
	
	b9 = new JButton("Remove");
	b9.setBounds(506,526, 160, 30);
	b9.setForeground(Color.WHITE);
	b9.addActionListener(this);
	b9.setBackground(new Color(204, 0, 51));
	p2.add(b9);
	
//****************************************************************************//
	//*****************customer panel******************************//
	JPanel p6= new JPanel();
	p6.setBackground(new Color(15,63,112));
	p6.setBounds(0, 0, 1200, 70);
	p3.add(p6);
	p6.setLayout(null);
	
	l77 = new JLabel("Customer List");
	 l77.setForeground(Color.WHITE);
	l77.setFont(new Font("TheSans", Font.BOLD, 14));
	l77.setBounds(10, 101,128, 27);
	p3.add(l77);
	
	
	l66 = new JLabel("Hello Managaer");
	l66.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 25));
	l66.setForeground(Color.WHITE);
	l66.setHorizontalAlignment(SwingConstants.CENTER);
	l66.setBounds(442, 11, 273, 33);
	p6.add(l66);
	
	JLabel img3 = new JLabel("");
	img3.setIcon(new ImageIcon("C:\\Users\\sdc\\Desktop\\resizedimage (1).png"));
	img3.setHorizontalAlignment(SwingConstants.CENTER);
	img3.setBounds(1063, 5, 108, 83);
	p6.add(img3);
	
	model3 = new DefaultListModel<Customer>();
	for(int i=0;i<estore.customersList.size();i++)
		model3.addElement(estore.customersList.get(i));
	
	list3 = new JList<Customer>(model3);
	list3.addListSelectionListener(this);
	list3.setBounds(10,152,250,200);
	p3.add(list3);
	
	l22=new JLabel("Customer ID");
	 l22.setForeground(Color.WHITE);
	l22.setBounds(550, 115,128, 27);
	p3.add(l22);
	
	l33=new JLabel("Customer Name");
	l33.setForeground(Color.WHITE);
	l33.setBounds(550, 167,128, 27);
	p3.add(l33);
	
	l44=new JLabel("Address");
	l44.setForeground(Color.WHITE);
	l44.setBounds(550, 217,128, 27);
	p3.add(l44);
	
	l88=new JLabel("User Name");
	l88.setForeground(Color.WHITE);
	l88.setBounds(550, 267,128, 27);
	p3.add(l88);
	
	l99=new JLabel("Password");
	l99.setForeground(Color.WHITE);
	l99.setBounds(550, 316,128, 27);
	p3.add(l99);
	
	id=new JTextField();
	id.setBounds(700, 115,128, 27);
	p3.add(id);
	
	name=new JTextField();
	name.setBounds(700, 167,200, 27);
	p3.add(name);
	
	addres =new JTextField();
	addres.setBounds(700, 217,200, 27);
	p3.add(addres);
	
	user =new JTextField();
	user.setBounds(700, 267,200, 27);
	p3.add(user);
	
	pass=new JTextField();
	pass.setBounds(700, 316,200, 27);
	p3.add(pass);
	
	b5 = new JButton("New Customer");
	b5.setBounds(154, 526, 160, 30);
	b5.addActionListener(this);
	p3.add(b5);
	
	b6=new JButton("Insert");
	b6.setBounds(360,526, 120, 30);
	b6.addActionListener(this);
	p3.add(b6);
	
	b7=new JButton("Updata Customer");
	b7.setBounds(530,526, 160, 30);
	b7.addActionListener(this);
	p3.add(b7);
	
	b8 = new JButton("Remove");
	b8.setBounds(730,526, 160, 30);
	b8.setForeground(Color.WHITE);
	b8.addActionListener(this);
	b8.setBackground(new Color(204, 0, 51));
	p3.add(b8);
	
	
		
}


/*public static void main(String[]args) {
	new ManagerWindow(new EStore());
	
}*/


@Override
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	
}

public void valueChanged( ListSelectionEvent e ) {
	if(list1.getSelectedValue()!=null) {
		Department d = (Department) list1.getSelectedValue();
		t1.setText(d.getName());
		a1.setText(d.getDescription());
	}
	
	if(list2.getSelectedValue()!=null) {
		Product p = (Product) list2.getSelectedValue();
		productname.setText(p.getName());
		price.setText(p.getPrice()+"");
		quantity.setSelectedItem(p.getQuantity());
		department.setText(p.d.getName());
		a2.setText(p.getDescription());
	}
	
	if(list3.getSelectedValue()!=null) {
		Customer c = (Customer) list3.getSelectedValue();
		name.setText(c.getName());
		user.setText(c.getUsern());
		pass.setText(c.getPassword());
		id.setText(c.getId()+"");
		addres.setText(c.getAddress());
	}
	
}


@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==b1) {
		nd.setVisible(true);
	}
	
	if(e.getSource()==b2) {
		if(t2.getText().compareTo("")!=0 && a3.getText().compareTo("")!=0 && list1.getSelectedValue()!=null) {
			Department d = (Department) list1.getSelectedValue();
			d.setName(t2.getText());
			d.setDescription(a3.getText());
			JOptionPane.showMessageDialog(null, "The Department "+d.getName()+" Updated Successfully");
		}
	}
	
	if(e.getSource() == b3) {
		np.setVisible(true);
	}
	
	if(e.getSource() == b4) {
		if(list2.getSelectedValue()!=null) {
			Product p = (Product) list2.getSelectedValue();
			
			int q;
			double pr;
			try {
				//q = Integer.parseInt(quantity.getText());
				pr = Double.parseDouble(price.getText());
				
				if(productname.getText().compareTo("")!=0){
					p.setName(productname.getText());
					p.setPrice(pr);
					q=(int)quantity.getSelectedItem();
					p.setQuantity(q);
					p.setDescription(a2.getText());	
					JOptionPane.showMessageDialog(null, "The Product "+p.getName()+" Updated Successfully");
				}else JOptionPane.showMessageDialog(null, "Incomplete Field", "Error", 0);
				
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null,"Invalued Number","Error",0);
			}
			
		}
		else JOptionPane.showMessageDialog(null, "Choose A Product To Update It");
		
	}
	
	if(e.getSource()==b5) {
		list3.setSelectedValue(list3.getSelectedIndex(),false);
		name.setText("");
		user.setText("");
		pass.setText("");
		id.setText("");
		addres.setText("");
	}
	if(e.getSource() == b6) {
		Customer c = new Customer(name.getText(),Integer.parseInt(id.getText()),addres.getText(),user.getText(),pass.getText());
		if(this.estore.customersList.contains(c))
			JOptionPane.showMessageDialog(null, "This Customer Already Founded");
		else {
			if(!(Customer.userSearch(user.getText(), estore.customersList))) {
				model3.addElement(c);
				JOptionPane.showMessageDialog(null, "The Customer "+c.getName()+" Added Successfuly");
			}else JOptionPane.showMessageDialog(null, "This Username Already Founded");
		}
		}
	
	if(e.getSource() == b7) {
		Customer c = (Customer) list3.getSelectedValue();
		if(!(Customer.userSearch(user.getText(), estore.customersList))) {
			c.setAddress(addres.getText());
			c.setId(Integer.parseInt(id.getText()));
			c.setName(name.getText());
			c.setPassword(pass.getText());
			c.setUsern(user.getText());
			JOptionPane.showMessageDialog(null, "The Customer "+c.getName()+" Updated Successfully");
		}
		else JOptionPane.showMessageDialog(null, "The Customer");

	}
	
}
}