package sec05.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/initMenu")
public class ContextParamServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		ServletContext context = getServletContext();
		String menu_member = context.getInitParameter("menu_member");
		String menu_order = context.getInitParameter("menu_order");
		String menu_goods = context.getInitParameter("menu_goods");
	
		out.print("<html><body>");
		out.print("<table border = 1 cellspacing = 0>                       ");
		out.print("<tr>메뉴 이름</tr><tr><td>"+ menu_member +"</td>           ");
		out.print("</tr><tr><td>" + menu_order + "</td></tr>                    ");
		out.print("<tr><td> "+ menu_goods + "</td></tr></table></body></html>   ");
	
	}
}
