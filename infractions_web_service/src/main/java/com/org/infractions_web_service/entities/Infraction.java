package com.org.infractions_web_service.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Infraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idF ;
    private Date date;
    private Double montantInfraction ;
    private String radarID;
    private String matVehicule ;
    private String vehiculeID ;
    private Double vitesse_max_radar ;
    private Double vitesse_vehicule ;




}
