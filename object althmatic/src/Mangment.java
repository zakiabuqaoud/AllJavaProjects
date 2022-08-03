import java.awt.Container;

import javax.swing.*;
public class Mangment {
	static Queue q;
	static Queue qu[];
	static int j=0;
	
	public static String[] save(Queue o) {
	QueueNode<Integer> point =o.fornt;
	String[] data = new String[o.length];
	for(int i=0;i<o.length;i++) {
		try {
		data[i] = ""+(point.item);
		}catch(NullPointerException r) {
			break;
		}
		point=point.link;
	}
	return data;
	}
	private static void print(Queue q2) {
		JOptionPane.showMessageDialog(null,save(q2));
		
	}
	public static  void sort(Queue q) {
		String[] d1 = new String[q.length];
		int[] d2=new int[q.length];
		d1=save(q);
		for(int i=0 ; i<q.length;++i) {
			
			int a=Integer.parseInt(d1[i]);
			d2[i]=a;
		}
		//دالة بتجيب object وبعدها بتحذفه
		qu=new Queue[10];
		for(int i=0 ;i<10 ;++i) {
			qu[i]=new Queue(); 
		}
		int i=0;
		while(i<10) {
			j=d2[i]%10;
			JOptionPane.showMessageDialog(null,""+j);
			Queue.add(d2[i],qu[i]);
			//q.delet();
			++i;
		}
	}
	public String toString(Queue q) {
		return ""+save(q);
	}
		
	
public static void main(String[]args) {
	JOptionPane.showMessageDialog(null,"-----Hollo Man-----");
	String s=JOptionPane.showInputDialog("----Enter nummber---");
	int a=Integer.parseInt(s);
	 q=new Queue(a);
	for(int i=0 ; i<9 ; ++i) {
	String ss=JOptionPane.showInputDialog("----Enter nummber---");
	//q.add(ss);
	}
	print(q);
	q.delet();
	q.delet();
	print(q);
	//sort(q);
	//print(qu[1]);
	//print(q);
}
}
