package TurtleGraghice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graghic extends JFrame {
    Graphics2D g2d;
    int lenght;
    int angle;
    int dirction;
    int x;
    int y;
    String stat;
    Frame f;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b;
    JComboBox c;
    String s[] = {"shape 1","shape 2","shape 3","shape 4","shape 5","shape 6"};
    public Graghic() {
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        f = new JFrame();
        f.setLayout(null);
        f.setBackground(Color.RED);
        f.setSize(500,300);
        l1 = new JLabel("X");
        l1.setBounds(10,10,100,30);
        t1 = new JTextField();
        t1.setBounds(120,10,100,30);
        l2 = new JLabel("Y");
        l2.setBounds(250,10,100,30);
        t2 = new JTextField();
        t2.setBounds(360,10,100,30);
        l3 = new JLabel("Lenght");
        l3.setBounds(10,60,100,30);
        t3 = new JTextField();
        t3.setBounds(120,60,100,30);
        l4 = new JLabel("Diryction");
        l4.setBounds(250,60,100,30);
        t4 = new JTextField();
        t4.setBounds(360,60,100,30);
        l5 = new JLabel("Angle");
        l5.setBounds(10,110,100,30);
        t5 = new JTextField();
        t5.setBounds(120,110,100,30);
        l6 = new JLabel("Shap to draw");
        l6.setBounds(250,110,100,30);
        t6 = new JTextField();
        t6.setBounds(360,110,100,30);
        l7 = new JLabel("Shapes");
        l7.setBounds(100,150,100,30);
        c = new JComboBox();
        c.addItem(s[0]);c.addItem(s[1]);c.addItem(s[2]);c.addItem(s[3]);c.addItem(s[4]);c.addItem(s[5]);
        c.setBounds(210,150,150,30);
        b = new JButton("Draw");
        b.setBounds(170,200,160,30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(c);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try{
                    x = Integer.parseInt(t1.getText());
                    y = Integer.parseInt(t2.getText());
                    lenght = Integer.parseInt(t3.getText());
                    dirction= Integer.parseInt(t4.getText());
                    angle= Integer.parseInt(t5.getText());
                    stat=t6.getText();}
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null,"Error in input try again");
                }
                Paint(getGraphics());
            }
        });
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==c){
                    if(c.getSelectedIndex()==0){
                        x =200;y=200;
                        lenght=50 ;dirction=0;
                        angle=45;stat="---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F++F-F-F-F-F-F-F-F";
                        Paint(getGraphics());
                    }
                    else if(c.getSelectedIndex()==1){
                        x =200;y=200;
                        lenght=50 ;dirction=0;
                        angle=45;stat="---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F---F++F++F";
                        Paint(getGraphics());
                    }
                    else if(c.getSelectedIndex()==2){
                        x =200;y=200;
                        lenght=60 ;dirction=0;
                        angle=30;stat="F--F++++F----F++++F++++F----F++++F----F++++F++++F----F++++F--F----F";
                        Paint(getGraphics());
                    }
                    else if(c.getSelectedIndex()==3){
                        x =200;y=200;
                        lenght=50 ;dirction=0;
                        angle=30;stat="-F-F++++F-F++++F-F++++F-F";
                        Paint(getGraphics());
                    }
                    else if(c.getSelectedIndex()==4){
                        x =200;y=200;
                        lenght=80 ;dirction=0;
                        angle=30;stat="F+++F+++F+++F+F++++F-F++++F-F++++F-F++++F";
                        Paint(getGraphics());
                    }
                    else if(c.getSelectedIndex()==5){
                        x =200;y=200;
                        lenght=60 ;dirction=0;
                        angle=45;stat="F-F++F-F+++F--F+++F-F++F-F+++F--F";
                        Paint(getGraphics());
                    }
                }
            }
        });
        setVisible(true);
        f.setVisible(true);



    }
    public void Paint(Graphics g){
        super.paint(g);
        g2d = (Graphics2D)g;
        moveTo(x,y);
        draw();

    }
    public void moveTo(int x , int y){
        g2d.translate(x,y);
    }
    public void forwerd(int lenght1){
        g2d.drawLine(0,0,lenght1,0);
        g2d.translate(lenght1,0);
    }
    public void right(double angle1){
        g2d.rotate(angle1*Math.PI/180);
    }
    public void left(double angle1){
        g2d.rotate(-angle1*Math.PI/180);
    }
    public void forwerd(){
        g2d.drawLine(0,0,lenght,dirction);
        g2d.translate(lenght,dirction);
    }
    public void right(){
        g2d.rotate(angle*Math.PI/180);
    }
    public void left(){
        g2d.rotate(-angle*Math.PI/180);
    }
    public void draw(){
        boolean n = test1(stat);
        if(n)
            for(int i=0;i<stat.length();++i){
                if(stat.charAt(i)=='F')
                    forwerd();
                else if(stat.charAt(i)=='+')
                    right();
                else if(stat.charAt(i)=='-')
                    left();
            }
        else
            JOptionPane.showMessageDialog(null,"Eroor try again");
    }
    public boolean test1(String s){
        boolean n =true;
        for(int i=0 ; i<s.length();++i)
            if(s.charAt(i)!='F'&&s.charAt(i)!='-'&&s.charAt(i)!='+'){
                n=false;
                break;}
        return n;
    }

}
class Test {
    public Test() {
    }
    public static void main(String[] args) {
        new Graghic();
    }
}
