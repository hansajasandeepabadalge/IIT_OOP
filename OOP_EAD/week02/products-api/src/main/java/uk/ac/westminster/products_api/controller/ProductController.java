package uk.ac.westminster.products_api.controller;

import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.dto.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}") // Maps Get /products/{id}
    public Product getProduct(@PathVariable Integer id) {
        return new Product();
    }

    @PostMapping("") // Maps Post /products
    public Product addProduct(@RequestBody Product product) {
        return new Product();
    }

    @PutMapping("/{id}") // Maps Put /products/{id}
    public Product updateProduct(@RequestBody Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}") // Maps Delete /products/{id}
    public void deleteProduct(@RequestBody Product product) {

    }
}
