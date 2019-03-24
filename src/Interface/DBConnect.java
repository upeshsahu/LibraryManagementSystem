package Interface;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnect{

  public static Connection connect()
  {
  Connection conn=null;
  try
     {
	   Class.forName("com.mysql.jdbc.Driver");
	   conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydata?","root","");
	   System.out.println("from the DBConnect class,connection buid");
	   JOptionPane.showMessageDialog(null, "connection build successfully");
     }
	 catch(Exception e)
     {
	   System.out.println("making connection to database calling DBConnect from DBConnect class"+e);
     }
   return conn; 
  }
}
