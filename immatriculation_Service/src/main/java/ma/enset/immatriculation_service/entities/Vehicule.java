package ma.enset.immatriculation_service.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Vehicule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String num_matricule ;
    private String marque ;
    private Integer puissance_fescale;
    private String modele ;
    private Double vitesse ;
    @ManyToOne
    private Proprietaire proprietaire ;

}
