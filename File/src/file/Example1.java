package file;

import java.io.File;
import java.util.Date;
public class Example1 {
  public static void main(String[] a) {
    File myFile = new File("C:\\WINDOWS\\Temp");
    System.out.println(myFile.getName());
    System.out.println(myFile.getPath());
if ( myFile.exists() ){
Long lastModified = myFile.lastModified();

        // Create a new date object and pass last modified information
        // to the date object.
        Date date = new Date(lastModified);
        
        // We know when the last time the file was modified.
        System.out.println(date);
if (myFile.isDirectory() ) // output directory listing
{
String directory[] = myFile.list();
System.out.println( "\n\nDirectory contents:\n" );
for ( String directoryName : directory )
System.out.printf( "%s\n", directoryName );
} 

}

  }
}
