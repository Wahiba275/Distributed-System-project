package ma.enset.immatriculation_service.web;



import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/web")
public class VehiculeRestCotroller {
    @Autowired
    private VehiculeRepository vehiculeRepository  ;
    @GetMapping("/Vehicules")
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }
    @GetMapping("/Vehicules/{id}")
    public Vehicule getVehicule(@PathVariable Integer id){
        return vehiculeRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account Not Found :)" , id)));
    }
    // - Check if vehicle exists
    @GetMapping("/vehicules/exist/{id}")
    public boolean vehicleExists(@PathVariable("id") Integer id){
        return vehiculeRepository.existsById(id);
    }

}
