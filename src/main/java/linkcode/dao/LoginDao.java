package linkcode.dao;
import java.util.List;
import linkcode.model.User;

public interface LoginDao {

	public User searchRecord(String uname);
	
}
