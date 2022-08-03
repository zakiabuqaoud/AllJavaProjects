package ds;
import java.awt.*;
import javax.swing.*;
public class StudentsList extends DoubleList<Student>{
	
	public StudentsList(Student s) {
		super(s);
	}
	
	public StudentsList() {
		this.first = null;
		this.length = 0;
		
	}
	
	public void printTable() {
		if(first == null) {
			JOptionPane.showMessageDialog(null, "This List Empty !");
			return;
		}
		DoubleNode<Student> point = first;
		Container c = new JFrame("TABLE");
		String[] tableHead = {"id","FirstName","LastName","Mid Exam Mark","Final Exam Mark","Total","Grade"};
		JTable table;
		String [][] data = new String[this.length][tableHead.length];
		for(int i=0;i<this.length;i++) {
			try {
			data[i] = point.object.information();
			}catch(NullPointerException r) {
				break;
			}
			point=point.next;
		}
		table = new JTable(data, tableHead);
		table.setEnabled(false);
		
		JPanel p = new JPanel();
		//p.setLayout(null);
		p.setSize(600,450);
		table.setBounds(10,10,500,500);
		p.add(table);
		p.setVisible(true);
		
		c.add(p);
		c.setVisible(true);
		c.setSize(700,500);
		
		
	}
	
	public void printSortedTable() {
		if(first == null) {
			JOptionPane.showMessageDialog(null, "This List Empty !");
			return;
		}
		
		StudentsList l = new StudentsList();
		
		Student []array =new Student[this.length];
		
		DoubleNode<Student> p=this.first;
		//***********************
		for(int i=0;i<this.length;i++) {
			array[i] = p.object;
			p=p.next;
		}
		
		//**************************
		Student temp;
		for(int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				
				if(array[i].hashCode()<array[j].hashCode())
				{
					temp=array[i];
					array[i]=array[j];
					array[j] = temp;
				}					
			}
			
		}
		
		//*************************
		for(int i=0;i<this.length;i++) {
			l.addLast((Student)array[i]);
		}
		
		l.printTable();
		
	}
	
	public static void main(String []args) {
		StudentsList l = new StudentsList(new Student(13,"s","ss",50,50));
		l.addLast(new Student(4,"s","ss",50,50));
		l.addSecound(new Student(2,"s","ss",50,50));
		l.addLast(new Student(1,"s","ss",50,50));
		l.addSecound(new Student(5,"s","ss",50,50));
		l.addFirst(new Student(6,"s","ss",50,50));
		l.addFirst(new Student(7,"s","ss",50,50));
		l.printTable();
		//l.delFirst();
		//l.delLast();
		l.delSecond();
		l.printTable();
		l.printSortedTable();
		JOptionPane.showMessageDialog(null, l.first.object.toString());
		//Student.l.printTable();
		
	}

}


