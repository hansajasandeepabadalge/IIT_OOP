package uk.ac.westminster.products_api.service;
import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.dto.DigitalProduct;
import uk.ac.westminster.products_api.dto.PhysicalProduct;
import uk.ac.westminster.products_api.dto.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(); // Created a List called product

    //nextId++ — use the current value, then increment.
    //++nextId — increment first, then use the new value.
    private Long nextId = 1L;

    public ProductService() { // ProductService Constructor
        System.out.println("ProductService constructor executed");
        products.add(new DigitalProduct(nextId++, "E-book",
                9.99, "/dl/1", 4.2));

        products.add(new PhysicalProduct(nextId++,
                "Monitor", 249.99, 5.4, "60x40"));
    }

    public List<Product> getProducts() {
        System.out.println("getProducts() called");
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    public Product addProduct(Product product) {
        product.setId(nextId);
        nextId += 1L;
        products.add(product);
        return product;
    }

    public String deleteProduct(Long id) {
        boolean isDeleted = products.removeIf(p -> p.getId().equals(id));
        if (isDeleted) {
            return "Deleted successfully";
        } else {
            return "ID not found";
        }
    }

    public List<Product> findProductsByName(String name) {
        return products.stream()
                .filter(product -> product.getName().toLowerCase()
                        .contains(name.toLowerCase()))
                .toList();
    }
}
