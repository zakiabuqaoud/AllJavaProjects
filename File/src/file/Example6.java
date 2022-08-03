package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

 public class Example6 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("src\\testin.txt"));
            outputStream = new PrintWriter(new FileWriter("src\\characteroutput22.txt"));

            int c;
            String line=null;
            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
             
                
            }
            
            System.out.println("Finished");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
