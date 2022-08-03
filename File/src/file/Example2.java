package file;

import java.io.*;

public class Example2 {
	public static void main(String args[]){
		   		
		   try{
		      byte bWrite [] = {65,97,3,40,5};
		      OutputStream os = new FileOutputStream("test2.dat");
		     
		      for(int x=0; x < bWrite.length ; x++){
		         os.write( bWrite[x] ); 
		        // writes the bytes
		     
		      }
		      os.flush();
		      os.close();
		     
		      InputStream is = new FileInputStream("test2.dat");
		      int size = is.available();

		      for(int i=0; i< size; i++){
		         System.out.print(is.read() + "  ");
		      }
		      is.close();
		   }catch(IOException e){
		      System.out.print(e+"Exception");
		   }	
		   }

}

