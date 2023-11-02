package com.Tracker.Tracker.Service;

import com.Tracker.Tracker.Entity.Product;
import com.Tracker.Tracker.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
