package Progress_241202.com.helloshop.order;

import Progress_241202.com.helloshop.product.Product;
import Progress_241202.com.helloshop.user.User;

public class Order {
User user;
Product product;

public Order(User user, Product product){
    this.user = user;
    this.product = product;
}
}