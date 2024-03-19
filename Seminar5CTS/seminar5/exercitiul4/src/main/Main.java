package main;

import clase.Reteta;
import clase.RetetaAbstracta;
import clase.RetetaCrema;

import java.rmi.server.RemoteRef;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> solutii = new HashMap<>();
        solutii.put("solutie1", 21.0);
        solutii.put("solutie2", 34.44);
        Reteta prototip = new Reteta(solutii, "Medicament1");

        RetetaAbstracta reteta2 = prototip.clone();
        System.out.println(reteta2);

        RetetaCrema retetaCremaPrototip = new RetetaCrema(45, "Galbenele");
        RetetaAbstracta retetaCrema = retetaCremaPrototip.clone();
        System.out.println(retetaCrema);

    }
}