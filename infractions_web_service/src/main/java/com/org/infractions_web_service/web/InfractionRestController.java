package com.org.infractions_web_service.web;

import com.org.infractions_web_service.entities.Infraction;
import com.org.infractions_web_service.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class InfractionRestController {
    @Autowired
    private InfractionRepository infractionRepository ;
    @GetMapping("/infractions")
    public List<Infraction> getAllInfractions() {
        return infractionRepository.findAll();

    }
    @GetMapping("/infractions/{id}")
    public Infraction getProprietaire(@PathVariable String id){
        return infractionRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account Not Found :)" , id)));
    }
    @PostMapping("/infractions")
    public Infraction save(@RequestBody Infraction infraction   ){
        return  infractionRepository.save(infraction);
    }
    @PutMapping("/infractions/{id}")
    public Infraction update(@PathVariable  String id ,@RequestBody Infraction infraction ){
        Infraction infraction1   = infractionRepository.findById(id)
                .orElseThrow();
        if(infraction.getDate() != null) infraction1.setDate(infraction.getDate());
        if(infraction.getMontantInfraction() != null) infraction1.setMontantInfraction(infraction.getMontantInfraction());
        if(infraction.getRadarID() != null) infraction1.setRadarID(infraction.getRadarID());
        if(infraction.getMatVehicule() != null) infraction1.setMatVehicule(infraction.getMatVehicule());
        if(infraction.getVitesse_max_radar() != null) infraction1.setVitesse_max_radar(infraction.getVitesse_max_radar());
        return infractionRepository.save(infraction1);
    }
    @DeleteMapping("/infractions/{id}")
    public void delete(@PathVariable String id){
        infractionRepository.deleteById(id);
    }

}
