package h;
import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;

public class Country extends JFrame implements ItemListener,ActionListener
{
	Container c;
	JLabel l1,l2 ;
	//DefaultComboBoxModel o;  //55
	JButton b1 = new JButton("print");
	JButton b2 = new JButton("Exit") ;
	//o=new DefaultComboBoxModel(s);//55
    String s[] = {"palestine","Egypt","Sudan","Syria"};
    String s2[] = {"gaza","rafah",};
    String s3[] = {"sina","Cairo"};
    String s4[] = {"Khartoum"};
    String s5[] = {"Aleppo","Damascus"};
    JComboBox cb;
    JComboBox cb2;
  //  cb.setModel(new DefaultComboBoxModel(s));
    public Country(){
        c=getContentPane();
        cb= new JComboBox();
        cb2=new JComboBox();
    
                    
    	c.setLayout(null);	
    	l1 =new JLabel("country");
    	l2 =new JLabel("city");
    	cb.setModel(new DefaultComboBoxModel(s));
    	cb2.setModel(new DefaultComboBoxModel(s2));
    	l1.setBounds(10,10,50,30);
    	l2.setBounds(10,50,50,30);
    	cb.setBounds(60,10,100,30);
    	cb2.setBounds(60,50,100,30);
    	b1.setBounds(60,150,100,30);
    	b2.setBounds(160,150,100,30);
    	c.add(l1);
    	c.add(l2);
    	c.add(b1);
    	c.add(b2);
    	c.add(cb);
    	c.add(cb2);
    	cb.setSelectedIndex(0);//now 0
    	//Â«œÌ » ⁄„·Ì ‘Ê «Ê· Õ«Ã… »«·ﬂ„»Ê »Êﬂ” ÕÌﬂÊ‰ Õ«ÿÿ «·”Êœ«‰ ·«‰ —ﬁ„Â« 2
    	setSize(400,400);
    	setVisible(true);
    	
        
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	cb.addItemListener(this);
    	
    	
    	
    	
    	
    }


	public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED)
			{
			if (e.getSource()== cb){
				
		    if(cb.getSelectedItem().equals("palestine"))
		    {
					cb2.setModel(new DefaultComboBoxModel(s2));
		    }
		    else if (cb.getSelectedItem().equals("Egypt"))
					cb2.setModel(new DefaultComboBoxModel(s3));
		    else if (cb.getSelectedItem().equals("Sudan"))	
					cb2.setModel(new DefaultComboBoxModel(s4));
		    else if(cb.getSelectedItem().equals("Syria"))
				cb2.setModel(new DefaultComboBoxModel(s5));
				}}}
public void actionPerformed(ActionEvent e) {
		
	if (e.getSource()== b1){
	    JOptionPane.showMessageDialog(null, "the right");
	    	}
		if (e.getSource()== b2){
			System.exit(0);}
	}
				
	public static void main (String[] args) {
        new Country() ;
        
	}
	

	}
