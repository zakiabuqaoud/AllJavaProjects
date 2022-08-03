package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyBytes3 {
 public static void main(String[] args) throws IOException {
     FileInputStream in = null;
     FileOutputStream out = null;
     BufferedInputStream inBuffer=null;
     BufferedOutputStream outBuffer=null;
     
     try {
         in = new FileInputStream("src\\imag.bmp");
         out = new FileOutputStream("src\\imag4.bmp");
inBuffer = new BufferedInputStream(in);

outBuffer= new BufferedOutputStream(out);          
int c;


long t1=System.currentTimeMillis();
         while ((c = inBuffer.read()) != -1) {
             outBuffer.write(c);
         }
         
long t2=System.currentTimeMillis();

System.out.println("Time is "+(t2-t1));
         System.out.println("Finished");
     } finally {
         if (inBuffer != null) {          
             in.close();
         }
         if (outBuffer != null) {
             out.close();
         }
     }
 }
}
