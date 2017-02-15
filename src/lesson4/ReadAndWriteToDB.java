package lesson4;

import java.sql.*;

public class ReadAndWriteToDB {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/test";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "180313vv";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      String sql = "SELECT fl.flightnumber, fl.departureAirport, fl.arrivalAirport,"
      		+ " fl.averageTicketPrice, fl.availableSeats, ap.priorityBoarding, al.additionalSpaceService "
      		+ "FROM flights AS fl JOIN `airlines` AS al ON "
      		+ "(al.flightnumber=fl.flightnumber) JOIN `airports` AS ap "
      		+ "ON (fl.departureAirport=ap.airport) WHERE departureAirport "
      		+ "= 'London' AND arrivalAirport = 'Munich' AND averageTicketPrice < 120 "
      		+ "AND priorityBoarding = 'yes' AND additionalSpaceService= 'yes'";
      
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int flightnumber  = rs.getInt("flightnumber");
         String departureAirport = rs.getString("departureAirport");
         String arrivalAirport = rs.getString("arrivalAirport");
         int averageTicketPrice = rs.getInt("averageTicketPrice");
         String availableSeats = rs.getString("availableSeats");
         String priorityBoarding = rs.getString("priorityBoarding");
         String additionalSpaceService = rs.getString("additionalSpaceService");

         //Display values
         System.out.print("Flightnumber: " + flightnumber);
         System.out.print(", departureAirport: " + departureAirport);
         System.out.print(", arrivalAirport: " + arrivalAirport);
         System.out.print(", averageTicketPrice: " + averageTicketPrice);
         System.out.print(", availableSeats: " + availableSeats);
         System.out.print(", priorityBoarding: " + priorityBoarding);
         System.out.println(", additionalSpaceService: " + additionalSpaceService);
      }
      rs.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample