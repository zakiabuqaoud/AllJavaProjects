package trader;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class t {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldNumber;
	private JTextField textFieldAddress;
	private JTextField textFieldTelephone;
	private JTextField textFieldPhone;
	private JTextField textFieldLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					t window = new t();
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
	public t() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1386, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setForeground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 1370, 703);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel signUpLabel = new JLabel("\u0627\u0644\u062A\u0633\u062C\u064A\u0644");
		signUpLabel.setBackground(Color.LIGHT_GRAY);
		signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signUpLabel.setForeground(Color.RED);
		signUpLabel.setBounds(510, 11, 196, 55);
		signUpLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel.add(signUpLabel);
		
		JLabel lblCompanyName = new JLabel("\u0627\u0633\u0645 \u0627\u0644\u0634\u0631\u0643\u0629  ");
		lblCompanyName.setForeground(Color.RED);
		lblCompanyName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyName.setBounds(1199, 98, 160, 44);
		panel.add(lblCompanyName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldName.setBounds(941, 99, 241, 44);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel companyNumber = new JLabel("\u0631\u0642\u0645 \u0627\u0644\u0634\u0631\u0643\u0629");
		companyNumber.setHorizontalAlignment(SwingConstants.CENTER);
		companyNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		companyNumber.setForeground(Color.RED);
		companyNumber.setBounds(1199, 153, 160, 44);
		panel.add(companyNumber);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNumber.setBounds(941, 154, 241, 44);
		panel.add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		JLabel address = new JLabel("\u0627\u0644\u0639\u0646\u0648\u0627\u0646");
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setForeground(Color.RED);
		address.setFont(new Font("Tahoma", Font.BOLD, 20));
		address.setBounds(1199, 208, 160, 44);
		panel.add(address);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldAddress.setBounds(941, 209, 241, 44);
		panel.add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		JLabel telphoneNumber = new JLabel("\u0631\u0642\u0645 \u0627\u0644\u0647\u0627\u062A\u0641");
		telphoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		telphoneNumber.setForeground(Color.RED);
		telphoneNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		telphoneNumber.setBounds(1199, 263, 160, 44);
		panel.add(telphoneNumber);
		
		textFieldTelephone = new JTextField();
		textFieldTelephone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTelephone.setBounds(941, 264, 241, 44);
		panel.add(textFieldTelephone);
		textFieldTelephone.setColumns(10);
		
		JLabel phoneNumber = new JLabel("\u0631\u0642\u0645 \u0627\u0644\u062C\u0648\u0627\u0644");
		phoneNumber.setForeground(Color.RED);
		phoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		phoneNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		phoneNumber.setBounds(1199, 318, 160, 44);
		panel.add(phoneNumber);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPhone.setBounds(941, 319, 241, 44);
		panel.add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		JLabel logo = new JLabel("\u0627\u0644\u0634\u0639\u0627\u0631");
		logo.setForeground(Color.RED);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setFont(new Font("Tahoma", Font.BOLD, 20));
		logo.setToolTipText("Logo");
		logo.setBounds(1199, 373, 160, 44);
		panel.add(logo);
		
		textFieldLogo = new JTextField();
		textFieldLogo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldLogo.setBounds(941, 374, 241, 44);
		panel.add(textFieldLogo);
		textFieldLogo.setColumns(10);
		
		JButton signBytton = new JButton("\u062A\u0633\u062C\u064A\u0644");
		signBytton.setForeground(Color.BLACK);
		signBytton.setBackground(Color.RED);
		signBytton.setFont(new Font("Tahoma", Font.BOLD, 25));
		signBytton.setBounds(967, 487, 150, 50);
		panel.add(signBytton);
		
		JButton instructions = new JButton("\u062A\u0639\u0644\u064A\u0645\u0627\u062A");
		instructions.setForeground(Color.BLACK);
		instructions.setFont(new Font("Tahoma", Font.BOLD, 25));
		instructions.setBackground(Color.RED);
		instructions.setBounds(652, 489, 150, 50);
		panel.add(instructions);
		
		JButton buttonLoadLogo = new JButton("\u062A\u062D\u0645\u064A\u0644 \u0627\u0644\u0634\u0639\u0627\u0631");
		buttonLoadLogo.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonLoadLogo.setForeground(Color.BLACK);
		buttonLoadLogo.setBackground(Color.RED);
		buttonLoadLogo.setBounds(800, 387, 118, 23);
		panel.add(buttonLoadLogo);
	}
}
