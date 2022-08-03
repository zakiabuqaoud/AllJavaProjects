package jtfyx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class concept {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					concept window = new concept();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public concept() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1000, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel t1 = new JLabel("Compute Expression By Parsing Tree");
		t1.setBounds(216, 25, 554, 52);
		frame.getContentPane().add(t1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(78, 128, 176, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(78, 223, 176, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(78, 287, 176, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		tf1 = new JTextField();
		tf1.setBounds(292, 128, 607, 28);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("New radio button");
		r1.setBounds(380, 223, 141, 28);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("New radio button");
		r2.setBounds(658, 223, 141, 28);
		frame.getContentPane().add(r2);
		
		JLabel lm = new JLabel("*");
		lm.setBounds(292, 287, 27, 28);
		frame.getContentPane().add(lm);
		
		JComboBox c1 = new JComboBox();
		c1.setBounds(327, 287, 128, 28);
		frame.getContentPane().add(c1);
		
		JLabel ld = new JLabel("/");
		ld.setBounds(504, 287, 31, 28);
		frame.getContentPane().add(ld);
		
		JComboBox c2 = new JComboBox();
		c2.setBounds(545, 287, 128, 28);
		frame.getContentPane().add(c2);
		
		JLabel las = new JLabel("^");
		las.setBounds(723, 287, 31, 28);
		frame.getContentPane().add(las);
		
		JComboBox c3 = new JComboBox();
		c3.setBounds(770, 287, 128, 28);
		frame.getContentPane().add(c3);
		
		JButton b1 = new JButton("New button");
		b1.setBounds(380, 368, 141, 28);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.setBounds(658, 368, 141, 28);
		frame.getContentPane().add(b2);
		
		JLabel l4 = new JLabel("New label");
		l4.setBounds(78, 432, 176, 28);
		frame.getContentPane().add(l4);
		
		tf2 = new JTextField();
		tf2.setBounds(380, 432, 419, 28);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel l5 = new JLabel("Notice: Level  1  is the  highest  procesdence and level 3 is the lowest precedence");
		l5.setBounds(291, 315, 483, 28);
		frame.getContentPane().add(l5);
		
		JLabel n1 = new JLabel("New label");
		n1.setBounds(292, 161, 381, 28);
		frame.getContentPane().add(n1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(78, 523, 176, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(380, 523, 419, 135);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
	}
}
