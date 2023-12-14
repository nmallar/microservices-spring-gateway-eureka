package com.texellent.ProductService.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products") //http://localhost:8080/products
public class ProductsController {

    @Autowired
    private Environment env;

    @PostMapping
    public String createProduct(){
        return "Service 1: HTTP POST is handled";
    }
    @GetMapping
    public String getProduct(){
        return "Service 1: HTTP GET  handled "+env.getProperty("local.server.port");
    }

    @PutMapping
    public String updateProduct(){
        return "Service 1: HTTP PUT handled";
    }

    @DeleteMapping
    public String deleteProduct(){
        return "Service 1: HTTP DELETE handled";
    }
}

