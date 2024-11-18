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
		/*Category category1Category = new Category();
		category1Category.setName("Fourniture");
		categoryRepository.save(category1Category);


		Keyword keyword = new Keyword();
		keyword.setName("keyword 1");
		Keyword keyword2 = new Keyword();
		keyword2.setName("keyword 2");


		Product product1Product = new Product();
		product1Product.setName("yagourt");
		product1Product.setPrice(2500);
		product1Product.setCategory(category1Category);
		product1Product.setKeywords(List.of(keyword, keyword2));
		productRepository.save(product1Product);
		System.out.println("Message run");


		

		productRepository.deleteById(1L);
		System.out.println("Produit supprimé");


		List<Product> products = productRepository.findByPriceGreaterThan(2100);
		for (Product p : products) {
			System.out.println("Détail du produit :" + p);
		}

		Product foundProduct = productRepository.findById(1L).orElse(null);
		System.out.println("Produit trouvé :" + foundProduct);

		int page = 2;
		int size = 3;
		Pageable pageable = PageRequest.of(page, size, Sort.by("price").descending());

		Page<Product> pagedResult = productRepository.findAll(pageable);

		System.out.println("Produit triés par prix(page" + page + "avec taille" + size + "):");
		pagedResult.getContent().forEach(System.out::println);
		System.out.println("Nombre total de pages : " + pagedResult.getTotalPages());
		System.out.println("Nombre total d'éléments : " + pagedResult.getTotalElements());
	   System.out.println("Taille de la page :" + pagedResult.getSize());
	   */

	}

}
