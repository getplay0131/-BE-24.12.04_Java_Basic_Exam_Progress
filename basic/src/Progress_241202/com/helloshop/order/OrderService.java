package Progress_241202.com.helloshop.order;

import Progress_241202.com.helloshop.product.*;
import Progress_241202.com.helloshop.user.*;
//import Progress_241202.com.helloshop.product.Product;
//import Progress_241202.com.helloshop.user.User;

public class OrderService {
    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}