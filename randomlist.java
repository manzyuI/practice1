

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**

 */
@WebServlet("/randomlist")
public class randomlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
 
     */
	  protected void doGet(HttpServletRequest request,
		      HttpServletResponse response)
		      throws ServletException, IOException {

	/**
	 * 
	 */
		  int n = (int) (Math.random() *100);
/**
	 *
	 */
 
 response.setContentType("text/html; charset=UTF-8");
 PrintWriter out = response.getWriter();
 out.println("<html>");
 out.println("<head>");
 out.println("<title>ランダムリストプログラム</title>");
 out.println("</head>");
 out.println("<body>");
 out.println(n+"人分出力");
 
 for(int i=1; i<=n; i++) {
	 out.println("<p>" + i + "人目");
 }
 out.println("</body>");
 out.println("</html>");

 }
}