package sec05.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cget")
public class GetServletContext extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("html/text:charset=utf-8");
	PrintWriter out = resp.getWriter();
	ServletContext context = getServletContext();
	List member = (List) context.getAttribute("member");
	String name = (String) member.get(0);
	int age = (Integer) member.get(1);
	out.print("<html><body>");
	out.print( name );
	out.print("<br>");
	out.print( age );
	out.print("<br>");
	out.print("</body></html>");
	
	
	
	
	}
}
