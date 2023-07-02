package Utils;

import Food.Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Auth", value = "/Auth")
public class Auth extends HttpServlet {

    @Override
    public void init() {}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean pass = true;

        String code = request.getParameter("code");
        for(int i = 1; i < code.length() && pass; ++i)
            if(code.charAt(i - 1) != code.charAt(i))
                pass = false;

        String next = request.getParameter("next");

        if(pass) {
            if (next.equals("add"))
                response.sendRedirect("addProduct.jsp");
            else if (next.equals("edit"))
                response.sendRedirect("editProduct.jsp");
        }
        else response.sendRedirect("auth.jsp?next=" + next + "&pass=false");

    }

}
