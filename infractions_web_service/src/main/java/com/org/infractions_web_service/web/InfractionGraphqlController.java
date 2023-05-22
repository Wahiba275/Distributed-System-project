package com.org.infractions_web_service.web;

import com.org.infractions_web_service.entities.Infraction;
import com.org.infractions_web_service.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;


@Controller
public class InfractionGraphqlController {
    @Autowired
    private InfractionRepository infractionRepository ;
    @QueryMapping
    public List<Infraction> infractionList(){
        return infractionRepository.findAll();
    }
    @QueryMapping
    public Infraction infractionByID(String idF){
        return infractionRepository.findById(idF).orElseThrow();}

    @MutationMapping
    public void deleteInfraction(String idF){
        infractionRepository.deleteById(idF);
    }





    }

