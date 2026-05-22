package com.mycompany.actividadpoo2;

public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + " | Género: " + genero;
    }
}
