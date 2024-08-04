import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Pro11 extends HttpServlet {
    
    protected void doGet(httpServletRequest req, httpServletResponse res) throws servletException, IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter(); // Corrected method name and class name
        out.println("<html><body>");
        out.println("<h1>Hello World</h1>");
        out.println("</body></html>"); // Fixed missing closing >
    }
}
