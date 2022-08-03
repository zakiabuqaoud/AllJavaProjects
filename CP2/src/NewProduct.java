
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultMutableTreeNode;

public class NewProduct extends JFrame implements ActionListener{
	
	JTextArea a4;
	JTextField t3;
	JTextField t2;
	JTextField t4;
	JButton b1,b2;
	JComboBox<Department> co1,co2;
	ManagerWindow m;
	
	public NewProduct(ManagerWindow m) {
		this.m = m;
		setLayout(null);
		setSize(440,550);
		//setVisible(true);
		setResizable(false);
		
		co1 = new JComboBox();
		
		co1.setBounds(124, 396, 100, 20);
		add(co1);
		
		JLabel l = new JLabel("Add new Product");
		l.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setBounds(48, 11, 287, 38);
		add(l);
		
		JLabel l1 = new JLabel("Product Name :");
		l1.setBounds(32, 82, 88, 14);
		add(l1);
		
		JLabel l3 = new JLabel("Price :");
		l3.setBounds(32, 136, 65, 14);
		add(l3);
		
		JLabel l4 = new JLabel("Quantity");
		l4.setBounds(32, 186, 65, 14);
		add(l4);
		
		JLabel l5 = new JLabel("Description");
		l5.setBounds(32, 236, 88, 14);
		add(l5);
		
		a4 = new JTextArea();
		a4.setBounds(32, 275, 329, 96);
		add(a4);
		
		JLabel l6 = new JLabel("Department");
		l6.setBounds(32, 399, 80, 14);
		add(l6);
		
		
		b1 = new JButton("Add");
		b1.setBounds(64, 449, 89, 23);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Cancel");
		b2.setBounds(254, 449, 89, 23);
		b2.addActionListener(this);
		add(b2);
		
		t3 = new JTextField();
		t3.setBounds(158, 79, 86, 20);
		add(t3);
		
		t2 = new JTextField();
		t2.setBounds(158, 133, 86, 20);
		add(t2);
		
		t4 = new JTextField();
		t4.setBounds(158, 183, 86, 20);
		add(t4);
		

		Department []q=new Department[m.estore.depList.size()];
		for(int i=0;i<m.estore.depList.size();++i) {
			q[i]=m.estore.depList.get(i);
			co1.addItem(q[i]);
		}
		setVisible(true);
	}
	
	/*public static void main(String []args) {
		new NewProduct(new ManagerWindow(new EStore()));
	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			int q;
			double pr;
			try {
				q = Integer.parseInt(t4.getText());
				pr = Double.parseDouble(t2.getText());
				
					Department d = (Department) co1.getSelectedItem();
					Product p = new Product(t3.getText(),pr,q,a4.getText(),(Department)co1.getSelectedItem());
					m.estore.productsList.add(p);
					m.model2.addElement(p);
					t3.setText("");
					t4.setText("");
					t2.setText("");
					a4.setText("");
					co1.setSelectedIndex(-1);
					//m.estore.customer.updateTree();

			}catch(Exception ex){	
				JOptionPane.showMessageDialog(null,"Invalued Number","Error",0);
			}
		}
		
		if(e.getSource() == b2)
			this.setVisible(false);

	}
}


