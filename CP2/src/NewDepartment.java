
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NewDepartment extends JFrame implements ActionListener{
	
	JTextField t2;
	JTextArea a3;
	JButton b8, b9;
	ManagerWindow m;
	
	public NewDepartment(ManagerWindow m) {
		setTitle("Add New Department");
		
		this.m = m;
		
		setLayout(null);
		setSize(440,550);
		//setVisible(true);
		setResizable(false);

		JLabel l111 = new JLabel("Add new Department");
		l111.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l111.setHorizontalAlignment(SwingConstants.CENTER);
		l111.setBounds(48, 11, 287, 38);
		add(l111);
		
		JLabel l222 = new JLabel("Name :");
		l222.setBounds(39, 89, 74, 14);
		add(l222);
		
		t2 = new JTextField();
		t2.setBounds(170, 86, 86, 20);
		add(t2);
		
		JLabel l333 = new JLabel("Description :");
		l333.setBounds(39, 153, 74, 14);
		add(l333);
		
		a3 = new JTextArea();
		a3.setBounds(63, 193, 256, 94);
		add(a3);
		
		b8 = new JButton("Add new Department");
		b8.setBounds(51, 315, 142, 23);
		b8.addActionListener(this);
		add(b8);
		
		b9 = new JButton("Cancel");
		b9.setBounds(246, 315, 89, 23);
		b9.addActionListener(this);
		add(b9);
		
	}
	
	/*public static void main(String []args) {
		//new NewDepartment();
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b8) {
			if(t2.getText().compareTo("")!=0 && a3.getText().compareTo("")!=0) {
				Department d = new Department(t2.getText(),a3.getText());
				m.estore.depList.add(d);
				m.model1.addElement(d);
				JOptionPane.showMessageDialog(null, "The Department "+d.getName()+" Added Successfully");
				t2.setText("");
				a3.setText("");
				//m.estore.customer.updateTree();
				m.department.addItem(d);
				
			}
		}
		
		if(e.getSource()==b9) {
			setVisible(false);
		}
		
	}

}
