package file;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public static void main(String[] args) {
        try {
            //
            // Create a new instance of RandomAccessFile class. We'll do a "r"
            // read and "w" write operation to the file. If you want to do a write
            // operation you must also allow read opeartion to the RandomAccessFile
            // instance.
            //
            RandomAccessFile raf = new RandomAccessFile("books.dat", "rw");

            //
            // Let's write some book's title to the end of the file
            //
            String books[] = new String[5];
            books[0] = "Professional JSP";
            books[1] = "The Java Application Programming Interface";
            books[2] = "Java Security";
            books[3] = "Java Security Handbook";
            books[4] = "Hacking Exposed J2EE & Java";
           
            for (int i = 0; i < books.length; i++) {
            	  StringBuffer x = new StringBuffer();
            	  x.append(books[i]);
                  x.setLength(16);
                 System.out.println( x.toString().getBytes().length);
                raf.write(x.toString().getBytes());
            }
     System.out.println(raf.length());
            //
            // Write another data at the end of the file.
            //
        //    raf.seek(raf.length());
          //  raf.writeUTF("Servlet & JSP Programming");

            //
            // Move the file pointer to the beginning of the file
            //
          //  raf.seek();
      //      System.out.println(raf.readUTF());
            //
            // While the file pointer is less than the file length, read the
            // next strings of data file from the current position of the
            // file pointer.
            //
         
             
          
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            catch(EOFException e2){
        	e2.printStackTrace();
            }
         catch (IOException e3) {
            e3.printStackTrace();
        }

    }
}

