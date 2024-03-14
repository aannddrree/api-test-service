package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Product;
import org.example.model.dto.ProductDTO;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService clientService;
    @PostMapping(Constant.API_CLIENT)
    public void insert(@RequestBody ProductDTO product){
        clientService.save(new Product(product));
    }
    @GetMapping(Constant.API_CLIENT)
    public List<Product> findAll(){
        return clientService.findAll();
    }
}