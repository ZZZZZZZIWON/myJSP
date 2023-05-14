package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디:" + user_id);
		System.out.println("비밀번호:" + user_pw);
	}	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
