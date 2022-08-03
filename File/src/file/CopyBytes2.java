package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//copy file using buffering
 class CopyBytes2 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src\\imag.bmp");
            out = new FileOutputStream("src\\imag12.bmp");
            byte buffer[ ]= new byte[20000];
                int c;
                long t1=System.currentTimeMillis();
            while ((c = in.read(buffer)) != -1) {
                out.write(buffer,0,c);
            }
            
            long t2=System.currentTimeMillis();
            System.out.println("Time is "+(t2-t1));
            System.out.println("Finished");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
