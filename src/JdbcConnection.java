import java.sql.*;
public class JdbcConnection  {
    static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/myBank";
    static final String USER="root";
    static final String PASS="";
    static String sql="insert into account values(12,302.4);";
    public static void main(String[] args) throws Exception{
  Connection conn=null;
try {
    Class.forName(JDBC_DRIVER);
    System.out.println("Connecting to database....");
    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    if (conn != null) {
        System.out.println("Connected to the db");
    }
    Statement st=conn.createStatement();
    int m=st.executeUpdate(sql);

      if(m==1)
      {
          System.out.println("Inserted success");
      }
      else
      {
          System.out.println("Inserted failure");

      }


}
   catch(Exception e)
    {
   e.printStackTrace();

}
    }
}
