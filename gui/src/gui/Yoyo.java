package gui;
import javax.swing.* ;
import java.awt.*    ;

public class Yoyo extends JFrame {
	JButton b1 ;
	public Yoyo(){
		super("zeko");
	this.setLayout(null);
    setVisible(true);
	setSize(400,400);
	b1 = new JButton("bee");
	b1.setBounds(50,10,200,200);
	this.add(b1);
		}
	public static void main (String[] args) {
		new Yoyo();
	}
}
