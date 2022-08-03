package file;
import java.io.*;
public class FileZaki {
	File f ;
	
	FileZaki(){
		f = new File("c:zaki/123.txt");
		if(!f.exists()){
			try{
			f.createNewFile();}
			catch(Exception e){
				e.printStackTrace();
				
			}
			
		}
		
		
		
	}
	

}
