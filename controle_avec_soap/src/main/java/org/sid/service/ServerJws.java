package org.sid.service;

import jakarta.xml.ws.Endpoint;

public class ServerJws {
    public static void main(String[] args) {

        Endpoint.publish("http://0.0.0.0:9191/" , new ImmatriculationService());
        System.out.println("Web service déployé sur http://0.0.0.0:9191/");
    }

}
