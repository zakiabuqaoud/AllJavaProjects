package project;

import javax.swing.*;
import java.awt.*;

public class DoubleList<T extends Object> {
	
	DoubleNode<T> first;
	int length = 0;
	
	//List Constructor *****************************
	public DoubleList(T o) {
		first = new DoubleNode(null, o, null);
		length++;
	}
	
	public DoubleList() {
		first = new DoubleNode();
		length++;
	}
	
	
	//List Methods ********************************
	public void addFirst(T x) {
		DoubleNode<T> point = this.first;
		//if(!(this.isInList(x))) {
			if(first==null) {first = new DoubleNode(null, x, null); length++; JOptionPane.showMessageDialog(null, "The Element Added Successfully");}
			else {
				first = new DoubleNode(null, x, point);
				point.pre = first;
				length++;
				JOptionPane.showMessageDialog(null, "The Element Added Successfully");
				
			}
		//}
	}
	
	public void addSecound(T x) {
		DoubleNode<T> point1;
		DoubleNode<T> point2 = this.first.next;
			if(first==null) {JOptionPane.showMessageDialog(null, "This List Is Empty So You Can't Add Secound");}
			else {
				point1 = new DoubleNode(first, x, point2);
				first.next = point1;
				point2.pre = point1;
				length++;
				JOptionPane.showMessageDialog(null, "The Element Added Successfully");
			}
		//}
	}
	
	public void addLast(T x) {
		DoubleNode<T> point1 = first;
		DoubleNode<T> point2;
		
		//if(!(this.isInList(x))) {
			if(first==null) {
				first = new DoubleNode(null, x, null);
				length++;
				JOptionPane.showMessageDialog(null, "This List Is Empty So The Element Added At First");
				}
			else {
				for(int i=0; i<this.length-1; i++) point1 = point1.next;
				point2 = new DoubleNode(point1, x, null);
				point1.next = point2;
				JOptionPane.showMessageDialog(null, "The Element Added Successfully");
				length++;
			}
		//}
	}
	
	//Delete Method *************************************
	public void delFirst() {
		if(first==null) {
			JOptionPane.showMessageDialog(null,"This List is Empty");
		}
		else if(length==1) {first=null; length--;}
		else {
			DoubleNode<T> point = first;
			first=first.next;
			first.pre=null;
			point.next = null;
			length--;
		}
	}
	
	public void delLast() {
		DoubleNode<T> point1 = first;
		DoubleNode<T> point2 = first;
		
		if(this.first==null) {
			JOptionPane.showMessageDialog(null,"This List is Empty");
		}
		else if(this.length==1) {first=null; length--;}
		else {
			for(int i=0;i<length-1;i++) {
				point2 = point1;
				point1 = point1.next;
			}
			point2.next = null;
			point1.pre = null;
			length--;
		}
	}
	
	public void delSecound() {
		DoubleNode<T> point1 = first.next.next;
		DoubleNode<T> point2 = first.next;
		if(this.first==null) {
			JOptionPane.showMessageDialog(null,"This List is Empty");
		}
		else if(this.length==1) {
			JOptionPane.showMessageDialog(null,"This List Have One Element Only");
		}
		else {
			first.next = point1;
			point1.pre = first;
			point2.pre = null;
			point2.next = null;
			length--;
		}
	}
	
	//Check If An Item Is In The List**************************************
	public boolean isInList(Object x) {
		DoubleNode<T> point = first;
		if(x.hashCode()==point.object.hashCode()) {
			JOptionPane.showMessageDialog(null, x.toString()+"Founded");
			return true;
		}
		else
			isInList(point.next.object);
		return false;
		
	}
	
	/*public void printTable() {
		DoubleNode point = first;
		Container c = new JFrame("TABLE");
		JTable table = new JTable();
		String [][] data = new String[this.length][];
		for(int i=0;i<this.length;i++) {
			data[i] = point.object.toString();
			
		}
		
	}*/

}

