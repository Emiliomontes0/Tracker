package com.Tracker.Tracker.Service;

import com.Tracker.Tracker.Entity.Product;
import com.Tracker.Tracker.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();

    }
    @Override
    public void deleteProduct(Product product){
        productRepository.delete(product);
    }
    @Override
    public Product updateProduct(Product product){
        return productRepository.save(product);
    }
}
