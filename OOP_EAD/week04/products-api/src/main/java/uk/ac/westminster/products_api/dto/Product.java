package uk.ac.westminster.products_api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

// Automatically identifies the correct subclass based on the JSON properties.
// For example, Jackson can distinguish a DigitalProduct from a PhysicalProduct
// by examining their unique fields without requiring a "type" property.
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)

// Defines the subclasses that Jackson can recognize when converting JSON
// into Java objects.
@JsonSubTypes({
        @JsonSubTypes.Type(DigitalProduct.class),
        @JsonSubTypes.Type(PhysicalProduct.class)
})
public class Product {
    private Long id;
    private String name;
    protected Double price;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        this.price = price;
    }
}
