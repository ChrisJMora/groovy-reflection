package org.example.com.vehiculo.terrestre;

import org.example.com.Traccion;
import org.example.com.vehiculo.Vehiculo;

public class Terrestre extends Vehiculo {
    private Traccion traccion;
    private int numeroRuedas;

    public void abrirPuerta()
    {
        System.out.println("Abrir Puerta");
    }

    @Override
    public String frenar() {
        return "Vehículo terrestre frenando...";
    }
}

