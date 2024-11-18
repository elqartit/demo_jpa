package ci.jpa.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import ci.jpa.demo.domain.Category;
import ci.jpa.demo.domain.Keyword;
import ci.jpa.demo.domain.Product;
import ci.jpa.demo.repository.CategoryRepository;
import ci.jpa.demo.repository.ProductRepository;

@SpringBootApplication
//CommandLineRunner pour tester les opérations de Spring Data JPA au démarrage de l'application
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
		//Product product1 = new Product("Laptop", 1350);
		//productRepository.save(product1);	
		//System.out.println("Liste de tous les produits");
		//productRepository.findAll().forEach(System.out::println);
		int page = 1;
		int size = 3;
		Pageable pageable = PageRequest.of(page, size, Sort.by("price").descending());

		productRepository.findExpensiveProducts(1330).forEach(System.out::println);
		Page<Product> pagedResult= productRepository.findAll(pageable);
		System.out.println("..................................................................");
		System.out.println("Produit triés par prix (page" + page + "avec taille " + size +  ")");
		pagedResult.getContent().forEach(System.out::println);
		System.out.println("Nombre total de page: " + pagedResult.getTotalPages());
		System.out.println("Nombre total d'elements: " + pagedResult.getTotalElements());
		System.out.println("Taille de la page " + pagedResult.getSize());

		Product founProduct = productRepository.findById(1L).orElse(null);
		System.out.println("produit trouvé: " + founProduct);
		productRepository.deleteById(1L);
		//System.out.println("produit suprimé");
		Category category1 = new Category();
		category1.setName("Fourniture");
		categoryRepository.save(category1);

		/*Product product1 = new Product();
		product1.setName("keybord");
		product1.setPrice(1300);
		product1.setCategory(category1);
		productRepository.save(product1);
		System.out.println("...........................................................................");*/

		Keyword keyword = new Keyword();
		keyword.setName("keyword 1 ");
		Keyword keyword2 = new Keyword();
		keyword.setName("keyword 2");


		Product product1 = new Product();
		product1.setName("keyboard");
		product1.setPrice(1300);
		product1.setCategory(category1);
		product1.setKeybords(List.of(keyword, keyword2));
		productRepository.save(product1);
	}
	
}
