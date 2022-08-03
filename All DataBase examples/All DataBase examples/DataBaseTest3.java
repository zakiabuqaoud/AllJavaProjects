import java.sql.*;


class DataBaseTest{
	
	 public static void main(String[] args)


        {
            try {
            	
     Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
             String database = "jdbc:ucanaccess://c:/xx/sample2.mdb";
           
         
          //  now we can get the connection from the DriverManager
         Connection con = DriverManager.getConnection( database ,"",""); 
    
        	 con.setAutoCommit(false);
        Statement s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
      
      s.execute("select * from student"); // select the data from the table
      
       ResultSet rowSet = s.getResultSet(); // get any ResultSet that came from our query
        if (rowSet != null){ // if rs == null, then there is no ResultSet to view
        rowSet.last();
        int numRow = rowSet.getRow();
        System.out.println("The number of row retrived is "+numRow);
        ResultSetMetaData meta =rowSet.getMetaData();
        int numColumns= meta.getColumnCount();
       for (int i = 1; i<=numColumns; i++)
      System.out.println( meta.getColumnName(i));
    
       
       rowSet.beforeFirst();
   
   
        while ( rowSet.next() ){ // this will step through our data row-by-row
		for(int i=1;i<=numColumns;++i)
            /* the next line will get the first column in our current row's ResultSet 
            as a String ( getString( columnNumber) ) and output it to the screen */ 
            System.out.printf("%-20s",rowSet.getString(i));
          
        System.out.println();
        }
        rowSet.close();
        


        } 
            
        }


            catch (Exception e) {
            //	e.printStackTrace();
           // System.out.println("Error: " + e);
        }
    }

}