package ma.enset.immatriculation_service.web;


import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web")
public class PropRestController {
    @Autowired
    private ProprietaireRepository proprietaireRepository  ;
    @GetMapping("/proprietaires")
        public List<Proprietaire> proprietaires(){
        return proprietaireRepository.findAll();
    }
    @GetMapping("/proprietaires/{id}")
    public Proprietaire getProprietaire(@PathVariable Integer id){
        return proprietaireRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account Not Found :)" , id)));
    }
    @PostMapping("/proprietaires")
    public Proprietaire save(@RequestBody Proprietaire proprietaire  ){
        return  proprietaireRepository.save(proprietaire);
    }
    @PutMapping("/proprietaires/{id}")
    public Proprietaire update(@PathVariable  Integer id ,@RequestBody Proprietaire proprietaire  ){
        Proprietaire p  = proprietaireRepository.findById(id)
                .orElseThrow();
        if(proprietaire.getNom() != null ) p.setNom(proprietaire.getNom());
        if(proprietaire.getEmail() != null) p.setEmail(proprietaire.getEmail());
        if(proprietaire.getDate_Naissance() != null) p.setDate_Naissance(proprietaire.getDate_Naissance());
        return proprietaireRepository.save(p);
    }
    @DeleteMapping("/proprietaires/{id}")
    public void delete(@PathVariable Integer id){
        proprietaireRepository.deleteById(id);
    }
    // - Check if owner exists
    @GetMapping("/proprietaires/exist/{id}")
    public boolean ownerExists(@PathVariable("id") Integer id){
        return proprietaireRepository.existsById(id);
    }
}
