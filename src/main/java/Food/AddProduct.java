package Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

@WebServlet(name = "AddProduct", value = "/AddProduct")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 3, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 100)
public class AddProduct extends HttpServlet {

    @Override
    public void init() {}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Part sample = request.getPart("sample");
        String name = request.getParameter("product");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Food.Urgency urgency = null;
        switch (request.getParameter("urgency")) {
            case "Bassa": urgency = Food.Urgency.Bassa; break;
            case "Media": urgency = Food.Urgency.Media; break;
            case  "Alta": urgency = Food.Urgency.Alta;  break;
        }

        Food food = new Food(name, quantity, urgency);
        ((ArrayList<Food>) request.getServletContext().getAttribute("Foods")).add(food);

        response.sendRedirect("thanks.jsp");

    }

}
