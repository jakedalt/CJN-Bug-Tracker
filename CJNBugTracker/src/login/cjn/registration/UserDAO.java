package login.cjn.registration;

public interface UserDAO {

	public int insertUser(User u);
	public User getUser(String username, String password);
}
