package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepositoy;
    public void save(Product product){
        productRepositoy.save(product);
    }
    public List<Product> findAll(){
        return productRepositoy.findAll();
    }
}
