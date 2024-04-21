package org.example.com.vehiculo.terrestre;

import lombok.Data;
import org.example.com.Combustible;

@Data
public class Motocicleta extends Terrestre {
    private Combustible combustible;
}
