package trader;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ConfirmationSign  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmationSign window = new ConfirmationSign();
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
	public ConfirmationSign() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 188);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 494, 159);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelConfirmation = new JLabel("\u0647\u0644 \u0623\u0646\u062A \u062A\u0631\u064A\u062F \u062A\u0623\u0643\u064A\u062F \u0627\u0644\u062A\u0633\u062C\u064A\u0644  \u061F\u061F");
		labelConfirmation.setForeground(Color.RED);
		labelConfirmation.setHorizontalAlignment(SwingConstants.CENTER);
		labelConfirmation.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelConfirmation.setBounds(202, 23, 239, 48);
		panel.add(labelConfirmation);
		
		JButton btnConfirmation = new JButton("\u062A\u0623\u0643\u064A\u062F");
		btnConfirmation.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnConfirmation.setBackground(Color.RED);
		btnConfirmation.setBounds(291, 82, 100, 30);
		panel.add(btnConfirmation);
		
		JButton btnCancle = new JButton("\u0625\u0644\u063A\u0627\u0621");
		btnCancle.setBackground(Color.RED);
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancle.setBounds(62, 82, 100, 30);
		panel.add(btnCancle);
	}

}
