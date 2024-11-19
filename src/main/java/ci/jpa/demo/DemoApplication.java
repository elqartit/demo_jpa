package ci.jpa.demo;
import ci.jpa.demo.domain.Product;
import ci.jpa.demo.domain.Category;
import ci.jpa.demo.domain.Keyword;
import ci.jpa.demo.repository.CategoryRepository;
import ci.jpa.demo.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


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

		//1. Créer un produit
		// Product product1 = new Product(null, null, 0);
		// product1.setName("Laptop4");
		// product1.setPrice(1650);
		// productRepository.save(product1); 

		//2. Lire tous les produits
		// System.out.println("Liste de tous les produits");

		// List<Product> products = productRepository.findByPriceGreaterThan(1901);
		// for (Product p : products) {
		// 	System.out.println("Détail du produit: " + p);
		// }

		/* productRepository.findAll().forEach(p->{
			System.out.println("Nom du produit: " + p);
		}); */
		
		//3. Trouver un produit par ID
		/*Product foundProduct = productRepository.findById(200L).orElse(null);
		System.out.println("Produit trouvé: " + foundProduct); */

		//4. Supprimer un produit
		/*productRepository.deleteById(1L);
		System.out.println("Produit supprimé");*/

		//Pagination et tri par prix décroissant (du plus cher au moins cher)
		/*int page = 1;
		int size = 3;
		Pageable pageable = PageRequest.of(page, size, Sort.by("price").descending());

		//Récupérer les produits paginés et triés
		Page<Product> pagedResult = productRepository.findAll(pageable);

		System.out.println("Produits triés par prix (page " + page + " avec taille " + size + "):");
		pagedResult.getContent().forEach(System.out::println);

		// Afficher quelques informations sur la pagination
		System.out.println("Nombre total de pages : " + pagedResult.getTotalPages());
		System.out.println("Nombre total d'éléments : " + pagedResult.getTotalElements());
		System.out.println("Taille de la page : " + pagedResult.getSize()); */

		//0. Créer une catégorie
		// Category category1 = new Category();
		// category1.setName("Furniture");
		// categoryRepository.save(category1);

		// Keyword keyword = new Keyword(null, null);
		// keyword.setName("Keyword 1");
		// Keyword keyword2 = new Keyword(null, null);
		// keyword2.setName("keyword 2");

		// //1. Créer un produit
		// Product product1 = new Product();
		// product1.setName("Keyboard");
		// product1.setPrice(1500);
		// product1.setCategory(category1);
		// product1.setKeywords(List.of(keyword, keyword2));
		// productRepository.save(product1);

	}
}
