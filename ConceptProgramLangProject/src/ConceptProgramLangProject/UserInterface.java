package ConceptProgramLangProject;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserInterface extends JFrame implements ActionListener {
	Container container ;
	String[] levels ={"level1","level2","level3"};
	JLabel titleLabel,expressionLabel,associativeLabel,precedenceLabel,outputLabel,precedenceNoticeLabel,divisionLabel,multLabel,powerLabel,inputNoticeLabel, tokensLabel;
	JButton computeButton,resetButton;
	JTextField expressionTextField,resultTextField ;
	JRadioButton leftAssociativeRadioButton,rightAssociativeRadioButton;
	ButtonGroup associativeGroup ;
	JComboBox precedenceLevelsDiv;
	JComboBox precedenceLevelsMult;
	JComboBox precedenceLevelsPower;
	JTextArea tokensTextArea;
	JScrollPane scrol;
	Font bigFont =new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,30);
	Font fontSmallBold = new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,15);
	Font smallFont =new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,15);
	Font smallestFont =new Font("Cleaver's_Juvenia_Bloc...",Font.PLAIN,12);
	Font inputColor = new Font("Cleaver's_Juvenia_Bloc...",Font.BOLD,15);
	Color towti = new Color(88,14,34);
	Color lightBlue = new Color(198,247,235);
	Color lightPink = new Color(213,132,124);
	Color lightDark = new Color(68,57,56);
	Color lightYellow = new Color(253,255,164);

	public UserInterface(){
		container = getContentPane();
		setTitle("Compute expression by parsing tree");
		setLayout(null);
		setVisible(true);
		setSize(1000,700);
		setResizable(false);
		container.setBackground(lightDark);
 	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/////////////////////////////////////////////////////
		//TextFiled
		expressionTextField = new JTextField();
		expressionTextField.setBackground(lightYellow);
		expressionTextField.setForeground(towti);
		expressionTextField.setFont(inputColor);
		
		resultTextField = new JTextField();
		resultTextField.setEditable(false);
		resultTextField.setBackground(lightYellow);
		resultTextField.setForeground(towti);
		resultTextField.setFont(inputColor);
		
		expressionTextField.setBounds(292, 128, 607, 28);
		resultTextField.setBounds(380, 432, 419, 28);
		container.add(expressionTextField);
		container.add(resultTextField);
			
		//Button
		computeButton = new JButton("compute");
		computeButton.setBackground(lightPink);
		computeButton.setForeground(towti);
		computeButton.setFont(fontSmallBold);
		  
		
		
		resetButton = new JButton("reset");
		resetButton.setBackground(lightPink);
		resetButton.setForeground(towti);
		resetButton.setFont(fontSmallBold);

		
		computeButton.setBounds(380, 368, 141, 28);
		resetButton.setBounds(658, 368, 141, 28);
		container.add(computeButton);
		container.add(resetButton);
		computeButton.addActionListener(this);
		resetButton.addActionListener(this);
		
		//Label
		titleLabel = new JLabel("Compute Expression By Parsing Tree"); 
		titleLabel.setFont(bigFont);
		titleLabel.setForeground(lightBlue);
		
		expressionLabel = new JLabel("Expression");
		expressionLabel.setFont(smallFont);
		expressionLabel.setForeground(lightBlue);
		
		associativeLabel = new JLabel("Associative");
		associativeLabel.setFont(smallFont);
		associativeLabel.setForeground(lightBlue);
		
		precedenceLabel = new JLabel("Precedence");
		precedenceLabel.setFont(smallFont);
		precedenceLabel.setForeground(lightBlue);
		
		outputLabel = new JLabel("Output");
		outputLabel.setFont(smallFont);
		outputLabel.setForeground(lightBlue);
		
		precedenceNoticeLabel = new JLabel("Notice: Level  1  is the  highest  precedence. level 3 is the lowest precedence.");
		precedenceNoticeLabel.setFont(smallestFont);
		precedenceNoticeLabel.setForeground(lightBlue);
		
		
		inputNoticeLabel = new JLabel("Notice: The expression contains on constants, variables, *, / and ^.");
		inputNoticeLabel.setFont(smallestFont);
		inputNoticeLabel.setForeground(lightBlue);
		
		multLabel = new JLabel("*");
		multLabel.setFont(smallFont);
		multLabel.setForeground(lightBlue);
		
		divisionLabel = new JLabel("/");
		divisionLabel.setFont(smallFont);
		divisionLabel.setForeground(lightBlue);
		
		powerLabel = new JLabel("^");
		powerLabel.setFont(smallFont);
		powerLabel.setForeground(lightBlue);
		
		tokensLabel = new JLabel("Tokens");
		tokensLabel.setFont(smallFont);
		tokensLabel.setForeground(lightBlue);
	
		titleLabel.setBounds(216, 25, 554, 52);
		expressionLabel.setBounds(78, 128, 176, 28);
		associativeLabel.setBounds(78, 223, 176, 28);
		precedenceLabel.setBounds(78, 287, 176, 28);
		outputLabel.setBounds(78, 432, 176, 28);
		multLabel.setBounds(292, 287, 27, 28);
		divisionLabel.setBounds(504, 287, 31, 28);
		powerLabel.setBounds(723, 287, 31, 28);
		precedenceNoticeLabel.setBounds(291, 315, 483, 28);
		inputNoticeLabel.setBounds(292, 161, 480, 28);
		tokensLabel.setBounds(78, 523, 176, 28);
		
		container.add(titleLabel);
		container.add(expressionLabel);
		container.add(associativeLabel);
		container.add(precedenceLabel);
		container.add(outputLabel);
		container.add(precedenceNoticeLabel);
		container.add(inputNoticeLabel);
		container.add(multLabel);
		container.add(divisionLabel);
		container.add(powerLabel);
		container.add(tokensLabel);
		
		//ComboBox
		precedenceLevelsDiv= new JComboBox();
		precedenceLevelsDiv.setBackground(lightYellow);
		precedenceLevelsDiv.setForeground(towti);
		
		precedenceLevelsMult= new JComboBox();
		precedenceLevelsMult.setBackground(lightYellow);
		precedenceLevelsMult.setForeground(towti);
		
		precedenceLevelsPower= new JComboBox();
		precedenceLevelsPower.setBackground(lightYellow);
		precedenceLevelsPower.setForeground(towti);
		
		precedenceLevelsDiv.setModel(new DefaultComboBoxModel(levels));
		precedenceLevelsMult.setModel(new DefaultComboBoxModel(levels));
		precedenceLevelsPower.setModel(new DefaultComboBoxModel(levels));
	
		precedenceLevelsMult.setBounds(327, 287, 128, 28);
		precedenceLevelsDiv.setBounds(545, 287, 128, 28);
		precedenceLevelsPower.setBounds(765, 287, 128, 28);
		
	
		container.add(precedenceLevelsDiv);
		container.add(precedenceLevelsMult);
		container.add(precedenceLevelsPower);
		
		//RadioButton
		leftAssociativeRadioButton = new JRadioButton("left");
		leftAssociativeRadioButton.setBackground(lightYellow);
		leftAssociativeRadioButton.setForeground(towti);
		
		rightAssociativeRadioButton = new JRadioButton("right");
		rightAssociativeRadioButton.setBackground(lightYellow);
		rightAssociativeRadioButton.setForeground(towti);
		
		leftAssociativeRadioButton.setBounds(380, 223, 141, 28);
		rightAssociativeRadioButton.setBounds(658, 223, 141, 28);
		container.add(leftAssociativeRadioButton);
		container.add(rightAssociativeRadioButton);
		
		//Assoiative Group
		associativeGroup =new ButtonGroup();
		associativeGroup.add(leftAssociativeRadioButton);
		associativeGroup.add(rightAssociativeRadioButton);
		
		//TextArea and Scroll
		scrol = new JScrollPane();
		scrol.setBounds(380, 524, 419, 118);
		container.add(scrol);
		
		
		tokensTextArea = new JTextArea();
		tokensTextArea.setBounds(380, 524, 419, 118);
		container.add(tokensTextArea);
		scrol.setViewportView(tokensTextArea);
		
		tokensTextArea.setBackground(lightYellow);
		tokensTextArea.setForeground(towti);
		tokensTextArea.setFont(inputColor);
		
		
		////////////////////////////////////////////////////////////
	}
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == resetButton){     
			expressionTextField.setText("");
			tokensTextArea.setText("");
		}
		
		if(event.getSource() == computeButton){
			double result= ProjectMethods.parse(expressionTextField.getText(), getRadio(), getComboBoxSelected());
			String resultString = String.valueOf(result);
			resultTextField.setText(resultString);
			tokensTextArea.setText("");
			
			//set in TextArea
			ArrayList<Token> tList =  ProjectMethods.getTokens(expressionTextField.getText());
			for(int i=0; i<tList.size(); i++) {
				tokensTextArea.append(tList.get(i).toString()+"\n");
			}
			
		}
		
	}
		public int getRadio(){
			if(leftAssociativeRadioButton.isSelected()){
				return 1;
			}else if(rightAssociativeRadioButton.isSelected()){
				return 2;
			}else{
				return 1;
			}	
		}
		
		public int[] getComboBoxSelected(){
			 String divLevelSelected = precedenceLevelsDiv.getSelectedItem().toString();
			 String multLevelSelected = precedenceLevelsMult.getSelectedItem().toString();
			 String powerLevelSelected = precedenceLevelsPower.getSelectedItem().toString();
			 String[] allSelectedString = {divLevelSelected, powerLevelSelected, multLevelSelected};
			 
			 int[] allSelectedInt = new int[3];
			
			 for(int i=0; i < allSelectedString.length;i++){
				 if(allSelectedString[i].equals("level1")){
					 allSelectedInt[i] =1;
				 }else if(allSelectedString[i].equals("level2")){
					 allSelectedInt[i] =2;
				 }else if(allSelectedString[i].equals("level3")){
					 allSelectedInt[i] =3;
				 }
			 }
			 return allSelectedInt;
		}
	
}
