package oper;

public class Lion {
	public static void main(String[] args) {
	      Subject subject = new Subject();

	      new Hexa(subject);
	      new Octal(subject);
	      new Binary(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
}
