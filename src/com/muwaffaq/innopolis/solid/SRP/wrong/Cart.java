package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

import java.util.List;

public class Cart {
    List<Product> products;
    double totals;
    String token;
}

public class AddToCart {
    void addToCart(Product product) {
        products.add(product);
    }
}

public class RemoveFromCart {
    void removeFromCart(Product product) {
        products.remove(product);
    }
}

public class ApplyDiscount {
    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }
}




