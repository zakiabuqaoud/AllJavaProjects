
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
public class CustomerWindow extends JFrame implements ActionListener,ItemListener,TreeSelectionListener{
	
	EStore estore;
	Container c;
	JButton b1,b2,b3,b4;
	JTree tree;
	ManagerWindow mw;
	Login login;
	Customer cst;
	// LinkedList<Department> depList;
	// LinkedList<Product> plist;
	 DefaultMutableTreeNode[] model4;
	 DefaultMutableTreeNode[] model5;
	 JLabel l4,l6;
	 JTextArea textArea;
	 DefaultMutableTreeNode root;
	
public CustomerWindow(EStore estore) {
	this.estore=estore;
	c=getContentPane();
	c.setBackground(new Color(0, 51, 102));
	setBounds(100, 100,440,550);
	setLayout(null);
	this.estore=estore;
	login = new Login(this);
	JPanel p1 = new JPanel();
	p1.setBounds(21, 101, 1131, 82);
	add(p1);
	p1.setBackground( Color.darkGray);
	p1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(135, 206, 235)));
	p1.setLayout(null);
	
	JPanel p5 = new JPanel();
	p5.setBounds(0, 11, 1200, 110);
	add(p5);
	p5.setBackground(new Color(0, 153, 204));
	p5.setLayout(null);
	
	
	JPanel p2 = new JPanel();
	p2.setBounds(21, 208, 1131, 532);
	add(p2);
	p2.setBackground( new Color(15,63,112));
	p2.setBorder(new MatteBorder(2, 2, 2, 2,new Color(135, 206, 235)));
	p2.setLayout(null);
	
	JPanel p3 = new JPanel();
	p3.setBounds(10, 11, 256, 510);
	p3.setBackground( new Color(15,63,112));
	p2.add(p3);
	p3.setLayout(null);
	
	
	JPanel p4 = new JPanel();
	p4.setBounds(276, 11, 845, 437);
	p2.add(p4);
	p4.setBackground( new Color(15,63,112));
	p4.setLayout(null);
	
	JLabel l1 = new JLabel("Quantity :");
	l1.setBounds(31, 21, 85, 22);
	l1.setForeground(Color.WHITE);
	p4.add(l1);
	
	JLabel l3 = new JLabel("Product :");
	l3.setBounds(31, 105, 85, 29);
	l3.setForeground(Color.WHITE);
	p4.add(l3);
	
	 l4 = new JLabel("New label");
	l4.setBounds(207, 112, 117, 22);
	l4.setForeground(Color.WHITE);
	p4.add(l4);
	
	JLabel l5 = new JLabel("Price :");
	l5.setBounds(26, 184, 90, 22);
	l5.setForeground(Color.WHITE);
	p4.add(l5);
	
	 l6 = new JLabel("New label");
	l6.setBounds(207, 184, 117, 18);
	l6.setForeground(Color.WHITE);
	p4.add(l6);
	
	JLabel l7 = new JLabel("Description");
	l7.setBounds(31, 259, 85, 22);
	l7.setForeground(Color.WHITE);
	p4.add(l7);
	
	JLabel img = new JLabel("");
	img.setIcon(new ImageIcon("C:\\\\Users\\\\sdc\\\\Desktop\\\\100x88.png"));
	img.setHorizontalAlignment(SwingConstants.CENTER);
	img.setBounds(999, 0, 146, 88);
	p5.add(img);
	
	JLabel nameimg = new JLabel("Bilal Alnajjar");
	nameimg.setHorizontalAlignment(SwingConstants.CENTER);
	nameimg.setFont(new Font("Tahoma", Font.PLAIN, 18));
	nameimg.setForeground(new Color(255, 255, 255));
	nameimg.setBounds(840, 28, 171, 31);
	p5.add(nameimg);
	
	root = new  DefaultMutableTreeNode("EStore");
	
	/* depList = new LinkedList<Department>();
	 plist = new LinkedList<Product>();
	 Department d1 =new Department("123","456");
	 Department d2 =new Department("555","\"jdjddfghhhhhhhhhhhhhhhh\"");
	 
	 Product p58 = new Product("p1",5,5,"p1 test",d1);
	 Product p55 = new Product("p2",55,55,"p2 test",d1);
	 Product p33 = new Product("p3",555,555,"p3 test",d2);
	 
	 plist.add(p58);
	 plist.add(p55);
	 plist.add(p33);
	 depList.add(d1);
	 depList.add(d2);
	 depList.add(new Department("Ali","456"));*/
	 model4=new  DefaultMutableTreeNode[estore.depList.size()];
	 DefaultMutableTreeNode model = new DefaultMutableTreeNode();
	// model5=new  DefaultMutableTreeNode [];
	 
	for(int i=0;i<estore.depList.size();i++) {
		model4[i]=new DefaultMutableTreeNode(estore.depList.get(i));
		for(int j=0;j<estore.depList.get(i).productslist.size();j++) {
			model5 = new DefaultMutableTreeNode[estore.depList.get(i).productslist.size()];
			model5[j] = new DefaultMutableTreeNode(estore.depList.get(i).productslist.get(j));
			model4[i].add(model5[j]);
		}
		root.add(model4[i]);
		//root.setUserObject(depList.get(i));
		
	}
	
	 tree = new JTree(root);
	tree.setBounds(10, 11, 236, 400);
	p3.add(tree);
	tree.setVisible(false);
	
	
	tree.addTreeSelectionListener(this);
	
	 textArea = new JTextArea();
	textArea.setBounds(31, 308, 715, 118);
	p4.add(textArea);
	
	Integer []t = {1,2,3,4,5,6,7,8,9,10};
	JComboBox comboBox = new JComboBox(t);
	comboBox.setBounds(207, 22, 61, 20);
	p4.add(comboBox);
	
	b1 = new JButton("Login");
	b1.setBounds(27, 29, 114, 29);
	b1.setForeground(Color.white);
	b1.setBackground(new Color(255, 153, 102));
	p1.add(b1);
	
	b2 = new JButton("Shop Product");
	b2.setEnabled(false);
	b2.setBounds(787, 29, 120, 29);
	b2.setBackground(new Color(153, 204, 255));
	p1.add(b2);
	
	b3 = new JButton("View Cart");
	b3.setEnabled(false);
	b3.setBounds(965, 29, 120, 29);
	b3.setBackground(new Color(153, 204, 255));
	p1.add(b3);
	
	
	b4 = new JButton("Add to Cart");
	b4.setEnabled(false);
	b4.setBounds(514, 21, 120, 29);
	b4.setBackground(new Color(153, 204, 255));
	p4.add(b4);
	

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	//setVisible(true);
	setSize(1200,700);
	setResizable(false);
	setVisible(true);
	
	
}

@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1)
		login.setVisible(true);
	if(e.getSource()==b2)
		tree.setVisible(true);
	if(e.getSource()==b3)
		new Cart(this);
	if(e.getSource()==b3) {
		String n = tree.getLastSelectedPathComponent().toString();
		Product d = estore.productsList.get(Product.getIndex(n, estore.productsList));
		cst.cartProducts.add(d);
	}
}
public static void main(String[]args) {
	CustomerWindow a=new CustomerWindow(new EStore());
}
@Override
public void valueChanged(TreeSelectionEvent e) {
	
		Product d;
		String n = tree.getLastSelectedPathComponent().toString();
		d = estore.productsList.get(Product.getIndex(n, estore.productsList));
		l4.setText(d.toString());
		l6.setText(d.getPrice()+"");
		this.textArea.setText(d.getDescription());
			
}

/*spublic void updateTree() {
	this.root.removeAllChildren();
	for(int i=0;i<estore.depList.size();i++) {
		model4[i]=new DefaultMutableTreeNode(estore.depList.get(i));
		for(int j=0;j<estore.depList.get(i).productslist.size();j++) {
			model5 = new DefaultMutableTreeNode[estore.depList.get(i).productslist.size()];
			model5[j] = new DefaultMutableTreeNode(estore.depList.get(i).productslist.get(j));
			model4[i].add(model5[j]);
		}
		root.add(model4[i]);
	}*/
	
}

