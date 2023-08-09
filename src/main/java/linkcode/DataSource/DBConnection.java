package linkcode.DataSource;
import java.sql.*;

public class DBConnection {
	static Connection con;
	
	public static Connection getConnection() {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String userName="hr";
		String password="12345678";

		try {
			//Step 1: Load Driver
			Class.forName(driver);

			//Step 2: Connection to Database
			con=DriverManager.getConnection(url, userName, password);
					
			System.out.println("Connected to Database...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
}
