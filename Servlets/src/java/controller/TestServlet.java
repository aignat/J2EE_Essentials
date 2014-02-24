
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/caleServlet", initParams = {@WebInitParam(name="type", value="checking")})
public class TestServlet extends HttpServlet {

    String type = null;
    String urlParameter = null;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        type = config.getInitParameter("type");
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<title>Titlu</title>");
        urlParameter = request.getParameter("parametru");
        pw.println("<h1>" + urlParameter + "</h1>");
        pw.println("<h1>" + type + "</h1>");
        
//        SessionCookieConfig config = request.getServletContext().getSessionCookieConfig();
//        config.setHttpOnly(true);
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
