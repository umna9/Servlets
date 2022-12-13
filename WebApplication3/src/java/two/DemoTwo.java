
package two;

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
public class DemoTwo implements Servlet{

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
        String str = config.getInitParameter("name");
        String str2 = config.getInitParameter("age");
        PrintWriter edit = res.getWriter();
        edit.println("My name is: " + str);
        edit.println(" .....My age is: " + str2);
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
