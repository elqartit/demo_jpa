package ci.jpa.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import ci.jpa.demo.domain.Category;
import ci.jpa.demo.domain.Keyword;
import ci.jpa.demo.domain.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;

import ci.jpa.demo.repository.CategoryRepository;
import ci.jpa.demo.repository.ProductRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// CommandLineRunner pour tester les opérations de Spring Data JPA au démarrage
// de l'application
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Product p1 = new Product("Attické", 500);
        // Product p2 = new Product("Alloco", 1500);
        // Product p3 = new Product("Fritte", 2000);
        // Product p4 = new Product("Tchep", 3000);
        // productRepository.save(p1);

        // List<Product> list = new ArrayList<>(Arrays.asList(p2, p3, p4));
        // productRepository.saveAll(list);

        // List<Product> prs = productRepository.findAll();
        // prs.forEach(p -> {
        // System.out.println("Produit trouvé : " + p.getName());
        // });

        // int page = 1;
        // int size = 3;
        // Pageable pageable = PageRequest.of(page, size,
        // Sort.by("price").descending());
        // Page<Product> pageResult = productRepository.findAll(pageable);
        // System.out.println("Produits triés par prix (page" + page + " avec taille " +
        // size + "):");
        // pageResult.getContent().forEach(System.out::println);
        // System.out.println("Nombre total de pages : " + pageResult.getTotalPages());
        // System.out.println("Nombre total d'éléments : " +
        // pageResult.getTotalElements());
        // System.out.println("Taille de la page : " + pageResult.getSize());

        // Category c1 = new Category("Fourniture 3");
        // categoryRepository.save(c1);

        // Keyword kw1 = new Keyword("keyword 1");
        // Keyword kw2 = new Keyword("keyword 2");

        // Product p1 = new Product("Clavier 3", 1300, c1, List.of(kw1, kw2));
        // productRepository.save(p1);

    }
}
