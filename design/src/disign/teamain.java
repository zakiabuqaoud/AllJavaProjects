package disign;
import javax.swing.*;
public class teamain {
	 public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
		 teamain object = teamain.getInstance();

	      //show the message
	      object.showMessage();
	   }

	private static teamain getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	private void showMessage() {
		// TODO Auto-generated method stub
		
	}
}
