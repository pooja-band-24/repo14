
package com.example.app.service;

import com.example.app.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    private final Map<Integer, Product> products = new HashMap<>();

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    public Product getProduct(int id) {
        return products.get(id);
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void updateProduct(int id, Product product) {
        products.put(id, product);
    }

    public void deleteProduct(int id) {
        products.remove(id);
    }
}
