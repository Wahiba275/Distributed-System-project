package ma.enset.immatriculation_service.web;




import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class graphqlController {
    @Autowired
    private VehiculeRepository vehiculeRepository ;
    @Autowired
    private ProprietaireRepository proprietaireRepository;
    @QueryMapping
    public List<Vehicule> vehicules(){
        return  vehiculeRepository.findAll();
    }
    @QueryMapping
    public Vehicule vehiculeById(@Argument Integer id){
        return  vehiculeRepository.findById(id)
            .orElseThrow();
    }
    @QueryMapping
    public List<Proprietaire> proprietaires(){
        return  proprietaireRepository.findAll();
    }
    @MutationMapping
    public void deleteVehicule(@Argument  Integer id){
        vehiculeRepository.deleteById(id);
    }
}
