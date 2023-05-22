package ma.enset.immatriculation_service.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idp ;
    private String nom ;
    private String date_Naissance ;
    private String email ;
    @OneToMany(mappedBy = "proprietaire")
    private List<Vehicule> vehiculeList ;


}
