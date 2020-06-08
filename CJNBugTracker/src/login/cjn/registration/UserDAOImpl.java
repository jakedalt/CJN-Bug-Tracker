package login.cjn.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {

	static Connection con;
	static PreparedStatement ps;
	
	@Override
	public int insertUser(User u) {
		int status = 0;
		try {
			con = ConnectionProvider.getCon();
			ps = con.prepareStatement("insert into user values(?,?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getName());
			
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	@Override
	public User getUser(String username, String password) {
		User u = new User();
		try {
			con = ConnectionProvider.getCon();
			ps = con.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setName(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return u;
	}

}
