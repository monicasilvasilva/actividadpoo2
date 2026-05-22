package com.mycompany.actividadpoo2;

import java.util.Scanner;

public class CRUDPersonas {
    private Persona[] arregloPersonas = new Persona[5];
    private Scanner leer = new Scanner(System.in);

    public void capturarPersonas() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\n Registro Persona " + (i + 1));
            System.out.print("Nombre: ");
            String nom = leer.nextLine();
            System.out.print("Apellido: ");
            String ape = leer.nextLine();
            System.out.print("Género (M para Masculino / F para Femenino): ");
            String gen = leer.nextLine().toUpperCase();
            System.out.print("Edad: ");
            int ed = Integer.parseInt(leer.nextLine());

            arregloPersonas[i] = new Persona(nom, ape, gen, ed);
        }
        System.out.println("Las 5 personas han sido registradas");
    }

    public void mostrarNombresYGeneros() {
        if (arregloPersonas[0] == null) {
            System.out.println("Primero debe capturar los datos.");
            return;
        }
        System.out.println("\n Lista de Nombres y Géneros");
        for (Persona p : arregloPersonas) {
            System.out.println(p.toString());
        }
    }

    public double obtenerPromedioEdades() {
        if (arregloPersonas[0] == null) return 0;
        int suma = 0;
        for (Persona p : arregloPersonas) {
            suma += p.getEdad();
        }
        return (double) suma / arregloPersonas.length;
    }

    public int contarMasculinos() {
        if (arregloPersonas[0] == null) return 0;
        int cont = 0;
        for (Persona p : arregloPersonas) {
            if (p.getGenero().equals("M")) cont++;
        }
        return cont;
    }

    public int contarFemeninos() {
        if (arregloPersonas[0] == null) return 0;
        int cont = 0;
        for (Persona p : arregloPersonas) {
            if (p.getGenero().equals("F")) cont++;
        }
        return cont;
    }
}
