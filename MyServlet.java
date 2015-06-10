import com.mysoft.Dao;

import java.io.IOException;

/**
 * Created by BABIY on 16.05.2015.
 */
@javax.servlet.annotation.WebServlet(name = "MyServlet", urlPatterns = "/posts")
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("posts", Dao.getPosts());

        response.getOutputStream().write("From servlet page".getBytes());
    }
}
