package SDP;
import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class SDPMain extends JFrame implements ActionListener {
	Container c;
	JLabel mainLabel,idLabel,nameLabel,priceLabel,noHourLabel,contentLabel;
	JTextField idTF,nameTF,priceTF,noHourTF,contentTF;
	JButton addCourse,reset;
	List<Integer> ids = new ArrayList<Integer>();
	public SDPMain(){
		c=getContentPane();
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,300);
		setVisible(true);
		setResizable(false);
		setTitle("Create a course in the system ");
		//JLabel
		mainLabel = new JLabel("Create a course in the system");
		idLabel = new JLabel("id"); 
		nameLabel = new JLabel("name");
		priceLabel = new JLabel("price");
		noHourLabel = new JLabel("number the hours");
		contentLabel = new JLabel("content");
		
		mainLabel.setBounds(130, 11, 301, 25);
		idLabel.setBounds(34, 49, 46, 14);
		nameLabel.setBounds(245, 47, 121, 16);
		priceLabel.setBounds(34, 108, 46, 14);
		noHourLabel.setBounds(245, 108, 121, 14);
		contentLabel.setBounds(34, 171, 46, 14);
		
		c.add(mainLabel);
		c.add(idLabel);
		c.add(nameLabel);
		c.add(priceLabel);
		c.add(noHourLabel);
		c.add(contentLabel);
		
		mainLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		//JTextFielld
		idTF = new JTextField();
		nameTF = new JTextField();
		priceTF = new JTextField();
		noHourTF = new JTextField();
		contentTF = new JTextField();
		
		idTF.setBounds(90, 47, 86, 20);
		nameTF.setBounds(376, 46, 86, 20);
		priceTF.setBounds(90, 105, 86, 20);
		noHourTF.setBounds(376, 105, 86, 20);
		contentTF.setBounds(90, 168, 297, 20);
		
		c.add(idTF);
		c.add(nameTF);
		c.add(priceTF);
		c.add(noHourTF);
		c.add(contentTF);
		
		//JButton
		addCourse = new JButton("add course");
		addCourse.setBounds(90, 216, 171, 23);
		c.add(addCourse);
		addCourse.addActionListener(this);
		//reset
		reset = new JButton("reset");
		reset.setBounds(298, 216, 89, 23);
		c.add(reset);
		reset.addActionListener(this);
	}
	
	public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addCourse){
			if(idTF.getText().trim().isEmpty()||nameTF.getText().trim().isEmpty()||priceTF.getText().trim().isEmpty()||noHourTF.getText().trim().isEmpty()||contentTF.getText().trim().isEmpty()){
				JOptionPane.showMessageDialog(null,"Complete All Informations","MessageError",0);
			}else if(ids.contains(Integer.parseInt(idTF.getText()))){
				JOptionPane.showMessageDialog(null,"This id Is Alredy Founded","MessageError",0);
			}else if(Integer.parseInt(idTF.getText()) > 9999 ){
				JOptionPane.showMessageDialog(null,"invalid id ","MessageError",0);
			}else if(!isNumeric(idTF.getText())||!isNumeric(priceTF.getText())||!isNumeric(noHourTF.getText()) ){
				JOptionPane.showMessageDialog(null,"enter the number in id or price or number the hour field ","MessageError",0);
			}else{
				Course c = new Course(Integer.parseInt(idTF.getText()),nameTF.getText(),Integer.parseInt(priceTF.getText()),Integer.parseInt(noHourTF.getText()),contentTF.getText());  
				JOptionPane.showMessageDialog(null, "The course has been added successfully");
				ids.add(Integer.parseInt(idTF.getText()));
			}
		
		}
		if(e.getSource()==reset){
			idTF.setText("");
			nameTF.setText("");
			priceTF.setText("");
			noHourTF.setText("");
			contentTF.setText("");
		}
	}
	public static void main(String[] args){
		SDPMain sdp = new SDPMain();
	}

}
