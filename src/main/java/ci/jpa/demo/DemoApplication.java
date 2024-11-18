package ci.jpa.demo;

import java.nio.channels.Pipe.SourceChannel;
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
import jakarta.persistence.Entity;

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
		/**Product product1 = new Product(null, 0);
		product1.setName("laptop");
		product1.setPrice(1300);
	    productRepository.save(product1);
		System.out.println("Message run-------");
		List<Product>  products = productRepository.findByPriceGreaterThan(1200);
		for (Product p: products) {
			System.out.println("detail du produit:" + p);
		} 
	   
       Product foundProduct =productRepository.findById(1l).orElse(null);
	   System.out.println("produit trouvé:" + foundProduct);
	   // supprimer un produit
	   productRepository.deleteById(1l);
	   System.out.println("produit supprimé");
	   // pagination et tri
	   int page = 1;
	   int size = 3;
	   Pageable pageable = PageRequest.of(page, size, Sort.by("price").descending());
	   // recuperer les produits paginés et triés
	   Page<Product> pagedResult = productRepository.findAll(pageable);
	   System.out.println("produits tries par prix(page" + page + "avec taille" + size + "):");
	   pagedResult.getContent().forEach(System.out::println);
	   // afficher quelques info sur la pagination
	   System.out.println("nombre total de page:"+ pagedResult.getTotalPages());
       System.out.println("nombre total d'éléments:"+ pagedResult.getTotalElements());
	   System.out.println("taille de la page:"+ pagedResult.getSize());
	
	   // creer une catégory
	   Category category1 = new Category();
	   category1.setName("fourniture");
	   categoryRepository.save(category1);

	   // creer des keyword
		 Keyword keyword = new Keyword();
		 keyword.setName("keyword1");
		 Keyword keyword2  = new  Keyword();
		 keyword2.setName("keyword2");


	   // creer un produit
	   Product product1 = new Product();
	   product1.setName("keyboard");
	   product1.setPrice(1300);
	   product1.setCategory(category1);
	   product1.setKeywords(List.of(keyword,keyword2));
	   productRepository.save(product1);**/
         
		 


    



	}
		
	


}
