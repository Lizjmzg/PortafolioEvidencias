package Solucion_Reto_01;

public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Leonardo");
        Patrulla patrulla = new Patrulla("Patrulla", "Camila");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Andres");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}
