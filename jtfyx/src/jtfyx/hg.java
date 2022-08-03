package jtfyx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hg {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hg window = new hg();
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
	public hg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 542, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l0 = new JLabel("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		l0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l0.setForeground(Color.RED);
		l0.setBounds(80, 11, 301, 25);
		frame.getContentPane().add(l0);
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(34, 49, 46, 14);
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(90, 47, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("New label");
		l2.setBounds(245, 47, 121, 16);
		frame.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setBounds(376, 46, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel l3 = new JLabel("New label");
		l3.setBounds(34, 108, 46, 14);
		frame.getContentPane().add(l3);
		
		t3 = new JTextField();
		t3.setBounds(90, 105, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel l4 = new JLabel("New label");
		l4.setBounds(245, 108, 121, 14);
		frame.getContentPane().add(l4);
		
		t4 = new JTextField();
		t4.setBounds(376, 105, 86, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JLabel l5 = new JLabel("New label");
		l5.setBounds(34, 171, 46, 14);
		frame.getContentPane().add(l5);
		
		t5 = new JTextField();
		t5.setBounds(90, 168, 297, 20);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		JButton b1 = new JButton("add");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		b1.setBounds(90, 216, 171, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("reset");
		b2.setBounds(298, 216, 89, 23);
		frame.getContentPane().add(b2);
	}
}
