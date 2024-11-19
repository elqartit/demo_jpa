package ci.jpa.demo.rest;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class EnqueteController {
    private static final Logger log = LoggerFactory.getLogger(EnqueteController.class);

    @Autowired
    private EnqueteRepository enqueteRepository;

    @GetMapping("/enquetes")
    public List<Enquete> getEnquetes() {
        List<Enquete> enquetes = enqueteRepository.findAll();
        log.info("Enquêtes trouvées: " + enquetes);

        return enquetes;
    }
    

    @Autowired
    private TypeEnqueteRepository typeEnqueteRepository;

    @PostMapping("/enquete")
    public Enquete editEnquete(@RequestBody Enquete enquete) {
        TypeEnquete typeEnquete = enquete.getTypeEnquete();
        typeEnqueteRepository.save(typeEnquete);
        Enquete foundEnquete = enqueteRepository.save(enquete);
        log.info("Enquete ajouté: " + foundEnquete);

        return foundEnquete;
    }

    @GetMapping("/enquete/{id}")
    public Enquete getEnquete(@PathVariable(name = "id") int id) {
        Enquete foundEnquete = enqueteRepository.findById(id).orElse(null);

        log.info("Enquête trouvé: " + foundEnquete);
        // if(foundEnquete == null) {
        //     throw new HttpClientErrorException(HttpStatusCode.valueOf(404));
        // }
        return foundEnquete;
    }

    @DeleteMapping("/enquete/{id}")
    public String deleteEnquete(@PathVariable(name = "id") int id) {
        log.info("Enquête à supprimé: " + id);
        enqueteRepository.deleteById(id);

        return "Enquête supprimé avec succès";
    }



}
