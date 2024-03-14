package org.example.model;

import org.example.model.dto.ProductDTO;
import org.example.repository.ProductRepository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Product {

    public Product(){}

    public Product(ProductDTO productDTO){
        this.description = productDTO.getDescription();
    }
    @Id
    private String _id;
    private String description;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
