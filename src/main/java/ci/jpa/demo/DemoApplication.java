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
		System.out.println("Message run:");

		// //0.Créer une catégorie
		// Category category1 = new Category();
		// category1.setName("Furniture");
		// categoryRepository.save(category1);

		// Keyword keyword = new Keyword();
		// keyword.setName("keyword 1");
		// Keyword keyword2 = new Keyword();
		// keyword2.setName("keyword 2");

		// //1.Créer un produit
		// Product product1 = new Product();
		// product1.setName("Keyboard");	
		// product1.setPrice(1300);
		// product1.setCategory(category1);
		// product1.setKeywords(List.of(keyword, keyword2));
		// productRepository.save(product1);


		// 1. Créer un produit
		// Product product1 = new Product(null, null, 0);
		// product1.setName("Laptop3");
		// product1.setPrice(1000);
		// productRepository.save(product1);

//2. Lire tous les produits
/*List<Product> products = productRepository.findAll();
		for (Product p : products) {
			System.out.println("Détail du produit :" + p);
		}*/
/*productRepository.findExpensiveProducts(900).forEach(p -> {
	System.out.println(" findExpensiveProducts Nom du produit :" + p);
});

//System.out.println("Liste de tous les produits :");
//

//3. Trouver un produit par ID
Product founProduct = productRepository.findById(1L).orElse(null);
System.out.println("Produit trouvé : " + founProduct);

//4. Supprimer un produit
// productRepository.deleteById(13L);
// System.out.println(" Produit supprimé");

//Pagination et tri par prix décroissant (du plus cher au mons cher)
int page = 4;
int size = 3;
Pageable pageable = PageRequest.of(page, size, Sort.by("price").descending());

//Récupérer les produits paginés et triés
Page<Product> pageResult = productRepository.findAll(pageable);

System.out.println("------------------------------------------------------");
System.out.println("Produits triés par prix (page) " + page + "avec taille " + size + "):");
pageResult.getContent().forEach(System.out::println);*/

	}
}
