package ds;
import javax.swing.*;
import java.awt.*;
//Error In Delete Second!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class DoubleList<T extends Object> {
	
	DoubleNode<T> first ;    
	int length = 0;
	
	//List Constructor *****************************
	public DoubleList(T o) {         
		first = new DoubleNode(null, o, null);
		length++;
	}
	
	public DoubleList() {
		first = null;
		length = 0;
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
		//if(!(this.isInList(x))) {
			if(first==null) {JOptionPane.showMessageDialog(null, "This List Is Empty So You Can't Add Secound");}
			else if(first.next == null) {point1 = new DoubleNode(first, x, null); first.next=point1;}
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
				//JOptionPane.showMessageDialog(null, "This List Is Empty So The Element Added At First");
				}
			else {
				for(int i=0; i<this.length-1; i++) point1 = point1.next;
				point2 = new DoubleNode(point1, x, null);
				point1.next = point2;
				//JOptionPane.showMessageDialog(null, "The Element Added Successfully");
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
			JOptionPane.showMessageDialog(null, "First One Deleted");
		}
	}
	
	public void delLast() {
		DoubleNode<T> point1 = first;
		DoubleNode<T> point2 = first;
		
		if(this.first==null) {
			JOptionPane.showMessageDialog(null,"This List Empty");
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
			JOptionPane.showMessageDialog(null, "Last One Deleted");
		}
	}
	
	public void delSecond() {
		DoubleNode<T> point1 ;
		DoubleNode<T> point2 ,point3;
		if(length == 0 || length == 1) {
			JOptionPane.showMessageDialog(null,"There Is No Second One");
		}
		else if(length==2) {
			first.next.pre = null;
			first.next = null;
			length--;
			JOptionPane.showMessageDialog(null,"Second One Deleted");
		}
		else {
			point1 = first;
			point2 = point1.next;
			point3 = point2.next;
			
			point1.next = point3;
			point3.pre = point1;
			
			point2.pre = null;
			point2.next = null;
			
			length--;
			JOptionPane.showMessageDialog(null, "Second One Deleted");
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
	
	public void swap(DoubleNode<T> p1, DoubleNode<T> p2) {
		p1.next = p2.next;
		p2.next.pre = p1;
		p2.pre = p1.pre;
		p1.pre.next = p2;
		p2.next = p1;
		p1.pre = p2;
	}
	
	/*public void sort() {
		DoubleNode<T> n;
		if((length == 0)||(length == 1))return;
		else if(length == 2) {
			n = first;
			if(n.object.hashCode() > n.next.object.hashCode()) {
				n.next.pre = n;
				n.pre = n.next;
				n.next = null;
				n.pre.next = n;
				return;
			}
			else return;
		}
		else {
			DoubleNode<T> p1,p2;
			n = first;
			p1= n.next;
			p2= p1.next;
			boolean flag = false;
			
			if(n.object.hashCode()>p1.object.hashCode()) {
				n.next = p2;
				p1.pre = null;
				p2.pre = n;
				n.pre = p1;
				p1.next = n;
				first = p1;
				flag = true;
				
			}
			else {
				while(!flag) {
					n = n.next;
					p1 = p1.next;
					if (p1 == null)flag = true;
					if(n.object.hashCode()>p1.object.hashCode()) swap(n,p1);
				}
				
			}
			
			
			/*DoubleNode<T> p1 = n.pre;
			if(n.pre.object.hashCode() > n.object.hashCode() && n.next == null) {
				p1 = n.pre;
				p1.next = null;
				n.next = p1;
				n.pre = p1.pre;
				p1.pre.next = n;
				p1.pre = n;
			}
			else if(n.pre.object.hashCode() > n.object.hashCode() && n.next != null) swap(p1,n);
			else if(n.pre.object.hashCode() < n.object.hashCode()) n = n.pre;
			
			{DoubleNode<T> p = this.first;
			int sortFlag = 0;
			for(int i=0;i<length-1;i++)
				if(p.object.hashCode() < p.next.object.hashCode()) {sortFlag++; p = p.next;}
			if(sortFlag+1 == length) return;
			}
			
		}
		
	}
		{   DoubleNode<T> p = this.first;
		int sortFlag = 0;
		for(int i=0;i<length-1;i++)
			if(p.object.hashCode() < p.next.object.hashCode()) {sortFlag++; p = p.next;}
		if(sortFlag+1 == length) return;
		else sort();
	}
	
	}*/
	
	public boolean search(int x) {
		if(first == null)return false;
		else if(length == 1) {if(first.object.hashCode() == x) return true;else return false;}
		else {
			DoubleNode<T> p = first;
			for(int i=0;i<length;i++) {
				if(p.object.hashCode() == x)
					return true;
				else p = p.next;
			}
			return false;
		}
	}
	
	/*public void sort(DoubleNode<T> x) {
		DoubleNode<T> point1;
		if(x.next != null)
			sort(x.next);
		
		point1 = x.pre;
	}*/
	
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

