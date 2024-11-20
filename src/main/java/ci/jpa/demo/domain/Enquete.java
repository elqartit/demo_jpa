package ci.jpa.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Enquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;

    @ManyToOne
    private TypeEnquete typeEnquete;

    public Enquete() {
    }

    public Enquete(Long id, String titre, String description, TypeEnquete typeEnquete) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.typeEnquete = typeEnquete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeEnquete getTypeEnquete() {
        return typeEnquete;
    }

    public void setTypeEnquete(TypeEnquete typeEnquete) {
        this.typeEnquete = typeEnquete;
    }

    public void afficher() {
        System.out.println("Enquete -> (" + this.id + ", " + this.titre + ", " + this.description + ")");
        this.typeEnquete.afficher();
    }

    @Override
    public String toString() {
        return "Enquete [id=" + id + ", titre=" + titre + ", description=" + description + ", typeEnquete="
                + typeEnquete + "]";
    }

}
