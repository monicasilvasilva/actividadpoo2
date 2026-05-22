package com.mycompany.actividadpoo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CRUDPersonas gestor = new CRUDPersonas();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n MENÚ PRINCIPAL");
            System.out.println("1. Capturar 5 Personas por teclado");
            System.out.println("2. Mostrar Nombres y Géneros");
            System.out.println("3. Calcular Promedio de Edades");
            System.out.println("4. Conteo de género Masculino");
            System.out.println("5. Conteo de género Femenino");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            
            try {
                opcion = Integer.parseInt(leer.nextLine());
                
                switch (opcion) {
                    case 1:
                        gestor.capturarPersonas();
                        break;
                    case 2:
                        gestor.mostrarNombresYGeneros();
                        break;
                    case 3:
                        System.out.println("\n-> El promedio de las edades es: " + gestor.obtenerPromedioEdades());
                        break;
                    case 4:
                        System.out.println("\n-> Cantidad de personas de género Masculino: " + gestor.contarMasculinos());
                        break;
                    case 5:
                        System.out.println("\n-> Cantidad de personas de género Femenino: " + gestor.contarFemeninos());
                        break;
                    case 6:
                        System.out.println("Saliste de la aplicacion");
                        break;
                    default:
                        System.out.println("Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        } while (opcion != 6);
        
    }
}
