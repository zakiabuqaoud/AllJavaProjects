import javax.swing.*;
public class Queue<T extends Object > {
public static QueueNode fornt;
public static QueueNode rear;
static int length=0;

public Queue() {
	this.fornt=null;
	this.rear=null;
	
}

public Queue(T o) {
	this.fornt=new QueueNode(o,null);
	this.rear=fornt;
	++length;
	JOptionPane.showMessageDialog(null,"The Element Added Successfully");
}
public static void add(Object o,Queue q) {
	if(q==null) {
		q.fornt=new QueueNode(o,null);
		q.rear=q.fornt;	
		}else {
	QueueNode point=q.fornt;
	q.fornt=new QueueNode(o,point);
	++q.length;
	JOptionPane.showMessageDialog(null,"The Element Added Successfully"+o);
		}
}

public boolean isEmpty() {
	if(this.rear==null||this.fornt==null) {
		return false;
	}
	else return true;
}
public void delet() {
	//try {
		QueueNode point=fornt;
		for(int i=0;i<length-1;i++) {
			point=point.link;
		}
		rear=point;
		--length;
	//}
	//catch(Exception e) {
		//JOptionPane.showMessageDialog(null,"----The Empty-----");
		//}
	}
}
