package Main;

import Food.Food;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;

@WebListener
public class ContextListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

    public ContextListener() {}

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("Lenticchie In Lattina", 10, Food.Urgency.Media));
        foods.add(new Food("Tonno In Scatola", 28, Food.Urgency.Alta));
        foods.add(new Food("Pasta", 41, Food.Urgency.Alta));

        sce.getServletContext().setAttribute("Foods", foods);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {}

}
