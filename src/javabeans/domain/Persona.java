package javabeans.domain;

import java.io.Serializable;

public class Persona implements Serializable {
    //Para que una clase sea una JavaBean, debe tener lo siguiente:
    /*
    1. Cada atributo debe ser privado
    2. Debe tener un constructor vacio
    3. Debe tener Getters and Setters
    */

    private String nombre;
    private String apellido;

    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
    }
    
    
}
