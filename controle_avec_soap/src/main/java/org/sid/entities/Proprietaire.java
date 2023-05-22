package org.sid.entities;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "proprietaire")
@XmlAccessorType(XmlAccessType.FIELD)

public class Proprietaire {
    private Long idp ;
    private String nom ;
    private String date_Naissance ;
    private String email ;
    @XmlElementWrapper(name = "vehicules")
    @XmlElement(name = "vehicule")
    private List<Vehicule> listeVehicules;

    public Proprietaire(Long id ,String nom, String date_Naissance, String email ) {
        this.idp=id;
        this.nom = nom;
        this.date_Naissance = date_Naissance;
        this.email = email;
    }
public Proprietaire(){}



    public Long getIdp() {
        return idp;
    }

    public void setIdp(Long idp) {
        this.idp = idp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate_Naissance() {
        return date_Naissance;
    }

    public void setDate_Naissance(String date_Naissance) {
        this.date_Naissance = date_Naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public List<Vehicule> getVehicules() {
        return listeVehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.listeVehicules = vehicules;
    }
}
