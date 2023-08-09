package linkcode.dao;
import java.sql.*;
import java.util.*;
import linkcode.DataSource.DBConnection;
import linkcode.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User searchRecord(String uname) {
		Connection con=DBConnection.getConnection();
		User temp=null;
		
		try {
			PreparedStatement pst=con.prepareStatement("select * from userinfo where uname=?");
			pst.setString(1, uname);
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				
				temp=new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}
	
}
