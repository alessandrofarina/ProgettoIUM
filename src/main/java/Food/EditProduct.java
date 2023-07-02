package Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "EditProduct", value = "/EditProduct")
public class EditProduct extends HttpServlet {

    @Override
    public void init() {}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("product");
        System.out.println(name);

        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Food.Urgency urgency = null;
        switch (request.getParameter("urgency")) {
            case "Bassa": urgency = Food.Urgency.Bassa; break;
            case "Media": urgency = Food.Urgency.Media; break;
            case  "Alta": urgency = Food.Urgency.Alta;  break;
        }

        ArrayList<Food> foods = (ArrayList<Food>) request.getServletContext().getAttribute("Foods");
        for(Food food: foods) {
            if(food.getName().equals(name)) {
                food.setQuantity(quantity);
                food.setUrgency(urgency);
            }
        }

        response.sendRedirect("thanks.jsp");

    }

}
