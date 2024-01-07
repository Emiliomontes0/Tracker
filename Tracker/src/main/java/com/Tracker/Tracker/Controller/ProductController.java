package com.Tracker.Tracker.Controller;
import com.Tracker.Tracker.Entity.Product;
import com.Tracker.Tracker.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public String add(@RequestBody Product product){
        productService.saveProduct(product);
        return "Done";
    }
    @GetMapping("/product")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

}
