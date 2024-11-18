package ci.jpa.demo.domain;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private double price;
     @ManyToOne
     private Category category;
     
     @OneToMany(cascade = CascadeType.ALL)
     private List<Keyword> keywords;
     
     //generer gettres setters
     


     // generer les getters et setters
        
    public Product( String name, double price) {
        this.name = name;
        this.price = price;
    }
     
    
    public Product() {
    }


    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    @Override
    public String toString() {
        return "Product [Id=" + Id + ", name=" + name + ", price=" + price + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public void setId(Long id) {
        Id = id;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }


    public List<Keyword> getKeywords() {
        return keywords;
    }


    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    

}
