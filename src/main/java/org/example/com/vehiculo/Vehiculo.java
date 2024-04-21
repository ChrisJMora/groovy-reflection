package org.example.com.vehiculo;

import lombok.Data;

@Data
public abstract class Vehiculo {
    private int galonesGasolina;
    private String marca;
    private String modelo;

    public String arrancar(){
        return "arrancar";
    }

    public String acelerar(){
        return "acelerar";
    }

    public String frenar(){
        return "frenar";
    }
}
