package web;
import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	@Override
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom"); 
		PrintWriter out= response.getWriter(); 
		out.println("<html><body>"); 
		out.println("<li> Nom:"+nom+"</li>"); 
		out.println("<li>Protocol: "+request.getProtocol()+"</li>"); 
		out.println("<li>IP Client: "+request.getRemoteAddr()+"</li>");
				out.println("</html></body>"); }
	*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.sendRedirect("Vue.jsp?nom="+request.getParameter("nom")); 
	}

}
