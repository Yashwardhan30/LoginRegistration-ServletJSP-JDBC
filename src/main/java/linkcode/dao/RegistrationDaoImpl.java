package linkcode.dao;
import java.sql.*;
import java.util.List;
import linkcode.DataSource.DBConnection;
import linkcode.model.User;

public class RegistrationDaoImpl implements RegistrationDao {

	@Override
	public int create(List<User> lst) {
		int i=0;
		Connection con=DBConnection.getConnection();
		
		try {
			PreparedStatement pst=con.prepareStatement("insert into userinfo values(?,?,?,?,?,?)");
			User u=lst.get(0);
			pst.setInt(1, u.getId());
			pst.setString(2, u.getFname());
			pst.setString(3, u.getUname());
			pst.setString(4, u.getPass());
			pst.setDouble(5, u.getMno());
			pst.setDouble(6, u.getRamt());
			i=pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return i;
	}
	
}
