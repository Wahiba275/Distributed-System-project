package org.sid.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicule")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicule {
    private String id ;
    private String num_matricule ;
    private String marque ;
    private Integer puissance_fescale;
    private String modele ;
    private Proprietaire proprietaire;

    public Vehicule() {
    }

    public Vehicule(String id ,String num_matricule, String marque, Integer puissance_fescale, String modele ) {
        this.id=id ;
        this.num_matricule = num_matricule;
        this.marque = marque;
        this.puissance_fescale = puissance_fescale;
        this.modele = modele;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum_matricule() {
        return num_matricule;
    }

    public void setNum_matricule(String num_matricule) {
        this.num_matricule = num_matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Integer getPuissance_fescale() {
        return puissance_fescale;
    }

    public void setPuissance_fescale(Integer puissance_fescale) {
        this.puissance_fescale = puissance_fescale;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
