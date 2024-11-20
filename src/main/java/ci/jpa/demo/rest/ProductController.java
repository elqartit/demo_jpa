package ci.jpa.demo.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "*")
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(EnqueteController.class);

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/products")
    public List<Product> getAll() {
        List<Product> products = productRepository.findAll();
        log.info("Produit trouvé : " + products);
        return products;
    }

    @GetMapping("/product/{id}")
    public Product getById(@PathVariable(name = "id") long id) {
        Product product = productRepository.findById(id).orElse(null);
        log.info("Produit trouvé : " + product);
        return product;
    }

    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        Category category = product.getCategory();
        categoryRepository.save(category);
        Product foundProduct = productRepository.save(product);
        log.info("Enregistrer un produit");
        return foundProduct;
    }

    @DeleteMapping("/product/{id}")
    public String delete(@PathVariable(name = "id") long id) {
        log.info("Produit à supprimer: " + id);
        productRepository.deleteById(id);
        return "Produit supprimé avec succès";
    }

}
