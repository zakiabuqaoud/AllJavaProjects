package H2;


//package JavaProject;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener{
	Container c;
	JTextField t1,t2;
	JButton b1,b2;
	CustomerWindow cw;
	boolean flag = false;
	public Login(CustomerWindow cw) {
		c = getContentPane();
		setLayout(null);
		setSize(400,400);
		//f.setVisible(true);
		setResizable(false);
		
		this.cw = cw;
		
		JLabel l8 = new JLabel("Login");
		l8.setFont(new Font("Simplified Arabic", Font.PLAIN, 21));
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setBounds(24, 11, 314, 50);
		add(l8);
		
		JLabel l9 = new JLabel("User Name");
		l9.setBounds(61, 103, 69, 14);
		add(l9);
		
		t1 = new JTextField();
		t1.setBounds(190, 100, 86, 20);
		add(t1);
		t1.setColumns(10);
		
		JLabel l4 = new JLabel("Passeword");
		l4.setBounds(61, 168, 69, 14);
		add(l4);
		
		t2 = new JTextField();
		t2.setBounds(190, 165, 86, 20);
		add(t2);
		t2.setColumns(10);
		
		b1 = new JButton("Login");
		b1.setBounds(83, 281, 89, 23);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Cancal");
		b2.setBounds(209, 281, 89, 23);
		b2.addActionListener(this);
		add(b2);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			
			if(t1.getText().compareTo("")==0||t2.getText().compareTo("")==0) {
				JOptionPane.showMessageDialog(null, "Complete All Fields");
				flag = false;
			}
			else {
				Customer cs = Customer.userSearch2(t1.getText());
				if(cs!=null) {
					if(cs.getPassword().compareTo(t2.getText())==0) {
						flag=true;
						cw.b2.setEnabled(true);
						cw.b3.setEnabled(true);
						cw.b4.setEnabled(true);
						cw.cst=cs;
						setVisible(false);
					}
					else {JOptionPane.showMessageDialog(null, "Wrong Password", "", 0); flag = false;}
				}
				else {JOptionPane.showMessageDialog(null, "User Not Found!"); flag = false;}
			}
		}
		
		if(e.getSource() == b2) {
			this.setVisible(false);
		}
		
	}


}

