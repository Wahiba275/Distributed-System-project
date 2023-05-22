package org.sid.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sid.entities.Proprietaire;
import org.sid.entities.Vehicule;


import java.util.Date;
import java.util.List;

@WebService(serviceName="ImmatriculationWS")
public class ImmatriculationService {
    @WebMethod(operationName="AfficheProprietaire")
    public Proprietaire getProprietaire(@WebParam(name="idp")  Long idp){
        return new Proprietaire(idp,"wahiba","13-01-2001","ouahibabouzyan@gmail.com");
    }
    @WebMethod
    public List<Proprietaire> listProprietaire(){
        return List.of(new Proprietaire(Long.parseLong("1"),"nabila","15-04-2004","na.bila@gmail.com"),
                new Proprietaire(Long.parseLong("2"),"jawad","27-09-1996","ja.wad@gmail.com"),
                new Proprietaire(Long.parseLong("3"),"anwar","10-10-2005","an.war@gmail.com")

        );
    }
    @WebMethod(operationName="AfficheVehicule")
    public Vehicule getVehicule(@WebParam(name="vehicule") Vehicule vehicule){
        return vehicule;
    }
    @WebMethod
    public List<Vehicule> listVehicule(){
        return List.of(
                new Vehicule("1" , "AB-123" ,"DACIA" , 6 , "Duster")

        );
    }
}