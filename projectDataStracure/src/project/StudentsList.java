package project;
import java.awt.*;
import javax.swing.*;
public class StudentsList extends DoubleList<Student>{
	static StudentsList l;
	public StudentsList(Student s) {
		super(s);
	}
	public StudentsList() {
		
	}
	
	public void printTable() {
		DoubleNode<Student> point = first;
		Container c = new JFrame("TABLE");
		JScrollPane scroll = new JScrollPane();
		String tableHead[] = {"id","FirstName","LastName","Mid Exam Mark","Final Exam Mark","Total"};
		JTable table;
		String [][] data = new String[this.length][];
		for(int i=0;i<this.length;i++) {
			data[i] = point.object.information();
			point=point.next;
		}
		table = new JTable(data, tableHead);
		scroll.add(table);
		c.add(table);
		c.setVisible(true);
		c.setSize(700,500);
		
		
	}
	public static void main(String []args) {
		StudentsList l = new StudentsList(new Student(1,"s","ss",50,50));
		l.addLast(new Student(3,"s","ss",50,50));
		l.addSecound(new Student(2,"s","ss",50,50));
		l.addLast(new Student(4,"s","ss",50,50));
		l.addSecound(new Student(5,"s","ss",50,50));
		l.addFirst(new Student(6,"s","ss",50,50));
		l.addFirst(new Student(7,"s","ss",50,50));
		l.printTable();
		
	}

}

