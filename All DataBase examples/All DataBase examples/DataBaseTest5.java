import java.sql.*;
import net.ucanaccess.jdbc.*;
class DataBaseTest{
	
	 public static void main(String[] args)

        {
             try {
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
             String database = "jdbc:ucanaccess://c:/xx/sample2.mdb";
           
         
          //  now we can get the connection from the DriverManager
         Connection con = DriverManager.getConnection( database ,"",""); 	
          
         
        Statement s = con.createStatement();
       s.addBatch("insert into student (name,mark,id)  values('Iyad ',88,6000)");
       s.addBatch("insert into student(name,mark,id)   values('Khaled',90,7000)");
       s.addBatch("delete from student where mark <= 70");
        int [] updateCounts=    s.executeBatch();
    
    System.out.println("Number of row update by the third statement: "+ updateCounts[2]);
   
       con.commit();
       s.execute("select * from student");
        ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query
        if (rs != null) // if rs == null, then there is no ResultSet to view
        while ( rs.next() ) // this will step through our data row-by-row

            {
            /* the next line will get the first column in our current row's ResultSet 
            as a String ( getString( columnNumber) ) and output it to the screen */ 
            System.out.println("Data from ID: " + rs.getInt("ID") );
            System.out.println("Data from name: " + rs.getString("name") );
            System.out.println("Data from mark: " + rs.getString("mark") );
          
        }

            
        }


            catch (Exception e) {
            	e.printStackTrace();
           // System.out.println("Error: " + e);
        }
    }

}