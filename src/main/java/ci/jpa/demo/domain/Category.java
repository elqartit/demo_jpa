package ci.jpa.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id ;
private String name;
// generer les getters et setters
public Long getId() {
    return Id;
}
public void setId(Long id) {
    Id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
// generer la methode tostring
@Override
public String toString() {
    return "Category [Id=" + Id + ", name=" + name + "]";
}

}
