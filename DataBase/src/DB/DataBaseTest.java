package DB;

import java.sql.*;
//import net.ucanaccess.jdbc.*;
//add package
class DataBaseTest{
	
	 public static void main(String[] args)
        {
            try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       
          //  now we can get the connection from the DriverManager   
         Connection con = DriverManager.getConnection("jdbc:ucanaccess://c:/xx/sample2.mdb","",""); 
         con.setAutoCommit(false);
        Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      
       s.execute("select id,name,mark from student");
       
       
        ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query
        
        
         if (rs != null) // if rs == null, then there is no ResultSet to view
     
      while ( rs.next())// this will step through our data row-by-row
            {
            /* the next line will get the first column in our current row's ResultSet 
            as a String ( getString( columnNumber) ) and output it to the screen */ 
        System.out.println(rs.getRow());
        System.out.println("Data from ID: " + rs.getInt(1));
       System.out.println("Data from name: " + rs.getString("name") );
        System.out.println("Data from mark: " + rs.getInt("mark"));
          
     }
   
     con.commit(); 
      
        }

            catch (Exception e) {
            	e.printStackTrace();
           // System.out.println("Error: " + e);
        }
    }

}