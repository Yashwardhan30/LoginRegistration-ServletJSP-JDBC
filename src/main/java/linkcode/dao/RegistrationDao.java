package linkcode.dao;
import java.util.List;
import linkcode.model.User;

public interface RegistrationDao {

	public int create(List<User> lst);
	
}
