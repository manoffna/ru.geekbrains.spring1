import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

    @WebServlet(name = "MyServlet", urlPatterns = "/my_servlet")
    public class MyServlet extends HttpServlet {

    private transient ServletConfig config;
    private static Logger logger = LoggerFactory.getLogger(MyServlet.class);

    List<Product> productList = new ArrayList<>();

        Product s1 = new Product(1, "Apple", 10);
        Product s2 = new Product(2, "Pineapple", 40);
        Product s3 = new Product(3, "Chocolate", 50);
        Product s4 = new Product(4, "Milk", 85);
        Product s5 = new Product(5, "Eggs", 120);
        Product s6 = new Product(6, "Cake", 180);
        Product s7 = new Product(7, "Cheese", 250);
        Product s8 = new Product(8, "Tomato", 75);
        Product s9 = new Product(9, "Cucumber", 65);
        Product s10 = new Product(10, "Potato", 30);


   {
        productList.add(s1);
        productList.add(s2);
        productList.add(s3);
        productList.add(s4);
        productList.add(s5);
        productList.add(s6);
        productList.add(s7);
        productList.add(s8);
        productList.add(s9);
        productList.add(s10);
        
        for (Product s : productList) {
            System.out.println(s.getID() + " " + s.getProduct() + " " + s.getPrice());
        }
    }

        private class Product {
              int a;
              String b;
              int c;

              Product (int a, String b, int c) {
                  this.a = a;
                  this.b = b;
                  this.c = c;}

                  public int getID() {
                      return a;
                  };

                  public String getProduct() {
                      return b;
                  };

                  public int getPrice() {
                      return c;
                  };

              }


        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //productList.add(s1);
        //productList.add(s2);
        //productList.add(s3);
        //productList.add(s4);
        //productList.add(s5);
        //productList.add(s6);
        //productList.add(s7);
        //productList.add(s8);
        //productList.add(s9);
        //productList.add(s10);

            //resp.setContentType("text/html");
            //PrintWriter printWriter = resp.getWriter();
            for (Product s : productList) {
            //printWriter.println(s);
            resp.getWriter().println(s.getID() + " " + s.getProduct() + " " + s.getPrice());}
            //printWriter.close();

        };

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            super.doPost(req, resp);
        }
}


