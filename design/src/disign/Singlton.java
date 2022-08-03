package disign;

public class Singlton {
	//create an object of SingleObject
	   public static Singlton instance = new Singlton();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   public Singlton(){}

	   //Get the only object available
	   public static Singlton getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
