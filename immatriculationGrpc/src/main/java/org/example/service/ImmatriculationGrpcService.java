package org.example.service;

import io.grpc.stub.StreamObserver;
import org.example.stubs.Immatriculation;
import org.example.stubs.ImmatriculationServiceGrpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmatriculationGrpcService extends ImmatriculationServiceGrpc.ImmatriculationServiceImplBase {
    private Map<Integer, Immatriculation.Proprietaire> proprietairesMap = new HashMap<>();
    private Map<Integer, Immatriculation.Vehicule> vehiculesMap = new HashMap<>();


    @Override
    public void ajouterProprietaire(Immatriculation.Proprietaire request, StreamObserver<Immatriculation.Proprietaire> responseObserver) {
        int proprietaireId = request.getId();
        proprietairesMap.put(proprietaireId, request);
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }

    @Override
    public void obtenirProprietaire(Immatriculation.ObtenirProprietaireRequest request, StreamObserver<Immatriculation.Proprietaire> responseObserver) {
        int proprietaireId = request.getId();
        Immatriculation.Proprietaire proprietaire = proprietairesMap.get(proprietaireId);
        responseObserver.onNext(proprietaire);
        responseObserver.onCompleted();
    }

    @Override
    public void modifierProprietaire(Immatriculation.ModifierProprietaireRequest request, StreamObserver<Immatriculation.Proprietaire> responseObserver) {
        int proprietaireId = request.getId();
        Immatriculation.Proprietaire updatedProprietaire = request.getProprietaire();
        proprietairesMap.put(proprietaireId, updatedProprietaire);
        responseObserver.onNext(updatedProprietaire);
        responseObserver.onCompleted();
    }

    @Override
    public void supprimerProprietaire(Immatriculation.SupprimerProprietaireRequest request,
                                      StreamObserver<Immatriculation.SupprimerProprietaireResponse> responseObserver) {
        int proprietaireId = request.getId();
        Immatriculation.Proprietaire proprietaire = proprietairesMap.remove(proprietaireId);
        boolean success = (proprietaire != null);
        Immatriculation.SupprimerProprietaireResponse response = Immatriculation.SupprimerProprietaireResponse.newBuilder()
                .setSuccess(success)
                .setMessage(success ? "Proprietaire deleted successfully" : "Proprietaire not found")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void ajouterVehicule(Immatriculation.Vehicule request,
                                StreamObserver<Immatriculation.Vehicule> responseObserver) {
        int vehiculeId = request.getId();
        vehiculesMap.put(vehiculeId, request);
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }
    @Override
    public void obtenirVehicule(Immatriculation.ObtenirVehiculeRequest request,
                                StreamObserver<Immatriculation.Vehicule> responseObserver) {
        int vehiculeId = request.getId();
        Immatriculation.Vehicule vehicule = vehiculesMap.get(vehiculeId);
        responseObserver.onNext(vehicule);
        responseObserver.onCompleted();
    }

    @Override
    public void modifierVehicule(Immatriculation.ModifierVehiculeRequest request,
                                 StreamObserver<Immatriculation.Vehicule> responseObserver) {
        int vehiculeId = request.getId();
        Immatriculation.Vehicule updatedVehicule = request.getVehicule();
        vehiculesMap.put(vehiculeId, updatedVehicule);
        responseObserver.onNext(updatedVehicule);
        responseObserver.onCompleted();
    }

    @Override
    public void supprimerVehicule(Immatriculation.SupprimerVehiculeRequest request,
                                  StreamObserver<Immatriculation.SupprimerVehiculeResponse> responseObserver) {
        // Implementation logic for deleting a vehicule
    }
}
