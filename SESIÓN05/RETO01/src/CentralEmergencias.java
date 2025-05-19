public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Alex");
        Patrulla patrulla = new Patrulla("Patrulla", "Itzel");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Camila");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}