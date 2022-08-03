package oper;

public class Octal extends Opserver{
	   public Octal(Subject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() {
		     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
}
}