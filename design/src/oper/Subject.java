package oper;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Opserver> observers = new ArrayList<Opserver>();
	   private int state;

	   public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers();
	   }

	   public void attach(Opserver observer){
		   observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Opserver observer : observers) {
	         observer.update();
	      }
	   }
}
