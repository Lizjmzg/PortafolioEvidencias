public class Principal {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Evelyn Rivera", "P010321");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("UX456", "Italia", "16:30");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Realizamos una nueva reservacion
        vuelo.reservarAsiento("Miguel García", "P236054");
        System.out.println(vuelo.obtenerItinerario());
    }
}
