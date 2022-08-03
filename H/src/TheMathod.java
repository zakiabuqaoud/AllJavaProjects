import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class TheMathod  extends JPanel implements ActionListener {
	LinkedList<JPanel> pl1=new LinkedList<JPanel>();
	LinkedList<JPanel> pl2=new LinkedList<JPanel>();
	LinkedList<JButton> b=new LinkedList<JButton>();
	JPanel p2,p3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	CustomerWindow w;
	Cart c;
	public TheMathod(Cart c) {
	this.w=w;
	this.c=c;
	
	
	//int x=20;
	//int y=20;
	JOptionPane.showMessageDialog(null,""+w.Chooseproduct.size());
		/*for(int i=0;i<w.Chooseproduct.size();++i) {
			pl1.add(getPnelchart(x,y));
			y=y+250;
			c.p1.add((JPanel)pl1.get(i));
			pl2.add(getPaneRemove(w.Chooseproduct.get(i)));
			pl1.get(i).add(pl2.get(i));
			b.add(b2);
			b.get(i).addActionListener(this);
	}*/
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
		for(int i=0;i<b.size();++i) {
			if(e.getSource()==b.get(i)) {
				pl1.remove(i);
				w.Chooseproduct.remove(i);
			JOptionPane.showMessageDialog(null,"The Remove saccecful");
	}
		}

}
}
