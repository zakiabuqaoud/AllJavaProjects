package b;

import javax.swing.*;
public class Queue<T extends Object > {
public QueueNode fornt;
public QueueNode rear;
int length=0;
public Queue() {
	this.fornt=null;
	this.rear=null;
	this.length=0;
}

public Queue(int o) {
	this.fornt=new QueueNode(o,null);
	this.rear=fornt;
	++length;
	JOptionPane.showMessageDialog(null,"The Element Added Successfully");
}
public <T extends Object> void add(int o) {
	QueueNode point =new QueueNode();
	point.item =o  ;
	point.link =null ;
	if (rear == null){
		fornt=rear=point;
	    ++length ;}
	else{
		rear.link= point;
		rear =point ;
		++length ;
	}
}

public boolean isEmpty() {
	if(this.rear==null||this.fornt==null) {
		return false;
	}
	else return true;
}
public void delet() {
	if(fornt==null){
		JOptionPane.showMessageDialog(null,"---The Empty---");
	}
	else if(length==1){
		fornt=rear=null;
		--length;
	}else{
     QueueNode point;
     point=fornt;
     fornt=fornt.link;
     point.link=null;
     --length;
	}
	}
public void conection(Queue q){
	
	while(q.fornt!=null){
		this.add(q.fornt.item);
		q.delet();
	}
	
}
	public  String[] sort() {
		Queue qu[]=new Queue[10];
		String d3[]=new String[length];
		for(int i=0 ;i<10 ;++i) {
			qu[i]=new Queue(); 
		}
		int le,a;
		le=this.length;
		QueueNode point1=fornt;
		/*for(int i=0;i<le;++i){
			JOptionPane.showMessageDialog(null,""+point1.item);
		point1=point1.link;}*/
		for(int i=0;i<le;++i) {
			//JOptionPane.showMessageDialog(null,""+(int)fornt.item);
			a=fornt.item%10;
			//JOptionPane.showMessageDialog(null,""+a);
			qu[a].add(fornt.item);
			delet();
		}
		for(int h=0; h<10 ;++h){
		conection(qu[h]);	
		}
		
		int b;
			for(int i=0;i<le;++i) {
				b=fornt.item/10%10;
				//JOptionPane.showMessageDialog(null,""+b);
				qu[b].add(fornt.item);
				delet();
		}
		for(int h=0; h<10 ;++h){
			conection(qu[h]);	
			}
		int c;
		for(int i=0;i<le;++i) {
				c=fornt.item/100;
				//JOptionPane.showMessageDialog(null,""+c);
				qu[c].add(fornt.item);
				this.delet();
		}
		for(int h=0; h<10 ;++h){
		this.conection(qu[h]);	
		}
		 QueueNode point;
		 point=fornt;
		for(int h=0;h<le;++h){
			d3[h]=""+point.item;
			point=point.link;
		}
		point1=fornt;
		for(int i=0;i<le;++i){
			JOptionPane.showMessageDialog(null,""+point1.item);
		point1=point1.link;}
		return d3;
	}
	
	/*public static String[] save(Queue o) {
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
	public void print() {
		JOptionPane.showMessageDialog(null,save(this));
		
	}*/
}