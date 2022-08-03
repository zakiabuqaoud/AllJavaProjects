
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class Cart extends JFrame implements ActionListener  {
	Container c;
	JPanel p1,p2,p3,p4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2;
	JTextArea a;
	int d;
	JPanel []pl1;
	JPanel []pl2;
	JButton []b;
	CustomerWindow w;
	public Cart(CustomerWindow w) {
		c=getContentPane();
		setLayout(null);
		setResizable(false);
		this.w = w;
		
		 p4= new JPanel();
		p4.setBounds(0, 0, 1194, 88);
		p4.setBackground(new Color(15,63,112));
		getContentPane().add(p4);
		p4.setLayout(null);
		
		d = w.cst.cartProducts.size();
		
		pl1=new JPanel[d];
		pl2=new JPanel[d];
		b=new JButton[d];
		
		JPanel p1 = new JPanel();
		p1.setBounds(0, 88, 1194, 583);
		add(p1);
		p1.setLayout(null);
		
		l1 = new JLabel("Total amount Price of items in cart ");
		l1.setFont(new Font("TheSans", Font.PLAIN, 15));
		l1.setForeground(Color.WHITE);
		l1.setBounds(528, 24, 277, 30);
		p4.add(l1);
		
		p4.setBorder(new MatteBorder(2, 2, 2, 2,new Color(135, 206, 235)));
		
		l2 = new JLabel("New label");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("TheSans", Font.PLAIN, 15));
		l2.setBounds(831, 24, 84, 30);
		p4.add(l2);
		
		//EStore.productsList.add(new Product("bilal",3.3,4,"sff",new Department("bilal","dfghj")));
		
		
		
		 b1 = new JButton("Proceed To Checkout");
		b1.setBackground(new Color(173, 216, 230));
		//b1.addActionListener(this);
		b1.setBounds(337, 24, 161, 30);
		p4.add(b1);
		
		int x=20;
		int y=20;
			for(int i=0;i<w.cst.cartProducts.size();++i) {
				pl1[i]=getPnelchart(x,y);
				y=y+250;
				p1.add(pl1[i]);
				pl2[i]=getPaneRemove(w.cst.cartProducts.get(i));
				pl1[i].add(pl2[i]);
				b[i]=b2;
				b[i].addActionListener(this);
				}
		
		
		setSize(1200,700);
		setVisible(true);
		
	}
	
	public JPanel getPnelchart(int x,int y) {
		JPanel p2=new JPanel();
		p2.setBackground(new Color(0, 102, 153));
		p2.setBounds(x,y, 1153, 239);
		p2.setBorder(new MatteBorder(2, 2, 2, 2,new Color(135, 206, 250)));
		p2.setLayout(null);
		

		 b2 = new JButton("Remove");
		b2.setBounds(10, 104, 89, 23);
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(204, 0, 51));
		p2.add(b2);
		return p2;
		
	}
	
	public JPanel getPaneRemove (Product p){
		 p3= new JPanel();
		p3.setBorder(new MatteBorder(1, 1, 1, 1, new Color(135, 206, 235)));
		p3.setBackground(new Color(153, 204, 255));
		p3.setBounds(109,11, 964,198);
		p3.setLayout(null);
		
		 l3 = new JLabel("Product :");
		l3.setBounds(10, 11, 83, 25);
		l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		p3.add(l3);
		
		l4 = new JLabel(p.getName());
		l4.setBounds(144, 18, 83, 25);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		p3.add(l4);
		
		 l5 = new JLabel("Quantity :");
		l5.setBounds(10, 47, 83, 25);
		l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		p3.add(l5);
		
		 l6 = new JLabel(p.getQuantity()+"");
		l6.setBounds(144, 54, 83, 25);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		p3.add(l6);
		
		l7 = new JLabel("Description :");
		l7.setBounds(10, 95, 100, 25);
		l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		p3.add(l7);
		
		l8 = new JLabel("Total Price :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l8.setBounds(451, 18, 100, 18);
		p3.add(l8);
		
		l9 = new JLabel(p.getPrice()+"");
		l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l9.setBounds(561, 18, 91, 18);
		p3.add(l9);
		
		JTextArea a = new JTextArea();
		a.setBounds(10, 131, 944, 56);
		a.setEditable(false);
		a.setText(p.getDescription());
		a.setFont(new Font("Courier New", Font.PLAIN, 16));
		p3.add(a);
		
		return p3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<d;++i) {
			if(e.getSource()==b[i]) {
				w.cst.cartProducts.remove(i);
				this.remove(pl1[i]);
				this.remove(pl2[i]);
			JOptionPane.showMessageDialog(null,"The Product Removed saccecful");
		}
		}
	}
	/*public static void main(String[]args) {
		new Cart();
	}*/
}
/*import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class Cart extends JFrame implements ActionListener  {
	Container c;
	
	JPanel p2,p3,p4;
	
	JButton b1;
	Customer cs;
	LinkedList<JPanel> panelsList;
	LinkedList<JButton> button;
	Checkout chk;
	
	public Cart(Customer cs) {
		panelsList = new LinkedList<JPanel>();
		this.cs=cs;
		chk = new Checkout();
		chk.setVisible(false);
		c=getContentPane();
		setLayout(null);
		setResizable(false);
		
		panelsList = new LinkedList<JPanel>();
		button = new LinkedList<JButton>();
		
		
		p2 = new JPanel();
		p2.setBounds(0, 99, 1174, 532);
		//p2.setSize(1174, 232);
		p2.setBackground(new Color(0, 102, 153));
		p2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 250)));
		//p2.setLayout(new FlowLayout());
		
		p4= new JPanel();
		p4.setBounds(0, 0, 1194, 88);
		p4.setBackground(new Color(15,63,112));
		getContentPane().add(p4);
		p4.setLayout(null);
		
		JLabel l1 = new JLabel("Total amount Price of items in cart ");
		l1.setFont(new Font("TheSans", Font.PLAIN, 15));
		l1.setForeground(Color.WHITE);
		l1.setBounds(528, 24, 277, 30);
		p4.add(l1);
		
		p4.setBorder(new MatteBorder(2, 2, 2, 2,new Color(135, 206, 235)));
		
		JLabel l2 = new JLabel("New label");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("TheSans", Font.PLAIN, 15));
		l2.setBounds(831, 24, 84, 30);
		p4.add(l2);
		
		
		
		b1 = new JButton("Proceed To Checkout");
		b1.setBackground(new Color(173, 216, 230));
		//b1.addActionListener(this);
		b1.setBounds(337, 24, 161, 30);
		b1.addActionListener(this);
		p4.add(b1);
		
		add(p2);
		setSize(1200,700);
		setVisible(true);
		
	}
	
	public void creatPanels() {
		for(int i=0;i<cs.cartProducts.size();i++) {
			ProductPanel panel = new ProductPanel(cs.cartProducts.get(i));
			JButton b = new JButton("Remove");
			b.setBounds(10, 104, 89, 23);
			b.setForeground(Color.WHITE);
			b.setBackground(new Color(204, 0, 51));
			panel.add(b);
			panelsList.add(panel);
			button.add(b);
			
		}
		
	}
	
	public void addAllPanels() {
		for(int i=0;i<panelsList.size();i++) {
			p2.add(panelsList.get(i));
			chk.p3.add(panelsList.get(i));
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			chk.setVisible(true);
		}
	}
		
		
	
	public static void main(String [] args) {
		Customer cst = new Customer("",5,"","","");
		Cart cart = new Cart(cst);
		cst.cartProducts.add(new Product("product 1",5,10));
		cst.cartProducts.add(new Product("product 2",5,10));
		cst.cartProducts.add(new Product("product 3",5,10));
		
		//cart.creatPanels();
		//cart.addAllPanels();
		//cart.p2.add(cart.panelsList.get(1));
		cart.p2.add(new ProductPanel(cst.cartProducts.get(1)));
		cart.p2.add(new ProductPanel(cst.cartProducts.get(0)));
		cart.p2.add(new ProductPanel(cst.cartProducts.get(2)));
		
	}
}*/