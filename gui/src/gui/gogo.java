package gui;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
public class gogo extends JFrame {
	Container c ;
	JPanel p ;
	JButton b[] = new JButton[16];
	JTextField result ;
	String s[] = {"1","2","3","4","5","6","7","8","9","0","+","-","*","/","=",","};
	public gogo(){
		
	c = new JFrame("zaki");
	p =new JPanel();
	p.setLayout(new GridLayout(4,4));
	this.setResizable(false);
	result = new JTextField();
	result.setEditable(false);
	//„⁄‰«Â« „« »ﬁœ— «œŒ· ÃÊ« «·’‰œÊﬁ ﬂ·«„ 
	result.setBackground(Color.cyan);
	//«‰« ⁄„·  ·ÊÊ‰ ‘«‘… «·«·… «·Õ«”»… ·Ê‰Â« ”„«ÊÌ
	for(int i=0 ; i<16;i++){
		b[i]= new JButton(s[i]);
		p.add(b[i]);
		}
	c.add(p);
	//c»⁄ »—Â« ›Ì «·«› —«÷Ì layout border
	c.add(result,BorderLayout.NORTH);
	c.setSize(200,200);
	c.setVisible(true);
	
}
	public static void main (String[] args){
		new gogo();
	}
}
