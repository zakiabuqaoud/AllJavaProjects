package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Student implements Comparable<Student> {
	int id;
	String name;
	double avg;
	public Student(int id, String name,double avg) {
		super();
		this.id = id;
		this.name = name;
		this.avg=avg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return id+" "+name+" "+avg;
	}
	
	public boolean equals(Object s){
		return this.id==((Student)s).id;
	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
 public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        ArrayList<Student> list= new ArrayList<Student>();

        try {
            inputStream = 
                new BufferedReader(new FileReader("src\\testin.txt"));
            outputStream = 
                new PrintWriter(new FileWriter("src\\characteroutput2.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                Scanner in=new Scanner(l);
                int id=in.nextInt();
                String firstName= in.next();
                String lastName= in.next();
                double avg=in.nextDouble();
            list.add(   new Student(id,firstName+" "+lastName,avg)); 
            }
            
            System.out.println(list);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

