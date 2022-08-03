package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//copy file 
 public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src\\imag.bmp");
            out = new FileOutputStream("src\\imag2.bmp");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
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
