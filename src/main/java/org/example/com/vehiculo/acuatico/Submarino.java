package org.example.com.vehiculo.acuatico;

import lombok.Data;
import org.example.com.Combustible;

@Data
public class Submarino extends Acuatico{
    private Combustible combustible;
}
