package Solucion_Reto_01;

import java.util.Scanner;

public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    // Método para mostrar los datos del paciente
    void mostrarInformacion() {
        System.out.println("\nInformación del paciente:");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}