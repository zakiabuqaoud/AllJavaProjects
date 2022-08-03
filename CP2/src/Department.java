
import java.util.LinkedList;
import javax.swing.JTextField;
import javax.swing.JList;

public class Department {
	
	private String name;
	private String description;
	
	public static LinkedList<Department> depList = new LinkedList<Department>();
	public JList<Product> jlist = new JList<Product>();
	
	public LinkedList<Product> productslist = new LinkedList<Product>();
	
	public Department(String name, String s) {
		this.name = name;
		this.description = s;
		
		depList.add(this);
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDescription(String s) {
		this.description = s;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void addProduct(Product p) {
		this.productslist.add(p);
	}
	
	public String toString() {
		return this.getName();
	}
	
	public static boolean search(String n) {
		for(int i=0;i<depList.size();i++)
			if(depList.get(i).getName().equals(n))
				return true;
		return false;
	}
	
	public static int getIndex(String n) {
		for(int i=0;i<depList.size();i++)
			if(depList.get(i).getName().equals(n))
				return i;
		return -1;
	}
	
	

	
}
