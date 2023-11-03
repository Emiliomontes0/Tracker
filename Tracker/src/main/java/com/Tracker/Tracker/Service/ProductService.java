package com.Tracker.Tracker.Service;

import com.Tracker.Tracker.Entity.Product;

import java.util.List;

// this is where to create crud methods
public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    void deleteProduct(Product product);
    Product updateProduct(Product product);
}
