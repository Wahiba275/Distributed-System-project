package ma.enset.immatriculation_service;

import ma.enset.immatriculation_service.entities.Proprietaire;
import ma.enset.immatriculation_service.entities.Vehicule;
import ma.enset.immatriculation_service.repositories.ProprietaireRepository;
import ma.enset.immatriculation_service.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ImmatriculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepository , VehiculeRepository vehiculeRepository){
        return args ->{
            // Create owners
            Stream.of("wahiba", "nabila", "jawad", "anwar").forEach(name -> {
                Proprietaire proprietaire  = Proprietaire.builder()
                        .nom(name)
                        .date_Naissance(new Date().toString())
                        .email(name + "@gmail.com")
                        .build();
                proprietaireRepository.save(proprietaire);
            });

            // Initialisation des véhicules
            List<String> marques = List.of("Toyota", "Honda", "Ford", "Chevrolet", "BMW");
            List<String> modeles = List.of("Corolla", "Civic", "Mustang", "Camaro", "X5");
            List<Double> vitesst = List.of(100.0 , 130.12 , 90.5 , 60.0);
            List<Integer> pF = List.of(5 , 6 , 7 , 8 , 9);
            Random random = new Random();
            proprietaireRepository.findAll().forEach(p -> {
                Stream.of("Clio", "Mercedes", "BMW").forEach(brand -> {
                    Vehicule vehicule = Vehicule.builder()
                            .num_matricule("AAA-" + Math.random() * 10000)
                            .marque(marques.get(random.nextInt(marques.size())))
                            .puissance_fescale(pF.get(random.nextInt(pF.size())))
                            .modele(modeles.get(random.nextInt(modeles.size())))
                            .proprietaire(p)
                            .vitesse(vitesst.get(random.nextInt(vitesst.size())))
                            .build();
                    vehiculeRepository.save(vehicule);

                });
            });
        };
    }
}
