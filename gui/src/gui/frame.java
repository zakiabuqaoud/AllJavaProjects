package gui;
import javax.swing.* ;
import java.awt.*;

public class frame extends JFrame {
	JButton b1  = new JButton("b1") ;
	JLabel l1   = new JLabel("l1") ;
	public frame() {
		super ("title");
	//	this.setTitle("title");åÇÏí Òí Çáí ŞÈáíåÇ  
		this.setSize(400,150);
		this.setLayout(new FlowLayout());
		this.setVisible(true);//ãÚäÇåÇ Çäæ íÙåÑ ÇáæÇÌåÉ
		this.setResizable(false);//áÇ íãßä ÊßÈíÑ æÊÕÛíÑ ÇáæÇÌåÉ
		this.add(b1);
		this.add(l1);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//ãÚäÇåÇ áãÇ ÇÚÕ Úáì ÇáÒÑ ÇáÎØÃ íØİí
		//this.setLayout(null);
		//ÈÓÊÎÏãåÇ áãÇ Çßæä ÈÏí ÇÍØ ÇáßÇÆä Úáì ãÒÇÌí 
		//b1.setBounds(10,20,30,5);
		//this.setDefaultCloseOperation(JFrame.Do_NOTHING_ON_CLOSE);
		//ãÇ ÈŞÏÑ ÇÛÇŞ ÇáæÇÌåÉ
		
		
}
	public static void main (String[] args){
		
		new frame();
	}
	

}
