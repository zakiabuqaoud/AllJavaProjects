package gui;
import javax.swing.* ;
import java.awt.event.*;
import java.awt.*;

 class Work extends JFrame implements ActionListener{
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JButton b1 ;
		JLabel l1 ;
		Container c ;//·«“„ «⁄„·  ⁄  awt
		
		public Work(){
			c=getContentPane();
			b1 = new JButton("b1");
			l1 = new JLabel("l1");
			setVisible(true);
			setSize(200,200);
			this.setLayout(new FlowLayout());
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setTitle("title");
			c.add(b1);
			c.add(l1);
			b1.addActionListener(this);
			}
		
		
		public void actionPerformed(ActionEvent e) {
			//if(e.getSource()==b1){
			//ÂÌﬂ »‘ €· ·√‰Â ›‘Ì ⁄‰œÌ €Ì— “— Ê«Õœ
			l1.setText("gogo");
			}
		//}
			public static void main(String[]args){
				new Work();
			}
			
		
		}

