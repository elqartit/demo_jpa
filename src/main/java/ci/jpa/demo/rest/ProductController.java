package ci.jpa.demo.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ci.jpa.demo.domain.Category;
import ci.jpa.demo.domain.Product;
import ci.jpa.demo.repository.CategoryRepository;
import ci.jpa.demo.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        System.out.println("Produit trouvé :" + products);
        return products;
    }

    @GetMapping("/product/{id}")
    public Product geProduct(@PathVariable(name = "id") long id) {
        Product foundProduct = productRepository.findById(id).orElse(null);
        System.out.println("Produit trouvé:" + foundProduct);
        return foundProduct;
    }

    
    @PostMapping("/product")
    public Product ediProduct (@RequestBody Product product) {
        Category category = product.getCategory();
        categoryRepository.save(category);
        Product founProduct = productRepository.save(product);
        System.out.println("produit ajouté:" + founProduct);
        return founProduct;
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable(name = "id") long id) {
        System.out.println("Produit à supprimer: " + id);
        productRepository.deleteById(id);
        return "Produit à supprimer avec succes";
    }
}
