package org.example.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: immatriculation.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.Proprietaire,
      org.example.stubs.Immatriculation.Proprietaire> getAjouterProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AjouterProprietaire",
      requestType = org.example.stubs.Immatriculation.Proprietaire.class,
      responseType = org.example.stubs.Immatriculation.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.Proprietaire,
      org.example.stubs.Immatriculation.Proprietaire> getAjouterProprietaireMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.Proprietaire, org.example.stubs.Immatriculation.Proprietaire> getAjouterProprietaireMethod;
    if ((getAjouterProprietaireMethod = ImmatriculationServiceGrpc.getAjouterProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAjouterProprietaireMethod = ImmatriculationServiceGrpc.getAjouterProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getAjouterProprietaireMethod = getAjouterProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.Proprietaire, org.example.stubs.Immatriculation.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "AjouterProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Proprietaire.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("AjouterProprietaire"))
                  .build();
          }
        }
     }
     return getAjouterProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ObtenirProprietaireRequest,
      org.example.stubs.Immatriculation.Proprietaire> getObtenirProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtenirProprietaire",
      requestType = org.example.stubs.Immatriculation.ObtenirProprietaireRequest.class,
      responseType = org.example.stubs.Immatriculation.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ObtenirProprietaireRequest,
      org.example.stubs.Immatriculation.Proprietaire> getObtenirProprietaireMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ObtenirProprietaireRequest, org.example.stubs.Immatriculation.Proprietaire> getObtenirProprietaireMethod;
    if ((getObtenirProprietaireMethod = ImmatriculationServiceGrpc.getObtenirProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getObtenirProprietaireMethod = ImmatriculationServiceGrpc.getObtenirProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getObtenirProprietaireMethod = getObtenirProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.ObtenirProprietaireRequest, org.example.stubs.Immatriculation.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "ObtenirProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.ObtenirProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("ObtenirProprietaire"))
                  .build();
          }
        }
     }
     return getObtenirProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ModifierProprietaireRequest,
      org.example.stubs.Immatriculation.Proprietaire> getModifierProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifierProprietaire",
      requestType = org.example.stubs.Immatriculation.ModifierProprietaireRequest.class,
      responseType = org.example.stubs.Immatriculation.Proprietaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ModifierProprietaireRequest,
      org.example.stubs.Immatriculation.Proprietaire> getModifierProprietaireMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ModifierProprietaireRequest, org.example.stubs.Immatriculation.Proprietaire> getModifierProprietaireMethod;
    if ((getModifierProprietaireMethod = ImmatriculationServiceGrpc.getModifierProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getModifierProprietaireMethod = ImmatriculationServiceGrpc.getModifierProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getModifierProprietaireMethod = getModifierProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.ModifierProprietaireRequest, org.example.stubs.Immatriculation.Proprietaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "ModifierProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.ModifierProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Proprietaire.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("ModifierProprietaire"))
                  .build();
          }
        }
     }
     return getModifierProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.SupprimerProprietaireRequest,
      org.example.stubs.Immatriculation.SupprimerProprietaireResponse> getSupprimerProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupprimerProprietaire",
      requestType = org.example.stubs.Immatriculation.SupprimerProprietaireRequest.class,
      responseType = org.example.stubs.Immatriculation.SupprimerProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.SupprimerProprietaireRequest,
      org.example.stubs.Immatriculation.SupprimerProprietaireResponse> getSupprimerProprietaireMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.SupprimerProprietaireRequest, org.example.stubs.Immatriculation.SupprimerProprietaireResponse> getSupprimerProprietaireMethod;
    if ((getSupprimerProprietaireMethod = ImmatriculationServiceGrpc.getSupprimerProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getSupprimerProprietaireMethod = ImmatriculationServiceGrpc.getSupprimerProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getSupprimerProprietaireMethod = getSupprimerProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.SupprimerProprietaireRequest, org.example.stubs.Immatriculation.SupprimerProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "SupprimerProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.SupprimerProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.SupprimerProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("SupprimerProprietaire"))
                  .build();
          }
        }
     }
     return getSupprimerProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.Vehicule,
      org.example.stubs.Immatriculation.Vehicule> getAjouterVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AjouterVehicule",
      requestType = org.example.stubs.Immatriculation.Vehicule.class,
      responseType = org.example.stubs.Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.Vehicule,
      org.example.stubs.Immatriculation.Vehicule> getAjouterVehiculeMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.Vehicule, org.example.stubs.Immatriculation.Vehicule> getAjouterVehiculeMethod;
    if ((getAjouterVehiculeMethod = ImmatriculationServiceGrpc.getAjouterVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAjouterVehiculeMethod = ImmatriculationServiceGrpc.getAjouterVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getAjouterVehiculeMethod = getAjouterVehiculeMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.Vehicule, org.example.stubs.Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "AjouterVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Vehicule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("AjouterVehicule"))
                  .build();
          }
        }
     }
     return getAjouterVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ObtenirVehiculeRequest,
      org.example.stubs.Immatriculation.Vehicule> getObtenirVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtenirVehicule",
      requestType = org.example.stubs.Immatriculation.ObtenirVehiculeRequest.class,
      responseType = org.example.stubs.Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ObtenirVehiculeRequest,
      org.example.stubs.Immatriculation.Vehicule> getObtenirVehiculeMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ObtenirVehiculeRequest, org.example.stubs.Immatriculation.Vehicule> getObtenirVehiculeMethod;
    if ((getObtenirVehiculeMethod = ImmatriculationServiceGrpc.getObtenirVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getObtenirVehiculeMethod = ImmatriculationServiceGrpc.getObtenirVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getObtenirVehiculeMethod = getObtenirVehiculeMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.ObtenirVehiculeRequest, org.example.stubs.Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "ObtenirVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.ObtenirVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("ObtenirVehicule"))
                  .build();
          }
        }
     }
     return getObtenirVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ModifierVehiculeRequest,
      org.example.stubs.Immatriculation.Vehicule> getModifierVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifierVehicule",
      requestType = org.example.stubs.Immatriculation.ModifierVehiculeRequest.class,
      responseType = org.example.stubs.Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ModifierVehiculeRequest,
      org.example.stubs.Immatriculation.Vehicule> getModifierVehiculeMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.ModifierVehiculeRequest, org.example.stubs.Immatriculation.Vehicule> getModifierVehiculeMethod;
    if ((getModifierVehiculeMethod = ImmatriculationServiceGrpc.getModifierVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getModifierVehiculeMethod = ImmatriculationServiceGrpc.getModifierVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getModifierVehiculeMethod = getModifierVehiculeMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.ModifierVehiculeRequest, org.example.stubs.Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "ModifierVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.ModifierVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("ModifierVehicule"))
                  .build();
          }
        }
     }
     return getModifierVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.SupprimerVehiculeRequest,
      org.example.stubs.Immatriculation.SupprimerVehiculeResponse> getSupprimerVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupprimerVehicule",
      requestType = org.example.stubs.Immatriculation.SupprimerVehiculeRequest.class,
      responseType = org.example.stubs.Immatriculation.SupprimerVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.SupprimerVehiculeRequest,
      org.example.stubs.Immatriculation.SupprimerVehiculeResponse> getSupprimerVehiculeMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Immatriculation.SupprimerVehiculeRequest, org.example.stubs.Immatriculation.SupprimerVehiculeResponse> getSupprimerVehiculeMethod;
    if ((getSupprimerVehiculeMethod = ImmatriculationServiceGrpc.getSupprimerVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getSupprimerVehiculeMethod = ImmatriculationServiceGrpc.getSupprimerVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getSupprimerVehiculeMethod = getSupprimerVehiculeMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Immatriculation.SupprimerVehiculeRequest, org.example.stubs.Immatriculation.SupprimerVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "SupprimerVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.SupprimerVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Immatriculation.SupprimerVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("SupprimerVehicule"))
                  .build();
          }
        }
     }
     return getSupprimerVehiculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ajouterProprietaire(org.example.stubs.Immatriculation.Proprietaire request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getAjouterProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void obtenirProprietaire(org.example.stubs.Immatriculation.ObtenirProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getObtenirProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void modifierProprietaire(org.example.stubs.Immatriculation.ModifierProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire> responseObserver) {
      asyncUnimplementedUnaryCall(getModifierProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void supprimerProprietaire(org.example.stubs.Immatriculation.SupprimerProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.SupprimerProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSupprimerProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void ajouterVehicule(org.example.stubs.Immatriculation.Vehicule request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getAjouterVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void obtenirVehicule(org.example.stubs.Immatriculation.ObtenirVehiculeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getObtenirVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void modifierVehicule(org.example.stubs.Immatriculation.ModifierVehiculeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getModifierVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void supprimerVehicule(org.example.stubs.Immatriculation.SupprimerVehiculeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.SupprimerVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSupprimerVehiculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAjouterProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.Proprietaire,
                org.example.stubs.Immatriculation.Proprietaire>(
                  this, METHODID_AJOUTER_PROPRIETAIRE)))
          .addMethod(
            getObtenirProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.ObtenirProprietaireRequest,
                org.example.stubs.Immatriculation.Proprietaire>(
                  this, METHODID_OBTENIR_PROPRIETAIRE)))
          .addMethod(
            getModifierProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.ModifierProprietaireRequest,
                org.example.stubs.Immatriculation.Proprietaire>(
                  this, METHODID_MODIFIER_PROPRIETAIRE)))
          .addMethod(
            getSupprimerProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.SupprimerProprietaireRequest,
                org.example.stubs.Immatriculation.SupprimerProprietaireResponse>(
                  this, METHODID_SUPPRIMER_PROPRIETAIRE)))
          .addMethod(
            getAjouterVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.Vehicule,
                org.example.stubs.Immatriculation.Vehicule>(
                  this, METHODID_AJOUTER_VEHICULE)))
          .addMethod(
            getObtenirVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.ObtenirVehiculeRequest,
                org.example.stubs.Immatriculation.Vehicule>(
                  this, METHODID_OBTENIR_VEHICULE)))
          .addMethod(
            getModifierVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.ModifierVehiculeRequest,
                org.example.stubs.Immatriculation.Vehicule>(
                  this, METHODID_MODIFIER_VEHICULE)))
          .addMethod(
            getSupprimerVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Immatriculation.SupprimerVehiculeRequest,
                org.example.stubs.Immatriculation.SupprimerVehiculeResponse>(
                  this, METHODID_SUPPRIMER_VEHICULE)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     */
    public void ajouterProprietaire(org.example.stubs.Immatriculation.Proprietaire request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAjouterProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obtenirProprietaire(org.example.stubs.Immatriculation.ObtenirProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObtenirProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifierProprietaire(org.example.stubs.Immatriculation.ModifierProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifierProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void supprimerProprietaire(org.example.stubs.Immatriculation.SupprimerProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.SupprimerProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupprimerProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ajouterVehicule(org.example.stubs.Immatriculation.Vehicule request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAjouterVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obtenirVehicule(org.example.stubs.Immatriculation.ObtenirVehiculeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObtenirVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifierVehicule(org.example.stubs.Immatriculation.ModifierVehiculeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifierVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void supprimerVehicule(org.example.stubs.Immatriculation.SupprimerVehiculeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.SupprimerVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupprimerVehiculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.stubs.Immatriculation.Proprietaire ajouterProprietaire(org.example.stubs.Immatriculation.Proprietaire request) {
      return blockingUnaryCall(
          getChannel(), getAjouterProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Immatriculation.Proprietaire obtenirProprietaire(org.example.stubs.Immatriculation.ObtenirProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getObtenirProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Immatriculation.Proprietaire modifierProprietaire(org.example.stubs.Immatriculation.ModifierProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifierProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Immatriculation.SupprimerProprietaireResponse supprimerProprietaire(org.example.stubs.Immatriculation.SupprimerProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getSupprimerProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Immatriculation.Vehicule ajouterVehicule(org.example.stubs.Immatriculation.Vehicule request) {
      return blockingUnaryCall(
          getChannel(), getAjouterVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Immatriculation.Vehicule obtenirVehicule(org.example.stubs.Immatriculation.ObtenirVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getObtenirVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Immatriculation.Vehicule modifierVehicule(org.example.stubs.Immatriculation.ModifierVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifierVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Immatriculation.SupprimerVehiculeResponse supprimerVehicule(org.example.stubs.Immatriculation.SupprimerVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSupprimerVehiculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.Proprietaire> ajouterProprietaire(
        org.example.stubs.Immatriculation.Proprietaire request) {
      return futureUnaryCall(
          getChannel().newCall(getAjouterProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.Proprietaire> obtenirProprietaire(
        org.example.stubs.Immatriculation.ObtenirProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObtenirProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.Proprietaire> modifierProprietaire(
        org.example.stubs.Immatriculation.ModifierProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifierProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.SupprimerProprietaireResponse> supprimerProprietaire(
        org.example.stubs.Immatriculation.SupprimerProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSupprimerProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.Vehicule> ajouterVehicule(
        org.example.stubs.Immatriculation.Vehicule request) {
      return futureUnaryCall(
          getChannel().newCall(getAjouterVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.Vehicule> obtenirVehicule(
        org.example.stubs.Immatriculation.ObtenirVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObtenirVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.Vehicule> modifierVehicule(
        org.example.stubs.Immatriculation.ModifierVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifierVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Immatriculation.SupprimerVehiculeResponse> supprimerVehicule(
        org.example.stubs.Immatriculation.SupprimerVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSupprimerVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AJOUTER_PROPRIETAIRE = 0;
  private static final int METHODID_OBTENIR_PROPRIETAIRE = 1;
  private static final int METHODID_MODIFIER_PROPRIETAIRE = 2;
  private static final int METHODID_SUPPRIMER_PROPRIETAIRE = 3;
  private static final int METHODID_AJOUTER_VEHICULE = 4;
  private static final int METHODID_OBTENIR_VEHICULE = 5;
  private static final int METHODID_MODIFIER_VEHICULE = 6;
  private static final int METHODID_SUPPRIMER_VEHICULE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AJOUTER_PROPRIETAIRE:
          serviceImpl.ajouterProprietaire((org.example.stubs.Immatriculation.Proprietaire) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire>) responseObserver);
          break;
        case METHODID_OBTENIR_PROPRIETAIRE:
          serviceImpl.obtenirProprietaire((org.example.stubs.Immatriculation.ObtenirProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire>) responseObserver);
          break;
        case METHODID_MODIFIER_PROPRIETAIRE:
          serviceImpl.modifierProprietaire((org.example.stubs.Immatriculation.ModifierProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Proprietaire>) responseObserver);
          break;
        case METHODID_SUPPRIMER_PROPRIETAIRE:
          serviceImpl.supprimerProprietaire((org.example.stubs.Immatriculation.SupprimerProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.SupprimerProprietaireResponse>) responseObserver);
          break;
        case METHODID_AJOUTER_VEHICULE:
          serviceImpl.ajouterVehicule((org.example.stubs.Immatriculation.Vehicule) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_OBTENIR_VEHICULE:
          serviceImpl.obtenirVehicule((org.example.stubs.Immatriculation.ObtenirVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_MODIFIER_VEHICULE:
          serviceImpl.modifierVehicule((org.example.stubs.Immatriculation.ModifierVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_SUPPRIMER_VEHICULE:
          serviceImpl.supprimerVehicule((org.example.stubs.Immatriculation.SupprimerVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Immatriculation.SupprimerVehiculeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.stubs.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getAjouterProprietaireMethod())
              .addMethod(getObtenirProprietaireMethod())
              .addMethod(getModifierProprietaireMethod())
              .addMethod(getSupprimerProprietaireMethod())
              .addMethod(getAjouterVehiculeMethod())
              .addMethod(getObtenirVehiculeMethod())
              .addMethod(getModifierVehiculeMethod())
              .addMethod(getSupprimerVehiculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
