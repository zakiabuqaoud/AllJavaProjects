package file;

import java.io.*;

public class Example8 {
    public static void main(String args[]) {

	    // writing part
	try {
	    ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("invoice3.dat"));

	    double prices[] = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	    int units[] = { 12, 8, 13, 29, 50 };
	    String descs[] = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java pin", "Java Key Chain" };
	
	    for (int i = 0; i < prices.length; i ++) {
	    	dos.writeObject(descs[i]);
	    	dos.writeObject(prices[i]);
	      //  dos.writeChar('\t');
	        dos.writeObject(units[i]);
	      //  dos.writeChar('\t');
	        
	      //  dos.writeChar('\n');
	        System.out.println("Write record"+i);
	    dos.flush();
	    }
	    dos.close();
	} catch (IOException e) {
	    System.out.println("DataIOTest: " + e);
	}

	    // reading part
	try {
	    ObjectInputStream dis = new ObjectInputStream(new FileInputStream("invoice3.dat"));

	    double price;
	    int unit;
	    String desc;
	    boolean EOF = false;
	    double total = 0.0;
int count=0;
	    while (!EOF) {
	        try {
	        	
	        desc = (String)dis.readObject();
	            price = (Double)dis.readObject();
	         //   dis.readChar();       // throws out the tab
	            unit =(Integer)dis.readObject();
	         //   dis.readChar();       // throws out the tab
	        //    desc = dis.readUTF();
		    System.out.println("You've ordered " + unit + " units of " + desc + " at $" + price);
		    total = total + unit * price;
		    
	        } catch (EOFException  e) {
	        	
		    EOF = true;
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    }
	    System.out.println("For a TOTAL of: $" + total);
	    dis.close();
	} catch (FileNotFoundException e) {
	    System.out.println("DataIOTest: " + e);
	} catch (IOException e) {
	    System.out.println("DataIOTest: " + e);
	}
    }
}
