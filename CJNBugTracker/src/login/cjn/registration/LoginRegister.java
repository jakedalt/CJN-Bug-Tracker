package login.cjn.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegister() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO ud = new UserDAOImpl();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password1");
		String submitType = request.getParameter("submit");
		
		User u = ud.getUser(username, password);
		
		if(submitType.equals("login") && u != null && u.getName() != null) {
			request.setAttribute("message", u.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else if (submitType.equals("register")) {
			u.setName(request.getParameter("name"));
			u.setPassword(password);
			u.setUsername(username);
			ud.insertUser(u);
			request.setAttribute("successMessage", "Registration complete. Please log in.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "No data found, please click on register!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
