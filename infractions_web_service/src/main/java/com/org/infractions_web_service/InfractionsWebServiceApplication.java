package com.org.infractions_web_service;

import com.org.infractions_web_service.entities.Infraction;
import com.org.infractions_web_service.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class InfractionsWebServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfractionsWebServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(InfractionRepository infractionRepository){
        return args -> {
            for (int i = 1; i <= 10; i++) {
                Infraction infraction = Infraction.builder()
                        .idF("IFRACTION00"+1)
                        .date(new Date())
                        .montantInfraction(100.0 + i * 10)
                        .matVehicule("AAA" + i)
                        .vitesse_max_radar(80.0 + i * 5)
                        .radarID("RADAR00" + i)
                        .vehiculeID("V00"+i)
                        .build();
                infractionRepository.save(infraction);
            }
        };
    }
}
