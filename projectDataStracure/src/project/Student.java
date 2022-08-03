package project ;
import javax.swing.JOptionPane;

public class Student  {
	static DoubleList<Student> l = new DoubleList();
	int id, midMark, finalMark, total = midMark+finalMark;
	String firstName, lastName;
	
	public Student(int id, String firstName, String lastName, int mid, int f) {
		//if(((id==0 || firstName==null) || (lastName==null || mid==0 ))|| (f==0) )
		//	JOptionPane.showMessageDialog(null,"Complet choose");
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midMark = mid;
		this.finalMark = f;
		total = midMark+finalMark;
		l.addLast(this);
	}
	
	public Student() {l.addLast(this);}
	
	public int hashCode() {
		return id;
	}
	
	public String[] information() {
		String s1,s2,s3,s4;
		s1=""+id;
		s2=""+midMark;
		s3=""+finalMark;
		s4=""+total;
		String s[] = {s1,firstName,lastName,s2,s3,s4};
		return s;
	}

	public String getGreat() {
	//	if(this.total<50)
		//return "Field";
		if(this.total>=60 && total<70)
		return "Pass";
		else if(total>=70 && total<80)
		return "Good";
		else if(total>=80 && total<90)
			return "Verry Good";
		else if(total >=90 && total<=100)
			return "Excellent";
		else 
			return "Failed";
			
	}
	
	public static boolean checkMark(int m) {
		if(m>50 || m<0) return false;
		else
			return true;
	}
	
	public static boolean checkName(String s) {
		char []ch = new char[s.length()];
		int count=0;
		for(int i=0;i<s.length();i++)ch[i] = s.charAt(i);
		
		for(int i=0;i<s.length();i++)
			if(ch[i]>=65&&ch[i]<=122)
				count++;
		
		if(count==s.length())return true;
		else return false;
	}


	
	
	/*public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[]args) {
		new Student();
	}*/

}
