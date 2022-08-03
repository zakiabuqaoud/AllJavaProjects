

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Checkout extends JFrame implements ActionListener {
	Container c;
	Cart cart;
	JPanel p4,p3,p2;
	JButton b2;
	
	public Checkout(Cart r) {
		this.cart=r;
		c=getContentPane();
		c.setBackground(new Color(0, 102, 153));
		setSize(1200,700);
		setResizable(false);
		setLayout(null);
		
		this.cart = cart;
		
		p4= new JPanel();
		p4.setBackground(new Color(15,63,112));
		p4.setBounds(0, 0, 1200, 70);
		add(p4);
		p4.setLayout(null);
		
		JLabel l1 = new JLabel("Confirm order and submit");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l1.setForeground(Color.WHITE);
		l1.setBounds(41, 11, 211, 37);
		p4.add(l1);
		
		JButton b1 = new JButton("Cancel Checkout");
		b1.setBackground(new Color(204, 0, 51));
		b1.setForeground(Color.white);
		b1.setBounds(978, 18, 146, 30);
		p4.add(b1);
		
		p2 = new JPanel();
		p2.setBackground(new Color(153, 204, 255));
		p2.setBounds(10, 81, 441, 346);
		//add(p2);
		p2.setLayout(null);
		
		JLabel l6 = new JLabel("Shipping Adderss");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l6.setBounds(10, 26, 163, 24);
		p2.add(l6);
		
		JTextArea a = new JTextArea();
		a.setLineWrap(true);
		a.setFont(new Font("Courier New", Font.PLAIN, 17));
		a.setTabSize(16);
		a.setBounds(10, 61, 421, 212);
		p2.add(a);
		
		p3 = new JPanel();
		p3.setBounds(461, 81, 723, 346);
		add(p3);
		
		b2 = new JButton("Confirm order");
		b2.setBackground(new Color(173, 216, 230));
		b2.setBounds(36, 453, 147, 31);
		add(b2);
		
		JLabel l2 = new JLabel("Total amount items in cart is ");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l2.setForeground(Color.WHITE);
		l2.setBounds(461, 457, 214, 19);
		add(l2);
		
		JLabel l3 = new JLabel("Total amount Price of items in cart is ");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l3.setForeground(Color.WHITE);
		l3.setBounds(461, 500, 245, 19);
		add(l3);
		
		JLabel l4 = new JLabel("New label");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l4.setForeground(Color.WHITE);
		l4.setBounds(745, 455, 107, 19);
		add(l4);
		
		JLabel l5 = new JLabel("New label");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l5.setForeground(Color.WHITE);
		l5.setBounds(745, 503, 107, 16);
		add(l5);
		setVisible(true);
		
		int g=109;
		int h=11;
			for(int i=0;i<cart.w.cst.cartProducts.size();i++) {
				h=h+250;
				cart.pl2[i]=cart.getPaneRemove(cart.w.cst.cartProducts.get(i));
				h=h+250;
				p3.add(r.pl2[i]);
				}
	}
	
	/*public void updatePanels() {
		for(int i=0;i<cart.panelsList.size();i++) {
			this.p3.add(cart.panelsList.get(i));
		}
	}*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
/*public static void main(String []args) {
		new Checkout();
	}*/
}

