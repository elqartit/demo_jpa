package ci.jpa.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ci.jpa.demo.domain.Product;
import ci.jpa.demo.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, First Rest API";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        System.out.println("Produit trouvé : " + products);
        return products;
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable(name = "id") long id) {
        Product product = productRepository.findById(id).orElse(null);
        System.out.println("Produit trouvé : " + product);
        return product;
    }

}
