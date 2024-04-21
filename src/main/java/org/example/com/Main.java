package org.example.com;

import org.codehaus.groovy.control.CompilationFailedException;
import org.example.com.vehiculo.Vehiculo;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final String[] nombres = new String[] {
            "org.example.com.vehiculo.terrestre.Automovil",
            "org.example.com.vehiculo.acuatico.Submarino",
            "org.example.com.vehiculo.terrestre.Motocicleta"
    };

    public static void main(String[] args) {
        // Generar código Groovy en tiempo de ejecución
        String script =  "def output = vehiculo.frenar()";
        // Crear un contexto y agregar variables
        Binding binding = new Binding();
        try {
            for (final String nombre : nombres) {
                // Clase
                Class clase = Class.forName(nombre);
                System.out.println(String.format("Clase: %s", clase.getSimpleName()));
                // Instancia
                Vehiculo vehiculo = ((Vehiculo) clase.newInstance());
                // Groovy
                binding.setVariable("vehiculo", vehiculo);
                // Ejecutar el script Groovy con el motor de interpretación
                GroovyShell shell = new GroovyShell(binding);
                Object result = shell.evaluate(script);
                System.out.println(String.format("Resultado: %s", result));
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | CompilationFailedException e) {
            throw new RuntimeException(e);
        }
    }
}