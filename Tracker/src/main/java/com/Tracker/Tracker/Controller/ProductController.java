package com.Tracker.Tracker.Controller;

import com.Tracker.Tracker.Entity.Product;
import com.Tracker.Tracker.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "New Product is added";
    }
}
