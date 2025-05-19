public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(180.0),
                new PagoTarjeta(320.0, 100.0),
                new PagoTransferencia(50.0, false) // esta fallará en autenticación
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}
