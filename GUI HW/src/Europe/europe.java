package Europe;
import javax.swing.* ;

import java.awt.* ;
import java.awt.event.* ;

public class europe extends JFrame implements ActionListener,ItemListener {

Container   con;	
JButton     p1 , p2 ;
JComboBox   c1 , c2 ;
JLabel      l1 , l2 ;

String      cy[]={"","Germany" ,"France" ,"Italy" ,"Spain"} ;
String      g[] ={"Berlin","Hamburg","Munich","Dortmund","Essen","Bremen","Nuremberg"," Duisburg","Bochum","Bonn"};
String      f[] ={"Paris","Marseille","Lyon","Toulouse","Nice","Nantes","Strasbourg","Montpellier","Bordeaux","Lille"};
String      i[] ={"Rome","Milan","Naples","Turin","Palermo","Genoa","Bologna"};
String      s[] ={"Andalusia","Almeria province","Cadiz province","Cordoba province","Jaen province","Malaga province","Teruel province","Huesca province"};

public europe(){
	con =getContentPane() ; 
	c1  =new JComboBox(cy) ;
	c2  =new JComboBox(g) ;
	p1  =new JButton("Print country");	
	p2  =new JButton("Exit");
	l1  =new JLabel("Country");
	l2  =new JLabel("City");
	
	setVisible(true);
	setSize(500,500);
    con.setLayout(null);
    
    c1.setBounds(85,30,100,25);
    c2.setBounds(85,75,100,25);
    p1.setBounds(100,150,70,60);
    p2.setBounds(200,150,70,60);
    l1.setBounds(20,30,50,25);
    l2.setBounds(20,75,50,25);
    
  
//	c1.setModel(new DefaultComboBoxModel());
	c2.setModel(new DefaultComboBoxModel());
    
    con.add(p1);
    con.add(p2);
    con.add(c1);
    con.add(c2);
    con.add(l1);
    con.add(l2);
    
	p1.addActionListener(this);
	p2.addActionListener(this);
	c1.addItemListener(this);

	
	
} 
	
	

	
	
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()== p1)
	    JOptionPane.showMessageDialog(null , c2.getSelectedItem() +" in "+ c1.getSelectedItem() ,"country" , -1);
	if (e.getSource()== p2)
		System.exit(0) ;
			
			
	}

public void itemStateChanged(ItemEvent e){
if (e.getSource() == c1){
	if(c1.getSelectedItem().equals("Germany"))
		c2.setModel(new DefaultComboBoxModel(g));
	
	if(c1.getSelectedItem().equals("France"))
		c2.setModel(new DefaultComboBoxModel(f));
	
	if(c1.getSelectedItem().equals("Italy"))
		c2.setModel(new DefaultComboBoxModel(i));
	
	if(c1.getSelectedItem().equals("Spain"))
		c2.setModel(new DefaultComboBoxModel(s));
	
	
	
}
	
	
}

	public static void main(String args[]){
		new europe() ;
		
	}
}


///////////////////////