
package three;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Yomna
 */
public class DemoThree implements Servlet{

    private ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
       this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     
        res.setContentType("text/html");
       
        PrintWriter edit = res.getWriter();
         edit.println ("My name is : "+req.getParameter("name")+" .....My age is: "+req.getParameter("age"));
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
       System.out.println("Destroyed !");
    }
    
}
