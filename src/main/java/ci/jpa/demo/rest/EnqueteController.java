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

import ci.jpa.demo.domain.Enquete;
import ci.jpa.demo.domain.TypeEnquete;
import ci.jpa.demo.repository.EnqueteRepository;
import ci.jpa.demo.repository.TypeEnqueteRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EnqueteController {

    private static final Logger log = LoggerFactory.getLogger(EnqueteController.class);

    @Autowired
    private EnqueteRepository enqueteRepository;

    @Autowired
    private TypeEnqueteRepository typeEnqueteRepository;

    @GetMapping("/enquetes")
    public List<Enquete> getAll() {
        List<Enquete> enquetes = enqueteRepository.findAll();
        log.info("Liste des enquêtes");
        return enquetes;
    }

    @GetMapping("/enquete/{id}")
    public Enquete getById(@PathVariable(name = "id") long id) {
        Enquete enquete = enqueteRepository.findById(id).orElse(null);
        log.info("Afficher enquête par id");
        return enquete;
    }

    @PostMapping("/enquete")
    public Enquete save(@RequestBody Enquete enquete) {
        TypeEnquete typeEnquete = enquete.getTypeEnquete();
        typeEnqueteRepository.save(typeEnquete);
        log.info("Enregistrer une enquête");
        Enquete enquete_ = enqueteRepository.save(enquete);
        return enquete_;
    }

    @DeleteMapping("/enquete/{id}")
    public String delete(@PathVariable(name = "id") long id) {
        log.info("Enquete à supprimer: " + id);
        enqueteRepository.deleteById(id);
        return "Enquête supprimée avec succès";
    }

}
